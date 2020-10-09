package com.hxb.controller;

import com.hxb.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {
    @RequestMapping(value = "/testJson")
    @ResponseBody
    public User testJson(@RequestBody User user) {
        System.out.println(user);
        return user;

    }

    /**
     * 接收RESTFul风格的请求,其接收方式为GET
     */
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    @ResponseBody
    public User selectUser(@PathVariable("id") String id) {
        //查看数据接收
        System.out.println("id=" + id);
        User user = new User();
        //模拟根据id查询出到用户对象数据
        if (id.equals("1234")) {
            user.setUsername("tom");
        }
        //返回JSON格式的数据
        return user;
    }
}
