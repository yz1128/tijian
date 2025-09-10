package com.ncwu.tijiancmsserver.controller;

import com.ncwu.tijiancmsserver.service.CidetailedreportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/ciDetailedReport")
public class CiDetailedReportController {

    @Autowired
    private CidetailedreportService cidetailedreportService;

    @RequestMapping("/updateCiDetailedReport")
    public Object updateCiDetailedReport(@RequestBody List<Map> params) {
            cidetailedreportService.updateCiDetailedReport(params);
        return 1;
    }
}