package com.lsjs.zb.controller;

import com.lsjs.zb.common.ServerResponse;
import com.lsjs.zb.service.BackgroundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * @author 杨红星
 * @version 1.0.0
 */
@CrossOrigin
@RestController
@RequestMapping("/background")
public class BackgroundManageController {

    @Autowired
    private BackgroundService backgroundService;


    @GetMapping("/get-all-server-list")
    public ServerResponse<ArrayList> getServerList() {
       return backgroundService.getServerList();
    }

    @GetMapping("/get-all-need-list")
    public ServerResponse<ArrayList> getNeedList() {
        return backgroundService.getNeedList();
    }

    /**
     * 修改服务审核审核  测试已通过
     * @param serverId
     * @param status
     * @return 修改状态
     */
    @GetMapping("/edit-server-status")
    public ServerResponse editServerStatus(int serverId,int status) {
        return backgroundService.editServerStatus(serverId,status);
    }

    /**
     * 修改需求审核状态
     * @param needId
     * @param status
     * @return 修改状态
     */
    @GetMapping("/edit-need-status")
    public ServerResponse editNeedStatus(int needId,int status) {
        return backgroundService.editNeedStatus(needId, status);
    }

    /**
     * 获取所有的举报需求信息
     * @return
     */
    @GetMapping("/get-all-report-need")
    public ServerResponse<ArrayList> getAllReportNeed(){
        return backgroundService.getAllReportNeed();
    }

    /**
     * 获取所有的举报服务信息
     * @return
     */
    @GetMapping("/get-all-report-server")
    public ServerResponse<ArrayList> getAllReportServer(){
        return backgroundService.getAllReportServer();
    }

    /**
     * 处理举报的需求
     * @param needId 需求id
     * @param status 处理状态 0：待处理 1：为违规 2：违规
     * @return
     */
    @GetMapping("/dispose-report-need")
    public ServerResponse disposeReportNeed(Integer needId,Integer status){
        return backgroundService.disposeReportNeed(needId,status);
    }

    /**
     * 处理举报的服务
     * @param serverId 服务id
     * @param status 处理状态 0：待处理 1：为违规 2：违规
     * @return
     */
    @GetMapping("/dispose-report-server")
    public ServerResponse disposeReportServer(Integer serverId,Integer status){
        return backgroundService.disposeReportServer(serverId,status);
    }

}
