package com.springboot.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * @author zhangbing1
 *         osp_tenant
 *         Jan 11, 2016
 */
public class Validate {
	/**
	 * 正则表达式：验证用户名
	 */
	// public static final String REGEX_USERNAME = "^[a-zA-Z]\\w{5,17}$";
	//public static final String REGEX_USERNAME = "^[a-zA-Z][a-zA-Z0-9_]{5,17}$";// 6~18个字符，可使用字母、数字、下划线，需以字母开头
	//public static final String REGEX_USERNAMEWITHBLANK = "^(\\s*)|([a-zA-Z][a-zA-Z0-9_]{5,17})$";// 6~18个字符，可使用字母、数字、下划线，需以字母开头
	//public static final String REGEX_USERNAME = "^(?!\\d+$)[\\da-zA-Z_]{4,18}$";// 4~18个字符，可使用字母、数字、下划线，不能全是数字
	//public static final String REGEX_USERNAMEWITHBLANK = "^(?!\\d+$)[\\da-zA-Z_]{4,18}$";// 4~18个字符，可使用字母、数字、下划线，不能全是数字
	
	public static final String REGEX_USERNAME = "^(?!(13[0-9]|15[012356789]|17[0678]|18[0-9]|14[57])[0-9]{8}$)([a-zA-Z0-9][a-zA-Z0-9_]{3,17})$";// 4~18个字符，可使用字母、数字、下划线，可以全是数字，不能是手机号
	
	//惠商云过来的用户编码比较长。 改为后台接受最大36位的 UUID
	public static final String REGEX_USERNAMEWITHBLANK = "^(?!(13[0-9]|15[012356789]|17[0678]|18[0-9]|14[57])[0-9]{8}$)([a-zA-Z0-9_-]{3,36})$";
	/**
	 * 正则表达式：验证密码
	 */
	public static final String REGEX_PASWD = "^[a-zA-Z0-9]{6,16}$";

	/**
	 * 正则表达式：验证手机号
	 */
	//public static final String REGEX_MOBILE = "^((13[0-9])|(15[^4,\\D])|(18[0-9]))\\d{8}$";
	public static final String REGEX_MOBILE = "^(13[0-9]|15[012356789]|17[0678]|18[0-9]|14[57])[0-9]{8}$";
	
	public static final String HKTelReg = "^(6|9)[0-9]{7}$"; //香港手机号正则  6或9开头的8位数字
	public static final String MacaoTelReg = "^6[0-9]{7}$"; //澳门手机号正则  6开头的8位数字

	public static final String REGEX_MOBILEWITHBLANK = "^(\\s*)|((13[0-9]|15[012356789]|17[0678]|18[0-9]|14[57])[0-9]{8}$)";

	/**
	 * 
	 */
	public static final String REGEX_PHONEANDMOBILE = "^(((13[0-9]|15[012356789]|17[0678]|18[0-9]|14[57])[0-9]{8})|(\\d{3}-\\d{8}|\\d{4}-\\d{7}))$";
	
	public static final String SIMPLE_REGITER_MOBILE = "^(1[0-9][0-9])\\d{8}$";

	public static final String REGEX_TENANTTEL = "^(\\+*(\\(\\d+\\)|\\d+)*-*\\d+-*\\d+-*\\d+,)*\\+*(\\(\\d+\\)|\\d+)*-*\\d+-*\\d+-*\\d+$";
	/**
	 * 租户多个手机或电话
	 */
	public static final String REGEX_MUTIPHONEANDMOBILE = "^((((13[0-9]|15[012356789]|17[0678]|18[0-9]|14[57])[0-9]{8})|(\\d{3}-\\d{8}|\\d{4}-\\d{7})),)*(((13[0-9]|15[012356789]|17[0678]|18[0-9]|14[57])[0-9]{8})|(\\d{3}-\\d{8}|\\d{4}-\\d{7}))$";
	/**
	 * 正则表达式：验证邮箱
	 */
//	public static final String REGEX_EMAIL = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
	
	public static final String REGEX_EMAIL2 ="^[a-z0-9]+([._\\-]*[a-z0-9])*@([a-z0-9]+[-a-z0-9]*[a-z0-9]+.){1,63}[a-z0-9]+$";
	
