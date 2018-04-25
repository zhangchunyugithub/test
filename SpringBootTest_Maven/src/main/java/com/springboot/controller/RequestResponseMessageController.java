package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * request response 参数测试
 * @auther zhangchy
 * @create 2018/2/24
 */
@Controller
@RequestMapping("/requestResponse")
public class RequestResponseMessageController {


    /*private JedisShardedTemplate jedisShardedTemplate;*/

    @ResponseBody
    @RequestMapping("/request")
    public String request1(HttpServletRequest request){


        String servletPath = request.getServletPath();
        String requestURI = request.getRequestURI();
        String remoteUser = request.getRemoteUser();
        String requestURL = request.getRequestURL().toString();
        System.out.println("servletPath:"+servletPath);
        System.out.println("requestURI:"+requestURI);
        System.out.println("requestURL:"+requestURL);
        System.out.println("remoteUser:"+remoteUser);
        int i = requestURL.indexOf(servletPath);
        if (i!=-1){
            System.out.println(requestURL.substring(0, i));
        }
        return "111";
    }

    @ResponseBody
    @RequestMapping("/request1")
    public String requestTest(HttpServletRequest request){
//        JedisShardedTemplate
        String header = request.getHeader("User-Agent");
        System.out.println(header);
        return header;
    }
}
