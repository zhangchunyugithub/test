package com.springboot.util;

import java.util.Random;
import java.util.UUID;

/**
 * @date 2016年4月14日
 *
 * @author zhangqiang6
 *
 * @Description: TODO 
 *
 **/
public class RandomData {
	private static Random random = new Random();

	/**
	 * 返回随机名称, prefix字符串+5位随机数字.
	 */
	public static String randomName(String prefix) {
		return prefix + random.nextInt(10000);
	}

	public static String generateMobile() {
		int i = random.nextInt(10000);
		String str = String.format("%04d", i);
		return "1450001" + str;
	}

	public static String generateEmail() {
		int i = random.nextInt(10000);
		String str = String.format("%04d", i);
		return "test" + str + "@yonyou.com";
	}

	public static String getId() {
		return UUID.randomUUID().toString();
	}
}