	/**
	 * 正则表达式：验证汉字
	 */
//	public static final String REGEX_CHINESE = MultiLangContext.getInstance().getMessage("module1.Validate_0000", new Object[]{})/*^[一-龥],{0,}$*/;

	/**
	 * 正则表达式：验证身份证
	 */
	public static final String REGEX_ID_CARD = "(^\\d{18}$)|(^\\d{15}$)";

	/**
	 * 正则表达式：验证URL   //http(s)?://([\\w-]+\\.)+[\\w-]+(/[\\w- ./?#%&=]*)?
	 */
	public static final String REGEX_URL = "http(s)?://([\\w-]+\\.)+[\\w-]+(:[0-9]+)?(/[\\w- ./?#%&=]*)?";

	/**
	 * 正则表达式：验证IP地址
	 */
	public static final String REGEX_IP_ADDR = "(25[0-5]|2[0-4]\\d|[0-1]\\d{2}|[1-9]?\\d)";
	/**
	 * 租户Code
	 */
	public static final String REGEX_TENANT_CODE = "^(\\s*)|[a-z][a-z0-9]{1,15}$";

	/**
	 * 校验用户名
	 * 
	 * @param username
	 * @return 校验通过返回true，否则返回false
	 */
	public static boolean isUsername(String username) {
		return Pattern.matches(REGEX_USERNAME, username);
	}

	/**
	 * 校验密码
	 * 
	 * @param password
	 * @return 校验通过返回true，否则返回false
	 */
	public static boolean isPassword(String password) {
		return Pattern.matches(REGEX_PASWD, password);
	}

	/**
	 * 校验手机号
	 * 
	 * @param mobile
	 * @return 校验通过返回true，否则返回false
	 */
	public static boolean isMobile(String mobile) {
		return Pattern.matches(REGEX_MOBILE, mobile);
	}
	/**
	 * 校验香港
	 * 
	 * @param mobile
	 * @return 校验通过返回true，否则返回false
	 */
	public static boolean HKTelReg(String mobile) {
		return Pattern.matches(HKTelReg, mobile);
	}
	/**
	 * 校验澳门
	 * 
	 * @param mobile
	 * @return 校验通过返回true，否则返回false
	 */
	public static boolean MacaoTelReg(String mobile) {
		return Pattern.matches(MacaoTelReg, mobile);
	}
	

	public static boolean isSimpleMobile(String mobile){
		return Pattern.matches(SIMPLE_REGITER_MOBILE, mobile);
	}
	
	/**
	 * 校验邮箱
	 * 
	 * @param email
	 * @return 校验通过返回true，否则返回false
	 */
	public static boolean isEmail(String email) {
		return Pattern.matches(REGEX_EMAIL2, email);
	}

	/**
	 * 校验汉字
	 * 
	 * @param chinese
	 * @return 校验通过返回true，否则返回false
	 */
//	public static boolean isChinese(String chinese) {
//		return Pattern.matches(REGEX_CHINESE, chinese);
//	}

	/**
	 * 校验身份证
	 * 
	 * @param idCard
	 * @return 校验通过返回true，否则返回false
	 */
	public static boolean isIDCard(String idCard) {
		return Pattern.matches(REGEX_ID_CARD, idCard);
	}

	/**
	 * 校验URL
	 * 
	 * @param url
	 * @return 校验通过返回true，否则返回false
	 */
	public static boolean isUrl(String url) {
		return Pattern.matches(REGEX_URL, url);
	}

	/**
	 * 校验IP地址
	 * 
	 * @param ipAddr
	 * @return
	 */
	public static boolean isIPAddr(String ipAddr) {
		return Pattern.matches(REGEX_IP_ADDR, ipAddr);
	}
	

	/**
	 * 判断是否含有特殊字符
	 *
	 * @param str
	 * @return true为包含，false为不包含
	 */
	public static boolean isSpecialChar(String str) {
		String regEx = "[#%/]";
		Pattern p = Pattern.compile(regEx);
		Matcher m = p.matcher(str);
		return m.find();
	}
}
