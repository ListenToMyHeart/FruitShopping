package com.fruit.Model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 */
public class Goodsinformation implements Serializable {
    private Integer pkid;

    /**
     * 商品名称
     */
    private String goodsid;

    /**
     * 商品类别
     */
    private String classid;

    /**
     * 商品介绍
     */
    private String goodsintroduce;

    /**
     * 商品品牌
     */
    private String goodsbrand;

    /**
     * 商品计数单位
     */
    private String goodsunit;

    /**
     * 商品重量
     */
    private BigDecimal goodsweight;

    /**
     * 商品图片地址
     */
    private String goodsurl;

    private Integer sales;

    private BigDecimal pregoodsprice;

    /**
     * 商品价格
     */
    private BigDecimal goodsprice;

    /**
     * 是否精品
     */
    private String isrefinement;

    /**
     * 是否热销
     */
    private String ishot;

    /**
     * 是否特价
     */
    private String isdiscount;

    /**
     * 上传日期
     */
    private Date updatatime;

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

    public String getClassid() {
        return classid;
    }

    public void setClassid(String classid) {
        this.classid = classid;
    }

    public String getGoodsintroduce() {
        return goodsintroduce;
    }

    public void setGoodsintroduce(String goodsintroduce) {
        this.goodsintroduce = goodsintroduce;
    }

    public String getGoodsbrand() {
        return goodsbrand;
    }

    public void setGoodsbrand(String goodsbrand) {
        this.goodsbrand = goodsbrand;
    }

    public String getGoodsunit() {
        return goodsunit;
    }

    public void setGoodsunit(String goodsunit) {
        this.goodsunit = goodsunit;
    }

    public BigDecimal getGoodsweight() {
        return goodsweight;
    }

    public void setGoodsweight(BigDecimal goodsweight) {
        this.goodsweight = goodsweight;
    }

    public String getGoodsurl() {
        return goodsurl;
    }

    public void setGoodsurl(String goodsurl) {
        this.goodsurl = goodsurl;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public BigDecimal getPregoodsprice() {
        return pregoodsprice;
    }

    public void setPregoodsprice(BigDecimal pregoodsprice) {
        this.pregoodsprice = pregoodsprice;
    }

    public BigDecimal getGoodsprice() {
        return goodsprice;
    }

    public void setGoodsprice(BigDecimal goodsprice) {
        this.goodsprice = goodsprice;
    }

    public String getIsrefinement() {
        return isrefinement;
    }

    public void setIsrefinement(String isrefinement) {
        this.isrefinement = isrefinement;
    }

    public String getIshot() {
        return ishot;
    }

    public void setIshot(String ishot) {
        this.ishot = ishot;
    }

    public String getIsdiscount() {
        return isdiscount;
    }

    public void setIsdiscount(String isdiscount) {
        this.isdiscount = isdiscount;
    }

    public Date getUpdatatime() {
        return updatatime;
    }

    public void setUpdatatime(Date updatatime) {
        this.updatatime = updatatime;
    }
}