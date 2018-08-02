package com.springboot.util;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

public class DiworkWebUtil {

	public static boolean isAjax(ServletRequest request) {
		boolean isAjax = false;
		if (request instanceof HttpServletRequest) {

			HttpServletRequest rq = (HttpServletRequest) request;

			String qs = rq.getQueryString();

			// 1. 判断请求queryString中是否包含isAjax=1
			if (qs != null && qs.indexOf("isAjax=1") != -1) {
				return true;
			}
			// 2. 判断header是否包含X-Requested-With="XMLHttpRequest"
			String requestType = rq.getHeader("X-Requested-With");
			if (requestType != null && "XMLHttpRequest".equals(requestType)) {
				return true;
			}
			// 3. 判断header是否包含isAjax=1
			String isAjaxValue = rq.getHeader("isAjax");
			if ("1".equalsIgnoreCase(isAjaxValue)) {
				return true;
			}
		}
		return isAjax;
	}
}
