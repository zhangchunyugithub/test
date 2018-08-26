package com.springboot.controller;

import com.alibaba.fastjson.JSON;
import com.springboot.service.StudentService;
import com.springboot.util.Student;
import com.springboot.util.StudentUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @auther zhangchy
 * @create 2018/2/9
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private StudentUtils studentUtils;

    @Autowired
    private Student student;

    /*@Autowired
    private IServiceIsolateService serviceIsolateService;*/


    @RequestMapping("/studentName")
    public void test3(){
        System.out.println(student.getName());
    }

    @RequestMapping("/getUrl")
    public void test(String url){
        System.out.println(url);
//        serviceIsolateService.findUserDataPermission();

    }

    @RequestMapping("/getStudent2")
    public String getStudent2() {
        Student student = new Student();
        Map<String,Object> map = new HashMap();
        map.put("sss", student);
        student.setDateToSchool(new Date());
        String s = JSON.toJSONString(student);
        return s;
    }

    @RequestMapping("/getStudent")
    public Map<String,Object> getStudent1() {
        Student student = new Student();
        Map<String,Object> map = new HashMap();
        map.put("sss", student);
        student.setDateToSchool(new Date());
        return map;
    }

    @RequestMapping("/getOne")
    public String getStudent() {
        String student = studentService.getStudent();
        return student;
    }

    @RequestMapping("/getStudentNum")
    public int getStudentNum() {
        return studentUtils.getStudenetNumber();
    }

}
