<%@page contentType="text/html; charset=UTF-8" language="java" %>
<%@include file="common/tag.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <title>图书详情页</title>
    <%@include file="common/head.jsp" %>
</head>
<body>
<div class="container">
    <div class="panel panel-default">
    	<div style="float:left;margin-top: 40px;margin-left: 30px;">
        	<a style="text-decoration:none;font-size: 24px;color: black" href="/SSM-BookAppointment/goIndex">首页</a>
        </div>
        <div style="float:left;margin-top: 40px;margin-left: 60px;">
        	<a style="text-decoration:none;font-size: 24px;color: black" href="/SSM-BookAppointment/bookList">图书列表</a>
        </div>
        <div class="panel-heading text-center">
     	   	<h2>图书详情</h2>
        </div>
        
        <div class="panel-body">
            <table class="table table-hover">
                <thead>
                <tr>
                    <th>图书ID</th>
                    <th>图书名称</th> 
                    <th>图书简介</th>
                    <th>剩余数量</th>
                    <th>可预约数</th>
                </tr>
                </thead>
                <tbody>
                	<tr>
                		<td>${book.bookId}</td>
                		<td>${book.name}</td>
                		<td>${book.introd}</td> 
                		<td>${book.number }</td>
                		<td>${book.appointNo }</td>
                	</tr>  
                </tbody>
             </table> 
           </div>  
           <div class="panel-body text-center">
            	<h2 class="text-danger">  
            		<!--用来展示预约控件-->
            		<span class="glyphicon" id="appoint-box"></span> <!--在js里面调用这个id还可以动态显示一些其他东西，例如动态时间等（需要插件）-->
            		
            		<!-- 当可预约数大于0时才可以预约 -->
            		<c:if test="${book.appointNo > 0}">
            		    <!-- 每本书只能预约一次 -->
	            		<c:if test="${error != null}">
	            			<span class="glyphicon"><a class="btn btn-primary btn-lg" href="/SSM-BookAppointment/cancelAppoint?bookId=${book.bookId}">取消预约</a></span>
	            		</c:if> 
	            		<c:if test="${error == null}">
            				<span class="glyphicon"><a class="btn btn-primary btn-lg" href="/SSM-BookAppointment/appoint?bookId=${book.bookId}">预约</a></span>
            			</c:if> 
            		</c:if>
            		
            		<c:if test="${book.appointNo == 0}"> 
            			<span class="glyphicon"><a class="btn btn-primary btn-lg" href="#">无法预约</a></span>
            		</c:if>	
            	</h2>
        	</div>
    </div>	 	
            		  
</div>

</body>
<%--jQery文件,务必在bootstrap.min.js之前引入--%>
<script src="http://apps.bdimg.com/libs/jquery/2.0.0/jquery.min.js"></script>
<script src="http://apps.bdimg.com/libs/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<%--使用CDN 获取公共js http://www.bootcdn.cn/--%>
<%--jQuery Cookie操作插件--%>
<script src="http://cdn.bootcss.com/jquery-cookie/1.4.1/jquery.cookie.min.js"></script>
<%--jQuery countDown倒计时插件--%>
<script src="http://cdn.bootcss.com/jquery.countdown/2.1.0/jquery.countdown.min.js"></script>

</html> 