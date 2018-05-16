package com.springboot.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalField;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * 时间日期工具类
 * @auther zhangchy
 * @create 2018/2/25
 */
public class DateTest {

    @Test
    public void test(){
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        String[] str = new String[list.size()];
        list.toArray(str);
        for(int i = 0 ;i<str.length;i++){
            System.out.println(str[i]);
        }
    }


    @Test
    public void getCurrentMills(){
        long millis = Clock.systemUTC().millis();
        System.out.println(millis);
    }

    @Test
    public void dateTest(){
        LocalDate date = LocalDate.of(2018, 3, 7);
//        System.out.println(date.getLong(ChronoField.));
        //新纪元天数   1970-1-1
        System.out.println(date.toEpochDay());
    }

    @Test
    public void milliTest(){
        Calendar instance = Calendar.getInstance();//1523081706656  asdfasdfasdf  {asdfa:asdfasd}
        instance.set(2018,3,8);
        System.out.println(instance.getTimeInMillis());

        JSONObject json = new JSONObject();
        JSONArray type = json.getJSONArray("type");


    }

    @Test
    public void milliTest1(){
        Date date = new Date(1523081706656L);
        //Calendar.
        Calendar instance = Calendar.getInstance();//1523081706656
        instance.setTime(date);
        System.out.println(instance.getTimeInMillis());

    }

    /**
     * 是否是闰年
     */
    @Test
    public void leapYear(){
        LocalDate date = LocalDate.of(2018, Month.MARCH, 7);
        System.out.println(date.isLeapYear());
    }



}
