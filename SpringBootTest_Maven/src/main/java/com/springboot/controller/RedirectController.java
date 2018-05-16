package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 重定向到其他服务器的测试
 * @auther zhangchy
 * @create 2018/2/24
 */
@Controller
@RequestMapping("/redirect")
public class RedirectController {


    //测试成功
    @RequestMapping("/toBaiDu")
    public String redirectToOutServier(HttpServletRequest request, HttpServletResponse response){

        try {
            response.sendRedirect("http://www.baidu.com");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("执行了");
        return "111";
        //return "redirect:http://www.baidu.com";
    }

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
