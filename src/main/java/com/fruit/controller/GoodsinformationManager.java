package com.fruit.controller;

import com.alibaba.fastjson.JSONObject;
import com.fruit.model.Goodsinformation;
import com.fruit.model.GoodsinformationExample;
import com.fruit.service.GoodsinformationService;
import com.fruit.utils.MyCommon;
import com.fruit.utils.PropertiesUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by Admin on 2017/4/4.
 */
@RestController
@RequestMapping("/goodsInformation")
public class GoodsinformationManager {

    @Autowired
    GoodsinformationService goodsinformationService;


    //根据关键字查询
    @GetMapping(value="/search/{keyword}")
    public JSONObject searchInformation(@PathVariable String keyword){
        JSONObject jsonObject=new JSONObject();
        GoodsinformationExample goodsinformationExample=new GoodsinformationExample();
        GoodsinformationExample.Criteria criteria=goodsinformationExample.createCriteria();
        criteria.andGoodsidLike("%"+keyword+"%");
        criteria.andIsrefinementEqualTo("否");
        List<Goodsinformation> goodsinformationList= goodsinformationService.selectByExample(goodsinformationExample);
        jsonObject.put("goods",goodsinformationList);
        return jsonObject;
    }

    //寻找一件商品
    @GetMapping(value="/searchOne/{pkid}")
    public JSONObject searchOne(@PathVariable int pkid){
        JSONObject jsonObject=new JSONObject();
        Goodsinformation goods=goodsinformationService.selectByPrimaryKey(pkid);
        jsonObject.put("goods",goods);
        return jsonObject;
    }
    //修改一件商品
    @PutMapping(value="/searchOne/{pkid}")
    public JSONObject modifyOne(@RequestBody Goodsinformation goodsinformation){
        JSONObject jsonObject=new JSONObject();
       int n=goodsinformationService.updateByPrimaryKeySelective(goodsinformation);
       if(n==1){
           jsonObject.put("success",true);
       }
        else{
           jsonObject.put("success",false);
       }
        return jsonObject;
    }

    //删除一件商品

    @DeleteMapping(value="/searchOne/{pkid}")
    public JSONObject deleteGoods(@PathVariable int pkid){
        JSONObject jsonObject=new JSONObject();
        Goodsinformation goodsinformation=new Goodsinformation();
        goodsinformation.setPkid(pkid);
        goodsinformation.setIsrefinement("是");
        int n=goodsinformationService.updateByPrimaryKeySelective(goodsinformation);
        if(n==1){
            jsonObject.put("success",true);
        }
        else
        {
            jsonObject.put("success",false);
        }
        return jsonObject;
    }

    //查找所有商品信息
    @GetMapping(value="/searchGoods")
    public JSONObject searchGoods(){
        JSONObject jsonObject=new JSONObject();
        GoodsinformationExample goodsinformationExample=new GoodsinformationExample();
        GoodsinformationExample.Criteria criteria=goodsinformationExample.createCriteria();
        criteria.andIsrefinementEqualTo("否");
       List<Goodsinformation>  goods=goodsinformationService.selectByExample(goodsinformationExample);
        for(int i=0;i<goods.size();i++){
            Goodsinformation goodsinformation=goods.get(i);
                SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
                String strDate= simpleDateFormat.format(goodsinformation.getUpdatatime());
            goodsinformation.setIsrefinement(strDate);
        }
        jsonObject.put("goods",goods);

        return jsonObject;
    }
    //查找打折的商品
    @GetMapping(value="/searchDiscountGoods")
    public JSONObject searchDiscountGoods(){
        JSONObject jsonObject=new JSONObject();
        GoodsinformationExample goodsinformationExample=new GoodsinformationExample();
        GoodsinformationExample.Criteria criteria=goodsinformationExample.createCriteria();
        criteria.andIsdiscountEqualTo("是");
        criteria.andIsrefinementEqualTo("否");
        List<Goodsinformation> goodsinformationList=goodsinformationService.selectByExample(goodsinformationExample);
        List<Goodsinformation> goodsinformationList4=goodsinformationList.subList(0,4);
        jsonObject.put("goods",goodsinformationList4);
        return jsonObject;
    }
    //查找国内商品
    @GetMapping(value="/searchGuoneiGoods")
    public JSONObject searchGuoneiGoods(){
        JSONObject jsonObject=new JSONObject();
        GoodsinformationExample goodsinformationExample=new GoodsinformationExample();
        GoodsinformationExample.Criteria criteria=goodsinformationExample.createCriteria();
        criteria.andClassidEqualTo("国产水果");
        criteria.andIsrefinementEqualTo("否");
        List<Goodsinformation> goodsinformationList=goodsinformationService.selectByExample(goodsinformationExample);
        List<Goodsinformation> goodsinformationList4=goodsinformationList.subList(0,9);
        jsonObject.put("goods",goodsinformationList4);
        return jsonObject;
    }
        //查找进口商品
    @GetMapping(value="/searchJinkouGoods")
    public JSONObject searchJinkouGoods(){
        JSONObject jsonObject=new JSONObject();
        GoodsinformationExample goodsinformationExample=new GoodsinformationExample();
        GoodsinformationExample.Criteria criteria=goodsinformationExample.createCriteria();
        criteria.andClassidEqualTo("进口水果");
        criteria.andIsrefinementEqualTo("否");
        List<Goodsinformation> goodsinformationList=goodsinformationService.selectByExample(goodsinformationExample);
        List<Goodsinformation> goodsinformationList4=goodsinformationList.subList(0,9);
        jsonObject.put("goods",goodsinformationList4);
        return jsonObject;
    }

