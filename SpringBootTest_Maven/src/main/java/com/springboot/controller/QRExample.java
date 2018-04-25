package com.springboot.controller;

import com.alibaba.fastjson.JSONObject;
import com.google.zxing.WriterException;
import com.springboot.util.GenQRcodeUtils;
import com.springboot.util.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
public class QRExample {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private Environment environment;

    @Autowired
    private ConfigController configController;


    @RequestMapping("/testSpecialCharacterInPom")
    public  void testSpecialCharacterInPom(){
        String s = configController.testSpecialCharacterInPom();

        logger.error("QRExample12312321");

    }
   /* @Autowired
    private Student student;*/

    @RequestMapping("/downloadIOSAPPQRCode")
    public ResponseEntity<byte[]> downloadIOSAPPController()
            throws WriterException, IOException {
     /*   InputStream is = this.getClass().getClassLoader().getResourceAsStream("app.properties");
        Properties props = new Properties();
        props.load(is);*/
        //String appId = (String)props.get(type);
        String url =  "https://www.baidu.com";
        return GenQRcodeUtils.getResponseEntity(url, 150, 150, "png");
    }
    @RequestMapping("/")
    String home() {
        JSONObject json = new JSONObject();
        json.put("key", "value");
        System.out.println(environment.getProperty("spring.application.name"));
        //System.out.prindddtln("vlie:");
        return json.toString();
    }
    @RequestMapping("/student")
    String home(@RequestBody Student student) {
        JSONObject json = new JSONObject();
        json.put("key", student.getName());
        return json.toString();
    }



/*  public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class, args);
    }*/
}