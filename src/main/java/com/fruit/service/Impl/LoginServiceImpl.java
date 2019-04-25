package com.fruit.service.Impl;

import com.fruit.dao.LoginDAO;
import com.fruit.model.Login;
import com.fruit.model.LoginExample;
import com.fruit.service.LoginService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Admin on 2017/3/30.
 */

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    LoginDAO loginDAO;

    public long countByExample(LoginExample example) {
        return 0;
    }

    public int deleteByExample(LoginExample example) {
        return 0;
    }

    public int deleteByPrimaryKey(String userid) {
        return 0;
    }

    public int insert(Login record) {
        return 0;
    }

    public int insertSelective(Login record) {
        return 0;
    }

    public List<Login> selectByExample(LoginExample example) {
        return null;
    }

    public Login selectByPrimaryKey(String userid) {
        return loginDAO.selectByPrimaryKey(userid);
    }

    public int updateByExampleSelective(@Param("record") Login record, @Param("example") LoginExample example) {
        return 0;
    }

    public int updateByExample(@Param("record") Login record, @Param("example") LoginExample example) {
        return 0;
    }

    public int updateByPrimaryKeySelective(Login record) {
        return 0;
    }

    public int updateByPrimaryKey(Login record) {
        return 0;
    }
}
