package com.lsjs.zb.dao;

import com.lsjs.zb.pojo.UserGetServer;
import com.lsjs.zb.pojo.UserGetServerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserGetServerMapper {
    int countByExample(UserGetServerExample example);

    int deleteByExample(UserGetServerExample example);

    int insert(UserGetServer record);

    int insertSelective(UserGetServer record);

    List<UserGetServer> selectByExample(UserGetServerExample example);

    int updateByExampleSelective(@Param("record") UserGetServer record, @Param("example") UserGetServerExample example);

    int updateByExample(@Param("record") UserGetServer record, @Param("example") UserGetServerExample example);
}