package com.fruit.Controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fruit.Model.*;
import com.fruit.Service.*;
import com.fruit.Utils.MyCommon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Admin on 2017/4/12.
 */
@Controller
@RequestMapping("/orderInformation")
public class OrderInformationManager {
    @Autowired
    OrderInformationService orderInformationService;
    @Autowired
    GoodsinformationService goodsinformationService;
    @Autowired
    MemberService memberService;
    @Autowired
    ShopcartService shopcartService;
    @Autowired
    AddressService addressService;

    //商品购买
    @RequestMapping(value = "/buy" ,method = RequestMethod.POST)
    @ResponseBody
    public JSONObject addOrderInfo(@RequestBody Orderinformation orderinformation, HttpServletRequest httpServletRequest){

        JSONObject jsonObject=new JSONObject();
        HttpSession session=httpServletRequest.getSession();
        String memberid=(String)session.getAttribute("username");
        if(memberid==null){
            jsonObject.put("success",false);
            jsonObject.put("msg","请登录");
            return jsonObject;
        }

        int pkid=Integer.parseInt(orderinformation.getPaytype());
        Date date=new Date();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strDate=simpleDateFormat.format(date);
        Timestamp timestamp=Timestamp.valueOf(strDate);

            Goodsinformation goodsinformation=goodsinformationService.selectByPrimaryKey(pkid);
            orderinformation.setGoodsid(goodsinformation.getGoodsid());
            orderinformation.setOrderdate(timestamp);

           //商品单价
           String goodsprice=goodsinformation.getGoodsprice()+"";
            orderinformation.setGoodsprice(goodsprice);

        //总价
        int number=Integer.parseInt(orderinformation.getIsconfirm());
        BigDecimal bignumber=new BigDecimal(number);
        BigDecimal total=bignumber.multiply(goodsinformation.getGoodsprice());
        String totalprice=total+"";
        orderinformation.setTotalprice(totalprice);

        orderinformation.setShiptype("快递");
        String goodspkid= goodsinformation.getPkid()+"";
        orderinformation.setPaytype(goodspkid);

        //获取会员id

        orderinformation.setMemberid(memberid);
        MembersExample membersExample=new MembersExample();
        MembersExample.Criteria criteria=membersExample.createCriteria();
        criteria.andMemberidEqualTo(memberid);
       /* List<Members> membersList=memberService.selectByExample(membersExample);
        Members member=membersList.get(0);
        orderinformation.setReceivername(member.getTruename());
        orderinformation.setReceiverphone(member.getPhone());*/
        orderinformation.setIspayment("否");
        orderinformation.setStatus("未提交");
        orderinformation.setAddress(orderinformation.getReceiveraddress());
        orderinformation.setReceiverpostcode("无");

        AddressExample addressExample=new AddressExample();
        AddressExample.Criteria addressCriteria=addressExample.createCriteria();
        addressCriteria.andMemberidEqualTo(memberid);
        addressCriteria.andStatusEqualTo("默认地址");

        List<Address> addressList=addressService.selectByExample(addressExample);

        if(addressList.size()!=0)
        {
            Address address=addressList.get(0);
            orderinformation.setReceivername(address.getReceiver());
            orderinformation.setReceiveraddress(address.getReceiveraddress());
            orderinformation.setReceiverphone(address.getReceiverphone());
        }else{
            orderinformation.setReceivername("无");
            orderinformation.setReceiveraddress("无");
            orderinformation.setReceiverphone("无");
        }
        orderinformation.setAddress("无");

        int n= orderInformationService.insertSelective(orderinformation);
        if(n==1){
            jsonObject.put("success",true);
            jsonObject.put("orderInformation",orderinformation);
        }
        else{
            jsonObject.put("success",false);
        }
            return jsonObject;
    }

    //获得自动生成的商品id

    @RequestMapping(value = "/getOrderid" ,method = RequestMethod.POST)
    @ResponseBody
    public JSONObject getOrderid(@RequestBody Orderinformation orderinformation){
        JSONObject jsonObject=new JSONObject();
        OrderinformationExample orderinformationExample=new OrderinformationExample();
        OrderinformationExample.Criteria criteria=orderinformationExample.createCriteria();
        criteria.andPaytypeEqualTo(orderinformation.getPaytype());
        criteria.andMemberidEqualTo(orderinformation.getMemberid());
        criteria.andStatusEqualTo("未提交");
        List<Orderinformation> orderinformationList= orderInformationService.selectByExample(orderinformationExample);
        Orderinformation orderinformation1=orderinformationList.get(orderinformationList.size()-1);
        jsonObject.put("orderInformation",orderinformation1);
        return jsonObject;

    }

