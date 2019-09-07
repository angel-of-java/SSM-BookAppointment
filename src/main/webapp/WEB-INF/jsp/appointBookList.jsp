<%@page contentType="text/html; charset=UTF-8" language="java" %>
<%@include file="common/tag.jsp"%>
<!DOCTYPE html>
<html>
<head>
    <title>预约图书列表</title>
    <%@include file="common/head.jsp" %>
</head>
<body>
<div class="container">
    <div class="panel panel-default">
    	<div style="float:left;margin-top: 40px;margin-left: 30px;">
        	<a style="text-decoration:none;font-size: 24px;color: black" href="/SSM-BookAppointment/goIndex">首页</a>
        </div>
        <div class="panel-heading text-center">
            <h2>您已预约图书列表</h2>
        </div>
		<div class="panel-body">
            <table class="table table-hover">
                <thead>
                <tr> 
                    <th>预定学号</th>
                    <th>预约时间</th>
                    <th>图书ID</th> 
                    <th>图书名称</th>
                    <th>图书简介</th>
                    <th>预约数量</th>  
                </tr>
                </thead>
                <tbody>
                <!-- 循环变量，控制内层循环 -->
                <c:set var="index" value="0" />
                <c:forEach items="${appointList}" var="al">
                    <tr>
                    	<c:forEach items="${bookList}" var="bl" begin="${index}" end="${index}">
                    	<c:set var="index" value="${index + 1}" />
                    	
	                    	<td>${al.studentId}</td> 
	                        <td>${al.appointTime}</td>
	                        <td>${al.bookId}</td>
	                        <td>${bl.getName()}</td>
	                        <td>${bl.getIntrod()}</td> 
	                        <td>1</td>
                        </c:forEach> 
                    </tr>
                </c:forEach>
                </tbody>
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