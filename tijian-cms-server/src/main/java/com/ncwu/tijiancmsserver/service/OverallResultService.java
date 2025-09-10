package com.ncwu.tijiancmsserver.service;

import java.util.List;
import java.util.Map;

public interface OverallResultService {
    List<Map> selectByOrderId(String orderId);
}
