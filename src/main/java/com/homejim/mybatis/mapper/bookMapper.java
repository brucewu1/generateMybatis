package com.homejim.mybatis.mapper;

import com.homejim.mybatis.entity.book;

public interface bookMapper {
    int deleteByPrimaryKey(Long id);

    int insert(book record);

    int insertSelective(book record);

    book selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(book record);

    int updateByPrimaryKey(book record);
}