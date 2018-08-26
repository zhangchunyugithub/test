package com.springboot.config;

/**
 * @auther zhangchy
 * @create 2018/7/17
 */

import com.springboot.util.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 测试 config 需不需要注册
 */
@Configuration
public class ConfigurationStudent {

    @Bean
    public Student student(){
        Student student = new Student();
        student.setName("caileo");
        return student;
    }

}
