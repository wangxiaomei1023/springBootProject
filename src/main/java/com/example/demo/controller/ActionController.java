package com.example.demo.controller;

import com.example.demo.service.Impl.RequestManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author ：wangxiaomei17
 * @date ：Created in 2021-03-18 21:40
 * @description：行为动作请求及响应
 */

@Controller
public class ActionController {

    @Autowired
    public RequestManagerImpl requestManagerImpl;

    @RequestMapping("/httpRequest")
    @ResponseBody
    public String sendHttpRequest(String request){
        String response= requestManagerImpl.getHttpRequestResult(request);
        return response;
    }

}
