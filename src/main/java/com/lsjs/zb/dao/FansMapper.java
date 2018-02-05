package com.lsjs.zb.dao;

import com.lsjs.zb.pojo.Fans;
import com.lsjs.zb.pojo.FansExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FansMapper {
    int countByExample(FansExample example);

    int deleteByExample(FansExample example);

    int deleteByPrimaryKey(Integer fansId);

    int insert(Fans record);

    int insertSelective(Fans record);

    List<Fans> selectByExample(FansExample example);

    Fans selectByPrimaryKey(Integer fansId);

    int updateByExampleSelective(@Param("record") Fans record, @Param("example") FansExample example);

    int updateByExample(@Param("record") Fans record, @Param("example") FansExample example);

    int updateByPrimaryKeySelective(Fans record);

    int updateByPrimaryKey(Fans record);
}