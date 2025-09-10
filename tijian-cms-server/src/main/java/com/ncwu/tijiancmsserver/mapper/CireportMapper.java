package com.ncwu.tijiancmsserver.mapper;

import com.ncwu.tijiancmsserver.model.Cireport;

import java.util.List;
import java.util.Map;

public interface CireportMapper {
    int deleteByPrimaryKey(Integer cirid);

    int insert(Cireport record);

    int insertSelective(Cireport record);

    Cireport selectByPrimaryKey(Integer cirid);

    int updateByPrimaryKeySelective(Cireport record);

    int updateByPrimaryKey(Cireport record);

    List<Map> selectByOrderId(String orderId);

    Integer selectCountByOrderId(String orderId);
}