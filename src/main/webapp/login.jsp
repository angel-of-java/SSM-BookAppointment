<%@page contentType="text/html; charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>登录-图书预约系统</title>
    <link href="login.css" rel="stylesheet">   
    <script src="${pageContext.request.contextPath}/login.js" type="text/javascript"></script>    
</head>
<body>
    <div class="main">
        <div class="login">
            <form action="login" method="post" onsubmit="return check(this)">
                <div class="tab">
                    <table cellpadding="0" cellspacing="20" align="auto" width="400" >
                        <tr>
                            <td>学号</td>
                            <td>
                            	<input type="text" name="studentId" onblur="check_studentId()"/>
                            	<span id="studentId_msg" class="error" style="display: none">学号不能为空</span>
                            </td>
                        </tr>
                        <tr>
                            <td>密码</td>
                            <td>
                            	<input type="password" name="password" onblur="check_password()"/>
                            	<span id="password_msg" class="error" style="display: none">密码不能为空</span>
                            </td>
                        </tr>
                        <tr>
                            <td align="center" colspan="2">
                            	<input type="submit" value="登录" class="button"/><br/>
                            	<span id="login_msg" class="error">${errorMsg}</span>
                            </td>
                        </tr>
                    </table>
                </div>
            </form>
        </div>
    </div>
</body>
</html>