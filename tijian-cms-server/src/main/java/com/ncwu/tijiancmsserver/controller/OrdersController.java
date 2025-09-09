package com.ncwu.tijiancmsserver.controller;

import com.ncwu.tijiancmsserver.mapper.OrdersMapper;
import com.ncwu.tijiancmsserver.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
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
    public Object listOrders(@RequestBody Map map) {
        System.out.println(map);
        System.out.println("listOrders");

        Integer pageNum = (Integer)map.get("pageNum");
        Integer pageSize = (Integer)map.get("maxPageNum");

        List<Map> list = ordersService.listOrder(pageNum,pageSize);
        Integer total = ordersMapper.selectCount();
        Map<String, Object> result = new HashMap<>();
        result.put("list", list);
        result.put("totalRow", total);
        result.put("maxPageNum", pageNum);
        System.out.println(result);
        return result;
    }
}
