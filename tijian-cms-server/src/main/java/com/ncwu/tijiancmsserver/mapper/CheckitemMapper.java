package com.ncwu.tijiancmsserver.mapper;

import com.ncwu.tijiancmsserver.model.Checkitem;

import java.util.List;
import java.util.Map;

public interface CheckitemMapper {
    int deleteByPrimaryKey(Integer ciid);

    int insert(Checkitem record);

    int insertSelective(Checkitem record);

    Checkitem selectByPrimaryKey(Integer ciid);

    int updateByPrimaryKeySelective(Checkitem record);

    int updateByPrimaryKey(Checkitem record);

    List<Map> selectCiIdBySmId(String smId);
}