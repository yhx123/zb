package com.lsjs.zb.pojo.vo;

import com.lsjs.zb.pojo.ReportServer;
import com.lsjs.zb.pojo.Server;
import lombok.Data;

@Data
public class ServerAndReportServerVo {
    private Server server;
    private ReportServer reportServer;
}
