package com.fruit.Service;

import com.fruit.Model.User;
import com.fruit.Model.UserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Admin on 2017/4/3.
 */
public interface UserService {

    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(String userid);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(String userid);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
