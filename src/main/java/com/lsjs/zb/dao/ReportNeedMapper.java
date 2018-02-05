package com.lsjs.zb.dao;

import com.lsjs.zb.pojo.ReportNeed;
import com.lsjs.zb.pojo.ReportNeedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReportNeedMapper {
    int countByExample(ReportNeedExample example);

    int deleteByExample(ReportNeedExample example);

    int insert(ReportNeed record);

    int insertSelective(ReportNeed record);

    List<ReportNeed> selectByExample(ReportNeedExample example);

    int updateByExampleSelective(@Param("record") ReportNeed record, @Param("example") ReportNeedExample example);

    int updateByExample(@Param("record") ReportNeed record, @Param("example") ReportNeedExample example);
}