    //查看未接收的订单信息
    @RequestMapping("/searchReciveOrder")
    @ResponseBody
    public JSONObject searchReciveOrder(){
        JSONObject jsonObject=new JSONObject();
        OrderinformationExample orderinformationExample=new OrderinformationExample();
        OrderinformationExample.Criteria criteria=orderinformationExample.createCriteria();
        criteria.andStatusEqualTo("未接收");
        List<Orderinformation> orderinformationList=orderInformationService.selectByExample(orderinformationExample);
        jsonObject.put("orderInformation",orderinformationList);
        return jsonObject;
    }
    //查看已接收的订单信息
    @RequestMapping("/searchRecivedOrder")
    @ResponseBody
    public JSONObject searchRecivedOrder(){
        JSONObject jsonObject=new JSONObject();
        OrderinformationExample orderinformationExample=new OrderinformationExample();
        OrderinformationExample.Criteria criteria=orderinformationExample.createCriteria();
        List<String> stringList=new LinkedList<String>(){{
            add("已发货");
            add("未发货");
        }};
        criteria.andStatusIn (stringList);
        List<Orderinformation> orderinformationList=orderInformationService.selectByExample(orderinformationExample);
        jsonObject.put("orderInformation",orderinformationList);
        return jsonObject;
    }
    //查看已完成的订单信息
    @RequestMapping("/searchFinishedOrder")
    @ResponseBody
    public JSONObject searchFinishedOrder(){
        JSONObject jsonObject=new JSONObject();
        OrderinformationExample orderinformationExample=new OrderinformationExample();
        OrderinformationExample.Criteria criteria=orderinformationExample.createCriteria();
        List<String> stringList=new LinkedList<String>(){{
            add("已收货");
            add("已退货");
        }};
        criteria.andStatusIn (stringList);
        List<Orderinformation> orderinformationList=orderInformationService.selectByExample(orderinformationExample);
        jsonObject.put("orderInformation",orderinformationList);
        return jsonObject;
    }
    //通过orderid查询一件商品信息
    @RequestMapping("/searchById/{keyword}")
    @ResponseBody
    public JSONObject searchById(@PathVariable int keyword ){

        Orderinformation orderinformation=orderInformationService.selectByPrimaryKey(keyword);

        JSONObject jsonObject=new JSONObject();
        jsonObject.put("success",true);
        jsonObject.put("orderInformation",orderinformation);
        return jsonObject;
    }

    //更新订单状态
    @RequestMapping(value = "/modifyStatusToReceived/{orderid}",method = RequestMethod.POST)
    @ResponseBody
    public JSONObject updateStatusToReceived(@PathVariable("orderid") int orderid,@RequestBody Orderinformation orderinformation){
        JSONObject jsonObject=new JSONObject();
        orderinformation.setOrderid(orderid);
        int n=  orderInformationService.updateByPrimaryKeySelective(orderinformation);
        jsonObject.put("n",n);
        return jsonObject;
    }

    //更新订单
    @RequestMapping(value = "/updateOrderInformation/{orderid}",method = RequestMethod.PUT)
    @ResponseBody
    public JSONObject updateStatusToReceived(@RequestBody Orderinformation orderinformation){
        JSONObject jsonObject=new JSONObject();
        int n=  orderInformationService.updateByPrimaryKeySelective(orderinformation);
        if(n==1){
            jsonObject.put("success",true);
        }
        else{
            jsonObject.put("success",false);
        }
        return jsonObject;
    }

