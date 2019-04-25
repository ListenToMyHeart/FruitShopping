package com.fruit.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 
 */
public class Shopcart extends ShopcartKey implements Serializable {
    /**
     * 购物车号
     */
    private Integer cartid;

    /**
     * 商品名称
     */
    private String goodsid;

    /**
     * 商品价格
     */
    private BigDecimal goodsprice;

    /**
     * 商品类别
     */
    private String classid;

    /**
     * 总价
     */
    private BigDecimal totalprice;

    /**
     * 商品数量
     */
    private Integer goodsnumber;

    /**
     * 购物车状态
     */
    private String cartstatus;

    /**
     * 商品图片地址
     */
    private String goodsurl;

    private BigDecimal goodspreprice;

    private String goodsintroduce;

    private static final long serialVersionUID = 1L;

    public Integer getCartid() {
        return cartid;
    }

    public void setCartid(Integer cartid) {
        this.cartid = cartid;
    }

    public String getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(String goodsid) {
        this.goodsid = goodsid;
    }

    public BigDecimal getGoodsprice() {
        return goodsprice;
    }

    public void setGoodsprice(BigDecimal goodsprice) {
        this.goodsprice = goodsprice;
    }

    public String getClassid() {
        return classid;
    }

    public void setClassid(String classid) {
        this.classid = classid;
    }

    public BigDecimal getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(BigDecimal totalprice) {
        this.totalprice = totalprice;
    }

    public Integer getGoodsnumber() {
        return goodsnumber;
    }

    public void setGoodsnumber(Integer goodsnumber) {
        this.goodsnumber = goodsnumber;
    }

    public String getCartstatus() {
        return cartstatus;
    }

    public void setCartstatus(String cartstatus) {
        this.cartstatus = cartstatus;
    }

    public String getGoodsurl() {
        return goodsurl;
    }

    public void setGoodsurl(String goodsurl) {
        this.goodsurl = goodsurl;
    }

    public BigDecimal getGoodspreprice() {
        return goodspreprice;
    }

    public void setGoodspreprice(BigDecimal goodspreprice) {
        this.goodspreprice = goodspreprice;
    }

    public String getGoodsintroduce() {
        return goodsintroduce;
    }

    public void setGoodsintroduce(String goodsintroduce) {
        this.goodsintroduce = goodsintroduce;
    }
}