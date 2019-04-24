package com.fruit.Controller;

import com.alibaba.fastjson.JSONObject;
import com.fruit.Model.Address;
import com.fruit.Model.AddressExample;
import com.fruit.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by Admin on 2017/5/3.
 */
@Controller
@RequestMapping("/address")
public class AddressManager {
    @Autowired
    AddressService addressService;

   //更新默认地址
    @RequestMapping(value = "/memberDefaultAddress",method = RequestMethod.POST)
    @ResponseBody
    public JSONObject memberDefaultAddress(@RequestBody Address address, HttpServletRequest httpServletRequest)
    {
        JSONObject jsonObject=new JSONObject();
        HttpSession session=httpServletRequest.getSession();
        String memberid=(String) session.getAttribute("username");

        AddressExample addressExample=new AddressExample();
        AddressExample.Criteria criteria=addressExample.createCriteria();
        criteria.andMemberidEqualTo(memberid);
        criteria.andStatusEqualTo("默认地址");

        try{
           int n= addressService.updateByExampleSelective(address,addressExample);
            if(n==0){
                address.setMemberid(memberid);
                address.setStatus("默认地址");
                addressService.insertSelective(address);
            }
        }catch (Exception e){

        }
        jsonObject.put("success",true);
        return  jsonObject;
    }
}