    //查询国内和进口的所有水果
    @GetMapping(value="/searchGJ/{keyword}")
    public JSONObject searchGJgoods(@PathVariable String keyword){
        JSONObject jsonObject=new JSONObject();
        GoodsinformationExample goodsinformationExample=new GoodsinformationExample();
        GoodsinformationExample.Criteria criteria=goodsinformationExample.createCriteria();
        if(keyword.equals("guochan")){
            criteria.andClassidEqualTo("国产水果");
        }else{
            criteria.andClassidEqualTo("进口水果");
        }
        criteria.andIsrefinementEqualTo("否");
        List<Goodsinformation> goodsinformationList= goodsinformationService.selectByExample(goodsinformationExample);
        jsonObject.put("goods",goodsinformationList);
        return jsonObject;
    }
    //增加商品信息
    @PostMapping(value = "/addGoodsInformation")
    public JSONObject addGoodsInformation(String goodsid,String classid,String goodsintroduce,String goodsweight,String goodsprice,
                                          @RequestParam("imgAddress")MultipartFile file) throws DataAccessException{
        String imgAddress="";
        JSONObject jsonObject=new JSONObject();
        if(file.getSize()>0)
        {
            UUID uuid=UUID.randomUUID();
            try
            {
                file.transferTo(new File(PropertiesUtil.getProperty("uploadPath")+uuid+file.getOriginalFilename()));
                imgAddress=uuid+file.getOriginalFilename();
            }catch (Exception e)
            {
               System.out.println("文件上传失败");
            }
        }else{
            imgAddress="../images/xiangjiao1.jpg";
        }
        imgAddress="../images/"+imgAddress;
        Goodsinformation goodsinformation=new Goodsinformation();
        goodsinformation.setGoodsid(goodsid);
        goodsinformation.setClassid(classid);

        BigDecimal bigGoodsprice=new BigDecimal(goodsprice);
        goodsinformation.setGoodsprice(bigGoodsprice);
        goodsinformation.setGoodsintroduce(goodsintroduce);
        BigDecimal bigGoodsweight=new BigDecimal(goodsweight);
        goodsinformation.setGoodsweight(bigGoodsweight);
        goodsinformation.setGoodsurl(imgAddress);
        goodsinformation.setGoodsbrand("无");
        goodsinformation.setGoodsunit("千克");
        goodsinformation.setPregoodsprice(bigGoodsprice);
        goodsinformation.setSales(0);
        goodsinformation.setIsrefinement("否");
        goodsinformation.setIshot("是");
        goodsinformation.setIsdiscount("否");
        Date date=new Date();
        MyCommon myCommon=new MyCommon();
        Timestamp timestamp=myCommon.DateToTimestamp(date);

        goodsinformation.setUpdatatime(timestamp);

        //添加行程信息到数据库
        try{
            goodsinformationService.insertSelective(goodsinformation);
            jsonObject.put("success",true);
        }catch(Exception e){
            jsonObject.put("success",false);
        }
        return jsonObject;
    }
}
