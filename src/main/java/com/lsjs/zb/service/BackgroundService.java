package com.lsjs.zb.service;

import com.lsjs.zb.common.ServerResponse;

import java.util.ArrayList;

/**
 * @author 杨红星
 * @version 1.0.0
 */
public interface BackgroundService {

    /**
     *  获取所有的服务列表，出去已经取消的
     * @return 服务列表
     */
    ServerResponse<ArrayList> getServerList() ;

    /**
     * 获取需求列表
     * @return 需求列表
     */
    ServerResponse<ArrayList> getNeedList();

    /**
     * 修改服务状态
     * @param serverId
     * @param status
     * @return
     */

    ServerResponse editServerStatus(int serverId, int status);

    /**
     * 修改需求状态
     * @param needId
     * @param status
     * @return
     */
    ServerResponse editNeedStatus(int needId, int status);

    /**
     * 获取所有举报需求的信息
     */
    ServerResponse<ArrayList> getAllReportNeed();

    /**
     * 获取所有举报服务的信息
     * @return
     */
    ServerResponse<ArrayList> getAllReportServer();

    /**
     * 处理举报的需求
     * @param needId 需求id
     * @param status 处理状态 0：待处理 1：为违规 2：违规
     * @return
     */
    ServerResponse disposeReportNeed(Integer needId,Integer status);

    /**
     * 处理举报的服务
     * @param serverId 服务id
     * @param status 处理状态 0：待处理 1：为违规 2：违规
     * @return
     */
    ServerResponse disposeReportServer(Integer serverId,Integer status);

}
