package com.ncwu.tijiancmsserver.service;

import java.util.List;
import java.util.Map;

public interface CireportService {

    int createReportTemplate(String orderId, String smId);

    List<Map> selectCiReportById(String orderId);
}
