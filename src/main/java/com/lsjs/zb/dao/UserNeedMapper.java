package com.lsjs.zb.dao;

import com.lsjs.zb.pojo.UserNeed;
import com.lsjs.zb.pojo.UserNeedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserNeedMapper {
    int countByExample(UserNeedExample example);

    int deleteByExample(UserNeedExample example);

    int insert(UserNeed record);

    int insertSelective(UserNeed record);

    List<UserNeed> selectByExample(UserNeedExample example);

    int updateByExampleSelective(@Param("record") UserNeed record, @Param("example") UserNeedExample example);

    int updateByExample(@Param("record") UserNeed record, @Param("example") UserNeedExample example);
}