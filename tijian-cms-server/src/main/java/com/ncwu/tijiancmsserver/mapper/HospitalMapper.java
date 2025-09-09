package com.ncwu.tijiancmsserver.mapper;

import com.ncwu.tijiancmsserver.model.Hospital;

public interface HospitalMapper {
    int deleteByPrimaryKey(Integer hpid);

    int insert(Hospital record);

    int insertSelective(Hospital record);

    Hospital selectByPrimaryKey(Integer hpid);

    int updateByPrimaryKeySelective(Hospital record);

    int updateByPrimaryKey(Hospital record);
}