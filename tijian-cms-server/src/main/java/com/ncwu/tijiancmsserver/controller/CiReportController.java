package com.ncwu.tijiancmsserver.controller;

import com.ncwu.tijiancmsserver.service.CireportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/ciReport")
public class CiReportController {

    @Autowired
    private CireportService cireportService;

    @RequestMapping("/createReportTemplate")
    public Object createReportTemplate(@RequestBody Map params) {
        cireportService.createReportTemplate(params.get("orderId").toString(),
                                             params.get("smId").toString());
        return 1;
    }

    @RequestMapping("/listCiReport")
    public Object listCiReport(@RequestBody Map params) {
        List<Map> listMap = cireportService.selectCiReportById(params.get("orderId").toString());
        System.out.println("listMap =" + listMap);
        return listMap;
    }
}
