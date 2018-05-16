package com.springboot.util;

import com.alibaba.fastjson.JSON;
import com.yonyou.iuap.utils.CookieUtil;
import net.sf.json.JSONObject;

import javax.servlet.http.Cookie;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CommonUtils {
	/**
	 * 获取异常栈字符串
	 * @Title: getErrorInfoFromException 
	 * @Description: TODO(这里用一句话描述这个方法的作用) 
	 * @param @param e
	 * @param @param len
	 * @param @return    设定文件 
	 * @return String    返回类型 
	 * @throws
	 */
	public static String getErrorInfoFromException(Exception e, int len) {
		try {
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			e.printStackTrace(pw);
			String str = sw.toString();
			if (len != 0) {
				if (str.length() < len)
					len = str.length();
				str = str.substring(0, len);
			}
			return str;
		} catch (Exception e2) {
			return "bad getErrorInfoFromException";
		}
	}
	
	 /** 
     * 使用正则表达式提取中括号中的内容 
     * @param msg 
     * @return  
     */  
    public static List<String> extractMessageByRegular(String msg){  
        
        List<String> list=new ArrayList<String>();  
        Pattern p = Pattern.compile("(\\[[^\\]]*\\])");  
        Matcher m = p.matcher(msg);  
        while(m.find()){  
            list.add(m.group().substring(1, m.group().length()-1));  
        }  
        return list;  
    }
    /**
     * @Title: replaceParam 
     * @Description: 替换字符串[]中的内容
     * @param @param baseText
     * @param @param jsonParam
     * @param @return    设定文件 
     * @return String    返回类型 
     * @throws
     */
    public static String replaceParam(String baseText,Object jsonParam){
    	List<String> textParam = extractMessageByRegular(baseText);
    	if(textParam.isEmpty()) return baseText;
    	JSONObject json = null;
    	if(jsonParam==null){
    		json = new JSONObject();
    	}else{
    		json = JSONObject.fromObject(jsonParam);
    	}
    	for(String p : textParam){
    		String val = json.containsKey(p)?json.getString(p):"";
    		baseText = baseText.replace("["+p+"]", val);
    	}
    	return baseText;
    }
    
   /* public static boolean isJson(String str) {
		boolean flag = true;
		try {
			JSON.parseObject(str, DataPermissionRuleParam.class);
		} catch (Exception e) {
			flag = false;
		}
		return flag;
	}*/
	
    public static boolean isRoleOrgVisible(Cookie[] requestCookies){
    		String orgControl =  CookieUtil.findCookieValue(requestCookies, "orgControl");
    		if(orgControl!=null && "1".equals(orgControl)){
    			return true;
    		}
    		return false;
    }

    public static boolean isTenantMgr(Cookie[] requestCookies){
    		String isTenantMgr =  CookieUtil.findCookieValue(requestCookies, "isTenantMgr");
    		if(isTenantMgr!=null && "1".equals(isTenantMgr)){
    			return true;
    		}
    		return false;
    }
}
