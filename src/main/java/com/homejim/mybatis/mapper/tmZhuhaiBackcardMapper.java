package com.homejim.mybatis.mapper;

import com.homejim.mybatis.entity.tmZhuhaiBackcard;

public interface tmZhuhaiBackcardMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(tmZhuhaiBackcard record);

    int insertSelective(tmZhuhaiBackcard record);

    tmZhuhaiBackcard selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(tmZhuhaiBackcard record);

    int updateByPrimaryKey(tmZhuhaiBackcard record);
}