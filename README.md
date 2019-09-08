# SSM-BookAppointment
一、项目概述
--
本项目是基于Spring + Spring MVC + MyBatis的图书预约系统，
使用Maven进行包管理。主要功能包括：图书查询、图书预约、取消预约图书、预约查询等。

二、项目背景
---
最近在学SSM框架，一直做的都是一些小项目，比如登陆，也是跟着教程一步一步做，自己没有独立用SSM框架完成过一个完整的项目。在知乎上看到一个大佬分享自己曾经
做过的一个SSM练手项目，我看了一下觉得很不错，就打算自己也做一下。前端页面和数据库部分是借鉴人家的，当然我也做了不少调整和修改，后端全部是我自己写的，
没有参考任何人的代码。前后花了十几天（第一次做，效率确实有点低）修修改改终于完成了，现在分享给大家，希望能给正在学SSM框架的同学一些帮助。
因为我是一个小白，所以项目会有很多不完善的地方，希望大家能够谅解。当初在做这个项目上的时候也考虑到了扩展性，所以就在mapper和service里多写了几个方法，
这几个方法目前还没有用到，所以大家觉得没用的话可以不添加这几个方法。`最后，如果大家觉得我的项目还可以的话可以送我一个star哦。`<br>
项目参考：https://github.com/jhyscode/ssm-BookAppointment-master<br>

三、项目开发环境
---
* 系统：Windows 10 <br>
* Java版本：jdk1.8.0_191 <br>
* 数据库：mysql-8.0.13-winx64 <br>
* 数据库可视化工具：navicat <br>
* IDE：Eclipse Jee 2018-09 <br>
* maven版本：apache-maven-3.6.1 <br>
* 服务器：apache-tomcat-9.0.14 <br>
* 文件编码：UTF-8 <br>
`大家在开发时可根据实际情况进行相应的调整。` <br>

四、项目运行
--
1.MySQL设置用户名为root，密码为123，也可自行修改数据库配置文件。 <br>
2.配置项目buildpath为jdk1.8。 <br>
3.配置Maven到环境变量中。 <br>
4.我使用的是热部署到本地服务器的方式，且更改了我的服务器端口号，请注意修改。
5.安装mysql并创建数据库。 <br>
6.数据库建表语句 <br>
```
-- 创建图书表
CREATE TABLE `book` ( 
  `book_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '图书ID',
  `name` varchar(100) NOT NULL COMMENT '图书名称',
  `introd` varchar(1000) NOT NULL COMMENT '简介',
  `number` int(11) NOT NULL COMMENT '馆藏数量',
  `appointNo` int(11) NOT NULL COMMENT '可预约数量',
  PRIMARY KEY (`book_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='图书表';

-- 初始化图书数据
INSERT INTO `book` (`book_id`, `name`, `introd`,`number`,`appointNO`)
VALUES
	(1000, 'Java程序设计', 'Java程序设计是一门balbal',10),
	(1001, '数据结构','数据结构是计算机存储、组织数据的方式。数据结构是指相互之间存在一种或多种特定关系的数据元素的集合。', 10,10),
	(1002, '设计模式','设计模式（Design Pattern）是一套被反复使用、多数人知晓的、经过分类的、代码设计经验的总结。',10,10),
	(1003, '编译原理','编译原理是计算机专业的一门重要专业课，旨在介绍编译程序构造的一般原理和基本方法。',10,10),
	(1004,'大学语文','基于长期的教学实践和学科思考，我们编写了这本《大学语文》教材balbal',10,10),
	(1005,'计算方法','计算方法又称“数值分析”。是为各种数学问题的数值解答研究提供最有效的算法。',10,10),
	(1006,'高等数学','广义地说，初等数学之外的数学都是高等数学，也有将中学较深入的代数、几何以及简单的集合论初步balbal',10,10);

-- 创建预约图书表
CREATE TABLE `appointment` (
  `book_id` bigint(20) NOT NULL COMMENT '图书ID',
  `student_id` bigint(20) NOT NULL COMMENT '学号',
  `appoint_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '预约时间' ,
  PRIMARY KEY (`book_id`, `student_id`),
  INDEX `idx_appoint_time` (`appoint_time`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='预约图书表';
-- 创建学生数据表
CREATE TABLE `student`(
	`student_id` bigint(20) NOT NULL COMMENT '学生ID',
	`password`  bigint(20) NOT NULL COMMENT '密码',
	PRIMARY KEY(`student_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='学生统计表';	
-- 初始化学生数据
INSERT INTO `student`(`student_id`,`password`) 
VALUES
	(1,1),
	(2,2),
	(3,3);
```

五、欢迎大家参与项目并与我交流沟通
---
* QQ：1319668285
* 微信：18534437910
* 邮箱：1319668285@qq.com
