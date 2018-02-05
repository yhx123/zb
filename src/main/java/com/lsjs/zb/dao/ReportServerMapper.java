package com.lsjs.zb.dao;

import com.lsjs.zb.pojo.ReportServer;
import com.lsjs.zb.pojo.ReportServerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReportServerMapper {
    int countByExample(ReportServerExample example);

    int deleteByExample(ReportServerExample example);

    int insert(ReportServer record);

    int insertSelective(ReportServer record);

    List<ReportServer> selectByExample(ReportServerExample example);

    int updateByExampleSelective(@Param("record") ReportServer record, @Param("example") ReportServerExample example);

    int updateByExample(@Param("record") ReportServer record, @Param("example") ReportServerExample example);
}