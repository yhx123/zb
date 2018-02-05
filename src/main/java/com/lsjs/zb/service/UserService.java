package com.lsjs.zb.service;

import com.github.pagehelper.PageInfo;
import com.lsjs.zb.common.ServerResponse;
import com.lsjs.zb.pojo.*;
import com.lsjs.zb.pojo.vo.*;

import java.util.ArrayList;

/**
 * @author 杨红星
 * @version 1.0.0
 */
public interface UserService {
    /**
     * 邮箱注册方法
     *
     * @param user
     * @return String类型的token
     */
    ServerResponse<User> register(User user);

    /**
     *手机号注册
     * @param user
     * @param code
     * @return 注册结果
     */
    ServerResponse<User> registerByPhone(User user, String code);

    /**
     * 编辑用户数据
     *
     * @param user 用户对象
     * @return
     */
    ServerResponse<User> edit(User user);

    /**
     * 发布服务
     *
     * @param server
     * @return 发布状态
     */
    ServerResponse publishServer(Server server, Integer userId);

    /**
     * 发布需求
     *
     * @param need
     * @return 发布状态
     */
    ServerResponse<Need> publishNeed(Need need, Integer userId);

    /**
     * 寻找需求
     *
     * @param longitude
     * @param latitude
     * @return 需求集合
     */
    ServerResponse<ArrayList> findNeed(String latitude, String longitude, String scope,int type);

    /**
     * 寻找服务
     *
     * @return
     */
    ServerResponse<ArrayList> findServer(String latitude, String longitude, String scope, int type);

    /**
     * 接收需求
     *
     * @param userId
     * @return
     */
    ServerResponse<NeededAndUserVo> acceptNeed(Integer needId,Integer userId, NeededNeed neededNeed);

    /**
     * 取消需求，即将需求状态该为 未接单 状态
     * @param needId
     * @return
     */
    ServerResponse cancelNeed(Integer needId);

    /**
     * 接收服务
     *
     * @param serverId 服务id
     * @param userId 用户id
     * @return
     */
    ServerResponse<ServeringServerAndUserVo> acceptServer(Integer serverId, Integer userId, ServeringServer serveringServer);

    /**
     * 取消服务，即将服务状态改为 未接单 状态
     * @param serverId
     * @return
     */
    ServerResponse cancelServer(Integer serverId);

    /**
     * 完成需求
     * @param needId
     * @return
     */
    ServerResponse finishNeed(Integer needId);

    /**
     * 完成服务
     * @param serverId
     * @return
     */
    ServerResponse finishServer(Integer serverId);

    /**
     * 撤回服务，即将服务状态改为 取消 状态
     * @param serverId
     * @return
     */
    ServerResponse takeBackServer(Integer serverId);

    /**
     * 撤回需求
     * @param needId
     * @return
     */
    ServerResponse takeBackNeed(Integer needId);

    /**
     * 评论方法
     * @param discuss discuss对象
     * @param replyId 回复的id
     * @return discuss对象
     */
    /**
     * 评论
     * @param discuss
     * @return 评论状态
     */
    ServerResponse discussTo(Discuss discuss);

    /**
     * 回复
     * @param reply
     * @return 回复状态
     */
    ServerResponse replyTo(Reply reply);

    /**
     * 获取服务列表
     * @param userId
     * @return 服务列表
     */
    ServerResponse<PageInfo> getServerList(int userId, int page, int onePage);

    /**
     * 获取需求列表
     * @param userId
     * @return 需求集合
     */
    ServerResponse<PageInfo> getNeedList(int userId,int page,int onePage);

    /**
     * 获取评论列表 测试成功
     * @param serverId
     * @return 评论集合
     */
    ServerResponse<ArrayList> getDiscussList(String serverId);


    /**
     * 登录
     * @param username
     * @param password
     * @return 登录状态
     */

    ServerResponse<User> login(String username, String password);

    /**
     * 获取用户正在进行的服务
     *
     * @param userId
     * @return 服务列表
     */
    ServerResponse<ServerUserListServerVo> getServering(int userId);

    /**
     * 获取用户正在进行的需求
     * @param userId
     * @return 需求列表
     */

    ServerResponse<NeedUserListServerVo> getNeeding(int userId);

    /**
     * 修改密码
     * @param messageCode
     * @param newPassWord
     * @param phoneNumber
     * @return  修改状态
     */
    ServerResponse resetPassword(String messageCode, String newPassWord, String phoneNumber);

    /**
     * 搜索附近的1000m之内的服务
     * @param latitude
     * @param longitude
     * @param content
     * @return 搜索结果集合
     */
    ServerResponse<ArrayList> searchServer(String latitude, String longitude, String content);

    /**
     * 搜索附近的1000m之内的服务
     *
     * @param latitude
     * @param longitude
     * @param content
     * @return 需求集合
     */
    ServerResponse<ArrayList> searchNeed(String latitude, String longitude, String content);

    /**
     * 获取评论列表
     * @param userId
     * @return
     */
    ServerResponse<ArrayList> getDiscussByUserId(String userId);

    /**
     * 添加服务者信息
     * @param serveringServer
     * @return
     */
    ServerResponse addServerMessage(ServeringServer serveringServer);

    /**
     * 添加被接受者信息
     * @param neededNeed
     * @return
     */
    ServerResponse addNeedMessage(NeededNeed neededNeed);

    /**
     * 根据用户id 获取用户对象
     * @param userId
     * @return 用户对象
     */
    ServerResponse<User> getUser(int userId);

}
