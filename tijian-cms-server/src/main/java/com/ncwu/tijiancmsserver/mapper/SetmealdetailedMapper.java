package com.ncwu.tijiancmsserver.mapper;

import com.ncwu.tijiancmsserver.model.Setmealdetailed;

public interface SetmealdetailedMapper {
    int deleteByPrimaryKey(Integer sdid);

    int insert(Setmealdetailed record);

    int insertSelective(Setmealdetailed record);

    Setmealdetailed selectByPrimaryKey(Integer sdid);

    int updateByPrimaryKeySelective(Setmealdetailed record);

    int updateByPrimaryKey(Setmealdetailed record);
}