package com.fruit.Service.Impl;

import com.fruit.DAO.ShopcartDAO;
import com.fruit.Model.Shopcart;
import com.fruit.Model.ShopcartExample;
import com.fruit.Model.ShopcartKey;
import com.fruit.Service.ShopcartService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Admin on 2017/4/27.
 */

@Service
public class ShopcartServiceImpl implements ShopcartService {

    @Autowired
    ShopcartDAO shopcartDAO;


    public long countByExample(ShopcartExample example) {
        return shopcartDAO.countByExample(example);
    }

    public int deleteByExample(ShopcartExample example) {
        return shopcartDAO.deleteByExample(example);
    }

    public int deleteByPrimaryKey(ShopcartKey key) {
        return shopcartDAO.deleteByPrimaryKey(key);
    }

    public int insert(Shopcart record) {
        return shopcartDAO.insert(record);
    }

    public int insertSelective(Shopcart record) {
        return shopcartDAO.insertSelective(record);
    }

    public List<Shopcart> selectByExample(ShopcartExample example) {
        return shopcartDAO.selectByExample(example);
    }

    public Shopcart selectByPrimaryKey(ShopcartKey key) {
        return shopcartDAO.selectByPrimaryKey(key);
    }

    public int updateByExampleSelective(@Param("record") Shopcart record, @Param("example") ShopcartExample example) {
        return shopcartDAO.updateByExampleSelective(record, example);
    }

    public int updateByExample(@Param("record") Shopcart record, @Param("example") ShopcartExample example) {
        return shopcartDAO.updateByExample(record, example);
    }

    public int updateByPrimaryKeySelective(Shopcart record) {
        return shopcartDAO.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Shopcart record) {
        return shopcartDAO.updateByPrimaryKey(record);
    }
}
