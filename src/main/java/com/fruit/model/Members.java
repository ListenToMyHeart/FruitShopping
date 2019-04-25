package com.fruit.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Members implements Serializable {
    private Integer cartid;

    /**
     * 会员ID
     */
    private String memberid;

    /**
     * 真实姓名
     */
    private String truename;

    /**
     * 会员性别
     */
    private String sex;

    /**
     * 电话号码
     */
    private String phone;

    /**
     * Email
     */
    private String email;

    /**
     * 所在城市
     */
    private String city;

    /**
     * 地址
     */
    private String address;

    /**
     * 邮编号码
     */
    private String postcode;

    /**
     * 现有存款
     */
    private String advancepayment;

    /**
     * 上次登录时间
     */
    private Date loaddate;

    private static final long serialVersionUID = 1L;

    public Integer getCartid() {
        return cartid;
    }

    public void setCartid(Integer cartid) {
        this.cartid = cartid;
    }

    public String getMemberid() {
        return memberid;
    }

    public void setMemberid(String memberid) {
        this.memberid = memberid;
    }

    public String getTruename() {
        return truename;
    }

    public void setTruename(String truename) {
        this.truename = truename;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getAdvancepayment() {
        return advancepayment;
    }

    public void setAdvancepayment(String advancepayment) {
        this.advancepayment = advancepayment;
    }

    public Date getLoaddate() {
        return loaddate;
    }

    public void setLoaddate(Date loaddate) {
        this.loaddate = loaddate;
    }
}