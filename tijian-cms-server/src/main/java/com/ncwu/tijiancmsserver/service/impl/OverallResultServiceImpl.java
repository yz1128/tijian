package com.ncwu.tijiancmsserver.service.impl;

import com.ncwu.tijiancmsserver.mapper.OverallresultMapper;
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
}
