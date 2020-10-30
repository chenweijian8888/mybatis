package com.qf.mapper;

import com.qf.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    //插入
    int insert(@Param("user") User user);
    //查询
    User selectByid(@Param("userid") int userid);
    //修改
    int update(@Param("user") User user);
}
