package com.fruit.controller;

import com.alibaba.fastjson.JSONObject;
import com.fruit.model.Login;
import com.fruit.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Admin on 2017/3/30.
 */
@Controller
@RequestMapping("/user")
public class LoginManager {
    @Autowired
    LoginService userService;

    @RequestMapping("/{userid}")
    @ResponseBody
    public JSONObject getUserById(@PathVariable String userid) {
        JSONObject jsonObject = new JSONObject();


        Login user = userService.selectByPrimaryKey(userid);
        jsonObject.put("success",true);
        jsonObject.put("data", user);
        return jsonObject;
    }



  /*  public JSONObject login(@RequestBody User user, HttpSession httpSession){
        JSONObject jsonObject=new JSONObject();
       *//*
       前端没有传回用户名
        *//*
        if(user.getUsername()==null||"".equals(user.getUsername())){
            System.out.println("用户名为空");
            jsonObject.put("success",false);
            jsonObject.put("msg","用户名为空");

            return jsonObject;
        }
        *//*
        根据用户名查询user表
         *//*
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria=userExample.createCriteria();
        //相当于hql条件查询语句
        criteria.andUsernameEqualTo(user.getUsername());
        //进行条数非空查询
        if(userService.countByExample(userExample)==0){
            System.out.println("没有当前用户");
            jsonObject.put("success",false);
            jsonObject.put("msg","没有当前用户");
            return jsonObject;
        }
        //查询并取得第一条数据
        List<User> list=userService.selectByExample(userExample);
        User real_user = list.get(0);
        if(!real_user.getPassword().equals(user.getPassword())){
            jsonObject.put("success",false);
            jsonObject.put("msg","账号密码错误");
            System.out.println("账号密码错误");
            return jsonObject;
        }
        //登录成功
        httpSession.setAttribute("username",real_user.getUsername());
        //打一个日志
        if (logger.isInfoEnabled()){
            logger.info(real_user.getUsername()+" 登录成功!");
        }
        jsonObject.put("success",true);
        jsonObject.put("url","./index.html");
        System.out.println("成功登陆");
        return jsonObject;
    }*/


}
