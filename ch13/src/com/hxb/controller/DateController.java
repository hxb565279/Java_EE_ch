package com.hxb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class DateController {
    @RequestMapping(value = "/customDate")
    public String CustomDate(Date date) {
        System.out.println("Date=" + date);
        return "success";
    }


}
