/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.5.57 : Database - test_db
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`test_db` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `test_db`;

/*Table structure for table `orders` */

DROP TABLE IF EXISTS `orders`;

CREATE TABLE `orders` (
  `id` int(15) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `buyer` varchar(50) DEFAULT '' COMMENT '买家',
  `product` varchar(100) DEFAULT '' COMMENT '产品',
  `number` int(11) DEFAULT '0' COMMENT '产品数量',
  `salePrice` decimal(10,2) DEFAULT '0.00' COMMENT '产品售价（人民币元）',
  `hkPrice` decimal(10,0) DEFAULT '0' COMMENT '港价（港元）',
  `purchaseDate` date DEFAULT '0000-00-00' COMMENT '采购日期',
  `operDate` datetime DEFAULT '0000-00-00 00:00:00' COMMENT '操作日期',
  `state` tinyint(4) DEFAULT '0' COMMENT '0:未付；1：已付',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

/*Table structure for table `users` */

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(50) DEFAULT '',
  `passWord` varchar(50) DEFAULT '',
  `user_sex` varchar(50) DEFAULT '''MAN''',
  `nick_name` varchar(50) DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
