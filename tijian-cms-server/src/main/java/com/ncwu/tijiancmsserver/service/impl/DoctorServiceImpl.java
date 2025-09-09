package com.ncwu.tijiancmsserver.service.impl;

import com.ncwu.tijiancmsserver.mapper.DoctorMapper;
import com.ncwu.tijiancmsserver.model.Doctor;
import com.ncwu.tijiancmsserver.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorServiceImpl implements DoctorService {
    @Autowired
    private DoctorMapper doctorMapper;

    @Override
    public Doctor getDoctorByCodeByPass(String docCode, String password) {
        /**
         * 如果返回结果不为空，证明账号密码是正确的
         * 否则账号密码错误 登陆失败
         * 注意：
         *      如果账号密码错误，还可以根据IP或账号是否冻结 或 账号是否到期等条件进行逻辑控制，登录后修改最后一次登录时间
         *      如果账号密码错误，可以利用如 Redis 等缓存 记录用户登录失败的次数
         *      如果登录失败3次冻结账号
         */
        Doctor doctor = doctorMapper.selectByDocCodeByPass(docCode,password);
        return doctor;
    }
}
