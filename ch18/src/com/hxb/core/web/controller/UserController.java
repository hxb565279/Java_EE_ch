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
 * �û�������
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
            //��ӵ�session
            session.setAttribute("USER_SESSION", user);
            //��ת��������
            return "customer";
        }
        model.addAttribute("msg", "�˺��������,���µ�¼");
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
