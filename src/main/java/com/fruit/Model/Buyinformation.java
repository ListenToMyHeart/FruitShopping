package com.fruit.Model;

import java.io.Serializable;

/**
 * @author 
 */
public class Buyinformation implements Serializable {
    /**
     * 购物单号
     */
    private Integer pkid;

    /**
     * 商品ID
     */
    private String goodsid;

    /**
     * 商品数量
     */
    private Integer num;

    /**
     * 订单号
     */
    private Integer orderid;

    /**
     * 商品单价
     */
    private String goodsprice;

    /**
     * 会员ID
     */
    private String memberid;

    private static final long serialVersionUID = 1L;

    public Integer getPkid() {
        return pkid;
    }

    public void setPkid(Integer pkid) {
        this.pkid = pkid;
    }

    public String getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(String goodsid) {
        this.goodsid = goodsid;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public String getGoodsprice() {
        return goodsprice;
    }

    public void setGoodsprice(String goodsprice) {
        this.goodsprice = goodsprice;
    }

    public String getMemberid() {
        return memberid;
    }

    public void setMemberid(String memberid) {
        this.memberid = memberid;
    }
}