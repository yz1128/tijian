package com.ncwu.tijiancmsserver.mapper;

import com.ncwu.tijiancmsserver.model.Setmeal;

import java.util.List;

public interface SetmealMapper {
    int deleteByPrimaryKey(Integer smid);

    int insert(Setmeal record);

    int insertSelective(Setmeal record);

    Setmeal selectByPrimaryKey(Integer smid);

    int updateByPrimaryKeySelective(Setmeal record);

    int updateByPrimaryKey(Setmeal record);
    
    // 添加查询所有套餐的方法
    List<Setmeal> selectAll();
}