    //付款结账更新订单
    @RequestMapping(value = "/buyGoodsByMoney/{orderid}",method = RequestMethod.GET)
    @ResponseBody
    public JSONObject buyGoodsByMoney(@PathVariable int orderid,HttpServletRequest httpServletRequest){
        JSONObject jsonObject=new JSONObject();

        //获取用户id
        HttpSession session=httpServletRequest.getSession();
        String memberid=(String)session.getAttribute("username");

        //获取当前订单信息

        Orderinformation orderinformation=orderInformationService.selectByPrimaryKey(orderid);
        double totalprice=Double.parseDouble(orderinformation.getTotalprice());

        int pkid=Integer.parseInt(orderinformation.getPaytype());
        Goodsinformation goodsinformation=goodsinformationService.selectByPrimaryKey(pkid);

        int buynumber=Integer.parseInt(orderinformation.getIsconfirm());
        int sales=goodsinformation.getSales();
        BigDecimal goodsweight=goodsinformation.getGoodsweight();
        BigDecimal bigBuynumber=BigDecimal.valueOf(buynumber);
        goodsweight=goodsweight.subtract(bigBuynumber);
        Double doublegoodsweight=Double.parseDouble(goodsweight.toString());
        if(doublegoodsweight<0)
        {
            jsonObject.put("success",false);
            jsonObject.put("message","购买失败，库存不足！");
            return jsonObject;
        }

        sales+=buynumber;
        goodsinformation.setSales(sales);
        goodsinformation.setGoodsweight(goodsweight);

        MembersExample membersExample=new MembersExample();
        MembersExample.Criteria criteria=membersExample.createCriteria();
        criteria.andMemberidEqualTo(memberid);
        List<Members> membersList=memberService.selectByExample(membersExample);
        double payment= Double.parseDouble(membersList.get(0).getAdvancepayment());
        double surplusMoney=payment-totalprice;
        if(surplusMoney<0){
            jsonObject.put("success",false);
            jsonObject.put("message","购买失败，您的余额不足");
            return jsonObject;
        }
        String surplus=surplusMoney+"";
        Members member=new Members();
        member.setAdvancepayment(surplus);
        orderinformation.setStatus("未接收");
        orderinformation.setIspayment("是");

        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strDate=simpleDateFormat.format(orderinformation.getOrderdate());
        Timestamp timestamp=Timestamp.valueOf(strDate);
        orderinformation.setOrderdate(timestamp);
        //更新订单表
        int m=orderInformationService.updateByPrimaryKeySelective(orderinformation);
        //更新成员表
        int n=memberService.updateByExampleSelective(member,membersExample);

        goodsinformationService.updateByPrimaryKeySelective(goodsinformation);

        if(m==1&&n==1){
            jsonObject.put("success",true);
        }
        else{
            jsonObject.put("success",false);
        }
        return jsonObject;
    }
    //返回所有退款退货订单
    @RequestMapping(value = "/returnGoods",method = RequestMethod.GET)
    @ResponseBody
    public JSONObject returnGoods(){
        JSONObject jsonObject=new JSONObject();
        OrderinformationExample orderinformationExample=new OrderinformationExample();
        OrderinformationExample.Criteria criteria=orderinformationExample.createCriteria();
        List<String> stringList=new LinkedList<String>(){{
            add("申请退货");
            add("申请退款");
        }};
        criteria.andStatusIn (stringList);
        List<Orderinformation> orderinformationList=orderInformationService.selectByExample(orderinformationExample);
        for(int i=0;i<orderinformationList.size();i++){
            Orderinformation orderinformation=orderinformationList.get(i);
            SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
            String strDate= simpleDateFormat.format(orderinformation.getOrderdate());
            orderinformation.setAddress(strDate);
        }
        jsonObject.put("orderInformation",orderinformationList);
        return jsonObject;
    }

    //通过memberid返回一个人的所有订单
    @RequestMapping("/member/orders")
    @ResponseBody
    public JSONObject searchOrdersByMemberid(HttpServletRequest httpServletRequest){
        HttpSession httpSession=httpServletRequest.getSession();
        JSONObject jsonObject=new JSONObject();
      final   String memberid=(String) httpSession.getAttribute("username");
        OrderinformationExample orderinformationExample=new OrderinformationExample();
        OrderinformationExample.Criteria criteria=orderinformationExample.createCriteria();
        criteria.andMemberidEqualTo(memberid);
      final  List<Orderinformation> orderinformationList=orderInformationService.selectByExample(orderinformationExample);
       /* Goodsinformation[] goodsinformations=new Goodsinformation[50];
        for(int i=0;i<orderinformationList.size();i++){
            int pkid=Integer.parseInt(orderinformationList.get(i).getPaytype());
            Goodsinformation goodsinformation=goodsinformationService.selectByPrimaryKey(pkid);
            goodsinformations[i]=goodsinformation;
        }*/
        List<Goodsinformation> goodsinformations=new LinkedList<Goodsinformation>(){
            {
                for(int i=0;i<orderinformationList.size();i++){
                    int pkid=Integer.parseInt(orderinformationList.get(i).getPaytype());
                    Goodsinformation goodsinformation=goodsinformationService.selectByPrimaryKey(pkid);
                    add(goodsinformation);
                }
            }
        } ;
        jsonObject.put("orderInformation",orderinformationList);
        jsonObject.put("goodsInformation",goodsinformations);
        jsonObject.put("success",true);
        return jsonObject;
    }

    //删除订单
    @RequestMapping(value = "/orders/{orderid}",method = RequestMethod.DELETE)
    @ResponseBody
    public  JSONObject deleteOrders(@PathVariable int orderid){
        JSONObject jsonObject=new JSONObject();
        int n=orderInformationService.deleteByPrimaryKey(orderid);
        if(n==1)
        {
            jsonObject.put("success",true);
        }
        else
        {
            jsonObject.put("success",false);
        }
        return jsonObject;
    }

