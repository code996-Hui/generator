package com.hui.dao;

import com.hui.pojo.checkitem;

public interface checkitemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(checkitem record);

    int insertSelective(checkitem record);

    checkitem selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(checkitem record);

    int updateByPrimaryKey(checkitem record);
}