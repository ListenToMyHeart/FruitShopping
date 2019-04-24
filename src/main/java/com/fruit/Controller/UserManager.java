package com.fruit.Controller;

import com.alibaba.fastjson.JSONObject;
import com.fruit.Model.Members;
import com.fruit.Model.User;
import com.fruit.Service.MemberService;
import com.fruit.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * Created by Admin on 2017/4/3.
 */
@Controller
@RequestMapping("/login")
public class UserManager {

    @Autowired
    UserService userService;

    @Autowired
    MemberService memberService;

    //用户登录

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public JSONObject userLogin(@RequestBody User user, HttpSession httpSession){
        JSONObject jsonObject= new JSONObject();
        User user1=userService.selectByPrimaryKey(user.getUserid());
     //用户不存在
        if(user1==null){
            jsonObject.put("success",false);
            jsonObject.put("message","用户名不存在!");
            return jsonObject;
        }
        //登陆成功
        if(user1.getPassword().equals(user.getPassword())){
            if(user1.getStatus()==1){
                jsonObject.put("success",false);
                jsonObject.put("message","您的账号已被冻结!");
                return jsonObject;
            }
            else if(user1.getPrivelege()==0)
            {
                httpSession.setAttribute("username",user1.getUserid());
                jsonObject.put("success",true);
                jsonObject.put("urlName","http://localhost:8080/FruitShopping/html/home.html");
            }
            else{
                httpSession.setAttribute("username",user1.getUserid());
                httpSession.setAttribute("privelege","1");
                jsonObject.put("success",true);
                jsonObject.put("urlName","http://localhost:8080/FruitShopping/admin/adminIndex.html");
            }

        }
        else{
            jsonObject.put("success",false);
            jsonObject.put("message","密码错误");
        }
        return  jsonObject;
    }

    //用户注册
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    @ResponseBody
    public  JSONObject createUser(@RequestBody User user){

        JSONObject jsonObject=new JSONObject();
        Members member=new Members();
        user.setStatus(0);
        user.setPrivelege(0);
        user.setTruename(user.getUserid());
        Date date=new Date();
        user.setLoaddate(date);

        member.setMemberid(user.getUserid());
        member.setTruename(user.getUserid());
        member.setAddress("正常");
        member.setSex("保密");
        member.setLoaddate(date);
        member.setAdvancepayment("0");
        member.setPhone("无");
    //捕捉异常，查看是否插入失败
        try{
             userService.insert(user);
            jsonObject.put("success",true);
        }
        catch (Exception e)
        {
            jsonObject.put("success",false);
            return jsonObject;
        }
        try{
            memberService.insert(member);
            jsonObject.put("success",true);
        }
       catch(Exception e)
       {
           jsonObject.put("success",false);
       }
        return jsonObject;
    }

    //得到一个user信息
    @RequestMapping(value = "/{userid}",method=RequestMethod.GET)
    @ResponseBody
    public JSONObject getUserById(@PathVariable String userid) {
        JSONObject jsonObject = new JSONObject();
        User user = userService.selectByPrimaryKey(userid);
        jsonObject.put("success",true);
        jsonObject.put("data", user);
        return jsonObject;
    }

    //获取当前用户名
    @RequestMapping(value = "/getUsername",method=RequestMethod.GET)
    @ResponseBody
    public JSONObject getUserById(HttpServletRequest httpServletRequest){
        JSONObject jsonObject=new JSONObject();

        HttpSession session=httpServletRequest.getSession();
        Object username=session.getAttribute("username");
        if(username!=null){
            jsonObject.put("username",username);
            jsonObject.put("success",true);
        }
        else{
            jsonObject.put("success",false);
        }
        return jsonObject;
    }

    //退出登录
    @RequestMapping("/logout")
    @ResponseBody
    public JSONObject logout(HttpServletRequest httpServletRequest){
        JSONObject jsonObject=new JSONObject();
        HttpSession session=httpServletRequest.getSession();
        session.setAttribute("username",null);
        session.setAttribute("privelege",null);
        jsonObject.put("success",true);
        return jsonObject;
    }

    @RequestMapping(value = "/password",method = RequestMethod.PUT)
    @ResponseBody
    public JSONObject modifyPassword(@RequestBody JSONObject jsonObject,HttpServletRequest httpServletRequest){
        HttpSession session=httpServletRequest.getSession();
        JSONObject apply=new JSONObject();
        String memberid=(String)session.getAttribute("username");
        User user=userService.selectByPrimaryKey(memberid);
        String oldPassword= (String)jsonObject.get("oldPassword");
        String password=(String)jsonObject.get("password");
        if(user.getPassword().equals(oldPassword)){
            user.setPassword(password);
            userService.updateByPrimaryKey(user);
            apply.put("success",true);
        }else{
            apply.put("success",false);
        }
        return apply;
    }

}
