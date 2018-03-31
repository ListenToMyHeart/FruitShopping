package com.fruit.Service;

import com.fruit.Model.Login;
import com.fruit.Model.LoginExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Admin on 2017/3/30.
 */
public interface LoginService {

    long countByExample(LoginExample example);

    int deleteByExample(LoginExample example);

    int deleteByPrimaryKey(String userid);

    int insert(Login record);

    int insertSelective(Login record);

    List<Login> selectByExample(LoginExample example);

    Login selectByPrimaryKey(String userid);

    int updateByExampleSelective(@Param("record") Login record, @Param("example") LoginExample example);

    int updateByExample(@Param("record") Login record, @Param("example") LoginExample example);

    int updateByPrimaryKeySelective(Login record);

    int updateByPrimaryKey(Login record);
}
