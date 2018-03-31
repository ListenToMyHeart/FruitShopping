/*
Navicat MySQL Data Transfer

Source Server         : mengxu
Source Server Version : 50554
Source Host           : localhost:3306
Source Database       : fruit

Target Server Type    : MYSQL
Target Server Version : 50554
File Encoding         : 65001

Date: 2017-09-02 22:07:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for address
-- ----------------------------
DROP TABLE IF EXISTS `address`;
CREATE TABLE `address` (
  `pkid` int(11) NOT NULL AUTO_INCREMENT,
  `memberid` varchar(40) COLLATE utf8_unicode_ci NOT NULL,
  `receiveraddress` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `status` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `receiver` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `receiverphone` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`pkid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for buyinformation
-- ----------------------------
DROP TABLE IF EXISTS `buyinformation`;
CREATE TABLE `buyinformation` (
  `pkid` int(11) NOT NULL COMMENT '购物单号',
  `goodsid` varchar(80) NOT NULL COMMENT '商品ID',
  `num` int(10) NOT NULL COMMENT '商品数量',
  `orderid` int(11) NOT NULL COMMENT '订单号',
  `goodsprice` varchar(80) NOT NULL COMMENT '商品单价',
  `memberid` varchar(80) NOT NULL COMMENT '会员ID',
  PRIMARY KEY (`pkid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for goodsinformation
-- ----------------------------
DROP TABLE IF EXISTS `goodsinformation`;
CREATE TABLE `goodsinformation` (
  `pkid` int(11) NOT NULL AUTO_INCREMENT,
  `goodsid` varchar(80) NOT NULL COMMENT '商品名称',
  `classid` varchar(80) NOT NULL COMMENT '商品类别',
  `goodsintroduce` varchar(500) NOT NULL COMMENT '商品介绍',
  `goodsbrand` varchar(80) NOT NULL COMMENT '商品品牌',
  `goodsunit` varchar(80) NOT NULL COMMENT '商品计数单位',
  `goodsweight` decimal(12,2) NOT NULL COMMENT '商品重量',
  `goodsurl` varchar(200) NOT NULL COMMENT '商品图片地址',
  `sales` int(11) NOT NULL DEFAULT '0',
  `pregoodsprice` decimal(12,2) NOT NULL,
  `goodsprice` decimal(12,2) NOT NULL COMMENT '商品价格',
  `isrefinement` varchar(40) NOT NULL COMMENT '是否下架',
  `ishot` varchar(40) DEFAULT NULL COMMENT '是否热销',
  `isdiscount` varchar(40) DEFAULT NULL COMMENT '是否特价',
  `updatatime` datetime NOT NULL COMMENT '上传日期',
  PRIMARY KEY (`pkid`)
) ENGINE=InnoDB AUTO_INCREMENT=78 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for members
-- ----------------------------
DROP TABLE IF EXISTS `members`;
CREATE TABLE `members` (
  `memberid` varchar(40) NOT NULL COMMENT '会员ID',
  `truename` varchar(40) DEFAULT NULL COMMENT '真实姓名',
  `sex` varchar(40) DEFAULT NULL COMMENT '会员性别',
  `phone` varchar(40) DEFAULT NULL COMMENT '电话号码',
  `email` varchar(80) DEFAULT NULL COMMENT 'Email',
  `city` varchar(80) DEFAULT NULL COMMENT '所在城市',
  `address` varchar(80) DEFAULT NULL COMMENT '会员状态(1为冻结,0为正常)',
  `postcode` varchar(80) DEFAULT NULL COMMENT '邮编号码',
  `advancepayment` varchar(80) NOT NULL DEFAULT '0' COMMENT '现有存款',
  `loaddate` datetime NOT NULL COMMENT '上次登录时间',
  `cartid` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`cartid`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='会员ID';

-- ----------------------------
-- Table structure for orderinformation
-- ----------------------------
DROP TABLE IF EXISTS `orderinformation`;
CREATE TABLE `orderinformation` (
  `orderid` int(11) NOT NULL AUTO_INCREMENT COMMENT '订单ID',
  `goodsid` varchar(80) NOT NULL COMMENT '商品名称',
  `orderdate` datetime NOT NULL COMMENT '提交订单日期',
  `goodsprice` varchar(40) NOT NULL COMMENT '商品价格',
  `totalprice` varchar(40) NOT NULL COMMENT '总价格',
  `paytype` varchar(40) NOT NULL COMMENT 'goodspkid',
  `shiptype` varchar(80) NOT NULL COMMENT '退款理由',
  `memberid` varchar(40) NOT NULL COMMENT '用户id',
  `receivername` varchar(40) NOT NULL COMMENT '接收人姓名',
  `receiverphone` varchar(40) NOT NULL COMMENT '接收人电话',
  `isconfirm` varchar(40) DEFAULT '' COMMENT '货物数量',
  `ispayment` varchar(40) NOT NULL COMMENT '是否付款',
  `address` varchar(250) NOT NULL COMMENT '地址',
  `receiverpostcode` varchar(40) DEFAULT NULL COMMENT '订单第二状态',
  `receiveraddress` varchar(250) NOT NULL COMMENT '接收人地址',
  `status` varchar(10) DEFAULT NULL COMMENT '商品状态（未提交,未接收,已发货,未发货,已收货,已退货）',
  PRIMARY KEY (`orderid`)
) ENGINE=InnoDB AUTO_INCREMENT=81 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Table structure for shopcart
-- ----------------------------
DROP TABLE IF EXISTS `shopcart`;
CREATE TABLE `shopcart` (
  `cartid` int(11) NOT NULL COMMENT '购物车号',
  `goodspkid` int(11) NOT NULL COMMENT '商品编号',
  `goodsid` varchar(40) NOT NULL COMMENT '商品名称',
  `goodsprice` decimal(12,2) NOT NULL COMMENT '商品价格',
  `memberid` varchar(40) NOT NULL COMMENT '会员ID',
  `classid` varchar(40) NOT NULL COMMENT '商品类别',
  `totalprice` decimal(12,2) NOT NULL COMMENT '总价',
  `goodsnumber` int(11) NOT NULL COMMENT '商品数量',
  `cartstatus` varchar(20) NOT NULL DEFAULT '正常' COMMENT '购物车状态',
  `goodsurl` varchar(200) NOT NULL COMMENT '商品图片地址',
  `goodspreprice` decimal(12,2) NOT NULL,
  `goodsintroduce` varchar(255) NOT NULL,
  PRIMARY KEY (`goodspkid`,`memberid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userid` varchar(80) NOT NULL COMMENT '登录名',
  `password` varchar(80) NOT NULL COMMENT '登录密码',
  `status` int(11) NOT NULL COMMENT '是否被冻结',
  `privelege` int(11) NOT NULL COMMENT '登录权限',
  `truename` varchar(40) NOT NULL DEFAULT '' COMMENT '真实姓名',
  `loaddate` date NOT NULL COMMENT '上次登录时间',
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
