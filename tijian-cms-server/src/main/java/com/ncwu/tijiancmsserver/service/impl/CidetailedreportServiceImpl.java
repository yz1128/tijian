package com.ncwu.tijiancmsserver.service.impl;

import com.ncwu.tijiancmsserver.mapper.CidetailedreportMapper;
import com.ncwu.tijiancmsserver.model.Cidetailedreport;
import com.ncwu.tijiancmsserver.service.CidetailedreportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
public class CidetailedreportServiceImpl implements CidetailedreportService {

    @Autowired
    private CidetailedreportMapper cidetailedreportMapper;

    @Override
    @Transactional
    public void updateCiDetailedReport(List<Map> params) {
        for(Map map : params) {
            Cidetailedreport cidetailedreport = new Cidetailedreport();
            cidetailedreport.setCidrid(Integer.valueOf(map.get("cidrId").toString()));
            cidetailedreport.setValue(map.get("value").toString());
            cidetailedreport.setIserror(Integer.parseInt(map.get("isError").toString()));
            cidetailedreportMapper.updateByPrimaryKeySelective(cidetailedreport);
        }
    }
}