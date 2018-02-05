package com.lsjs.zb.service.impl;

import com.lsjs.zb.common.ServerResponse;
import com.lsjs.zb.dao.*;
import com.lsjs.zb.pojo.*;
import com.lsjs.zb.pojo.vo.NeedAndReportNeedVo;
import com.lsjs.zb.pojo.vo.NeedAndUserVo;
import com.lsjs.zb.pojo.vo.ServerAndReportServerVo;
import com.lsjs.zb.pojo.vo.ServerAndUserVo;
import com.lsjs.zb.service.BackgroundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 杨红星
 * @version 1.0.0
 */
@Service("backgroundServer")
public class BackgroundServerImpl implements BackgroundService {
    @Autowired
    private ServerMapper serverMapper;

    @Autowired
    private UserServerMapper userServerMapper;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private NeedMapper needMapper;

    @Autowired
    private UserNeedMapper userNeedMapper;

    @Autowired
    private ReportNeedMapper reportNeedMapper;

    @Autowired
    private ReportServerMapper reportServerMapper;

    @Override
    public ServerResponse<ArrayList> getServerList() {
        ServerExample serverExample = new ServerExample();
        serverExample.createCriteria().andServerStatusNotEqualTo(3);
        List<Server> servers = serverMapper.selectByExample(serverExample);
        ArrayList<ServerAndUserVo> serverAndUserVos = new ArrayList<>();
        for (Server server : servers) {
            ServerAndUserVo serverAndUserVon = new ServerAndUserVo();
            UserServerExample userServerExample = new UserServerExample();
            userServerExample.createCriteria().andServerIdEqualTo(server.getServerId());
            List<UserServer> userServers = userServerMapper.selectByExample(userServerExample);
            User user = userMapper.selectByPrimaryKey(userServers.get(0).getUserId());
            serverAndUserVon.setUser(user);
            serverAndUserVon.setServer(server);
            serverAndUserVos.add(serverAndUserVon);
        }
        return ServerResponse.createBySuccess(serverAndUserVos);
    }


    @Override
    public ServerResponse<ArrayList> getNeedList() {
        NeedExample needExample = new NeedExample();
        needExample.createCriteria().andGoodsStatusNotEqualTo(3);
        List<Need> needs = needMapper.selectByExample(needExample);
        ArrayList<NeedAndUserVo> needAndUserVos = new ArrayList<>();
        for (Need need : needs) {
            UserNeedExample userNeedExample = new UserNeedExample();
            userNeedExample.createCriteria().andNeedIdEqualTo(need.getNeedId());
            List<UserNeed> userNeeds = userNeedMapper.selectByExample(userNeedExample);
            User user = userMapper.selectByPrimaryKey(userNeeds.get(0).getUserId());
            NeedAndUserVo needAndUserVo = new NeedAndUserVo();
            needAndUserVo.setNeed(need);
            needAndUserVo.setUser(user);
            needAndUserVos.add(needAndUserVo);
        }
        return ServerResponse.createBySuccess(needAndUserVos);
    }

    @Override
    public ServerResponse editServerStatus(int serverId, int status) {
        Server server = serverMapper.selectByPrimaryKey(serverId);
        server.setCheckStatus(status);

        int i = serverMapper.updateByPrimaryKeySelective(server);
        if (i == 0) {
            return ServerResponse.createByErrorMessage("修改失败");
        }
        return ServerResponse.createBySuccessMessage("修改成功");
    }

    @Override
    public ServerResponse editNeedStatus(int needId, int status) {
        Need need = needMapper.selectByPrimaryKey(needId);
        need.setCheckStatus(status);

        int i = needMapper.updateByPrimaryKeySelective(need);
        if (i == 0) {
            return ServerResponse.createByErrorMessage("修改失败");
        }
        return ServerResponse.createBySuccessMessage("修改成功");
    }

    @Override
    public ServerResponse<ArrayList> getAllReportNeed() {
        ReportNeedExample reportNeedExample = new ReportNeedExample();
        reportNeedExample.createCriteria().andNeedIdIsNotNull();
        List<ReportNeed> reportNeedList = reportNeedMapper.selectByExample(reportNeedExample);
        ArrayList<NeedAndReportNeedVo> needAndReportNeedVoArrayList = new ArrayList<>();
        for (ReportNeed reportNeed : reportNeedList) {
            NeedAndReportNeedVo needAndReportNeedVo = new NeedAndReportNeedVo();
            Need need = needMapper.selectByPrimaryKey(reportNeed.getNeedId());
            needAndReportNeedVo.setNeed(need);
            needAndReportNeedVo.setReportNeed(reportNeed);
            needAndReportNeedVoArrayList.add(needAndReportNeedVo);
        }
        return ServerResponse.createBySuccess(needAndReportNeedVoArrayList);
    }

    @Override
    public ServerResponse<ArrayList> getAllReportServer() {
        ReportServerExample reportServerExample = new ReportServerExample();
        reportServerExample.createCriteria().andServerIdIsNotNull();
        List<ReportServer> reportServerList = reportServerMapper.selectByExample(reportServerExample);
        ArrayList<ServerAndReportServerVo> serverAndReportServerVoArrayList = new ArrayList<>();
        for (ReportServer reportServer : reportServerList) {
            ServerAndReportServerVo serverAndReportServerVo = new ServerAndReportServerVo();
            Server server = serverMapper.selectByPrimaryKey(reportServer.getServerId());
            serverAndReportServerVo.setServer(server);
            serverAndReportServerVo.setReportServer(reportServer);
            serverAndReportServerVoArrayList.add(serverAndReportServerVo);
        }
        return ServerResponse.createBySuccess(serverAndReportServerVoArrayList);
    }

    @Override
    public ServerResponse disposeReportNeed(Integer needId, Integer status) {
        Need need = new Need();
        need.setNeedId(needId);
        need.setCheckStatus(status);

        ReportNeedExample reportNeedExample = new ReportNeedExample();
        reportNeedExample.createCriteria().andNeedIdEqualTo(needId);
        ReportNeed reportNeed = new ReportNeed();
        reportNeed.setNeedId(needId);
        reportNeed.setReportStatus(status);

        if (needMapper.updateByPrimaryKeySelective(need) > 0 && reportNeedMapper.updateByExampleSelective(reportNeed, reportNeedExample) > 0) {
            return ServerResponse.createBySuccessMessage("成功");
        }
        return ServerResponse.createByErrorMessage("失败");
    }

    @Override
    public ServerResponse disposeReportServer(Integer serverId, Integer status) {
        Server server = new Server();
        server.setServerId(serverId);
        server.setCheckStatus(status);

        ReportServerExample reportServerExample = new ReportServerExample();
        reportServerExample.createCriteria().andServerIdEqualTo(serverId);
        ReportServer reportServer = new ReportServer();
        reportServer.setServerId(serverId);
        reportServer.setReportStatus(status);

        if (serverMapper.updateByPrimaryKeySelective(server) > 0 && reportServerMapper.updateByExampleSelective(reportServer, reportServerExample) > 0) {
            return ServerResponse.createBySuccessMessage("成功");
        }
        return ServerResponse.createByErrorMessage("失败");
    }
}
