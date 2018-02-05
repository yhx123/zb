package com.lsjs.zb.dao;

import com.lsjs.zb.pojo.CreditDetail;
import com.lsjs.zb.pojo.CreditDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CreditDetailMapper {
    int countByExample(CreditDetailExample example);

    int deleteByExample(CreditDetailExample example);

    int deleteByPrimaryKey(Integer creditDetailId);

    int insert(CreditDetail record);

    int insertSelective(CreditDetail record);

    List<CreditDetail> selectByExample(CreditDetailExample example);

    CreditDetail selectByPrimaryKey(Integer creditDetailId);

    int updateByExampleSelective(@Param("record") CreditDetail record, @Param("example") CreditDetailExample example);

    int updateByExample(@Param("record") CreditDetail record, @Param("example") CreditDetailExample example);

    int updateByPrimaryKeySelective(CreditDetail record);

    int updateByPrimaryKey(CreditDetail record);
}