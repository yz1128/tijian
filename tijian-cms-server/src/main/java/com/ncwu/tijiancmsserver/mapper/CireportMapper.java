package com.ncwu.tijiancmsserver.mapper;

import com.ncwu.tijiancmsserver.model.Cireport;

public interface CireportMapper {
    int deleteByPrimaryKey(Integer cirid);

    int insert(Cireport record);

    int insertSelective(Cireport record);

    Cireport selectByPrimaryKey(Integer cirid);

    int updateByPrimaryKeySelective(Cireport record);

    int updateByPrimaryKey(Cireport record);
}