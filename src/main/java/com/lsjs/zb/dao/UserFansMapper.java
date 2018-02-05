package com.lsjs.zb.dao;

import com.lsjs.zb.pojo.UserFans;
import com.lsjs.zb.pojo.UserFansExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserFansMapper {
    int countByExample(UserFansExample example);

    int deleteByExample(UserFansExample example);

    int insert(UserFans record);

    int insertSelective(UserFans record);

    List<UserFans> selectByExample(UserFansExample example);

    int updateByExampleSelective(@Param("record") UserFans record, @Param("example") UserFansExample example);

    int updateByExample(@Param("record") UserFans record, @Param("example") UserFansExample example);
}