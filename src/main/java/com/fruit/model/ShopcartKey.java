package com.fruit.model;

import java.io.Serializable;

/**
 * @author 
 */
public class ShopcartKey implements Serializable {
    /**
     * 商品编号
     */
    private Integer goodspkid;

    /**
     * 会员ID
     */
    private String memberid;

    private static final long serialVersionUID = 1L;

    public Integer getGoodspkid() {
        return goodspkid;
    }

    public void setGoodspkid(Integer goodspkid) {
        this.goodspkid = goodspkid;
    }

    public String getMemberid() {
        return memberid;
    }

    public void setMemberid(String memberid) {
        this.memberid = memberid;
    }
}