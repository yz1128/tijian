package com.ncwu.tijiancmsserver.service.impl;

import com.ncwu.tijiancmsserver.mapper.*;
import com.ncwu.tijiancmsserver.model.Checkitemdetailed;
import com.ncwu.tijiancmsserver.model.Cidetailedreport;
import com.ncwu.tijiancmsserver.model.Cireport;
import com.ncwu.tijiancmsserver.service.CireportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
public class CireportServiceImpl implements CireportService {
    @Autowired
    private CireportMapper cireportMapper;
    @Autowired
    private CheckitemMapper checkitemMapper;
    @Autowired
    private CheckitemdetailedMapper checkitemdetailedMapper;
    @Autowired
    private CidetailedreportMapper cidetailedreportMapper;
    
    @Transactional
    @Override
    public int createReportTemplate(String orderId, String smId) {
        // 根据套餐ID 获取对应的所有检查项的ID 以及检查项目名称
        List<Map> checkItemlist = checkitemMapper.selectCiIdBySmId(smId);
        
        for (Map map : checkItemlist) {
            Cireport cireport = new Cireport();
            cireport.setOrderid(Integer.valueOf(orderId));
            cireport.setCiid(Integer.valueOf(map.get("ciId").toString()));
            cireport.setCiname(map.get("ciName").toString());
            cireportMapper.insert(cireport);
            
            // 根据CiId(检查项Id) 获取这个检查项的所有明细数据
            List<Checkitemdetailed> list = checkitemdetailedMapper.selectByCiId(Integer.valueOf(map.get("ciId").toString()));
            
            // 循环检查项的所有明细
            for (Checkitemdetailed c : list) {
                Cidetailedreport cidetailedreport = new Cidetailedreport();
                cidetailedreport.setCiid(Integer.valueOf(map.get("ciId").toString()));
                cidetailedreport.setOrderid(Integer.valueOf(orderId));
                cidetailedreport.setMaxrange(c.getMaxrange());
                cidetailedreport.setMinrange(c.getMinrange());
                cidetailedreport.setName(c.getName());
                cidetailedreport.setNormalvalue(c.getNormalvalue());
                cidetailedreport.setNormalvaluestring(c.getNormalvaluestring());
                cidetailedreport.setType(c.getType());
                cidetailedreport.setUnit(c.getUnit());
                cidetailedreport.setIserror(0);
                
                cidetailedreportMapper.insert(cidetailedreport); // 插入体检报告对应的 检查项明细
            }
        }
        
        return 0;
    }

    // 修改selectCiReportById方法
    @Override
    public List<Map> selectCiReportById(String orderId) {
        List<Map> list = cireportMapper.selectByOrderId(orderId);
        
        // 为每个检查项添加检查项明细数据
        for (Map ci : list) {
            // 查询该检查项的所有明细
            List<Map> cidrList = cidetailedreportMapper.selectByCiIdAndOrderId(
                Integer.valueOf(ci.get("ciId").toString()), 
                Integer.valueOf(orderId)
            );
            ci.put("cidrList", cidrList);
        }
        
        return list;
    }
}
