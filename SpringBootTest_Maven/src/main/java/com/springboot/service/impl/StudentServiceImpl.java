package com.springboot.service.impl;

import com.springboot.service.StudentService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @auther zhangchy
 * @create 2018/2/9
 */
@Service("aaa")
public class StudentServiceImpl implements StudentService,InitializingBean {


    @PostConstruct
    public void initMethod(){
        System.out.println("初始化方法");
    }

    public void initMethod2(){

    }
    @Override
    public String getStudent() {
        return "leo";
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
    }
}
