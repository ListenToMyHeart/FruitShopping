package com.fruit.service.Impl;

import com.fruit.dao.UserDAO;
import com.fruit.model.User;
import com.fruit.model.UserExample;
import com.fruit.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Admin on 2017/4/3.
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDAO userDAO;

    public long countByExample(UserExample example) {
        return userDAO.countByExample(example);
    }

    public int deleteByExample(UserExample example) {
        return userDAO.deleteByExample(example);
    }

    public int deleteByPrimaryKey(String userid) {
        return userDAO.deleteByPrimaryKey(userid);
    }

    public int insert(User record) {
        return userDAO.insert(record);
    }

    public int insertSelective(User record) {
        return userDAO.insertSelective(record);
    }

    public List<User> selectByExample(UserExample example) {
        return userDAO.selectByExample(example);
    }

    public User selectByPrimaryKey(String userid) {
        return userDAO.selectByPrimaryKey(userid);
    }

    public int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example) {
        return userDAO.updateByExampleSelective(record, example);
    }

    public int updateByExample(@Param("record") User record, @Param("example") UserExample example) {
        return userDAO.updateByExample(record, example);
    }

    public int updateByPrimaryKeySelective(User record) {
        return userDAO.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(User record) {
        return userDAO.updateByPrimaryKey(record);
    }
}
