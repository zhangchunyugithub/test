package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public String redirectToOutServier(){
        return "redirect:http://www.baidu.com";
    }

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
