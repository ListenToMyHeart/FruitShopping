package com.fruit.controller;

import com.alibaba.fastjson.JSONObject;
import com.fruit.model.*;
import com.fruit.service.AddressService;
import com.fruit.service.GoodsinformationService;
import com.fruit.service.MemberService;
import com.fruit.service.ShopcartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Admin on 2017/4/27.
 */

@RestController
@RequestMapping("/shopcart")
public class ShopcartManager {

    @Autowired
    ShopcartService shopcartService;
    @Autowired
    GoodsinformationService goodsinformationService;
    @Autowired
    MemberService memberService;
    @Autowired
    AddressService addressService;

    //添加购物车

    @PostMapping(value = "/goods/{goodspkid}")
    public JSONObject addGoodsToShopcart(@RequestBody Shopcart shopcart, HttpServletRequest httpServletRequest){
        HttpSession session=httpServletRequest.getSession();
        JSONObject jsonObject=new JSONObject();
        String memberid=(String) session.getAttribute("username");

        if(memberid==null){
            jsonObject.put("success",false);
            jsonObject.put("msg","请登录");
            return jsonObject;
        }

        //获取该会员的会员信息
        MembersExample membersExample=new MembersExample();
        MembersExample.Criteria criteria=membersExample.createCriteria();
        criteria.andMemberidEqualTo(memberid);
        List<Members> membersList=memberService.selectByExample(membersExample);
        Members member=membersList.get(0);

        shopcart.setCartid(member.getCartid());
        shopcart.setMemberid(memberid);

        //获取该商品的信息
        Goodsinformation goodsinformation=goodsinformationService.selectByPrimaryKey(shopcart.getGoodspkid());

        int goodsnumber=shopcart.getGoodsnumber();
        BigDecimal bigGoodsnumber=BigDecimal.valueOf(goodsnumber);

        BigDecimal totalprice= goodsinformation.getGoodsprice().multiply(bigGoodsnumber);

        shopcart.setGoodsid(goodsinformation.getGoodsid());
        shopcart.setTotalprice(totalprice);
        shopcart.setGoodsurl(goodsinformation.getGoodsurl());
        shopcart.setGoodsprice(goodsinformation.getGoodsprice());
        shopcart.setClassid(goodsinformation.getClassid());
        shopcart.setCartstatus("正常");
        shopcart.setGoodsintroduce(goodsinformation.getGoodsintroduce());
        shopcart.setGoodspreprice(goodsinformation.getPregoodsprice());

        try{
            shopcartService.insertSelective(shopcart);
            jsonObject.put("success",true);
        }catch(Exception e){
            jsonObject.put("success",false);
        }

        return jsonObject;

    }

    @GetMapping( value = "/shopcartGoods")
    public JSONObject getShopcartByMemberid(HttpServletRequest httpServletRequest){

        JSONObject jsonObject=new JSONObject();
        HttpSession session=httpServletRequest.getSession();

        String memberid=(String)session.getAttribute("username");

        ShopcartExample shopcartExample=new ShopcartExample();
        ShopcartExample.Criteria criteria=shopcartExample.createCriteria();
        criteria.andMemberidEqualTo(memberid);
        List<Shopcart> shopcartList=shopcartService.selectByExample(shopcartExample);
        jsonObject.put("shopcart",shopcartList);
        jsonObject.put("success",true);

        return  jsonObject;
    }

    //更新购物车信息
    @PutMapping(value = "/goods/{goodspkid}")
    public JSONObject updateGoodsToShopcart(@RequestBody Shopcart shopcart, HttpServletRequest httpServletRequest){
        HttpSession session=httpServletRequest.getSession();
        JSONObject jsonObject=new JSONObject();
        String memberid=(String) session.getAttribute("username");
        shopcart.setMemberid(memberid);
        Goodsinformation goodsinformation=goodsinformationService.selectByPrimaryKey(shopcart.getGoodspkid());

        int goodsnumber=shopcart.getGoodsnumber();
        BigDecimal bigGoodsnumber = BigDecimal.valueOf(goodsnumber);

        BigDecimal totalprice= goodsinformation.getGoodsprice().multiply(bigGoodsnumber);
        shopcart.setTotalprice(totalprice);
        try{
            shopcartService.updateByPrimaryKeySelective(shopcart);
            jsonObject.put("success",true);
        }catch(Exception e){
            jsonObject.put("success",false);
        }
        return jsonObject;
    }

    @DeleteMapping(value = "/goods/{goodspkid}")
    public JSONObject deleteShopGoods(@PathVariable int goodspkid, HttpServletRequest httpServletRequest){
        JSONObject jsonObject=new JSONObject();
        HttpSession session=httpServletRequest.getSession();
        String memberid=(String) session.getAttribute("username");

        try{
            ShopcartKey shopcartKey=new ShopcartKey();
            shopcartKey.setMemberid(memberid);
            shopcartKey.setGoodspkid(goodspkid);
            shopcartService.deleteByPrimaryKey(shopcartKey);
            jsonObject.put("success",true);
        }catch (Exception e){
            jsonObject.put("success",false);
        }

        return jsonObject;
    }

    //获取购物车中特定条件商品信息
    @PostMapping(value = "/searchPayGoods")
    public JSONObject searchPayGoods(@RequestBody Shopcart shopcart,HttpServletRequest httpServletRequest){
        JSONObject jsonObject=new JSONObject();
        HttpSession session=httpServletRequest.getSession();

        //获取当前用户名
        String memberid=(String) session.getAttribute("username");
        ShopcartExample shopcartExample=new ShopcartExample();
        ShopcartExample.Criteria criteria=shopcartExample.createCriteria();
        criteria.andMemberidEqualTo(memberid);
        criteria.andCartstatusEqualTo(shopcart.getCartstatus());
        try {
            List<Shopcart> shopcartList= shopcartService.selectByExample(shopcartExample);
            jsonObject.put("shopcart",shopcartList);
            jsonObject.put("success",true);
        }catch (Exception e){
            jsonObject.put("success",false);
        }
        Address address=new Address();
        address=getAddreeByMemberid(memberid);

        if(address.getReceiver()!=null)
        {
            jsonObject.put("address",address);
        }
        else {
            address.setReceiveraddress("无");
            address.setReceiver("无");
            address.setReceiverphone("无");
            jsonObject.put("address",address);
        }

        return jsonObject;

    }

    public Address getAddreeByMemberid(String memberid){
        Address address=new Address();
        AddressExample addressExample=new AddressExample();
        AddressExample.Criteria criteria=addressExample.createCriteria();
        criteria.andMemberidEqualTo(memberid);
        criteria.andStatusEqualTo("默认地址");
        try{
            List<Address> addresseList=addressService.selectByExample(addressExample);
            address=addresseList.get(0);
        }catch (Exception e)
        {

        }
        return address;
    }
}
