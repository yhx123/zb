package com.lsjs.zb.dao;

import com.lsjs.zb.pojo.Following;
import com.lsjs.zb.pojo.FollowingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FollowingMapper {
    int countByExample(FollowingExample example);

    int deleteByExample(FollowingExample example);

    int deleteByPrimaryKey(Integer followeringId);

    int insert(Following record);

    int insertSelective(Following record);

    List<Following> selectByExample(FollowingExample example);

    Following selectByPrimaryKey(Integer followeringId);

    int updateByExampleSelective(@Param("record") Following record, @Param("example") FollowingExample example);

    int updateByExample(@Param("record") Following record, @Param("example") FollowingExample example);

    int updateByPrimaryKeySelective(Following record);

    int updateByPrimaryKey(Following record);
}