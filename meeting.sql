/*
Navicat MySQL Data Transfer

Source Server         : lookhouse
Source Server Version : 50519
Source Host           : localhost:3306
Source Database       : meeting

Target Server Type    : MYSQL
Target Server Version : 50519
File Encoding         : 65001

Date: 2018-02-23 13:12:44
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_manager`
-- ----------------------------
DROP TABLE IF EXISTS `t_manager`;
CREATE TABLE `t_manager` (
  `id` int(11) NOT NULL DEFAULT '0',
  `name` varchar(255) CHARACTER SET utf8 NOT NULL,
  `password` varchar(100) CHARACTER SET utf8 NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of t_manager
-- ----------------------------
INSERT INTO `t_manager` VALUES ('23', 'asd', 'abcd');

-- ----------------------------
-- Table structure for `t_meeting`
-- ----------------------------
DROP TABLE IF EXISTS `t_meeting`;
CREATE TABLE `t_meeting` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '会议id',
  `name` varchar(255) NOT NULL COMMENT '会议名称',
  `people_num` int(11) NOT NULL COMMENT '会议人数',
  `begin_time` datetime NOT NULL COMMENT '会议开始时间',
  `end_time` datetime NOT NULL COMMENT '会议结束时间',
  `room_id` int(11) NOT NULL COMMENT '会议室编号',
  `status` tinyint(3) NOT NULL COMMENT '会议状态',
  `manager_id` int(12) NOT NULL COMMENT '创建者id',
  `description` text COMMENT '会议描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_meeting
-- ----------------------------
INSERT INTO `t_meeting` VALUES ('1', '???', '50', '2018-02-21 00:00:00', '2018-02-22 00:00:00', '11', '0', '1', '????');
INSERT INTO `t_meeting` VALUES ('2', '???', '50', '2018-02-21 00:00:00', '2018-02-22 00:00:00', '11', '0', '1', '????');
INSERT INTO `t_meeting` VALUES ('3', '???', '50', '2018-02-21 00:00:00', '2018-02-22 00:00:00', '11', '0', '1', '????');
INSERT INTO `t_meeting` VALUES ('4', '???', '50', '2018-02-21 00:00:00', '2018-02-22 00:00:00', '11', '0', '1', '????');

-- ----------------------------
-- Table structure for `t_meeting_room`
-- ----------------------------
DROP TABLE IF EXISTS `t_meeting_room`;
CREATE TABLE `t_meeting_room` (
  `room_name` varchar(133) CHARACTER SET utf8 NOT NULL,
  `room_id` bigint(20) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`room_id`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of t_meeting_room
-- ----------------------------
INSERT INTO `t_meeting_room` VALUES ('???', '34');

-- ----------------------------
-- Table structure for `t_relation_join`
-- ----------------------------
DROP TABLE IF EXISTS `t_relation_join`;
CREATE TABLE `t_relation_join` (
  `meeting_id` int(12) NOT NULL,
  `user_id` int(12) NOT NULL,
  PRIMARY KEY (`meeting_id`,`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of t_relation_join
-- ----------------------------
INSERT INTO `t_relation_join` VALUES ('12', '3');

-- ----------------------------
-- Table structure for `t_super_manager`
-- ----------------------------
DROP TABLE IF EXISTS `t_super_manager`;
CREATE TABLE `t_super_manager` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '超级管理id',
  `name` varchar(255) CHARACTER SET utf8 NOT NULL COMMENT '超级管理姓名',
  `password` varchar(16) NOT NULL COMMENT '超级管理密码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of t_super_manager
-- ----------------------------
INSERT INTO `t_super_manager` VALUES ('1', 'ly', '123456');

-- ----------------------------
-- Table structure for `t_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `user_name` varchar(255) CHARACTER SET utf8 NOT NULL COMMENT '用户名',
  `user_psd` varchar(20) NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2013 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('2012', 'fzj', '1994');
