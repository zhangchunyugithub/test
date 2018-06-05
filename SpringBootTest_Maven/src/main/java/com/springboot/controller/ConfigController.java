package com.springboot.controller;

import com.springboot.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 读取config方法测试
 * @auther zhangchy
 * @create 2018/2/25
 */
@RestController
@RequestMapping("/config")
public class ConfigController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * maven 可以自动注入到map中
     */
    @Autowired
    private Map<String, StudentService> map = new HashMap<>();

    @Value("${spring.application.name}")
    private String salt1;

    @Autowired
    private Environment env;

    @Autowired
    private QRExample qrExample;

    @RequestMapping("/specialCharater2")

    public String testSpecialCharacterInPom2(String salt) {

        return salt;
    }

    @RequestMapping(value="/specialCharater1",method = RequestMethod.GET)
    public String testSpecialCharacterInPom1(@RequestParam(name = "showDept",defaultValue = "false") boolean showDept) {
        Set<String> strings = map.keySet();
        System.out.println(strings);
        System.out.println(showDept);
        //System.out.println(12312);
//        System.out.println(2222);
        return "12312";
    }

    @RequestMapping("/specialCharater")
    public String testSpecialCharacterInPom() {
        String salt = env.getProperty("salt");
        logger.error("ConfigController1213");

        return salt;
    }


}
