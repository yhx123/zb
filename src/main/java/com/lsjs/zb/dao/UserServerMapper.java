package com.lsjs.zb.dao;

import com.lsjs.zb.pojo.UserServer;
import com.lsjs.zb.pojo.UserServerExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserServerMapper {
    int countByExample(UserServerExample example);

    int deleteByExample(UserServerExample example);

    int insert(UserServer record);

    int insertSelective(UserServer record);

    List<UserServer> selectByExample(UserServerExample example);

    int updateByExampleSelective(@Param("record") UserServer record, @Param("example") UserServerExample example);

    int updateByExample(@Param("record") UserServer record, @Param("example") UserServerExample example);

}