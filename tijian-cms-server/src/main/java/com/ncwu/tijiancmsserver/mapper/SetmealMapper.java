package com.ncwu.tijiancmsserver.mapper;

import com.ncwu.tijiancmsserver.model.Setmeal;

public interface SetmealMapper {
    int deleteByPrimaryKey(Integer smid);

    int insert(Setmeal record);

    int insertSelective(Setmeal record);

    Setmeal selectByPrimaryKey(Integer smid);

    int updateByPrimaryKeySelective(Setmeal record);

    int updateByPrimaryKey(Setmeal record);
}