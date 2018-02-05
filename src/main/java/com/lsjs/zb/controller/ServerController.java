package com.lsjs.zb.controller;

import com.github.pagehelper.PageInfo;
import com.lsjs.zb.common.ServerResponse;
import com.lsjs.zb.pojo.Server;
import com.lsjs.zb.pojo.ServeringServer;
import com.lsjs.zb.pojo.vo.ServerUserListServerVo;
import com.lsjs.zb.pojo.vo.ServeringServerAndUserVo;
import com.lsjs.zb.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * @author 杨红星
 * @version 1.0.0
 */
@Api(value = "用户控制器")
@RestController
@RequestMapping("/server")
@CrossOrigin
public class ServerController {

    @Autowired
    private UserService userService;

    /**
     * 服务发布  已跑通
     *
     * @param server 服务对象
     * @param userId 用户id
     * @return 发布状态
     */
    @ApiOperation(value = "服务发布")
    @PostMapping("/publishServer")
    public ServerResponse publishServer(Server server, Integer userId) {
        return userService.publishServer(server, userId);
    }

    /**
     * 寻找服务 已跑通
     *
     * @param latitude  纬度
     * @param longitude 经度
     * @param meter     范围
     * @return
     */
    @PostMapping("/find-server")
    public ServerResponse<ArrayList> findServer(String latitude, String longitude, String meter, int type) {
        return userService.findServer(latitude, longitude, meter, type);
    }


    /**
     * 接收服务
     * <p>
     * 接收服务 已通过
     *
     * @param serverId
     * @param userId
     * @return
     */
    @ApiOperation(value = "接收服务")
    @PostMapping("/accept-server")
    public ServerResponse<ServeringServerAndUserVo> acceptServer(Integer serverId, Integer userId, ServeringServer serveringServer) {
        return userService.acceptServer(serverId, userId, serveringServer);
    }

    /**
     * 取消服务，即将服务状态改为 未接单 状态 ,并把接单的记录删除 已通过
     *
     * @param serverId
     * @return
     */
    @ApiOperation(value = "取消服务")
    @PostMapping("/cancel-server")
    public ServerResponse cancelServer(Integer serverId) {
        return userService.cancelServer(serverId);
    }

    /**
     * 完成服务 已通过
     *
     * @param serverId
     * @return
     */
    @ApiOperation(value = "完成服务")
    @PostMapping("/finish-server")
    public ServerResponse finishServer(Integer serverId) {
        return userService.finishServer(serverId);
    }


    /**
     * 撤回服务 将服务状态改为 取消  已通过
     *
     * @param serverId
     * @return
     */
    @ApiOperation(value = "撤回服务")
    @PostMapping("/take-bake-server")
    public ServerResponse takeBackServer(Integer serverId) {
        return userService.takeBackServer(serverId);
    }


    @GetMapping("/get-server-discuss-list")
    public ServerResponse<ArrayList> getDiscussList(String serverId) {
        return userService.getDiscussList(serverId);
    }

    /**
     * 获取服务列表  测试通过
     *
     * @param userId
     * @return 服务列表集合
     */
    @GetMapping("/get-server-list")
    public ServerResponse<PageInfo> getServerList(int userId, int page, int onePage) {
        return userService.getServerList(userId, page, onePage);
    }

    /**
     * 搜索server 测试通过
     *
     * @param latitude
     * @param longitude
     * @param content
     * @return
     */
    @PostMapping("/search-server")
    public ServerResponse<ArrayList> searchServer(String latitude, String longitude, String content) {
        return userService.searchServer(latitude, longitude, content);
    }


    /**
     * 获取正在进行的服务和已经结束的服务
     * @param userId
     * @return
     */

    @GetMapping("/get-servering-and-servered")
    public ServerResponse<ServerUserListServerVo> getServering(int userId) {
        return userService.getServering(userId);
    }


}
