package com.ncwu.tijiancmsserver.mapper;

import com.ncwu.tijiancmsserver.model.Checkitemdetailed;

public interface CheckitemdetailedMapper {
    int deleteByPrimaryKey(Integer cdid);

    int insert(Checkitemdetailed record);

    int insertSelective(Checkitemdetailed record);

    Checkitemdetailed selectByPrimaryKey(Integer cdid);

    int updateByPrimaryKeySelective(Checkitemdetailed record);

    int updateByPrimaryKey(Checkitemdetailed record);
}