package com.lsjs.zb.service;

import com.lsjs.zb.common.ServerResponse;
import com.lsjs.zb.pojo.Credit;

public interface CreditService {

    /**
     * 注册为实名用户
     *
     * @param userId 用户Id
     * @param realName 真实姓名
     * @param idCard 身份证号码
     * @return
     */
    ServerResponse<Credit> realName(Integer userId, String realName, String idCard);

    /**
     * 用户信用分增加
     * @param score 增加的分数
     * @param userId 用户id
     * @return
     */
    ServerResponse<Credit> pointChange(Integer score,Integer userId);

    /**
     * 举报需求
     * @param needId
     * @param userId
     * @return
     */
    ServerResponse reportNeed(Integer needId,Integer userId,String msg);

    /**
     * 举报服务
     * @param serverId
     * @param userId
     * @return
     */
    ServerResponse reportServer(Integer serverId,Integer userId,String msg);

    /**
     * 处理需求举报
     * @param needId
     * @param reportStatus
     * @return
     */
    ServerResponse disposeReportNeed(Integer needId,Integer reportStatus);

    /**
     * 处理服务举报
     * @param serverId
     * @param reportStatus
     * @return
     */
    ServerResponse disposeReportServer(Integer serverId,Integer reportStatus);

}
