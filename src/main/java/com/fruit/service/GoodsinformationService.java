package com.fruit.service;

import com.fruit.model.Goodsinformation;
import com.fruit.model.GoodsinformationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Admin on 2017/4/4.
 */
public interface GoodsinformationService {

    long countByExample(GoodsinformationExample example);

    int deleteByExample(GoodsinformationExample example);

    int deleteByPrimaryKey(Integer pkid);

    int insert(Goodsinformation record);

    int insertSelective(Goodsinformation record);

    List<Goodsinformation> selectByExample(GoodsinformationExample example);

    Goodsinformation selectByPrimaryKey(Integer pkid);

    int updateByExampleSelective(@Param("record") Goodsinformation record, @Param("example") GoodsinformationExample example);

    int updateByExample(@Param("record") Goodsinformation record, @Param("example") GoodsinformationExample example);

    int updateByPrimaryKeySelective(Goodsinformation record);

    int updateByPrimaryKey(Goodsinformation record);
}
