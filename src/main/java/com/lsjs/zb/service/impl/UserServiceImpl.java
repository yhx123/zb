package com.lsjs.zb.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lsjs.zb.common.ServerResponse;
import com.lsjs.zb.common.TokenCache;
import com.lsjs.zb.dao.*;
import com.lsjs.zb.pojo.*;
import com.lsjs.zb.pojo.vo.*;
import com.lsjs.zb.service.UserService;
import com.lsjs.zb.util.KeyGenUtil;
import com.lsjs.zb.util.LocationUtil;
import com.lsjs.zb.util.RegularExpressionUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 杨红星
 * @version 1.0.0
 */
@Service("userService")
@Slf4j
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private ServerMapper serverMapper;

    @Autowired
    private NeedMapper needMapper;

    @Autowired
    private UserNeedMapper userNeedMapper;

    @Autowired
    private UserServerMapper userServerMapper;

    @Autowired
    private DiscussMapper discussMapper;

    @Autowired
    private DiscussReplyMapper discussReplyMapper;

    @Autowired
    private UserGetNeedMapper userGetNeedMapper;

    @Autowired
    private UserGetServerMapper userGetServerMapper;

    @Autowired
    private ReplyMapper replyMapper;


    @Autowired
    private NeededNeedMapper neededNeedMapper;

    @Autowired
    private FollowingMapper followingMapper;


    @Autowired
    private ServeringServerMapper serveringServerMapper;


    @Override
    public ServerResponse<User> register(User user) {
        String password = user.getPassword();
//        user.setPassword(MD5Util.MD5EncodeUtf8(password));
        user.setPassword(password);
        int i = userMapper.insertSelective(user);
        if (i == 0) {
            return ServerResponse.createByErrorMessage("出现一个异常导致注册失败");
        }
        return ServerResponse.createBySuccess(user);
    }

    @Override
    public ServerResponse<User> registerByPhone(User user, String code) {

        String s = user.getPhoneNumber() + code;
        if (null == TokenCache.getKey(s)) {
            return ServerResponse.createByErrorMessage("验证码输入错误或者已过期");
        }
        String phoneNumber = user.getPhoneNumber();
        UserExample userExample = new UserExample();
        userExample.createCriteria().andPhoneNumberEqualTo(phoneNumber);
        if (userMapper.selectByExample(userExample).size() != 0) {
            return ServerResponse.createByErrorMessage("该手机号已存在，请直接登录");
        }
        Integer userId = KeyGenUtil.genUniqueKey();
        user.setUserId(userId);
//        user.setPassword(MD5Util.MD5EncodeUtf8(user.getPassword()));
        user.setPassword(user.getPassword());
        int i = userMapper.insertSelective(user);
        if (i == 0) {
            return ServerResponse.createByErrorMessage("注册失败");
        }
        return ServerResponse.createBySuccess("注册成功", user);
    }

    @Override
    public ServerResponse<User> login(String username, String password) {
        ArrayList<User> users = new ArrayList<User>();
        UserExample userExample = new UserExample();
        if (RegularExpressionUtil.isPhoneNumber(username)) {
            //是手机号
            userExample.createCriteria().andPhoneNumberEqualTo(username);
            users = (ArrayList) userMapper.selectByExample(userExample);
        } else if (RegularExpressionUtil.isMail(username)) {
            //是邮箱
            userExample.createCriteria().andMailEqualTo(username);
            users = (ArrayList) userMapper.selectByExample(userExample);

        } else {
            //是用户名
            userExample.createCriteria().andUsernameEqualTo(username);
            users = (ArrayList) userMapper.selectByExample(userExample);
        }
        User user = users.get(0);
        return ServerResponse.createBySuccess(user);

    }


    @Override
    public ServerResponse<User> edit(User user) {
        log.info(user.toString());
        if (userMapper.updateByPrimaryKeySelective(user) > 0) {
            Integer userId = user.getUserId();
            User user1 = userMapper.selectByPrimaryKey(userId);
            return ServerResponse.createBySuccess(user1);
        }
        return ServerResponse.createByErrorMessage("修改失败");
    }

    @Override
    public ServerResponse publishServer(Server server, Integer userId) {
        int id = KeyGenUtil.genUniqueKey();
        server.setServerId(id);
        int i = serverMapper.insertSelective(server);
        UserServer userServer = new UserServer();
        userServer.setServerId(id);
        userServer.setUserId(userId);
        int j = userServerMapper.insert(userServer);
        if (i == 0 || j == 0) {
            return ServerResponse.createBySuccessMessage("出现一个异常，发布不成功");
        }
        return ServerResponse.createBySuccessMessage("发布服务成功");
    }

    @Override
    public ServerResponse<Need> publishNeed(Need need, Integer userId) {
        int id = KeyGenUtil.genUniqueKey();
        need.setNeedId(id);
        int i = needMapper.insertSelective(need);
        UserNeed userNeed = new UserNeed();
        userNeed.setUserId(userId);
        userNeed.setNeedId(id);
        int j = userNeedMapper.insertSelective(userNeed);
        if (i == 0 || j == 0) {
            return ServerResponse.createByErrorMessage("出现一个问题导致发布失败");
        }
        return ServerResponse.createBySuccessMessage("发布成功，快叫你的小伙伴来帮助你吧");
    }

    @Override
    public ServerResponse<ArrayList> findNeed(String latitude, String longitude, String scope, int type) {
        NeedExample needExample = new NeedExample();
        needExample.or()
                .andCheckStatusNotEqualTo(2)
                .andGoodsStatusEqualTo(0);
        List<Need> needs = needMapper.selectByExample(needExample);
        ArrayList<NeedAndUserVo> need = new ArrayList<>();

        for (Need next : needs) {
            double distance = LocationUtil.getDistance(Double.valueOf(latitude), Double.valueOf(longitude), Double.valueOf(next.getLatitude()), Double.valueOf(next.getLongitude()));
            if (distance < Double.valueOf(scope)) {
                UserNeedExample userNeedExample = new UserNeedExample();
                NeedAndUserVo needAndUserVo = new NeedAndUserVo();
                //通过需求id查找用户id
                userNeedExample.createCriteria().andNeedIdEqualTo(next.getNeedId());
                List<UserNeed> userNeeds = userNeedMapper.selectByExample(userNeedExample);
                needAndUserVo.setUser(userMapper.selectByPrimaryKey(userNeeds.get(0).getUserId()));
                needAndUserVo.setNeed(next);
                need.add(needAndUserVo);
            }
        }
        if (type == 0) {
            return ServerResponse.createBySuccess(need);
        } else {
            ArrayList<NeedAndUserVo> need1 = new ArrayList<>();
            for (NeedAndUserVo needAndUserVo : need) {
                if (needAndUserVo.getNeed().getNeedType() == type) {
                    need1.add(needAndUserVo);
                }
            }
            return ServerResponse.createBySuccess(need1);
        }

    }

    @Override
    public ServerResponse<ArrayList> findServer(String latitude, String longitude, String scope, int type) {
        ServerExample serverExample = new ServerExample();
        serverExample.or()
                .andCheckStatusNotEqualTo(2)
                .andServerStatusEqualTo(0);

        List<Server> servers = serverMapper.selectByExample(serverExample);
        ArrayList<ServerAndUserVo> serverAndUserVos = new ArrayList<>();

        for (Server next : servers) {
            double distance = LocationUtil.getDistance(Double.valueOf(latitude), Double.valueOf(longitude), Double.valueOf(next.getServerLatitude()), Double.valueOf(next.getServerLongitude()));
            if (distance < Double.valueOf(scope)) {
                ServerAndUserVo serverAndUserVo = new ServerAndUserVo();
                Integer serverId = next.getServerId();
                UserServerExample userServerExample = new UserServerExample();
                userServerExample.createCriteria().andServerIdEqualTo(serverId);
                log.info(serverId.toString());
                List<UserServer> userServers = userServerMapper.selectByExample(userServerExample);
                log.info(userServers.toString());
                User user = userMapper.selectByPrimaryKey(userServers.get(0).getUserId());
                log.info(user.toString());
                serverAndUserVo.setUser(user);
                serverAndUserVo.setServer(serverMapper.selectByPrimaryKey(serverId));
                serverAndUserVos.add(serverAndUserVo);
            }
        }
        if (type == 0) {
            return ServerResponse.createBySuccess(serverAndUserVos);

        } else {
            ArrayList<ServerAndUserVo> serverAndUserVos1 = new ArrayList<>();
            for (ServerAndUserVo serverAndUserVo : serverAndUserVos) {
                if (serverAndUserVo.getServer().getServerType() == type) {
                    serverAndUserVos1.add(serverAndUserVo);
                }
            }
            return ServerResponse.createBySuccess(serverAndUserVos1);
        }
    }


    @Override
    @Transactional(rollbackFor = Exception.class)
    public ServerResponse<NeededAndUserVo> acceptNeed(Integer needId, Integer userId, NeededNeed neededNeed) {
        UserGetNeed userGetNeed = new UserGetNeed();
        userGetNeed.setNeedId(needId);
        userGetNeed.setUserId(userId);
        userGetNeed.setStatus(0);
        Need need = new Need();
        need.setNeedId(needId);
        need.setGoodsStatus(1);
        neededNeed.setNeededId(KeyGenUtil.genUniqueKey());
        UserNeedExample userNeedExample = new UserNeedExample();
        userNeedExample.createCriteria().andNeedIdEqualTo(needId);
        List<UserNeed> userNeeds = userNeedMapper.selectByExample(userNeedExample);
        User user = userMapper.selectByPrimaryKey(userNeeds.get(0).getUserId());
        NeededAndUserVo neededAndUserVo = new NeededAndUserVo();
        neededAndUserVo.setNeededNeed(neededNeed);
        neededAndUserVo.setUser(user);

        int i2 = neededNeedMapper.insertSelective(neededNeed);
        int i = userGetNeedMapper.insert(userGetNeed);
        int i1 = needMapper.updateByPrimaryKeySelective(need);
        if (i != 0 && i1 != 0 && i2 != 0) {
            return ServerResponse.createBySuccess(neededAndUserVo);
        }
        return ServerResponse.createByErrorMessage("接单失败，请重试");
    }

    @Override
    public ServerResponse cancelNeed(Integer needId) {
        UserGetNeedExample userGetNeedExample = new UserGetNeedExample();
        userGetNeedExample.createCriteria().andNeedIdEqualTo(needId);

        Need need = new Need();
        need.setNeedId(needId);
        need.setGoodsStatus(0);
        if (needMapper.updateByPrimaryKeySelective(need) > 0 && userGetNeedMapper.deleteByExample(userGetNeedExample) > 0) {
            return ServerResponse.createBySuccessMessage("取消成功");
        }
        return ServerResponse.createByErrorMessage("取消失败，请重试");
    }

    @Override
    public ServerResponse finishNeed(Integer needId) {
        Need need = new Need();
        need.setNeedId(needId);
        need.setGoodsStatus(2);


        UserGetNeedExample userGetNeedExample = new UserGetNeedExample();
        userGetNeedExample.createCriteria().andNeedIdEqualTo(needId);
        List<UserGetNeed> userGetNeeds = userGetNeedMapper.selectByExample(userGetNeedExample);
        if (userGetNeeds.size() != 0) {
            UserGetNeed userGetNeed = userGetNeeds.get(0);
            userGetNeed.setStatus(1);
            int i = userGetNeedMapper.updateByExampleSelective(userGetNeed, userGetNeedExample);
            if (needMapper.updateByPrimaryKeySelective(need) > 0 && i > 0) {
                return ServerResponse.createBySuccessMessage("成功");
            }
        }
        return ServerResponse.createByErrorMessage("失败");
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public ServerResponse<ServeringServerAndUserVo> acceptServer(Integer serverId, Integer userId, ServeringServer serveringServer) {
        ServeringServerAndUserVo serveringServerAndUserVo = new ServeringServerAndUserVo();
        UserGetServer userGetServer = new UserGetServer();
        userGetServer.setServerId(serverId);
        userGetServer.setUserId(userId);
        serveringServer.setServeringId(KeyGenUtil.genUniqueKey());
        Server server = new Server();
        server.setServerId(serverId);
        server.setServerStatus(1);

        UserServerExample userServerExample = new UserServerExample();
        userServerExample.createCriteria().andServerIdEqualTo(serverId);
        User user = userMapper.selectByPrimaryKey(userServerMapper.selectByExample(userServerExample).get(0).getUserId());
        serveringServerAndUserVo.setUser(user);
        serveringServerAndUserVo.setServeringServer(serveringServer);

        int i2 = serveringServerMapper.insertSelective(serveringServer);
        int i = userGetServerMapper.insertSelective(userGetServer);
        int i1 = serverMapper.updateByPrimaryKeySelective(server);


        if (i != 0 && i1 != 0 && i2 != 0) {
            return ServerResponse.createBySuccess(serveringServerAndUserVo);
        }
        return ServerResponse.createByErrorMessage("接单失败");
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public ServerResponse cancelServer(Integer serverId) {
        Server server = new Server();
        server.setServerId(serverId);
        server.setServerStatus(0);

        UserGetServerExample userGetServerExample = new UserGetServerExample();
        userGetServerExample.createCriteria().andServerIdEqualTo(serverId);
        List<UserGetServer> userGetServers = userGetServerMapper.selectByExample(userGetServerExample);
        if (serverMapper.updateByPrimaryKeySelective(server) > 0) {
            return ServerResponse.createBySuccessMessage("取消成功");
        }
        return ServerResponse.createByErrorMessage("取消失败");
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public ServerResponse finishServer(Integer serverId) {
        Server server = new Server();
        server.setServerId(serverId);
        server.setServerStatus(2);

        UserGetServerExample userGetServerExample = new UserGetServerExample();
        userGetServerExample.createCriteria().andServerIdEqualTo(serverId);
        List<UserGetServer> userGetServers = userGetServerMapper.selectByExample(userGetServerExample);
        if (userGetServers.size() != 0) {
            UserGetServer userGetServer = userGetServers.get(0);
            userGetServer.setStatus(1);
            int i = userGetServerMapper.updateByExampleSelective(userGetServer, userGetServerExample);
            if (serverMapper.updateByPrimaryKeySelective(server) > 0 && i > 0) {
                return ServerResponse.createBySuccessMessage("成功");
            }
        }
        return ServerResponse.createByErrorMessage("失败");
    }

    @Override
    public ServerResponse takeBackServer(Integer serverId) {
        Server server = new Server();
        server.setServerId(serverId);
        server.setServerStatus(3);
        if (serverMapper.updateByPrimaryKeySelective(server) > 0) {
            return ServerResponse.createBySuccessMessage("取消成功");
        }
        return ServerResponse.createByErrorMessage("取消失败");
    }

    @Override
    public ServerResponse takeBackNeed(Integer needId) {
        Need need = new Need();
        need.setNeedId(needId);
        need.setGoodsStatus(3);
        if (needMapper.updateByPrimaryKeySelective(need) > 0) {
            return ServerResponse.createBySuccessMessage("取消成功");
        }
        return ServerResponse.createByErrorMessage("取消失败");
    }


    @Override
    @Transactional(rollbackFor = Exception.class)
    public ServerResponse discussTo(Discuss discuss) {
        discuss.setDiscussId(KeyGenUtil.genUniqueKey());
        int i = discussMapper.insertSelective(discuss);
        if (i == 0) {
            return ServerResponse.createByErrorMessage("评论失败");
        }
        DiscussReply discussReply = new DiscussReply();
        discussReply.setDiscussId(discuss.getDiscussId());
        discussReply.setReplyId(discuss.getParentId());
        int i1 = discussReplyMapper.insertSelective(discussReply);
        if (i1 == 0) {
            return ServerResponse.createByErrorMessage("评论失败");
        }
        return ServerResponse.createBySuccessMessage("评论成功");
    }


    @Transactional(rollbackFor = Exception.class)
    @Override
    public ServerResponse replyTo(Reply reply) {
        reply.setReplyId(KeyGenUtil.genUniqueKey());

        int i = replyMapper.insertSelective(reply);
        if (i == 0) {
            return ServerResponse.createByErrorMessage("回复失败");
        }
        DiscussReply discussReply = new DiscussReply();
        discussReply.setReplyId(reply.getReplyId());
        discussReply.setDiscussId(reply.getParentId());
        int i1 = discussReplyMapper.insertSelective(discussReply);
        if (i1 == 0) {
            return ServerResponse.createByErrorMessage("回复失败");
        }
        //把父id添加到，需要回复的discuss的子节点上
        Discuss discuss = discussMapper.selectByPrimaryKey(reply.getParentId());
        discuss.setChildId(reply.getReplyId());

        int i2 = discussMapper.updateByPrimaryKey(discuss);
        if (i2 == 0) {
            return ServerResponse.createByErrorMessage("回复失败");
        }
        return ServerResponse.createBySuccess("回复成功");
    }

    @Override
    public ServerResponse<PageInfo> getServerList(int userId, int page, int onePage) {
        PageHelper.startPage(page, onePage);
        UserServerExample userServerExample = new UserServerExample();
        userServerExample.createCriteria().andUserIdEqualTo(userId);
        List<UserServer> userServers = userServerMapper.selectByExample(userServerExample);
        ArrayList<Server> services = new ArrayList<>();
        for (UserServer userServer : userServers) {
            services.add(serverMapper.selectByPrimaryKey(userServer.getServerId()));
        }
        PageInfo<Server> info = new PageInfo<>(services);
        return ServerResponse.createBySuccess(info);
    }

    @Override
    public ServerResponse<PageInfo> getNeedList(int userId, int page, int onePage) {
        PageHelper.startPage(page, onePage);
        UserNeedExample userNeedExample = new UserNeedExample();
        userNeedExample.createCriteria().andUserIdEqualTo(userId);
        List<UserNeed> userNeeds = userNeedMapper.selectByExample(userNeedExample);
        ArrayList<Need> needs = new ArrayList<>();
        for (UserNeed userNeed : userNeeds) {
            needs.add(needMapper.selectByPrimaryKey(userNeed.getNeedId()));
        }
        PageInfo<Need> info = new PageInfo<>(needs);
        return ServerResponse.createBySuccess(info);
    }

    @Override
    public ServerResponse<ArrayList> getDiscussList(String serverId) {
        ArrayList<DiscussReplyVo> discussReplyVos = new ArrayList<>();
        String serverId1 = "1" + String.valueOf(serverId);
        log.info(String.valueOf(serverId1));
        DiscussExample discussExample = new DiscussExample();
        discussExample.createCriteria().andServerOrNeedIdEqualTo(serverId1);
        List<Discuss> discusses = discussMapper.selectByExample(discussExample);
        if (discusses.size() == 0) {
            return ServerResponse.createByErrorMessage("该服务不存在");
        }
        for (Discuss discuss : discusses) {
            if (discuss.getParentId() == 0) {
                UserServiceImpl userService = new UserServiceImpl();
                discussReplyVos = userService.getDiscussList(discuss);
            }
        }
        return ServerResponse.createBySuccess(discussReplyVos);
    }

    /**
     * 获取评论的递归方法
     */
    private ArrayList<DiscussReplyVo> getDiscussList(Discuss discuss) {
        ArrayList<DiscussReplyVo> discussReplyVos = new ArrayList<>();
        DiscussReplyVo discussReplyVo = new DiscussReplyVo();
        discussReplyVo.setDiscuss(discuss);
        if (null == discuss.getChildId()) {
            discussReplyVos.add(discussReplyVo);
            return discussReplyVos;
        }
        Reply reply = replyMapper.selectByPrimaryKey(discuss.getChildId());
        discussReplyVo.setReply(reply);
        discussReplyVos.add(discussReplyVo);
        if (null == reply.getChildId()) {
            return discussReplyVos;
        }
        Discuss discuss1 = discussMapper.selectByPrimaryKey(reply.getChildId());
        return getDiscussList(discuss1);
    }


    @Override
    public ServerResponse<NeedUserListServerVo> getNeeding(int userId) {
        NeedUserListServerVo needUserListServerVo = new NeedUserListServerVo();
        User user = userMapper.selectByPrimaryKey(userId);
        needUserListServerVo.setUser(user);
        //把所有该用户发的需求筛选出来
        UserNeedExample userNeedExample = new UserNeedExample();
        userNeedExample.createCriteria().andUserIdEqualTo(userId);
        List<UserNeed> userNeeds = userNeedMapper.selectByExample(userNeedExample);
        ArrayList<NeedAndUserVo> needAndUserVos = new ArrayList<>();
        if (userNeeds.size() != 0) {
            for (UserNeed userNeed : userNeeds) {
                NeedAndUserVo needAndUserVo = new NeedAndUserVo();
                Need need = needMapper.selectByPrimaryKey(userNeed.getNeedId());
                if (need.getGoodsStatus() == 1 || need.getGoodsStatus() == 2 || need.getGoodsStatus() == 3) {
                    needAndUserVo.setNeed(need);
                    UserGetNeedExample userGetNeedExample = new UserGetNeedExample();
                    userGetNeedExample.createCriteria().andNeedIdEqualTo(need.getNeedId());
                    List<UserGetNeed> userGetNeeds = userGetNeedMapper.selectByExample(userGetNeedExample);
                    if (userGetNeeds.size() > 0) {
                        User user1 = userMapper.selectByPrimaryKey(userGetNeeds.get(0).getUserId());
                        needAndUserVo.setUser(user1);
                        needAndUserVos.add(needAndUserVo);
                    }

                }
            }

        }
        UserGetNeedExample userGetNeedExample = new UserGetNeedExample();
        userGetNeedExample.createCriteria().andUserIdEqualTo(userId);
        List<UserGetNeed> userGetNeeds = userGetNeedMapper.selectByExample(userGetNeedExample);
        if (userGetNeeds.size() != 0) {
            for (UserGetNeed userGetNeed : userGetNeeds) {
                NeedAndUserVo needAndUserVo = new NeedAndUserVo();
                Need need = needMapper.selectByPrimaryKey(userGetNeed.getNeedId());
                UserNeedExample userNeedExample1 = new UserNeedExample();
                userNeedExample1.createCriteria().andNeedIdEqualTo(need.getNeedId());
                List<UserNeed> userNeeds1 = userNeedMapper.selectByExample(userNeedExample1);
                if (userNeeds1.size() > 0) {
                    User user1 = userMapper.selectByPrimaryKey(userNeeds1.get(0).getUserId());
                    needAndUserVo.setUser(user1);
                    needAndUserVo.setNeed(need);
                    needAndUserVos.add(needAndUserVo);
                }
            }
        }

        needUserListServerVo.setNeedAndUserVos(needAndUserVos);
        return ServerResponse.createBySuccess(needUserListServerVo);
    }

    @Override
    public ServerResponse resetPassword(String messageCode, String newPassWord, String phoneNumber) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andPhoneNumberEqualTo(phoneNumber);
        User user = userMapper.selectByExample(userExample).get(0);
        String s = phoneNumber + messageCode;
        log.info(s);
        log.info(TokenCache.getKey(s));
        if (null == TokenCache.getKey(s)) {

            return ServerResponse.createByErrorMessage("您输入的短信验证码有误或者已失效");
        }
//        user.setPassword(MD5Util.MD5EncodeUtf8(newPassWord));
        user.setPassword(newPassWord);
        int i = userMapper.updateByPrimaryKeySelective(user);
        if (i == 0) {
            return ServerResponse.createByErrorMessage("更新失败");
        }
        return ServerResponse.createBySuccess("修改成功");


    }

    @Override
    public ServerResponse<ArrayList> searchServer(String latitude, String longitude, String content) {

        ArrayList<ServerAndUserVo> serverAndUserVos = new ArrayList<>();
        ServerExample serverExample = new ServerExample();
        ServerExample.Criteria criteria = serverExample.createCriteria();
        if (StringUtils.isNotBlank(content)) {
            content = "%" + content + "%";
        }
        if (StringUtils.isNotBlank(content)) {
            criteria.andServerTitleLike(content);
        }
        List<Server> servers = serverMapper.selectByExample(serverExample);
        for (Server server : servers) {
            double distance = LocationUtil.getDistance(Double.valueOf(server.getServerLatitude()), Double.valueOf(server.getServerLongitude()), Double.valueOf(latitude), Double.valueOf(longitude));
            if (distance < 1000) {
                ServerAndUserVo serverAndUserVo = new ServerAndUserVo();
                UserServerExample userServerExample = new UserServerExample();
                userServerExample.createCriteria().andServerIdEqualTo(server.getServerId());
                serverAndUserVo.setUser(userMapper.selectByPrimaryKey(userServerMapper.selectByExample(userServerExample).get(0).getUserId()));
                serverAndUserVo.setServer(server);
                serverAndUserVos.add(serverAndUserVo);
            }
        }
        return ServerResponse.createBySuccess(serverAndUserVos);
    }

    @Override
    public ServerResponse<ArrayList> searchNeed(String latitude, String longitude, String content) {

        ArrayList<NeedAndUserVo> needAndUserVos = new ArrayList<>();
        NeedExample needExample = new NeedExample();
        needExample.createCriteria().andNeedTitleNotLike("" + content + "");
        List<Need> needs = needMapper.selectByExample(needExample);
        for (Need need : needs) {
            if (LocationUtil.getDistance(Double.valueOf(latitude), Double.valueOf(longitude), Double.valueOf(need.getLatitude()), Double.valueOf(need.getLatitude())) < 1000) {
                NeedAndUserVo needAndUserVo = new NeedAndUserVo();
                UserNeedExample userNeedExample = new UserNeedExample();
                userNeedExample.createCriteria().andNeedIdEqualTo(need.getNeedId());
                User user = userMapper.selectByPrimaryKey(userNeedMapper.selectByExample(userNeedExample).get(0).getUserId());
                needAndUserVo.setUser(user);
                needAndUserVo.setNeed(need);
                needAndUserVos.add(needAndUserVo);
            }
        }
        return ServerResponse.createBySuccess(needAndUserVos);
    }

    @Override
    public ServerResponse<ArrayList> getDiscussByUserId(String userId) {
        ArrayList<DiscussAndUserVo> discussAndUserVos = new ArrayList<>();
        DiscussExample discussExample = new DiscussExample();
        List<Discuss> discusses = discussMapper.selectByExample(discussExample);
        for (Discuss discuss : discusses) {
            DiscussAndUserVo discussAndUserVo = new DiscussAndUserVo();
            discussAndUserVo.setDiscuss(discuss);
            User user = userMapper.selectByPrimaryKey(discuss.getUserId());
            discussAndUserVo.setUser(user);
            discussAndUserVos.add(discussAndUserVo);
        }


        return ServerResponse.createBySuccess(discussAndUserVos);
    }


    @Override
    public ServerResponse addServerMessage(ServeringServer serveringServer) {
        serveringServer.setServeringId(KeyGenUtil.genUniqueKey());
        int i = serveringServerMapper.insertSelective(serveringServer);
        if (i == 0) {
            return ServerResponse.createByErrorMessage("添加信息失败");
        }
        return ServerResponse.createBySuccessMessage("添加成功");
    }

    @Override
    public ServerResponse addNeedMessage(NeededNeed neededNeed) {
        neededNeed.setNeededId(KeyGenUtil.genUniqueKey());
        int i = neededNeedMapper.insertSelective(neededNeed);
        if (i == 0) {
            return ServerResponse.createByErrorMessage("添加失败");
        }
        return ServerResponse.createBySuccessMessage("添加成功");
    }


    @Override
    public ServerResponse<ServerUserListServerVo> getServering(int userId) {
        //封装的传输vo
        ServerUserListServerVo serverUserListServerVo = new ServerUserListServerVo();
        //获取用户对象
        User user = userMapper.selectByPrimaryKey(userId);
        //将此用户添加到vo中
        serverUserListServerVo.setUser(user);
        //根据用户获取服务id
        UserServerExample userServerExample = new UserServerExample();
        userServerExample.createCriteria().andUserIdEqualTo(userId);
        //获取服务列表
        List<UserServer> userServers = userServerMapper.selectByExample(userServerExample);
        ArrayList<ServerAndUserVo> serverAndUserVos = new ArrayList<>();
        if (userServers.size() != 0) {
            //筛选封装
            for (UserServer userServer : userServers) {
                ServerAndUserVo serverAndUserVo = new ServerAndUserVo();
                Server server = serverMapper.selectByPrimaryKey(userServer.getServerId());
                if (server.getServerStatus() == 1 || server.getServerStatus() == 2 || server.getServerStatus() == 3) {
                    serverAndUserVo.setServer(server);
                    UserGetServerExample userGetServerExample = new UserGetServerExample();
                    userGetServerExample.createCriteria().andServerIdEqualTo(server.getServerId());
                    List<UserGetServer> userGetServers = userGetServerMapper.selectByExample(userGetServerExample);
                    if (userGetServers.size() != 0) {
                        User user1 = userMapper.selectByPrimaryKey(userGetServers.get(0).getUserId());
                        serverAndUserVo.setUser(user1);
                        serverAndUserVos.add(serverAndUserVo);
                    }
                }
            }
        }
        //通过用户id到usergetserver表中查找server
        UserGetServerExample userGetServerExample = new UserGetServerExample();
        userGetServerExample.createCriteria().andUserIdEqualTo(userId);
        List<UserGetServer> userGetServers = userGetServerMapper.selectByExample(userGetServerExample);
        if (userGetServers.size() != 0) {

            for (UserGetServer userGetServer : userGetServers) {
                ServerAndUserVo serverAndUserVo = new ServerAndUserVo();
                //获取server对象
                Server server = serverMapper.selectByPrimaryKey(userGetServer.getServerId());
                UserServerExample userServerExample1 = new UserServerExample();
                userServerExample1.createCriteria().andServerIdEqualTo(server.getServerId());
                List<UserServer> userServers1 = userServerMapper.selectByExample(userServerExample1);
                if (userServers1.size() > 0) {
                    User user1 = userMapper.selectByPrimaryKey(userServers1.get(0).getUserId());
                    serverAndUserVo.setUser(user1);
                    serverAndUserVo.setServer(server);
                    serverAndUserVos.add(serverAndUserVo);
                }
            }
        }
        serverUserListServerVo.setServerAndUserVos(serverAndUserVos);
        return ServerResponse.createBySuccess(serverUserListServerVo);
    }

    @Override
    public ServerResponse<User> getUser(int userId) {
        User user = userMapper.selectByPrimaryKey(userId);
        if (null != user) {
            return ServerResponse.createBySuccess(user);
        } else {
            return ServerResponse.createByErrorMessage("该用户不存在");
        }
    }
}
