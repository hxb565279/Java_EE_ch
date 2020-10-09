package com.hxb.interceptor;

import com.hxb.po.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        //除了login.jsp可以公开访问,其他全部拦截
        String url = httpServletRequest.getRequestURI();
        if (url.contains("/login")) {
            return true;
        }
        //获取session
        HttpSession session = httpServletRequest.getSession();
        User user_session = (User) session.getAttribute("USER_SESSION");
        if (user_session != null) {
            return true;
        }
        httpServletRequest.setAttribute("msg", "你还没登录,请登录");
        httpServletRequest.getRequestDispatcher("/jsp/login.jsp").forward(httpServletRequest, httpServletResponse);
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {

    }
}
