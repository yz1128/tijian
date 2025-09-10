package com.ncwu.tijiancmsserver.service;

import com.ncwu.tijiancmsserver.model.Orders;

import java.util.List;
import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

public interface OrdersService {
    Map listOrder(Integer pageNum, Integer pageSize, String userId, String realName, String sex, String smId, String orderDate, String state);

    Map getOrdersById(String orderId);

    @Transactional
    void updateOrdersState(Integer orderId, Integer state);
}
