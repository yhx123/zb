package com.lsjs.zb.dao;

import com.lsjs.zb.pojo.UserFollowing;
import com.lsjs.zb.pojo.UserFollowingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserFollowingMapper {
    int countByExample(UserFollowingExample example);

    int deleteByExample(UserFollowingExample example);

    int insert(UserFollowing record);

    int insertSelective(UserFollowing record);

    List<UserFollowing> selectByExample(UserFollowingExample example);

    int updateByExampleSelective(@Param("record") UserFollowing record, @Param("example") UserFollowingExample example);

    int updateByExample(@Param("record") UserFollowing record, @Param("example") UserFollowingExample example);
}