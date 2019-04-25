package com.fruit.service.Impl;

import com.fruit.dao.OrderinformationDAO;
import com.fruit.model.Orderinformation;
import com.fruit.model.OrderinformationExample;
import com.fruit.service.OrderInformationService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Admin on 2017/4/12.
 */
@Service
public class OrderInformationServiceImpl implements OrderInformationService {

    @Autowired
    OrderinformationDAO orderinformationDAO;
    public long countByExample(OrderinformationExample example) {
        return orderinformationDAO.countByExample(example);
    }

    public int deleteByExample(OrderinformationExample example) {
        return orderinformationDAO.deleteByExample(example);
    }

    public int deleteByPrimaryKey(Integer orderid) {
        return orderinformationDAO.deleteByPrimaryKey(orderid);
    }

    public int insert(Orderinformation record) {
        return orderinformationDAO.insert(record);
    }

    public int insertSelective(Orderinformation record) {
        return orderinformationDAO.insertSelective(record);
    }

    public List<Orderinformation> selectByExample(OrderinformationExample example) {
        return orderinformationDAO.selectByExample(example);
    }

    public Orderinformation selectByPrimaryKey(Integer orderid) {
        return orderinformationDAO.selectByPrimaryKey(orderid);
    }

    public int updateByExampleSelective(@Param("record") Orderinformation record, @Param("example") OrderinformationExample example) {
        return orderinformationDAO.updateByExampleSelective(record, example);
    }

    public int updateByExample(@Param("record") Orderinformation record, @Param("example") OrderinformationExample example) {
        return orderinformationDAO.updateByExample(record, example);
    }

    public int updateByPrimaryKeySelective(Orderinformation record) {
        return orderinformationDAO.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Orderinformation record) {
        return orderinformationDAO.updateByPrimaryKey(record);
    }
}
