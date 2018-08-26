package com.springboot.util;


import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @auther zhangchy
 * @create 2018/4/16
 */
public class SerialiseUtil {

	public byte[] getBytes(Object obj) {
		try {
			ByteArrayOutputStream bytes = new ByteArrayOutputStream();
			ObjectOutputStream out = new ObjectOutputStream(bytes);
			out.writeObject(obj);
			return bytes.toByteArray();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
