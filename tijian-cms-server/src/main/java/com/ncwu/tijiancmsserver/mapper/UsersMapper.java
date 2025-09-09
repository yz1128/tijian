package com.ncwu.tijiancmsserver.mapper;

import com.ncwu.tijiancmsserver.model.Users;

public interface UsersMapper {
    int deleteByPrimaryKey(String userid);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(String userid);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
}