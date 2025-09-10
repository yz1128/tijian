package com.ncwu.tijiancmsserver.service.impl;

import com.ncwu.tijiancmsserver.mapper.OrdersMapper;
import com.ncwu.tijiancmsserver.model.Orders;
import com.ncwu.tijiancmsserver.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class OrderServiceImpl implements OrdersService {
    
    @Autowired
    private OrdersMapper ordersMapper;

    @Override
    public Map  listOrder(Integer pageNum, Integer pageSize,
                          String userId, String realName,
                          String sex, String smId,
                          String orderDate, String state) {
        Integer total = ordersMapper.selectCount(userId,realName,sex,smId,orderDate,state);
        Integer skipNum = (pageNum - 1) * pageSize;
        // 获取查询结果
        List<Map> list = ordersMapper.selectOrders(skipNum,pageSize,userId,realName,sex,smId,orderDate,state);
        List<Map> datalist = new ArrayList<Map>();//定义返回给前端的数据
        for (Map map : list) {//遍历结果集合
            Map dataMap = new HashMap();
            dataMap.put("orderId", map.get("orderId"));
            dataMap.put("userId", map.get("userId"));
            Map userMap = new HashMap();
            userMap.put("realName", map.get("realName"));
            userMap.put("sex", map.get("sex"));
            dataMap.put("users", userMap);
            Map setmealMap = new HashMap();
            setmealMap.put("name", map.get("setmealName"));
            dataMap.put("setmeal", setmealMap);
            Map hospitalMap = new HashMap();
            hospitalMap.put("name", map.get("hospitalName"));
            dataMap.put("hospital", hospitalMap);
            dataMap.put("orderDate", map.get("orderDate"));
            dataMap.put("state", map.get("state"));
            dataMap.put("smId", map.get("smId"));
            datalist.add(dataMap);
        }
        Map map = new HashMap();
        map.put("totalRow",total);
        map.put("maxPageNum",pageSize);
        map.put("list",datalist);
        return map;
    }

    @Override
    public Map getOrdersById(String orderId) {
        Map orderMap = ordersMapper.selectById(orderId);
        Map dataMap = new HashMap();
        dataMap.put("orderId", orderId);
        dataMap.put("userId", orderMap.get("userId"));
        Map userMap = new HashMap();
        userMap.put("realName", orderMap.get("realName"));
        userMap.put("sex", orderMap.get("sex"));
        dataMap.put("users", userMap);
        Map setmealMap = new HashMap();
        setmealMap.put("name", orderMap.get("setmealName"));
        dataMap.put("setmeal", setmealMap);
        dataMap.put("orderDate", orderMap.get("orderDate"));
        dataMap.put("state", orderMap.get("state"));
        return dataMap;
    }

    @Override
    public void updateOrdersState(Integer orderId, Integer state) {
        Orders orders=new Orders();
        orders.setOrderid(orderId);
        orders.setState(state);
        ordersMapper.updateByPrimaryKeySelective(orders);
    }
}
