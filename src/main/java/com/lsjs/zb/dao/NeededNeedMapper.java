package com.lsjs.zb.dao;

import com.lsjs.zb.pojo.NeededNeed;
import com.lsjs.zb.pojo.NeededNeedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NeededNeedMapper {
    int countByExample(NeededNeedExample example);

    int deleteByExample(NeededNeedExample example);

    int deleteByPrimaryKey(Integer neededId);

    int insert(NeededNeed record);

    int insertSelective(NeededNeed record);

    List<NeededNeed> selectByExample(NeededNeedExample example);

    NeededNeed selectByPrimaryKey(Integer neededId);

    int updateByExampleSelective(@Param("record") NeededNeed record, @Param("example") NeededNeedExample example);

    int updateByExample(@Param("record") NeededNeed record, @Param("example") NeededNeedExample example);

    int updateByPrimaryKeySelective(NeededNeed record);

    int updateByPrimaryKey(NeededNeed record);
}