package com.ncwu.tijiancmsserver.mapper;

import com.ncwu.tijiancmsserver.model.Overallresult;

import java.util.List;
import java.util.Map;

public interface OverallresultMapper {
    int deleteByPrimaryKey(Integer orid);

    int insert(Overallresult record);

    int insertSelective(Overallresult record);

    Overallresult selectByPrimaryKey(Integer orid);

    int updateByPrimaryKeySelective(Overallresult record);

    int updateByPrimaryKey(Overallresult record);
    List<Map> selectByOrderId(String orderId);
}