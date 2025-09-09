package com.ncwu.tijiancmsserver.service;

import com.ncwu.tijiancmsserver.model.Orders;

import java.util.List;
import java.util.Map;

public interface OrdersService {
    List<Map> listOrder(Integer pageNum, Integer pageSize);
}
