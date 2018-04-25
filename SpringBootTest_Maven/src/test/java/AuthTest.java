import com.alibaba.fastjson.JSONArray;
import com.yonyou.iuap.tenant.sdk.OrgRoleCenter;
import com.yonyou.iuap.tenant.sdk.RoleCenter;
import com.yonyou.iuap.tenant.sdk.UserRoleCenter;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import uap.web.utils.CasClientPropertyUtil;
import uap.web.utils.HttpTookit;
import uap.web.utils.sign.SignUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @auther zhangchy
 * @create 2018/4/16
 */
public class AuthTest {

	@Test
	public void test4(){
		String s = RoleCenter.pageRoles("hr_cloud", "qsg7hxih", "100", "1", null);
		System.out.println(s);
	}

	@Test
	public void test3(){
		String orgRolePageByUser = OrgRoleCenter.getOrgRolePageByUser("ipu", "pkw2o81e", null, "1", "2", null, null);
		System.out.println(orgRolePageByUser);
	}

	@Test
	public void test2(){
		String s = UserRoleCenter.queryRoleByUser("12312", "12312", "123123");
		System.out.println(s);
	}

	@Test
	public void test1(){
		String baseurl = CasClientPropertyUtil.getPropertyByKey("tenant.tenantauth.base.url");
		String url = CasClientPropertyUtil.getInnerPropertyByKey("tenant.tenantauth.userRole.userrole");
		url = baseurl + url + "/ipu" ;
		String result = HttpTookit.doGet(url,null);
//		String result = SignUtils.signAndGet(url);
		System.out.println(result);
	}

	@Test
	public void test(){
//		String s = UserRoleCenter.queryUserByRole("ipu");
//		System.out.println(s);
//		String baseurl = CasClientPropertyUtil.getPropertyByKey("tenant.tenantauth.base.url");
		String url = "https://www.diwork.com/service-adapter/rpc-adapter/tenantauth/";//ipu/czw4u4qb
		Map<String, String> map = new HashMap<>();
		map.put("serviceName", "com.yonyou.uap.tenant.service.itf.ITenantRoleUserService");
		map.put("methodName", "getRoleUserPage");
		JSONArray json = new JSONArray();
		json.add("ipu_aoyang");
		json.add("zuj0wqq9");//qmnnxcpy
		json.add("1");
		json.add("10");
		map.put("args", json.toJSONString());
//		String result = HttpTookit.doPost(url, map);
		String result = SignUtils.signAndPost(url,map);
		System.out.println(result);
	}
}
