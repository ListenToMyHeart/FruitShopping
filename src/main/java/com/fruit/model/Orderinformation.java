package com.fruit.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Orderinformation implements Serializable {
    /**
     * 订单ID
     */
    private Integer orderid;

    /**
     * 商品名称
     */
    private String goodsid;

    /**
     * 提交订单日期
     */
    private Date orderdate;


    /**
     * 商品价格
     */
    private String goodsprice;

    /**
     * 总价格
     */
    private String totalprice;

    /**
     * 付款方式
     */
    private String paytype;

    /**
     * 运送方式
     */
    private String shiptype;

    /**
     * 用户id
     */
    private String memberid;

    /**
     * 接收人姓名
     */
    private String receivername;

    /**
     * 接收人电话
     */
    private String receiverphone;

    /**
     * 是否确认
     */
    private String isconfirm;

    /**
     * 是否付款
     */
    private String ispayment;

    /**
     * 地址
     */
    private String address;

    /**
     * 接收人邮编
     */
    private String receiverpostcode;

    /**
     * 接收人地址
     */
    private String receiveraddress;

    /**
     * 商品状态（已收货,已退货，运送中）
     */
    private String status;

    private static final long serialVersionUID = 1L;

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public String getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(String goodsid) {
        this.goodsid = goodsid;
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    public String getGoodsprice() {
        return goodsprice;
    }

    public void setGoodsprice(String goodsprice) {
        this.goodsprice = goodsprice;
    }

    public String getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(String totalprice) {
        this.totalprice = totalprice;
    }

    public String getPaytype() {
        return paytype;
    }

    public void setPaytype(String paytype) {
        this.paytype = paytype;
    }

    public String getShiptype() {
        return shiptype;
    }

    public void setShiptype(String shiptype) {
        this.shiptype = shiptype;
    }

    public String getMemberid() {
        return memberid;
    }

    public void setMemberid(String memberid) {
        this.memberid = memberid;
    }

    public String getReceivername() {
        return receivername;
    }

    public void setReceivername(String receivername) {
        this.receivername = receivername;
    }

    public String getReceiverphone() {
        return receiverphone;
    }

    public void setReceiverphone(String receiverphone) {
        this.receiverphone = receiverphone;
    }

    public String getIsconfirm() {
        return isconfirm;
    }

    public void setIsconfirm(String isconfirm) {
        this.isconfirm = isconfirm;
    }

    public String getIspayment() {
        return ispayment;
    }

    public void setIspayment(String ispayment) {
        this.ispayment = ispayment;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getReceiverpostcode() {
        return receiverpostcode;
    }

    public void setReceiverpostcode(String receiverpostcode) {
        this.receiverpostcode = receiverpostcode;
    }

    public String getReceiveraddress() {
        return receiveraddress;
    }

    public void setReceiveraddress(String receiveraddress) {
        this.receiveraddress = receiveraddress;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}