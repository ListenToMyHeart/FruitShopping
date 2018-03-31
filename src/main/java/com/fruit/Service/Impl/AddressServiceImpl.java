package com.fruit.Service.Impl;

import com.fruit.DAO.AddressDAO;
import com.fruit.Model.Address;
import com.fruit.Model.AddressExample;
import com.fruit.Service.AddressService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Admin on 2017/5/3.
 */
@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    AddressDAO addressDAO;

    public long countByExample(AddressExample example) {
        return addressDAO.countByExample(example);
    }

    public int deleteByExample(AddressExample example) {
        return addressDAO.deleteByExample(example);
    }

    public int deleteByPrimaryKey(Integer pkid) {
        return addressDAO.deleteByPrimaryKey(pkid);
    }

    public int insert(Address record) {
        return addressDAO.insert(record);
    }

    public int insertSelective(Address record) {
        return addressDAO.insertSelective(record);
    }

    public List<Address> selectByExample(AddressExample example) {
        return addressDAO.selectByExample(example);
    }

    public Address selectByPrimaryKey(Integer pkid) {
        return addressDAO.selectByPrimaryKey(pkid);
    }

    public int updateByExampleSelective(@Param("record") Address record, @Param("example") AddressExample example) {
        return addressDAO.updateByExampleSelective(record, example);
    }

    public int updateByExample(@Param("record") Address record, @Param("example") AddressExample example) {
        return addressDAO.updateByExample(record, example);
    }

    public int updateByPrimaryKeySelective(Address record) {
        return addressDAO.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Address record) {
        return addressDAO.updateByPrimaryKey(record);
    }
}
