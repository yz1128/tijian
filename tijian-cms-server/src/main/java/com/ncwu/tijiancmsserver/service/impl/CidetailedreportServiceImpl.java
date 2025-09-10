package com.ncwu.tijiancmsserver.service.impl;

import com.ncwu.tijiancmsserver.mapper.CidetailedreportMapper;
import com.ncwu.tijiancmsserver.model.Cidetailedreport;
import com.ncwu.tijiancmsserver.service.CidetailedreportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class CidetailedreportServiceImpl implements CidetailedreportService {

    @Autowired
    private CidetailedreportMapper cidetailedreportMapper;

    @Override
    public int updateByPrimaryKeySelective(Map param) {
        Cidetailedreport record = new Cidetailedreport();
        record.setCidrid(Integer.valueOf(param.get("cidrId").toString()));
        record.setValue(param.get("value").toString());
        record.setIserror(Integer.valueOf(param.get("isError").toString()));
        return cidetailedreportMapper.updateByPrimaryKeySelective(record);
    }
}