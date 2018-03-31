package com.fruit.Service.Impl;

import com.fruit.DAO.GoodsinformationDAO;
import com.fruit.Model.Goodsinformation;
import com.fruit.Model.GoodsinformationExample;
import com.fruit.Service.GoodsinformationService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Admin on 2017/4/4.
 */
@Service
public class GoodsinformationImpl implements GoodsinformationService {

    @Autowired
    GoodsinformationDAO goodsinformationDAO;


    public long countByExample(GoodsinformationExample example) {
        return goodsinformationDAO.countByExample(example);
    }

    public int deleteByExample(GoodsinformationExample example) {
        return goodsinformationDAO.deleteByExample(example);
    }

    public int deleteByPrimaryKey(Integer pkid) {
        return goodsinformationDAO.deleteByPrimaryKey(pkid);
    }

    public int insert(Goodsinformation record) {
        return goodsinformationDAO.insert(record);
    }

    public int insertSelective(Goodsinformation record) {
        return goodsinformationDAO.insertSelective(record);
    }

    public List<Goodsinformation> selectByExample(GoodsinformationExample example) {
        return goodsinformationDAO.selectByExample(example);
    }

    public Goodsinformation selectByPrimaryKey(Integer pkid) {
        return goodsinformationDAO.selectByPrimaryKey(pkid);
    }

    public int updateByExampleSelective(@Param("record") Goodsinformation record, @Param("example") GoodsinformationExample example) {
        return goodsinformationDAO.updateByExampleSelective(record, example);
    }

    public int updateByExample(@Param("record") Goodsinformation record, @Param("example") GoodsinformationExample example) {
        return goodsinformationDAO.updateByExample(record, example);
    }

    public int updateByPrimaryKeySelective(Goodsinformation record) {
        return goodsinformationDAO.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Goodsinformation record) {
        return goodsinformationDAO.updateByPrimaryKey(record);
    }
}
