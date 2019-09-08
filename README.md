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
5.安装mysql并创建数据库，创建表并添加数据。数据库建表语句在根目录createTable.sql文件中，运行项目时注意删除 <br>

五、运行截图
---
1.登录界面
! + [登录] + (https://github.com/angel-of-java/SSM-BookAppointment/master/images/login.png)
2.索引界面
! + [索引] + (https://github.com/angel-of-java/SSM-BookAppointment/master/images/index.png)
3.图书列表界面
! + [索引] + (https://github.com/angel-of-java/SSM-BookAppointment/master/images/bookList.png)
4.图书详情界面
! + [索引] + (https://github.com/angel-of-java/SSM-BookAppointment/master/images/detail.png)
5.已预约图书列表
! + [登录] + (https://github.com/angel-of-java/SSM-BookAppointment/master/images/appointmentList.png)

五、欢迎大家参与改善项目并与我交流沟通
---
* QQ：1319668285
* 微信：18534437910
* 邮箱：1319668285@qq.com
