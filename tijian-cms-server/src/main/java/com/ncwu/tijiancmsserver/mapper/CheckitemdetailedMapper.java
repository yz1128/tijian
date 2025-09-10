package com.ncwu.tijiancmsserver.mapper;

import com.ncwu.tijiancmsserver.model.Checkitemdetailed;
import java.util.List;

public interface CheckitemdetailedMapper {
    int deleteByPrimaryKey(Integer cdid);

    int insert(Checkitemdetailed record);

    int insertSelective(Checkitemdetailed record);

    Checkitemdetailed selectByPrimaryKey(Integer cdid);

    int updateByPrimaryKeySelective(Checkitemdetailed record);

    int updateByPrimaryKey(Checkitemdetailed record);
    
    // 根据检查项ID查询检查项的所有明细数据
    List<Checkitemdetailed> selectByCiId(Integer ciId);
}