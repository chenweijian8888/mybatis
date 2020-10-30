package com.qf.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.io.ResolverUtil;

public interface TestSelectMapper {
    int insert(@Param("test") ResolverUtil.Test test);
}
