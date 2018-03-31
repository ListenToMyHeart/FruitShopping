package com.fruit.Controller;

import com.alibaba.fastjson.JSONObject;
import com.fruit.Model.Members;
import com.fruit.Model.MembersExample;
import com.fruit.Model.User;
import com.fruit.Service.MemberService;
import com.fruit.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Created by Admin on 2017/4/12.
 */
@Controller
@RequestMapping("/members")
public class MemberManager {
    @Autowired
    MemberService memberService;

    @Autowired
    UserService userService;

    //查找所有会员信息
    @RequestMapping("/searchAll")
    @ResponseBody
    public JSONObject searchAll(){
        MembersExample membersExample=new MembersExample();
        JSONObject jsonObject=new JSONObject();
        MembersExample.Criteria criteria=membersExample.createCriteria();
        criteria.andAddressNotEqualTo("管理员");
        List<Members> membersList=memberService.selectByExample(membersExample);
        for(int i=0;i<membersList.size();i++){
            Members members =membersList.get(i);
            SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
            String strDate= simpleDateFormat.format(members.getLoaddate());
            members.setPostcode(strDate);
        }
        jsonObject.put("members",membersList);
        return jsonObject;
    }
    //通过购物车号查看单个会员信息
    @RequestMapping(value = "/searchByCartid/{cartid}" ,method = RequestMethod.GET)
    @ResponseBody
    public JSONObject searchByCartid(@PathVariable int cartid){
        JSONObject jsonObject=new JSONObject();
        Members members=memberService.selectByPrimaryKey(cartid);
        User user=userService.selectByPrimaryKey(members.getMemberid());
        jsonObject.put("members",members);
        jsonObject.put("user",user);
        return jsonObject;
    }
    //冻结会员
    @RequestMapping(value = "/frozzenMember",method = RequestMethod.POST)
    @ResponseBody
    public JSONObject frozzenMember(@RequestBody Members member){
        JSONObject jsonObject=new JSONObject();
        User user=new User();
        int status;
        if(member.getAddress().equals("正常")){
            status=0;
        }
        else{
            status=1;
        }
        user.setUserid(member.getMemberid());
        user.setStatus(status);
        int n=userService.updateByPrimaryKeySelective(user);
        int m=memberService.updateByPrimaryKeySelective(member);
        if(n==1 && m==1){
            jsonObject.put("success",true);
        }
        else{
            jsonObject.put("success",false);
        }
        return  jsonObject;
    }
    //通过memberid查看会员
    @RequestMapping(value = "/searchByMemberid" ,method = RequestMethod.GET)
    @ResponseBody
    public JSONObject searchByMemberid(HttpServletRequest httpServletRequest){

        JSONObject jsonObject=new JSONObject();
        HttpSession httpSession=httpServletRequest.getSession();
        String memberid=(String)httpSession.getAttribute("username");
        MembersExample membersExample=new MembersExample();
        MembersExample.Criteria criteria=membersExample.createCriteria();
        criteria.andMemberidEqualTo(memberid);
        List<Members> member=memberService.selectByExample(membersExample);
        jsonObject.put("member",member);
        return jsonObject;
    }

    //更新会员信息
    @RequestMapping(value = "/updateByMemberid" ,method = RequestMethod.POST)
    @ResponseBody
    public JSONObject updateByMemberid(@RequestBody Members members, HttpServletRequest httpServletRequest){
        JSONObject jsonObject=new JSONObject();
        HttpSession session=httpServletRequest.getSession();
        String memberid=(String)session.getAttribute("username");
        members.setMemberid(memberid);

        int n=memberService.updateByPrimaryKeySelective(members);
        if(n==1){
            jsonObject.put("success",true);
        }else{
            jsonObject.put("success",false);
        }

        return  jsonObject;
    }

}
