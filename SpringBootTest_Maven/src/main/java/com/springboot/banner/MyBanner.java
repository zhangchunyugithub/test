package com.springboot.banner;

import org.springframework.boot.Banner;
import org.springframework.core.env.Environment;

import java.io.PrintStream;

/**
 * @auther zhangchy
 * @create 2018/4/19
 */
public class MyBanner implements Banner{
	@Override
	public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {
		out.println("springbootaaa");
	}
}
