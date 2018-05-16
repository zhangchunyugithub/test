package com.springboot.util;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.io.StringWriter;
import java.util.*;

/**
 * @auther zhangchy
 * @create 2018/3/22
 */
public class IoUtils {

    @Test
    public void test() {
        StringWriter writer = new StringWriter();
        writer.append("sss");
        System.out.println(writer.toString());
        writer.getBuffer().setLength(0);
        writer.append("bbb");
        System.out.println(writer.toString());
    }


    @Test
    public void test2(){
        String a = "a";
        String b = "b";

    }
}
