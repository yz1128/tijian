package com.ncwu.tijiancmsserver.controller;

import com.ncwu.tijiancmsserver.mapper.OrdersMapper;
import com.ncwu.tijiancmsserver.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
@CrossOrigin
@RequestMapping("/orders")
public class OrdersController {
    
    @Autowired
    private OrdersService ordersService;
    @Autowired
    private OrdersMapper ordersMapper;

    @RequestMapping("/listOrders")
    public Object listOrders(@RequestBody Map params) {
        System.out.println(params);
        System.out.println("listOrders");

        String userId = (String) params.get("userId");
        String realName = (String) params.get("realName");
        String sex = (String) params.get("sex");
        String smId = null;
        if (params.get("smId") != null) {
            smId = params.get("smId").toString();
        } else {
            // 这里可以给 smId 一个默认值，比如空字符串或者其他符合业务逻辑的值
            smId = "";
        }
        String orderDate = (String) params.get("orderDate");
        String state = (String) params.get("state");


        Integer pageNum = (Integer)params.get("pageNum");
        Integer pageSize = (Integer)params.get("maxPageNum");

        /**
         * 由于前端需要的是分页数据，因此后端需要返回一个Map集合或专门用于封装
         */
        Map map = ordersService.listOrder(pageNum,pageSize ,userId,realName,sex,smId,orderDate,state);
        return map;
    }

    @RequestMapping("/getOrdersById")
    public Object getOrdersById(@RequestBody Map params) {
        String orderId = (String) params.get("orderId");
        Map map = ordersService.getOrdersById(orderId);
        return map;
    }

    @RequestMapping("/updateOrdersState")
    public Object updateOrdersState(@RequestBody Map params) {
            Integer orderId=Integer.valueOf(params.get("orderId").toString());
            Integer state=Integer.valueOf(params.get("state").toString());
            ordersService.updateOrdersState(orderId,state);
            return 1;
    }
}
