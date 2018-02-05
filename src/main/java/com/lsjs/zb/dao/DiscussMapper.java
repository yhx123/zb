package com.lsjs.zb.dao;

import com.lsjs.zb.pojo.Discuss;
import com.lsjs.zb.pojo.DiscussExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DiscussMapper {
    int countByExample(DiscussExample example);

    int deleteByExample(DiscussExample example);

    int deleteByPrimaryKey(Integer discussId);

    int insert(Discuss record);

    int insertSelective(Discuss record);

    List<Discuss> selectByExample(DiscussExample example);

    Discuss selectByPrimaryKey(Integer discussId);

    int updateByExampleSelective(@Param("record") Discuss record, @Param("example") DiscussExample example);

    int updateByExample(@Param("record") Discuss record, @Param("example") DiscussExample example);

    int updateByPrimaryKeySelective(Discuss record);

    int updateByPrimaryKey(Discuss record);
}