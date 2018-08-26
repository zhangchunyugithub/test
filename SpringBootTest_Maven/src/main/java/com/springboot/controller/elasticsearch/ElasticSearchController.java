package com.springboot.controller.elasticsearch;

import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import com.springboot.dao.StudentDao;
import com.springboot.vo.StudentVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * elasticSearch Test
 */
@RequestMapping("/es")
@RestController
public class ElasticSearchController {

    private static final Logger logger = LoggerFactory.getLogger(ElasticSearchController.class);

    @Autowired
    private StudentDao studentDao;


    @RequestMapping("/addStudent")
    public String hello() {
        StudentVO stu = new StudentVO();
        stu.setId("0001");
        stu.setAge(20);
        stu.setClazz(1);
        stu.setName("leo");
        stu.setHobby(Lists.newArrayList("basketball","pingpang","swimming"));
        studentDao.save(stu);
        return "save success";
    }



    @RequestMapping("/get")
    public String get(){
        String id = "0001";
        StudentVO one = studentDao.findOne(id);
        // 只和当前logger的level有关系 如果没有指定level  则默认去使用最近的父Logger中的level(而不是root logger)
        logger.debug(JSONObject.toJSONString(one));
        logger.info("get info");
//        System.out.println(JSONObject.toJSONString(one));
        return JSONObject.toJSONString(one);

    }


}
