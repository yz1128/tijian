package com.ncwu.tijiancmsserver.mapper;

import com.ncwu.tijiancmsserver.model.Doctor;
import org.apache.ibatis.annotations.Param;

public interface DoctorMapper {
    int deleteByPrimaryKey(Integer docid);

    int insert(Doctor record);

    int insertSelective(Doctor record);

    Doctor selectByPrimaryKey(Integer docid);

    int updateByPrimaryKeySelective(Doctor record);

    int updateByPrimaryKey(Doctor record);

    Doctor selectByDocCodeByPass(@Param("docCode") String docCode,@Param("password") String password);
}