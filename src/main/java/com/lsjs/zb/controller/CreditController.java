package com.lsjs.zb.controller;

import com.lsjs.zb.common.ServerResponse;
import com.lsjs.zb.service.CreditService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 实名认证控制器（包含信用分值的控制）
 */
@CrossOrigin
@Api(value = "实名认证与信用分控制器")
@RestController
@RequestMapping("/credit")
public class CreditController {
    @Autowired
    private CreditService creditService;

    /**
     * 注册实名制  已通过
     *
     * @param userId 用户id
     * @param realName 真实姓名
     * @param idCard 身份证号
     * @return
     */
    @ApiOperation(value = "实名制注册")
    @PostMapping("/real-name")
    public ServerResponse realName(Integer userId, String realName, String idCard) {
        return creditService.realName(userId, realName, idCard);
    }

    /**
     * 信用分的增减  已通过
     *
     * @param score 分数，负数为减
     * @param userId 用户id
     * @return
     */
    @ApiOperation(value = "信用分修改")
    @PostMapping("/point-change")
    public ServerResponse pointChange(Integer score, Integer userId) {
        return creditService.pointChange(score, userId);
    }

    /**
     * 举报需求
     *
     * @param needId 所举报的需求id
     * @param userId 举报者的id
     * @param msg 信息
     * @return
     */
    @ApiOperation(value = "举报需求")
    @PostMapping("/report-need")
    public ServerResponse reportNeed(Integer needId,Integer userId,String msg){
        return creditService.reportNeed(needId,userId,msg);
    }

    /**
     * 举报服务
     *
     * @param serverId 服务id
     * @param userId 举报者的id
     * @return
     */
    @ApiOperation(value = "举报服务")
    @PostMapping("/report-server")
    public ServerResponse reportServer(Integer serverId,Integer userId,String msg){
        return creditService.reportServer(serverId,userId,msg);
    }

    /**
     * 处理需求举报
     * @param needId 需求id
     * @param reportStatus 举报状态，1为没有违规 2为违规
     * @return
     */
    @ApiOperation(value = "处理需求举报")
    @PostMapping("/dispose-report-need")
    public ServerResponse disposeReportNeed(Integer needId,Integer reportStatus){
        return creditService.disposeReportNeed(needId,reportStatus);
    }

    /**
     * 处理服务举报
     *
     * @param serverId
     * @param reportStatus
     * @return
     */
    @ApiOperation(value = "处理服务举报")
    @PostMapping("/dispose-report-server")
    public ServerResponse disposeReportServer(Integer serverId,Integer reportStatus){
        return creditService.disposeReportServer(serverId,reportStatus);
    }


}