package com.fruit.service.Impl;

import com.fruit.dao.MembersDAO;
import com.fruit.model.Members;
import com.fruit.model.MembersExample;
import com.fruit.service.MemberService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Admin on 2017/4/12.
 */
@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    MembersDAO membersDAO;

    public long countByExample(MembersExample example) {
        return membersDAO.countByExample(example);
    }

    public int deleteByExample(MembersExample example) {
        return membersDAO.deleteByExample(example);
    }

    public int deleteByPrimaryKey(Integer cartid) {
        return membersDAO.deleteByPrimaryKey(cartid);
    }

    public int insert(Members record) {
        return membersDAO.insert(record);
    }

    public int insertSelective(Members record) {
        return membersDAO.insertSelective(record);
    }

    public List<Members> selectByExample(MembersExample example) {
        return membersDAO.selectByExample(example);
    }

    public Members selectByPrimaryKey(Integer cartid) {
        return membersDAO.selectByPrimaryKey(cartid);
    }

    public int updateByExampleSelective(@Param("record") Members record, @Param("example") MembersExample example) {
        return membersDAO.updateByExampleSelective(record, example);
    }

    public int updateByExample(@Param("record") Members record, @Param("example") MembersExample example) {
        return membersDAO.updateByExample(record, example);
    }

    public int updateByPrimaryKeySelective(Members record) {
        return membersDAO.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Members record) {
        return membersDAO.updateByPrimaryKey(record);
    }
}
