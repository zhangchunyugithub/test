//import com.alibaba.fastjson.JSONArray;
//import com.alibaba.fastjson.JSONObject;
//import com.springboot.util.RandomData;
//import com.yonyou.iuap.tenant.sdk.OrgRoleCenter;
//import com.yonyou.iuap.tenant.sdk.RoleAppCenter;
//import com.yonyou.iuap.tenant.sdk.RoleCenter;
//import com.yonyou.iuap.tenant.sdk.UserRoleCenter;
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import uap.web.utils.CasClientPropertyUtil;
//import uap.web.utils.HttpTookit;
//import uap.web.utils.sign.SignUtils;
//
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * @auther zhangchy
// * @create 2018/4/16
// */
//public class AuthTest {
//
//
//	@Test
//	public void test8(){
//		net.sf.json.JSONObject json = new net.sf.json.JSONObject();
//		json.put("roleCode", "code501");
//		json.put("roleId", "141bf58a-f077-4e9b-a4b4-a39b9f83d8631");
//		json.put("tenantId", "1231");
//		json.put("systemCode", "123123");
//		net.sf.json.JSONArray array = new net.sf.json.JSONArray();
//		net.sf.json.JSONObject app1 = new net.sf.json.JSONObject();
//		app1.put("permissionId", "4c058c1e-b981-4e7d-abde-b797b56dc335");
//		app1.put("permissionCode", "code23151");
//		app1.put("permissionType", "1");
//		net.sf.json.JSONObject app2 = new net.sf.json.JSONObject();
//		app2.put("permissionId", "4c058c1e-b981-4e7d-abde-b797b56dc33511");
//		app2.put("permissionCode", "code231511");
//		app2.put("permissionType", "2");
//		array.add(app1);
//		array.add(app2);
//		json.put("apps", array);
//		String result = RoleAppCenter.roleApp(json.toString());
//		System.out.println(result);
//
//	}
//
//	@Test
//	public void test7(){
//		net.sf.json.JSONObject json = new net.sf.json.JSONObject();
//		json.put("roleCode", RandomData.randomName("code"));
//		json.put("roleId", RandomData.getId());
//		json.put("tenantId", "1231");
//		json.put("systemCode", "123123");
//		net.sf.json.JSONArray array = new net.sf.json.JSONArray();
//		net.sf.json.JSONObject app = new net.sf.json.JSONObject();
//		app.put("permissionId", RandomData.getId());
//		app.put("permissionCode", RandomData.randomName("code"));
//		app.put("permissionType", "1");
//		array.add(app);
//		json.put("apps", array);
//		String result = RoleAppCenter.roleApp(json.toString());
//		System.out.println(result);
//
//	}
//
//
//	@Test
//	public void test6(){
//		String s = RoleCenter.queryRoles("ipu_aoyang", "qmnnxcpy");
//		System.out.println(s);
//	}
//
//	@Test
//	public void test5(){
//		String s1 = RoleCenter.pageExcludeByRoleCodes("tm","vkzso9lp",new String[]{"855ccc82-138a-482d-9ec5-5eab39aceedf"}, "100", "1", null);
//		System.out.println(s1);
//	}
//
//	@Test
//	public void test4(){
//		String s = RoleCenter.pageRoles("hr_cloud", "qsg7hxih", "100", "1", null);
//		System.out.println(s);
//	}
//
//	@Test
//	public void test3(){
//		String orgRolePageByUser = OrgRoleCenter.getOrgRolePageByUser("tm", "vkzso9lp", null, "100", "1", null, null);
//		System.out.println(orgRolePageByUser);
//	}
//
//	@Test
//	public void test2(){
//		String s = UserRoleCenter.queryRoleByUser("12312", "12312", "123123");
//		System.out.println(s);
//	}
//
//	@Test
//	public void test1(){
//		String baseurl = CasClientPropertyUtil.getPropertyByKey("tenant.tenantauth.base.url");
//		String url = CasClientPropertyUtil.getInnerPropertyByKey("tenant.tenantauth.userRole.userrole");
//		url = baseurl + url + "/ipu" ;
//		String result = HttpTookit.doGet(url,null);
////		String result = SignUtils.signAndGet(url);
//		System.out.println(result);
//	}
//
//	@Test
//	public void test(){
////		String s = UserRoleCenter.queryUserByRole("ipu");
////		System.out.println(s);
////		String baseurl = CasClientPropertyUtil.getPropertyByKey("tenant.tenantauth.base.url");
//		String url = "https://www.diwork.com/service-adapter/rpc-adapter/tenantauth/";//ipu/czw4u4qb
//		Map<String, String> map = new HashMap<>();
//		map.put("serviceName", "com.yonyou.uap.tenant.service.itf.ITenantRoleUserService");
//		map.put("methodName", "getRoleUserPage");
//		JSONArray json = new JSONArray();
//		json.add("ipu_aoyang");
//		json.add("zuj0wqq9");//qmnnxcpy
//		json.add("1");
//		json.add("10");
//		map.put("args", json.toJSONString());
////		String result = HttpTookit.doPost(url, map);
//		String result = SignUtils.signAndPost(url,map);
//		System.out.println(result);
//	}
//
//}
