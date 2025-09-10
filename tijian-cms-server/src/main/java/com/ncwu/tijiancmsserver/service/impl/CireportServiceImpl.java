package com.ncwu.tijiancmsserver.service.impl;

import com.ncwu.tijiancmsserver.mapper.CheckitemMapper;
import com.ncwu.tijiancmsserver.mapper.CireportMapper;
import com.ncwu.tijiancmsserver.mapper.SetmealdetailedMapper;
import com.ncwu.tijiancmsserver.model.Cireport;
import com.ncwu.tijiancmsserver.service.CireportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CireportServiceImpl implements CireportService {
    @Autowired
    private CireportMapper cireportMapper;
    @Autowired
    private CheckitemMapper checkitemMapper;
    @Override
    public int createReportTemplate(String orderId, String smId) {
        List<Map> checkItemlist = checkitemMapper.selectCiIdBySmId(smId);
        for (Map map : checkItemlist) {
            Cireport cireport = new Cireport();
            cireport.setOrderid(Integer.valueOf(orderId));
            cireport.setCiid(Integer.valueOf(map.get("ciId").toString()));
            cireport.setCiname(map.get("ciName").toString());
            cireportMapper.insert(cireport);
        }
        System.out.printf(checkItemlist.toString());
        return 0;
    }

    @Override
    public List<Map> selectCiReportById(String orderId) {
        List<Map> list = cireportMapper.selectByOrderId(orderId);
        return list;
    }
}
