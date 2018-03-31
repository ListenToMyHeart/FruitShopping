package com.fruit.Model;

import java.io.Serializable;

/**
 * @author 
 */
public class Login implements Serializable {
    /**
     * 用户名
     */
    private String userid;

    private String password;

    /**
     * 状态（有无被锁）
     */
    private Integer status;

    /**
     * 权限
     */
    private Integer privilege;

    private static final long serialVersionUID = 1L;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getPrivilege() {
        return privilege;
    }

    public void setPrivilege(Integer privilege) {
        this.privilege = privilege;
    }
}