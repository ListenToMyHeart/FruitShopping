package com.fruit.DAO;

import com.fruit.Model.Buyinformation;
import com.fruit.Model.BuyinformationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BuyinformationDAO {
    long countByExample(BuyinformationExample example);

    int deleteByExample(BuyinformationExample example);

    int deleteByPrimaryKey(Integer pkid);

    int insert(Buyinformation record);

    int insertSelective(Buyinformation record);

    List<Buyinformation> selectByExample(BuyinformationExample example);

    Buyinformation selectByPrimaryKey(Integer pkid);

    int updateByExampleSelective(@Param("record") Buyinformation record, @Param("example") BuyinformationExample example);

    int updateByExample(@Param("record") Buyinformation record, @Param("example") BuyinformationExample example);

    int updateByPrimaryKeySelective(Buyinformation record);

    int updateByPrimaryKey(Buyinformation record);
}