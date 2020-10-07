package com.hxb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value = "/hello")
public class FirstController {
    @RequestMapping(value = "/firstController")
    public String handleRequest(HttpServletRequest request, HttpServletResponse response, Model model) {
        model.addAttribute("msg", "这是我的第一个SpringMVC 程序");
        return "first";
    }


}