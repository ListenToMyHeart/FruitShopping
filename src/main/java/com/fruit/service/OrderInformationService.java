package com.fruit.service;

import com.fruit.model.Orderinformation;
import com.fruit.model.OrderinformationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Admin on 2017/4/12.
 */
public interface OrderInformationService {
    long countByExample(OrderinformationExample example);

    int deleteByExample(OrderinformationExample example);

    int deleteByPrimaryKey(Integer orderid);

    int insert(Orderinformation record);

    int insertSelective(Orderinformation record);

    List<Orderinformation> selectByExample(OrderinformationExample example);

    Orderinformation selectByPrimaryKey(Integer orderid);

    int updateByExampleSelective(@Param("record") Orderinformation record, @Param("example") OrderinformationExample example);

    int updateByExample(@Param("record") Orderinformation record, @Param("example") OrderinformationExample example);

    int updateByPrimaryKeySelective(Orderinformation record);

    int updateByPrimaryKey(Orderinformation record);
}
