package com.jiayuewen.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginCheckInterceptor  extends HandlerInterceptorAdapter{
	@Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //1、如果用户已经登录 放行
        if(request.getSession().getAttribute("student") != null){
            return true;
        }else {
            //2、非法请求 即这些请求需要登录后才能访问,重定向到登录页面
            response.sendRedirect(request.getContextPath()+"/login.jsp");
            return false;
        }
    }
}
