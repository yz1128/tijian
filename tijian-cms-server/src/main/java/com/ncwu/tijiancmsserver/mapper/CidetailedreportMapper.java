package com.ncwu.tijiancmsserver.mapper;

import com.ncwu.tijiancmsserver.model.Cidetailedreport;

public interface CidetailedreportMapper {
    int deleteByPrimaryKey(Integer cidrid);

    int insert(Cidetailedreport record);

    int insertSelective(Cidetailedreport record);

    Cidetailedreport selectByPrimaryKey(Integer cidrid);

    int updateByPrimaryKeySelective(Cidetailedreport record);

    int updateByPrimaryKey(Cidetailedreport record);
}