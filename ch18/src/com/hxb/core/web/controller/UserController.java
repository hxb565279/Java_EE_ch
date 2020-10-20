package com.hxb.core.web.controller;

import com.hxb.core.po.User;
import com.hxb.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * 用户控制类
 */

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login.action", method = RequestMethod.POST)
    public String login(String usercode, String password, Model model, HttpSession session) {
        User user = userService.findUser(usercode, password);
        if (user != null) {
            //添加到session
            session.setAttribute("USER_SESSION", user);
            //跳转到主界面
            return "customer";
        }
        model.addAttribute("msg", "账号密码错误,重新登录");
        return "login";
    }

    @RequestMapping(value = "/login")
    public String logout1() {
        return "login";
    }

    @RequestMapping(value = "/logout.action")
    public String logout(HttpSession session) {
        session.invalidate();
        return "login";
    }


}
