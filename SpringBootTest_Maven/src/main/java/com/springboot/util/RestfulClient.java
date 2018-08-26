//package com.springboot.util;
//
//import java.nio.charset.StandardCharsets;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.Map.Entry;
//
//import org.apache.commons.collections.MapUtils;
//import org.apache.http.entity.ContentType;
//
//import com.google.common.collect.Lists;
//import com.yonyou.apache.http.client.methods.HttpPost;
//import com.yonyou.apache.http.entity.StringEntity;
//import com.yonyou.cloud.auth.sdk.client.AuthSDKClient;
//import com.yonyou.cloud.auth.sdk.client.utils.http.EnumRequestType;
//import com.yonyou.cloud.auth.sdk.client.utils.http.HttpResult;
//
//public class RestfulClient {
//
//	private AuthSDKClient authSDKClient;
//
//	public RestfulClient(String accessKey, String accessSecret) {
//		authSDKClient = new AuthSDKClient(accessKey, accessSecret);
//	}
//
//	public String signAndPost(String url, Map<String, String> params) {
//		EnumRequestType requestType = EnumRequestType.POST;
//		Map<String, List<String>> paramMap = new HashMap<>();
//		if (MapUtils.isNotEmpty(params)) {
//			for (Entry<String, String> entry : params.entrySet()) {
//				paramMap.put(entry.getKey(), Lists.newArrayList(entry.getValue()));
//			}
//		}
//		HttpResult ret = authSDKClient.execute(url, paramMap, null, requestType);
//		return ret.getResponseString();
//	}
//
//	public String signAndPost(String url, String jsonStr) {
//
//		HttpPost httpPost = new HttpPost(url);
//		httpPost.setHeader("Content-Type", ContentType.APPLICATION_JSON.getMimeType());
//		StringEntity s = new StringEntity(jsonStr, StandardCharsets.UTF_8);
//		s.setContentEncoding("UTF-8");
//		s.setContentType("application/json");// 发送json数据需要设置contentType
//		httpPost.setEntity(s);
//		HttpResult ret = authSDKClient.execute(httpPost);
//		return ret.getResponseString();
//	}
//
//	public String signAndGet(String url) {
//		EnumRequestType requestType = EnumRequestType.GET;
//		HttpResult ret = authSDKClient.execute(url, null, null, requestType);
//		return ret.getResponseString();
//	}
//
//	public String signAndDelete(String url, Map<String, String> params) {
//		EnumRequestType requestType = EnumRequestType.DELETE;
//		Map<String, List<String>> paramMap = new HashMap<>();
//		if (MapUtils.isNotEmpty(params)) {
//			for (Entry<String, String> entry : params.entrySet()) {
//				paramMap.put(entry.getKey(), Lists.newArrayList(entry.getValue()));
//			}
//		}
//		HttpResult ret = authSDKClient.execute(url, paramMap, null, requestType);
//		return ret.getResponseString();
//	}
//
//}
