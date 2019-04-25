package com.fruit.service;

import com.fruit.model.Members;
import com.fruit.model.MembersExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Admin on 2017/4/12.
 */
public interface MemberService {

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
