package com.lsjs.zb.dao;

import com.lsjs.zb.pojo.CreditCreditDetail;
import com.lsjs.zb.pojo.CreditCreditDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CreditCreditDetailMapper {
    int countByExample(CreditCreditDetailExample example);

    int deleteByExample(CreditCreditDetailExample example);

    int insert(CreditCreditDetail record);

    int insertSelective(CreditCreditDetail record);

    List<CreditCreditDetail> selectByExample(CreditCreditDetailExample example);

    int updateByExampleSelective(@Param("record") CreditCreditDetail record, @Param("example") CreditCreditDetailExample example);

    int updateByExample(@Param("record") CreditCreditDetail record, @Param("example") CreditCreditDetailExample example);
}