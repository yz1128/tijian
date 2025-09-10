package com.ncwu.tijiancmsserver.mapper;

import com.ncwu.tijiancmsserver.model.Cidetailedreport;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface CidetailedreportMapper {
    int deleteByPrimaryKey(Integer cidrid);

    int insert(Cidetailedreport record);

    int insertSelective(Cidetailedreport record);

    Cidetailedreport selectByPrimaryKey(Integer cidrid);

    int updateByPrimaryKeySelective(Cidetailedreport record);

    int updateByPrimaryKey(Cidetailedreport record);
    
    // 添加批量更新方法
    int batchUpdate(@Param("list") List<Cidetailedreport> list);
    
    // 添加根据检查项ID和订单ID查询检查项明细的方法
    List<Map> selectByCiIdAndOrderId(@Param("ciId") Integer ciId, @Param("orderId") Integer orderId);
}