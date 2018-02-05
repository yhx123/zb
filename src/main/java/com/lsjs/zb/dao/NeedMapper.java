package com.lsjs.zb.dao;

import com.lsjs.zb.pojo.Need;
import com.lsjs.zb.pojo.NeedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NeedMapper {
    int countByExample(NeedExample example);

    int deleteByExample(NeedExample example);

    int deleteByPrimaryKey(Integer needId);

    int insert(Need record);

    int insertSelective(Need record);

    List<Need> selectByExample(NeedExample example);

    Need selectByPrimaryKey(Integer needId);

    int updateByExampleSelective(@Param("record") Need record, @Param("example") NeedExample example);

    int updateByExample(@Param("record") Need record, @Param("example") NeedExample example);

    int updateByPrimaryKeySelective(Need record);

    int updateByPrimaryKey(Need record);
}