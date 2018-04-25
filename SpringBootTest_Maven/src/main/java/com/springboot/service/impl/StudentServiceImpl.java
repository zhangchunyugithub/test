package com.springboot.service.impl;

import com.springboot.service.StudentService;
import org.springframework.stereotype.Service;

/**
 * @auther zhangchy
 * @create 2018/2/9
 */
@Service
public class StudentServiceImpl implements StudentService{

    @Override
    public String getStudent() {
        return "leo";
    }
}
