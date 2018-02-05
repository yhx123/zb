package com.lsjs.zb.dao;

import com.lsjs.zb.pojo.UserGetNeed;
import com.lsjs.zb.pojo.UserGetNeedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserGetNeedMapper {
    int countByExample(UserGetNeedExample example);

    int deleteByExample(UserGetNeedExample example);

    int insert(UserGetNeed record);

    int insertSelective(UserGetNeed record);

    List<UserGetNeed> selectByExample(UserGetNeedExample example);

    int updateByExampleSelective(@Param("record") UserGetNeed record, @Param("example") UserGetNeedExample example);

    int updateByExample(@Param("record") UserGetNeed record, @Param("example") UserGetNeedExample example);
}