package com.lsjs.zb.dao;

import com.lsjs.zb.pojo.ServeringServer;
import com.lsjs.zb.pojo.ServeringServerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServeringServerMapper {
    int countByExample(ServeringServerExample example);

    int deleteByExample(ServeringServerExample example);

    int deleteByPrimaryKey(Integer serveringId);

    int insert(ServeringServer record);

    int insertSelective(ServeringServer record);

    List<ServeringServer> selectByExample(ServeringServerExample example);

    ServeringServer selectByPrimaryKey(Integer serveringId);

    int updateByExampleSelective(@Param("record") ServeringServer record, @Param("example") ServeringServerExample example);

    int updateByExample(@Param("record") ServeringServer record, @Param("example") ServeringServerExample example);

    int updateByPrimaryKeySelective(ServeringServer record);

    int updateByPrimaryKey(ServeringServer record);
}