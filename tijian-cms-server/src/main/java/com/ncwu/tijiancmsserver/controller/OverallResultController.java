package com.ncwu.tijiancmsserver.controller;

import com.ncwu.tijiancmsserver.service.OverallResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/overallResult")
public class OverallResultController {
    @Autowired
    private OverallResultService overallResultService;
    
    @RequestMapping("/listOverallResultByOrderId")
    public Object listOverallResultByOrderId(@RequestBody Map params){
        List<Map> list = 
            overallResultService.selectByOrderId(params.get("orderId").toString());
        return list;
    }
}