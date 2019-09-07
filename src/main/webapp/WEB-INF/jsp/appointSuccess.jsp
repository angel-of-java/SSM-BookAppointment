<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<script type="text/javascript">
	window.onload = function(){
		var time = 4;
		var secondEle = document.getElementById("time");
		var timer = setInterval(function(){
			secondEle.innerHTML = time;
			time--;
			if(time==0){
				clearInterval(timer);
				location.href="http://localhost/SSM-BookAppointment/bookList";
			}
				
		},1000);
	}
</script>
<title>预约成功</title>
</head>
<body>
	<div style="color:red;margin-top:50px;margin-left:700px;font-size: 60px;"><p>预约成功</p></div>
	<div style="margin-top:30px;margin-left:850px;font-size: 20px;">
		<span id="time">4</span><span>秒后自动跳转到图书列表,若未跳转<a href="http://localhost/SSM-BookAppointment/bookList">点击这里</a></span>
	</div>
</body>
</html>
	