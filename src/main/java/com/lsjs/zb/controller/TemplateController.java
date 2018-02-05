package com.lsjs.zb.controller;

import com.lsjs.zb.dao.NeedMapper;
import com.lsjs.zb.dao.ServerMapper;
import com.lsjs.zb.pojo.Need;
import com.lsjs.zb.pojo.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@CrossOrigin
@Controller
public class TemplateController {
    @Autowired
    private ServerMapper serverMapper;

    @Autowired
    private NeedMapper needMapper;

    @GetMapping("/getServer")
    public String getServer(int serverId, Model model) {
        Server server = serverMapper.selectByPrimaryKey(serverId);
        String imgStr = server.getServerImg();
        String[] images = null;
        if (imgStr != null) {
            images = imgStr.split(",");
        }
        model.addAttribute("images", images);
        model.addAttribute("server", server);
        return "getServer";
    }


    @GetMapping("/getNeed")
    public String getNeed(int needId, Model model) {
        Need need = needMapper.selectByPrimaryKey(needId);
        String imgStr = need.getNeedImg();
        String[] images = null;
        if (imgStr != null){
            images = imgStr.split(",");
        }
        model.addAttribute("images", images);
        model.addAttribute("need", need);
        return "getNeed";
    }

}