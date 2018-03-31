package com.fruit.DAO;

import com.fruit.Model.Shopcart;
import com.fruit.Model.ShopcartExample;
import com.fruit.Model.ShopcartKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopcartDAO {
    long countByExample(ShopcartExample example);

    int deleteByExample(ShopcartExample example);

    int deleteByPrimaryKey(ShopcartKey key);

    int insert(Shopcart record);

    int insertSelective(Shopcart record);

    List<Shopcart> selectByExample(ShopcartExample example);

    Shopcart selectByPrimaryKey(ShopcartKey key);

    int updateByExampleSelective(@Param("record") Shopcart record, @Param("example") ShopcartExample example);

    int updateByExample(@Param("record") Shopcart record, @Param("example") ShopcartExample example);

    int updateByPrimaryKeySelective(Shopcart record);

    int updateByPrimaryKey(Shopcart record);
}