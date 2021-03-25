package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ：wangxiaomei17
 * @date ：Created in 2021-03-13 16:55
 * @description：常用controller层
 */

@Controller
public class CommonController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/aaa")
    public String aaa(){
        return "aaa";
    }
}