    //通过memberid查询订单信息和对应的商品信息
    @RequestMapping("/getOrderAndGoods/{orderid}")
    @ResponseBody
    public JSONObject getOrderAndGoods(@PathVariable int orderid){
        JSONObject jsonObject=new JSONObject();
        try {
            Orderinformation orderinformation = orderInformationService.selectByPrimaryKey(orderid);
            int pkid = Integer.parseInt(orderinformation.getPaytype());
            Goodsinformation goodsinformation = goodsinformationService.selectByPrimaryKey(pkid);
            jsonObject.put("success",true);
            jsonObject.put("orderInformation",orderinformation);
            jsonObject.put("goodsInformation",goodsinformation);
        }
        catch (Exception e)
        {
            jsonObject.put("success",false);
        }
        return jsonObject;
    }

    //购物车付款

    @RequestMapping("/shopcartBuy/{goodspkid}")
    @ResponseBody
    public JSONObject shopcartBuy(@PathVariable int goodspkid,HttpServletRequest httpServletRequest){

        JSONObject jsonObject=new JSONObject();
        HttpSession session=httpServletRequest.getSession();
        String memberid=(String)session.getAttribute("username");
        ShopcartKey shopcartKey=new ShopcartKey();
        shopcartKey.setGoodspkid(goodspkid);
        shopcartKey.setMemberid(memberid);
        Shopcart shopcart=shopcartService.selectByPrimaryKey(shopcartKey);

        //更新用户余额信息
        MembersExample membersExample=new MembersExample();
        MembersExample.Criteria criteria1=membersExample.createCriteria();
        criteria1.andMemberidEqualTo(memberid);
        List<Members> membersList=memberService.selectByExample(membersExample);
        Members member=membersList.get(0);
        BigDecimal bigtotal=new BigDecimal(member.getAdvancepayment());
        bigtotal=bigtotal.subtract(shopcart.getTotalprice());
        Double doubletotal=Double.parseDouble(bigtotal.toString());
        if(doubletotal<0)
        {
            jsonObject.put("success",false);
            jsonObject.put("message","购买失败，您的余额不足");
            return jsonObject;
        }
        member.setAdvancepayment(bigtotal+"");

        //更新商品的重量和销量
        Goodsinformation goodsinformation=goodsinformationService.selectByPrimaryKey(goodspkid);

        int buynumber=shopcart.getGoodsnumber();
        int sales=goodsinformation.getSales();
        BigDecimal goodsweight=goodsinformation.getGoodsweight();
        BigDecimal bigBuynumber=BigDecimal.valueOf(buynumber);
        goodsweight=goodsweight.subtract(bigBuynumber);

        Double doublegoodsweight=Double.parseDouble(goodsweight.toString());
        if(doublegoodsweight<0)
        {
            jsonObject.put("success",false);
            jsonObject.put("message","购买失败，库存不足！");
            return jsonObject;
        }
        sales+=buynumber;
        goodsinformation.setSales(sales);
        goodsinformation.setGoodsweight(goodsweight);

        //添加订单信息
        Orderinformation orderinformation=new Orderinformation();
        orderinformation.setGoodsid(shopcart.getGoodsid());

        Date date=new Date();
        MyCommon myCommon=new MyCommon();
        Timestamp timestamp= myCommon.DateToTimestamp(date);
        orderinformation.setOrderdate(timestamp);

        orderinformation.setGoodsprice(shopcart.getGoodsprice()+"");
        orderinformation.setTotalprice(shopcart.getTotalprice()+"");
        orderinformation.setPaytype(goodspkid+"");
        orderinformation.setShiptype("无");
        orderinformation.setMemberid(shopcart.getMemberid());

        //获取收货人地址
        AddressExample addressExample=new AddressExample();
        AddressExample.Criteria criteria=addressExample.createCriteria();
        criteria.andMemberidEqualTo(memberid);
        criteria.andStatusEqualTo("默认地址");
        List<Address> addressList=addressService.selectByExample(addressExample);
        Address address=addressList.get(0);

        orderinformation.setReceivername(address.getReceiver());
        orderinformation.setReceiverphone(address.getReceiverphone());
        orderinformation.setReceiveraddress(address.getReceiveraddress());
        orderinformation.setIsconfirm(shopcart.getGoodsnumber()+"");
        orderinformation.setIspayment("是");
        orderinformation.setAddress("无");
        orderinformation.setReceiverpostcode("无");
        orderinformation.setStatus("未接收");
        try{
            orderInformationService.insertSelective(orderinformation);
            memberService.updateByPrimaryKeySelective(member);
            goodsinformationService.updateByPrimaryKeySelective(goodsinformation);
            shopcartService.deleteByPrimaryKey(shopcartKey);
            jsonObject.put("success",true);
        }catch (Exception e)
        {
            jsonObject.put("success",false);
        }
       return jsonObject;
    }



    //测试
    @RequestMapping("/dispatcher")
    @ResponseBody
    public void test(){

    }
}
