package com.ncwu.tijiancmsserver.mapper;

import com.ncwu.tijiancmsserver.model.Orders;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface OrdersMapper {
    int deleteByPrimaryKey(Integer orderid);

    int insert(Orders record);

    int insertSelective(Orders record);

    Orders selectByPrimaryKey(Integer orderid);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);

    Integer selectCount(@Param("userId") String userId,
                        @Param("realName") String realName,
                        @Param("sex") String sex,
                        @Param("smId") String smId,
                        @Param("orderDate") String orderDate,
                        @Param("state") String state);

    List<Map> selectOrders(@Param("skipNum") Integer skipNum,
                           @Param("pageSize") Integer pageSize,
                           @Param("userId") String userId,
                           @Param("realName") String realName,
                           @Param("sex") String sex,
                           @Param("smId") String smId,
                           @Param("orderDate") String orderDate,
                           @Param("state") String state);

    Map selectById(String orderId);
}