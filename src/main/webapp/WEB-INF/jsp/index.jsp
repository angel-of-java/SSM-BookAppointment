<%@page contentType="text/html; charset=UTF-8" language="java" %>
<%@include file="common/tag.jsp"%>
<!DOCTYPE html>
<html>
<head>
    <title>欢迎使用</title>
    <%@include file="common/head.jsp" %>
    <style>
	    td{  
		    vertical-align: middle;
		    text-align: center;  
		}
		
		a{text-decoration:none}
	</style>
</head>
<body>
<div class="container">
    <div class="panel panel-default">
        <div class="panel-heading text-center">
            <h2>XX大学图书预约系统</h2>
        </div>
        <div class="panel-body">
            <table class="table table-hover" height="150" style="font-size: 35px; color: #000000;">
                <tr>
                    <td><a href="http://localhost/SSM-BookAppointment/bookList">图书列表</a></td>
                </tr>
                <tr>                    
	                <td><a href="http://localhost/SSM-BookAppointment/appointBookList">查看我的预约</a></td>	                        	
                </tr>
                <tr>                    
	                <td><a href="http://localhost/SSM-BookAppointment/logout">退出登录</a></td>	                        	
                </tr>
            </table> 
        </div>
        
    </div>
</div> 
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="http://apps.bdimg.com/libs/jquery/2.0.0/jquery.min.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="http://apps.bdimg.com/libs/bootstrap/3.3.0/js/bootstrap.min.js"></script>
</body>
</html> 