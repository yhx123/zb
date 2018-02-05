package com.lsjs.zb.dao;

import com.lsjs.zb.pojo.DiscussReply;
import com.lsjs.zb.pojo.DiscussReplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DiscussReplyMapper {
    int countByExample(DiscussReplyExample example);

    int deleteByExample(DiscussReplyExample example);

    int insert(DiscussReply record);

    int insertSelective(DiscussReply record);

    List<DiscussReply> selectByExample(DiscussReplyExample example);

    int updateByExampleSelective(@Param("record") DiscussReply record, @Param("example") DiscussReplyExample example);

    int updateByExample(@Param("record") DiscussReply record, @Param("example") DiscussReplyExample example);
}