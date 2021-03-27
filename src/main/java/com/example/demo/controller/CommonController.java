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

    @RequestMapping("/httpRequestTest")
    public String httpRequestTest(){
        return "httpRequestTest";
    }

    @RequestMapping("/blank-page")
    public String blankPage(){
        return "blank-page";
    }

    @RequestMapping("/charts")
    public String charts(){
        return "charts";
    }

    @RequestMapping("/compose")
    public String compose(){
        return "compose";
    }

    @RequestMapping("/forms")
    public String forms(){
        return "forms";
    }

    @RequestMapping("/general")
    public String general(){
        return "general";
    }

    @RequestMapping("/grids")
    public String grids(){
        return "grids";
    }

    @RequestMapping("/inbox")
    public String inbox(){
        return "inbox";
    }

    @RequestMapping("/media")
    public String media(){
        return "media";
    }
    @RequestMapping("/tables")
    public String tables(){
        return "tables";
    }
    @RequestMapping("/typography")
    public String typography(){
        return "typography";
    }
    @RequestMapping("/validation")
    public String validation(){
        return "validation";
    }
    @RequestMapping("/widgets")
    public String widgets(){
        return "widgets";
    }
}
