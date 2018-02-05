package com.lsjs.zb.service.impl;

import com.lsjs.zb.common.ServerResponse;
import com.lsjs.zb.dao.*;
import com.lsjs.zb.pojo.*;
import com.lsjs.zb.service.CreditService;
import com.lsjs.zb.util.IdCardVerifierUtil;
import com.lsjs.zb.util.KeyGenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CreditServiceImpl implements CreditService {
    @Autowired
    private CreditMapper creditMapper;

    @Autowired
    private ReportNeedMapper reportNeedMapper;

    @Autowired
    private ReportServerMapper reportServerMapper;

    @Autowired
    private NeedMapper needMapper;

    @Autowired
    private ServerMapper serverMapper;

    @Override
    public ServerResponse<Credit> realName(Integer userId, String realName, String idCard) {
        Credit credit = new Credit();
        if (IdCardVerifierUtil.is18ByteIdCardComplex(idCard)) {
            credit.setId(KeyGenUtil.genUniqueKey());
            credit.setUserId(userId);
            credit.setRealName(realName);
            credit.setIdNamuber(idCard);
            credit.setCreditScore("100");
        } else {
            return ServerResponse.createByErrorMessage("请输入正确的身份证号");
        }

        if (creditMapper.insert(credit) > 0) {
            return ServerResponse.createBySuccessMessage("实名认证成功");
        }
        return ServerResponse.createByErrorMessage("实名认证失败");
    }

    @Override
    public ServerResponse<Credit> pointChange(Integer score, Integer userId) {
        Credit credit = creditMapper.selectByPrimaryKey(userId);
        score += Integer.valueOf(credit.getCreditScore());
        credit.setCreditScore(score.toString());
        if (creditMapper.updateByPrimaryKeySelective(credit) > 0) {
            return ServerResponse.createBySuccessMessage("信用分修改成功");
        }
        return ServerResponse.createByErrorMessage("信用分修改失败");
    }

    @Override
    public ServerResponse reportNeed(Integer needId, Integer userId, String msg) {
        ReportNeed reportNeed = new ReportNeed();
        reportNeed.setNeedId(needId);
        reportNeed.setUserId(userId);
        reportNeed.setNeedMessage(msg);

        ReportNeedExample reportNeedExample = new ReportNeedExample();
        reportNeedExample.or()
                .andNeedIdEqualTo(needId)
                .andUserIdEqualTo(userId);
        if (reportNeedMapper.selectByExample(reportNeedExample).size() > 0) {
            if (reportNeedMapper.updateByExampleSelective(reportNeed, reportNeedExample) > 0) {
                return ServerResponse.createBySuccessMessage("举报成功");
            }
        } else {
            reportNeedMapper.insertSelective(reportNeed);
            return ServerResponse.createBySuccessMessage("举报成功");
        }
        return ServerResponse.createByErrorMessage("举报失败");
    }

    @Override
    public ServerResponse reportServer(Integer serverId, Integer userId, String msg) {
        ReportServer reportServer = new ReportServer();
        reportServer.setServerId(serverId);
        reportServer.setUserId(userId);
        reportServer.setServerMessage(msg);

        ReportServerExample reportServerExample = new ReportServerExample();
        reportServerExample.or()
                .andServerIdEqualTo(serverId)
                .andUserIdEqualTo(userId);


        if (reportServerMapper.selectByExample(reportServerExample).size() > 0) {
            if (reportServerMapper.updateByExampleSelective(reportServer, reportServerExample) > 0) {
                return ServerResponse.createBySuccessMessage("举报成功");
            }
        } else {
            if (reportServerMapper.insertSelective(reportServer) > 0) {
                return ServerResponse.createBySuccessMessage("举报成功");
            }
        }
        return ServerResponse.createByErrorMessage("举报失败");
    }

    @Override
    public ServerResponse disposeReportNeed(Integer needId, Integer reportStatus) {
        Need need = new Need();
        need.setNeedId(needId);
        need.setGoodsStatus(reportStatus);

        ReportNeed reportNeed = new ReportNeed();
        reportNeed.setNeedId(needId);
        reportNeed.setReportStatus(reportStatus);
        ReportNeedExample reportNeedExample = new ReportNeedExample();
        reportNeedExample.createCriteria().andNeedIdEqualTo(needId);
        if (needMapper.updateByPrimaryKeySelective(need) > 0 && reportNeedMapper.updateByExampleSelective(reportNeed, reportNeedExample) > 0) {
            return ServerResponse.createBySuccessMessage("处理成功");
        }
        return ServerResponse.createByErrorMessage("处理失败");
    }

    @Override
    public ServerResponse disposeReportServer(Integer serverId, Integer reportStatus) {
        Server server = new Server();
        server.setServerId(serverId);
        server.setServerStatus(reportStatus);

        ReportServer reportServer = new ReportServer();
        reportServer.setServerId(serverId);
        reportServer.setReportStatus(reportStatus);
        ReportServerExample reportServerExample = new ReportServerExample();
        reportServerExample.createCriteria().andServerIdEqualTo(serverId);
        if (serverMapper.updateByPrimaryKeySelective(server) > 0 && reportServerMapper.updateByExampleSelective(reportServer, reportServerExample) > 0) {
            return ServerResponse.createByErrorMessage("处理成功");
        }
        return ServerResponse.createByErrorMessage("处理失败");
    }
}
