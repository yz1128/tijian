package com.ncwu.tijiancmsserver.service;

import com.ncwu.tijiancmsserver.model.Orders;

import java.util.List;
import java.util.Map;

public interface OrdersService {
    Map listOrder(Integer pageNum, Integer pageSize, String userId, String realName, String sex, String smId, String orderDate, String state);

    Map getOrdersById(String orderId);
}
