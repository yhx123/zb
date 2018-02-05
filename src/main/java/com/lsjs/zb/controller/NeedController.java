package com.lsjs.zb.controller;

import com.github.pagehelper.PageInfo;
import com.lsjs.zb.common.ServerResponse;
import com.lsjs.zb.pojo.Need;
import com.lsjs.zb.pojo.NeededNeed;
import com.lsjs.zb.pojo.vo.NeedUserListServerVo;
import com.lsjs.zb.pojo.vo.NeededAndUserVo;
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
@RequestMapping("/need")
@CrossOrigin
public class NeedController {

    @Autowired
    private UserService userService;

    /**
     * 发布需求 已跑通
     *
     * @param need 需求对象
     * @return
     */
    @ApiOperation(value = "需求发布")
    @PostMapping("/publishNeed")
    public ServerResponse<Need> publishNeed(Need need, Integer userId) {
        return userService.publishNeed(need, userId);
    }


    /**
     * 寻找需求  测试可用
     *
     * @param latitude  纬度
     * @param longitude 经度
     * @param scope     范围
     * @return
     */
    @RequestMapping(value = "/find-need", method = RequestMethod.POST)
    public ServerResponse<ArrayList> findNeed(String latitude, String longitude, String scope, int type) {
        return userService.findNeed(latitude, longitude, scope, type);
    }

    /**
     * 接收需求  已通过
     *
     * @param userId 用户id
     * @return
     */
    @ApiOperation(value = "接收需求", notes = "needId 需求id ,userId 用户id发起接受的用户id")
    @PostMapping("/accept-need")
    public ServerResponse<NeededAndUserVo> acceptNeed(Integer needId,Integer userId, NeededNeed neededNeed) {
        return userService.acceptNeed(needId,userId,neededNeed);
    }

    /**
     * 取消需求，即将需求状态改为 未接单 状态 ,并把接单的记录删除  已通过
     *
     * @param needId
     * @return
     */
    @ApiOperation(value = "取消需求，即将需求状态改为 未接单 状态")
    @PostMapping("/cancel-need")
    public ServerResponse cancelNeed(Integer needId) {
        return userService.cancelNeed(needId);
    }

    /**
     * 完成需求 已通过
     *
     * @param needId 需求id
     * @return
     */
    @ApiOperation(value = "完成需求")
    @PostMapping("/finish-need")
    public ServerResponse finishNeed(Integer needId) {
        return userService.finishNeed(needId);
    }

    /**
     * 撤回需求 将需求状态改为 取消 已通过
     *
     * @param needId
     * @return
     */
    @ApiOperation(value = "撤回需求")
    @PostMapping("/take-bake-need")
    public ServerResponse takeBackNeed(Integer needId) {
        return userService.takeBackNeed(needId);
    }

    @PostMapping("/search-need")
    public ServerResponse<ArrayList> searchNeed(String latitude, String longitude, String content) {
        return userService.searchNeed(latitude, longitude, content);
    }

    /**
     * 添加被接受者信息 测试已通过
     * @param neededNeed
     * @return
     */
    @PostMapping("/add-need-message")
    public ServerResponse addNeedMessage(NeededNeed neededNeed) {
        return userService.addNeedMessage(neededNeed);
    }
    /**
     * 获取需求集合  测试通过
     *
     * @param userId
     * @return 需求集合
     */
    @GetMapping("/get-need-list")
    public ServerResponse<PageInfo> getNeedList(int userId, int page, int onePage) {
        return userService.getNeedList(userId, page, onePage);
    }

    /**
     * 获取正在进行的需求 测试通过
     *
     * @param userId
     * @return 需求列表
     */
    @GetMapping("/get-needing-and-needed")
    public ServerResponse<NeedUserListServerVo> getNeeding(int userId) {
        return userService.getNeeding(userId);
    }

}
