/*
SQLyog  v12.2.6 (64 bit)
MySQL - 5.7.20-0ubuntu0.16.04.1 : Database - zb
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`zb` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */;

USE `zb`;

/*Table structure for table `credit` */

DROP TABLE IF EXISTS `credit`;

CREATE TABLE `credit` (
  `id` int(11) NOT NULL COMMENT '信用id',
  `user_id` int(11) NOT NULL COMMENT '用户id',
  `real_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '真是姓名',
  `id_namuber` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '身份证号',
  `credit_score` varchar(255) COLLATE utf8_unicode_ci NOT NULL COMMENT '信用分',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '实名认证时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `credit` */

insert  into `credit`(`id`,`user_id`,`real_name`,`id_namuber`,`credit_score`,`create_time`) values 
(134621,450778,'陈然','360722199708096335','100','2017-11-30 18:51:42'),
(238519,283879,'希望','360313199801053032','100','2017-12-01 21:40:43'),
(389686,179551,'杨红星','362329199604290838','100','2017-11-30 17:32:13'),
(756062,598520,'施智文','360722199708096335','100','2017-12-01 10:27:52');

/*Table structure for table `credit_credit_detail` */

DROP TABLE IF EXISTS `credit_credit_detail`;

CREATE TABLE `credit_credit_detail` (
  `credit_id` int(11) NOT NULL COMMENT '信用id',
  `credit_detail_id` int(11) NOT NULL COMMENT '信用细节id'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `credit_credit_detail` */

/*Table structure for table `credit_detail` */

DROP TABLE IF EXISTS `credit_detail`;

CREATE TABLE `credit_detail` (
  `credit_detail_id` int(11) NOT NULL COMMENT '信息记录id',
  `user_id` int(11) NOT NULL COMMENT '用户id',
  `time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '产生信用时间',
  `activelity` varchar(255) COLLATE utf8_unicode_ci NOT NULL COMMENT '行为名称',
  `score_chage` varchar(255) COLLATE utf8_unicode_ci NOT NULL COMMENT '信用变化情况',
  `description` varchar(1024) COLLATE utf8_unicode_ci NOT NULL COMMENT '备注',
  PRIMARY KEY (`credit_detail_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `credit_detail` */

/*Table structure for table `discuss` */

DROP TABLE IF EXISTS `discuss`;

CREATE TABLE `discuss` (
  `discuss_id` int(11) NOT NULL COMMENT '评价id',
  `child_id` int(11) DEFAULT NULL COMMENT '子id一定是reply_id',
  `server_or_need_id` varchar(11) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '服务或需求id,第一位0:need,1:server',
  `parent_id` int(11) NOT NULL COMMENT '父id一定是reply_id或0',
  `user_id` int(11) NOT NULL COMMENT '用户id',
  `content` varchar(1024) COLLATE utf8_unicode_ci NOT NULL COMMENT '评论内容',
  `discuss_img` varchar(1024) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '图片评论地址',
  PRIMARY KEY (`discuss_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `discuss` */

/*Table structure for table `discuss_reply` */

DROP TABLE IF EXISTS `discuss_reply`;

CREATE TABLE `discuss_reply` (
  `discuss_id` int(11) NOT NULL COMMENT '评论表id',
  `reply_id` int(11) NOT NULL COMMENT '回复表'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `discuss_reply` */

/*Table structure for table `fans` */

DROP TABLE IF EXISTS `fans`;

CREATE TABLE `fans` (
  `fans_id` int(11) NOT NULL COMMENT '粉丝表id',
  `user_id` int(11) NOT NULL COMMENT '用户id',
  PRIMARY KEY (`fans_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='用户粉丝列表';

/*Data for the table `fans` */

/*Table structure for table `following` */

DROP TABLE IF EXISTS `following`;

CREATE TABLE `following` (
  `followering_id` int(11) NOT NULL COMMENT '关注者表id',
  `user_id` int(11) NOT NULL COMMENT '用户id',
  PRIMARY KEY (`followering_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='用户的关注着列表';

/*Data for the table `following` */

/*Table structure for table `need` */

DROP TABLE IF EXISTS `need`;

CREATE TABLE `need` (
  `need_id` int(11) NOT NULL COMMENT '需求id主键非空',
  `need_title` varchar(255) COLLATE utf8_unicode_ci NOT NULL COMMENT '需求标题',
  `need_description` varchar(1024) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '需求描述',
  `reward` bigint(20) NOT NULL COMMENT '悬赏单位：分',
  `longitude` varchar(255) COLLATE utf8_unicode_ci NOT NULL COMMENT '经度非空',
  `latitude` varchar(255) COLLATE utf8_unicode_ci NOT NULL COMMENT '纬度非空',
  `need_type` int(11) NOT NULL COMMENT '需求类型非空',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '发布时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `goods_status` int(11) NOT NULL DEFAULT '0' COMMENT '0：未接单1：已接单2：已完成3：被取消',
  `check_status` int(11) NOT NULL DEFAULT '0' COMMENT '0:未审核1：通过2:未通过',
  `need_img` varchar(1024) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '需求图片地址可为多张图片用json',
  `need_time` bigint(20) NOT NULL DEFAULT '-1' COMMENT '默认为-1就是无期限，以分钟为单位',
  PRIMARY KEY (`need_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `need` */

insert  into `need`(`need_id`,`need_title`,`need_description`,`reward`,`longitude`,`latitude`,`need_type`,`create_time`,`update_time`,`goods_status`,`check_status`,`need_img`,`need_time`) values 
(117966,'教我学习英语','最近想要学习一下英语，但是我又不知道怎么去学，基础比较差，希望能有个人能帮帮我，教我英语，感谢',50,'114.414371082869','30.5150467778494',5,'2017-12-01 21:17:53','2017-12-01 21:17:53',0,1,'http://zhongbangapp.oss-cn-beijing.aliyuncs.com/b6dac8eb3df102a5cd0bf2c0c17a269c.png,',120),
(349928,'帮我维修手机','我的nubia手机屏幕坏了，一直黑屏，我买了一个新的屏幕，但是不会换，希望有人能帮我换一下',10,'114.398114214308','30.5177999520619',4,'2017-12-01 21:30:54','2017-12-06 15:25:33',2,1,'http://zhongbangapp.oss-cn-beijing.aliyuncs.com/7940756058024dfb40b9405cdc0cc943.png,',120),
(636712,'帮我重新装个系统','我的Windows系统电脑比较卡，希望有人能帮我重装一下系统',20,'114.404153207802','30.5168652910868',4,'2017-12-01 21:51:04','2017-12-02 10:27:35',1,1,'http://zhongbangapp.oss-cn-beijing.aliyuncs.com/85bf08da4d3216a02ac1bb4f86cde596.png,',120),
(764717,'帮我王者荣耀上分','希望大神陪我一起玩游戏，带我上王者',2,'114.403176883737','30.5134939670662',7,'2017-12-02 08:10:45','2017-12-02 08:10:45',0,1,'http://zhongbangapp.oss-cn-beijing.aliyuncs.com/ab68310535ea79ffadb142e1ef11a5d1.png,',120),
(906831,'找个人帮我补习英语','我的英语基础比较差希望有人帮我补习一下英语，时间是每个周一到周五。',50,'114.404059330488','30.5284375860314',5,'2017-12-01 22:03:21','2017-12-01 22:03:21',0,1,'http://zhongbangapp.oss-cn-beijing.aliyuncs.com/57136bcca5b3db1aee432428f0446e1d.png,',120);

/*Table structure for table `needed_need` */

DROP TABLE IF EXISTS `needed_need`;

CREATE TABLE `needed_need` (
  `needed_id` int(11) NOT NULL COMMENT '接受需求信息表id',
  `need_id` int(11) NOT NULL COMMENT '需求id',
  `user_id` int(11) NOT NULL COMMENT '接单人的user_id',
  `needed_name` varchar(255) COLLATE utf8_unicode_ci NOT NULL COMMENT '接受需求者姓名',
  `needed_address` varchar(1024) COLLATE utf8_unicode_ci NOT NULL COMMENT '接受需求者地址',
  `needed_phone` varchar(255) COLLATE utf8_unicode_ci NOT NULL COMMENT '接受需求者手机号',
  PRIMARY KEY (`needed_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='接受了需求的人（也就是被需求）的个人信息，类似于收件人的信息';

/*Data for the table `needed_need` */

insert  into `needed_need`(`needed_id`,`need_id`,`user_id`,`needed_name`,`needed_address`,`needed_phone`) values 
(120628,636712,598520,'s','i','s'),
(122464,636712,598520,'杨红星','地大','18270313383'),
(134650,636712,598520,'杨红星','地大','18270313383'),
(226555,636712,598520,'杨红星','地大','18270313383'),
(251082,636712,598520,'杨红星','地大','18270313383'),
(561049,636712,598520,'杨红星','地大','18270313383'),
(604459,636712,598520,'杨红星','地大','18270313383'),
(616158,636712,598520,'杨红星','地大','18270313383'),
(616848,636712,598520,'杨红星','地大','18270313383'),
(670062,636712,598520,'杨红星','地大','18270313383'),
(825376,349928,598520,'q','，','，'),
(848337,636712,598520,'杨红星','地大','18270313383'),
(866186,636712,598520,'杨红星','地大','18270313383'),
(867910,636712,598520,'杨红星','地大','18270313383'),
(906894,636712,598520,'杨红星','地大','18270313383'),
(996491,636712,598520,'杨红星','地大','18270313383');

/*Table structure for table `reply` */

DROP TABLE IF EXISTS `reply`;

CREATE TABLE `reply` (
  `reply_id` int(11) NOT NULL COMMENT '回复表id',
  `child_id` int(11) DEFAULT NULL COMMENT '子id一定discuss_id',
  `parent_id` int(11) NOT NULL COMMENT '父id一定是discuss_id',
  `content` varchar(1024) COLLATE utf8_unicode_ci NOT NULL COMMENT '回复内容',
  `reply_img` varchar(1024) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '图片回复地址',
  PRIMARY KEY (`reply_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `reply` */

/*Table structure for table `report_need` */

DROP TABLE IF EXISTS `report_need`;

CREATE TABLE `report_need` (
  `need_id` int(11) NOT NULL COMMENT '需求id',
  `user_id` int(11) NOT NULL COMMENT '举报者的用户id',
  `report_status` int(11) NOT NULL DEFAULT '0' COMMENT '处理状态：0为未处理；1为举报无效 未违规；2为举报有效 即违规',
  `need_message` varchar(1024) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '备注信息',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '举报时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='需求举报表';

/*Data for the table `report_need` */

/*Table structure for table `report_server` */

DROP TABLE IF EXISTS `report_server`;

CREATE TABLE `report_server` (
  `server_id` int(11) NOT NULL COMMENT '服务id',
  `user_id` int(11) NOT NULL COMMENT '举报者用户id',
  `report_status` int(11) NOT NULL DEFAULT '0' COMMENT '处理状态：0为未处理；1为举报无效 未违规；2为举报有效 违规',
  `server_message` varchar(1024) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '备注信息',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '举报时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='服务举报表';

/*Data for the table `report_server` */

insert  into `report_server`(`server_id`,`user_id`,`report_status`,`server_message`,`create_time`) values 
(971057,598520,2,'举报测试','2017-12-01 22:38:21'),
(297110,598520,2,'，','2017-12-02 11:47:18');

/*Table structure for table `server` */

DROP TABLE IF EXISTS `server`;

CREATE TABLE `server` (
  `server_id` int(11) NOT NULL COMMENT '服务id',
  `server_title` varchar(255) COLLATE utf8_unicode_ci NOT NULL COMMENT '服务标题',
  `server_description` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '服务描述',
  `price` bigint(20) NOT NULL COMMENT '定价 单位：分',
  `server_time` bigint(255) NOT NULL DEFAULT '-1' COMMENT '服务时间 单位：分',
  `check_status` int(11) DEFAULT '0' COMMENT '0:未审核1：通过2:未通过',
  `server_status` int(11) DEFAULT '0' COMMENT '0:没有被接受1:已接收2：已完成3：已取消',
  `server_type` int(11) NOT NULL COMMENT '服务类型非空关联服务类型id',
  `server_latitude` varchar(255) COLLATE utf8_unicode_ci NOT NULL COMMENT '服务范围纬度',
  `server_longitude` varchar(255) COLLATE utf8_unicode_ci NOT NULL COMMENT '服务范围经度',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `server_img` varchar(1024) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '服务图片地址用json',
  PRIMARY KEY (`server_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `server` */

insert  into `server`(`server_id`,`server_title`,`server_description`,`price`,`server_time`,`check_status`,`server_status`,`server_type`,`server_latitude`,`server_longitude`,`create_time`,`update_time`,`server_img`) values 
(101669,'手绘素描图片','1.风格:单人头像素描82元，单人头像彩铅170元2.图片形式：电子图（实在是需要实物图手稿可加15元邮费，当赠送您）相框30。3.出图时间：一般7天，加急可+50元，48小时内出图，加急+40，3天出图，加急+30，4天出图。周末除外。4.下单流程：点击右下角立即预约，预约成功后发相片到聊天窗口单人拍单份，多人请拍多份，如图中有2人就拍2份。',82,120,1,0,1,'30.5219902190376','114.389862398415','2017-12-01 21:34:07','2017-12-01 21:34:07','http://zhongbangapp.oss-cn-beijing.aliyuncs.com/7d993d65720fa90fdd9e08ae4f1fd179.png,'),
(189213,'专业为你讲解计算机知识','教你如何装系统，如何使用office等各种办公软件，如ps等',199,120,0,0,5,'30.5127707000054','114.398847798461','2017-12-01 21:56:14','2017-12-01 21:56:14','http://zhongbangapp.oss-cn-beijing.aliyuncs.com/346e8cd4eda3c57592f0b7e9a2e917e7.png,'),
(297110,'维修各种家电用品','维修家电产品，如电视剧，洗衣机，热水器等一系列家电产品',199,120,2,1,4,'30.5213571271486','114.407003054831','2017-12-02 08:29:06','2017-12-02 11:50:15','http://zhongbangapp.oss-cn-beijing.aliyuncs.com/d1b453a7e00de96919a8ac2c6b637390.png,'),
(311052,'帮你画一个Q版头像','1.风格:单人头像素描82元，单人头像彩铅170元2.图片形式：电子图（实在是需要实物图手稿可加15元邮费，当赠送您）相框30。3.出图时间：一般7天，加急可+50元，48小时内出图，加急+40，3天出图，加急+30，4天出图。周末除外。4.下单流程：点击右下角立即预约，预约成功后发相片到聊天窗口单人拍单份，多人请拍多份，如图中有2人就拍2份。',82,120,0,0,3,'30.5278022257381','114.404355714579','2017-12-01 21:58:45','2017-12-01 21:58:45','http://zhongbangapp.oss-cn-beijing.aliyuncs.com/74e78ae417c1cceb2b2e5b50a649a6e3.png,'),
(417503,'，','，',11,120,2,3,1,'30.51759765625','114.405781521267','2017-12-02 10:14:54','2017-12-03 20:38:27','http://zhongbangapp.oss-cn-beijing.aliyuncs.com/478c85a6c7f65094e42b52814abc59d7.png,'),
(465743,'专业拍照','专业为人拍照片，时间随便定。',89,120,0,1,2,'30.509235163775','114.406037459603','2017-12-01 21:47:51','2017-12-02 10:31:14','http://zhongbangapp.oss-cn-beijing.aliyuncs.com/d0e6cbee35bea74634be594ac06bfa0b.png,'),
(651675,'维修电脑手机','电脑，手机等各种产品的重装系统，刷机都可以，Windows系列，各种手机型号都都行',79,120,0,2,4,'30.5201752675686','114.404798279059','2017-12-02 08:37:15','2017-12-02 11:49:29','http://zhongbangapp.oss-cn-beijing.aliyuncs.com/148b68e1c840dafe38d148d264a59746.png,'),
(653699,'帮你维修各种手机，平板','个人有多年的手机等电子产品的维修经验，保证能够为你把东西修好，各种手机的刷机等',89,120,0,0,4,'30.5251498404396','114.411279837032','2017-12-02 08:16:09','2017-12-02 08:16:09','http://zhongbangapp.oss-cn-beijing.aliyuncs.com/23ea6505992e3aba220dda635821e559.png,'),
(887768,'1','1',20,120,2,3,1,'30.519128','114.40456','2017-12-02 11:48:55','2017-12-03 20:38:25','http://zhongbangapp.oss-cn-beijing.aliyuncs.com/cc9fd46b6feade4eee49156965407f0f.png,'),
(971057,'专业健身，改善饮食','简单介绍：三分靠练七分靠吃。用科学的方式减脂增肌，不节食不损伤代谢能力。你可自行拍下计划，根据你的新陈代谢，结合你的日常习惯，通过精确的计算为你制定饮食方案。向你介绍饮食原则，让你掌握饮食方法。计划时效：计划做好后，6个月内，可根据你的情况免费调整1次饮食方案。我的建议：结合私人定制的运动计划可实现更佳的减脂塑形或增重增肌的效果，好身材不是梦。',99,120,2,0,5,'30.5228693781235','114.394406060408','2017-12-01 21:37:16','2017-12-02 11:50:13','http://zhongbangapp.oss-cn-beijing.aliyuncs.com/8c9ffc3695df6cad73a2d24cab87880d.png,');

/*Table structure for table `servering_server` */

DROP TABLE IF EXISTS `servering_server`;

CREATE TABLE `servering_server` (
  `servering_id` int(11) NOT NULL COMMENT '服务者信息表id',
  `server_id` int(11) NOT NULL COMMENT '服务id',
  `user_id` int(11) NOT NULL COMMENT '接单人的用户id',
  `server_name` varchar(255) COLLATE utf8_unicode_ci NOT NULL COMMENT '服务者姓名',
  `server_phone` varchar(255) COLLATE utf8_unicode_ci NOT NULL COMMENT '服务者手机号',
  `server_address` varchar(1024) COLLATE utf8_unicode_ci NOT NULL COMMENT '服务者地址',
  PRIMARY KEY (`servering_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='这是接受了服务的人的个人信息，类似于收件人的信息';

/*Data for the table `servering_server` */

insert  into `servering_server`(`servering_id`,`server_id`,`user_id`,`server_name`,`server_phone`,`server_address`) values 
(670401,651675,598520,'施智文','18679700741','中国地质大学迎宾楼'),
(864826,465743,598520,'s','s','a'),
(951858,297110,598520,'1','123456','中国地质大学');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `user_id` int(11) NOT NULL COMMENT '用户ID主键',
  `username` varchar(255) COLLATE utf8_unicode_ci NOT NULL COMMENT '用户名',
  `password` varchar(255) COLLATE utf8_unicode_ci NOT NULL COMMENT '密码 非空',
  `phone_number` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '手机号 非空',
  `mail` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '邮箱',
  `birthday` date DEFAULT NULL COMMENT '生日',
  `sex` int(2) DEFAULT NULL COMMENT '性别 0为男 1女',
  `job` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '职业',
  `hobby` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '兴趣爱好',
  `speciality` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '特长',
  `user_img` varchar(225) COLLATE utf8_unicode_ci DEFAULT 'http://zhongbangapp.oss-cn-beijing.aliyuncs.com/defaultUserImage.png',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `user` */

insert  into `user`(`user_id`,`username`,`password`,`phone_number`,`mail`,`birthday`,`sex`,`job`,`hobby`,`speciality`,`user_img`) values 
(179551,'redstar','53A93D61CF748399EC8BC6F59CAC7D79','18270313383',NULL,NULL,0,'程序猿','敲代码','头发特长','http://zhongbangapp.oss-cn-beijing.aliyuncs.com/4ada0d944a71f7e9442eba1e1b5c7e9c.png'),
(283879,'唯有','53A93D61CF748399EC8BC6F59CAC7D79','15170334491',NULL,NULL,0,'教练','打篮球','运动','http://zhongbangapp.oss-cn-beijing.aliyuncs.com/0a78847a55b85ce9fb7df1b4eb5a30d9.png'),
(450778,'超级马里奥','53A93D61CF748399EC8BC6F59CAC7D79','15679678525',NULL,NULL,1,'','','','http://zhongbangapp.oss-cn-beijing.aliyuncs.com/1f63a601a666f06e25beb5fe1fde14ef.png'),
(598520,'你才码农','53A93D61CF748399EC8BC6F59CAC7D79','18679700741',NULL,NULL,0,'程序猿','科技，维修','维修，绘画','http://zhongbangapp.oss-cn-beijing.aliyuncs.com/609ae4461b18051cd6d9212938f67174.png');

/*Table structure for table `user_fans` */

DROP TABLE IF EXISTS `user_fans`;

CREATE TABLE `user_fans` (
  `user_id` int(11) NOT NULL COMMENT '用户id',
  `fans_id` int(11) NOT NULL COMMENT '粉丝表id'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `user_fans` */

/*Table structure for table `user_following` */

DROP TABLE IF EXISTS `user_following`;

CREATE TABLE `user_following` (
  `user_id` int(11) NOT NULL COMMENT '用户id',
  `following_id` int(11) NOT NULL COMMENT '关注者id'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `user_following` */

/*Table structure for table `user_get_need` */

DROP TABLE IF EXISTS `user_get_need`;

CREATE TABLE `user_get_need` (
  `user_id` int(11) NOT NULL COMMENT '用户id',
  `need_id` int(11) NOT NULL COMMENT '需求id',
  `status` int(11) NOT NULL DEFAULT '0' COMMENT '0:正在进行,1:已完成'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='用户找到需求的关联表';

/*Data for the table `user_get_need` */

insert  into `user_get_need`(`user_id`,`need_id`,`status`) values 
(598520,349928,1);

/*Table structure for table `user_get_server` */

DROP TABLE IF EXISTS `user_get_server`;

CREATE TABLE `user_get_server` (
  `user_id` int(11) NOT NULL COMMENT '用户id',
  `server_id` int(11) NOT NULL COMMENT '服务id',
  `status` int(11) NOT NULL DEFAULT '0' COMMENT '0:正在进行1:已结束'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='用户接受别人的服务关联表';

/*Data for the table `user_get_server` */

insert  into `user_get_server`(`user_id`,`server_id`,`status`) values 
(598520,651675,1),
(598520,465743,0),
(598520,297110,0);

/*Table structure for table `user_need` */

DROP TABLE IF EXISTS `user_need`;

CREATE TABLE `user_need` (
  `need_id` int(11) NOT NULL COMMENT '需求id',
  `user_id` int(11) NOT NULL COMMENT '用户id',
  KEY `need_id` (`need_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `user_need` */

insert  into `user_need`(`need_id`,`user_id`) values 
(117966,179551),
(349928,179551),
(636712,283879),
(906831,598520),
(764717,283879);

/*Table structure for table `user_server` */

DROP TABLE IF EXISTS `user_server`;

CREATE TABLE `user_server` (
  `user_id` int(11) NOT NULL COMMENT '用户id',
  `server_id` int(11) NOT NULL COMMENT '服务id'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `user_server` */

insert  into `user_server`(`user_id`,`server_id`) values 
(179551,101669),
(179551,971057),
(283879,465743),
(598520,189213),
(598520,311052),
(283879,653699),
(283879,297110),
(179551,651675),
(598520,417503),
(598520,887768);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
