package com.ncwu.tijiancmsserver.controller;

import com.ncwu.tijiancmsserver.model.Setmeal;
import com.ncwu.tijiancmsserver.service.SetmealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/setmeal")
public class SetmealController {
    @Autowired
    private SetmealService setmealService;

    @PostMapping("/listSetmeal")
    public List<Setmeal> listSetmeal() {
        // 调用service层的listSetmeal方法获取套餐列表并返回给前端
        System.out.println(setmealService.listSetmeal());
        return setmealService.listSetmeal();
    }
}
