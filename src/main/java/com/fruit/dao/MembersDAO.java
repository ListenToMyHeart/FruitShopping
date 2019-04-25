package com.fruit.dao;

import com.fruit.model.Members;
import com.fruit.model.MembersExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MembersDAO {
    long countByExample(MembersExample example);

    int deleteByExample(MembersExample example);

    int deleteByPrimaryKey(Integer cartid);

    int insert(Members record);

    int insertSelective(Members record);

    List<Members> selectByExample(MembersExample example);

    Members selectByPrimaryKey(Integer cartid);

    int updateByExampleSelective(@Param("record") Members record, @Param("example") MembersExample example);

    int updateByExample(@Param("record") Members record, @Param("example") MembersExample example);

    int updateByPrimaryKeySelective(Members record);

    int updateByPrimaryKey(Members record);
}