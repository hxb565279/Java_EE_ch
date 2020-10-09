package com.hxb.controller;

import com.hxb.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    /**
     * 向用户登录界面跳转
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String toLogin() {
        return "login";
    }

    /**
     * 用户登录
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(User user, Model model, HttpSession session) {
        //获取用户名和密码
        String username = user.getUsername();
        String password = user.getPassword();
        if (username != null && username.equals("xiao_xue") && password != null && password.equals("123456")) {
            //用户对象添加Session
            session.setAttribute("USER_SESSION", user);
            //重定向主页面
            return "redirect:main";
        }
        model.addAttribute("msg", "用户名或密码错误");
        return "login";
    }

    /**
     * 向用户主页面跳转
     */
    @RequestMapping(value = "main")
    public String toMain() {
        return "main";
    }

    /**
     * 退出登录
     */
    @RequestMapping(value = "/logout")
    public String logout(HttpSession session) {
        //清除Session
        session.invalidate();
        //重定向登录
        return "redirect:login";
    }

}
