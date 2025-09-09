package com.ncwu.tijiancmsserver.service;

import com.ncwu.tijiancmsserver.model.Doctor;

public interface DoctorService {
    Doctor getDoctorByCodeByPass(String docCode, String password);
}
