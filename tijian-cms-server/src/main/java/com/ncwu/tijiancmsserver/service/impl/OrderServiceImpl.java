package com.ncwu.tijiancmsserver.service.impl;

import com.ncwu.tijiancmsserver.mapper.OrdersMapper;
import com.ncwu.tijiancmsserver.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class OrderServiceImpl implements OrdersService {

    @Autowired
    private OrdersMapper ordersMapper;

    @Override
    public List<Map> listOrder(Integer pageNum, Integer pageSize) {
        Integer total = ordersMapper.selectCount();
        Integer skipNum = (pageNum - 1) * pageSize;
        List<Map> list = ordersMapper.selectOrders(skipNum,pageSize);
        return list;
    }
}
