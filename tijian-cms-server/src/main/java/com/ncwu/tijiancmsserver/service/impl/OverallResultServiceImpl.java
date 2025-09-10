package com.ncwu.tijiancmsserver.service.impl;

import com.ncwu.tijiancmsserver.mapper.OverallresultMapper;
import com.ncwu.tijiancmsserver.model.Overallresult;
import com.ncwu.tijiancmsserver.service.OverallResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class OverallResultServiceImpl implements OverallResultService {
    @Autowired
    private OverallresultMapper overallresultMapper;
    
    @Override
    public List<Map> selectByOrderId(String orderId) {
        return overallresultMapper.selectByOrderId(orderId);
    }
    
    @Override
    public void removeOverallResult(String orId) {
        overallresultMapper.deleteByPrimaryKey(Integer.valueOf(orId));
    }
    
    @Override
    public void saveOverallResult(Map params) {
        Overallresult overallresult = new Overallresult();
        overallresult.setOrderid(Integer.valueOf(params.get("orderId").toString()));
        overallresult.setTitle(params.get("title").toString());
        overallresult.setContent(params.get("content").toString());
        overallresultMapper.insert(overallresult);
    }
}
