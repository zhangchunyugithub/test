//import com.alibaba.fastjson.JSON;
//import com.alibaba.fastjson.JSONObject;
//import com.springboot.vo.SuperVO;
//import com.springboot.vo.TeamConfigVO;
//import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.net.URLDecoder;
//import java.net.URLEncoder;
//import java.text.MessageFormat;
//import java.util.*;
//
///**
// * @auther zhangchy
// * @create 2018/3/5
// */
//public class JsonTest {
//
//
//    @Test
//    public void test9()throws  Exception{
//        String url = "file-cdn.yonyoucloud.com/workbench-image-path-applicationIcon/3d9624e1-7610-4036-bcd0-f9477a4823ae/屏幕快照03-01+下午4.37.13.png";
//        String utf8 = URLEncoder.encode(url, "UTF8");
//        System.out.println(utf8);
//        String utf9 = URLEncoder.encode(utf8, "UTF8");
//        System.out.println(utf9);
//        System.out.println(utf8.equals(utf9));
//
//        System.out.println(URLDecoder.decode(utf9,"UTF8"));
//        System.out.println(URLDecoder.decode(URLDecoder.decode(utf9,"UTF8"),"UTF8"));
//        System.out.println(url);
//    }
//
//    @Test
//    public void test8(){
//        Map<String, String> map = new HashMap<>();
//        map.put("1", "1");
//        System.out.println(map);
//    }
//
//    @Test
//    public void test7(){
//        Set<Integer> set = new HashSet<>();
//        set.add(1);
//        System.out.println(set);
//    }
//
//    @Test
//    public void test6(){
//        List<TeamConfigVO> list = new ArrayList<>();
//        TeamConfigVO teamConfigVO = new TeamConfigVO();
//        list.add(teamConfigVO);
//        String s = JSONObject.toJSONString(list);
//        System.out.println(s);
//    }
//
//    @Test
//    public void test5(){
//        TeamConfigVO teamConfigVO = new TeamConfigVO();
//        System.out.println(net.sf.json.JSONObject.fromObject(teamConfigVO).toString());
//    }
//
//
//
//    @Test
//    public void test4(){
//        TeamConfigVO teamConfigVO = new TeamConfigVO();
//        String s = JSONObject.toJSONString(teamConfigVO);
//        System.out.println(s);
//    }
//
//    @Test
//    public void test3(){
//        String s = "方法名称{0}，传入参数{1},{2}";
//        String format = MessageFormat.format(s, 11, 22);
//        System.out.println(format);
//    }
//
//    @Test
//    public void test1(){
//        Map<String,String> params = new HashMap<String,String>();
//        params.put("sss","1");
//        JSONObject json = JSONObject.parseObject(JSON.toJSONString(params));
//        System.out.println(json.toString());
//    }
//
//    @Test
//    public void test(){
//        Map<String,String> params = new HashMap<String,String>();
//        params.put("sss","1");
//        System.out.println(params);
//    }
//
//    @Test
//    public void test111(){
//        SuperVO teamConfigVO = new TeamConfigVO();
//        teamConfigVO.get11();
//    }
//
//
//
//}
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Lists;
import com.springboot.vo.SuperVO;
import com.springboot.vo.TeamConfigVO;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.lang.reflect.Type;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.MessageFormat;
import java.util.*;

/**
 * @auther zhangchy
 * @create 2018/3/5
 */
public class JsonTest {


    @Test
    public void test11() {
        Method[] methods = JsonTest.class.getMethods();
        ArrayList<Method> methods1 = Lists.newArrayList(methods);
        methods1.forEach(method -> {
            if (method.getName().equals("sss")) {
                Object bool = true;
                Object o = JSONObject.parseObject(bool.toString(), method.getReturnType());
                System.out.println(o);
            }
        });

    }


    public boolean sss() {
        return true;
    }

    class A {
        public void aa(JSONObject jsonObject) {
            String tenantId = jsonObject.getString("tenantId");
            JSONArray roleUsers = jsonObject.getJSONArray("roleUsers");
            System.out.println(roleUsers);
        }
    }


    private void invoke(Object listener, String userObject)
            throws Exception {

        Method[] methods = listener.getClass().getMethods();
        for (Method m : methods) {
            if (m.getName().equals("aa")) {
                Object message = deserialize(m, userObject);
                m.invoke(listener, message);

            }
        }
    }

    private Object deserialize(Method method, String userObject) throws Exception {
        Parameter[] parameters = method.getParameters();
        if (parameters.length != 1) {
            throw new Exception("错误");
        }


        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        Object eventMessage = objectMapper.readValue(userObject, new TypeReference<Object>() {
            @Override
            public Type getType() {
                return parameters[0].getParameterizedType();
            }
        });
        return eventMessage;

    }


    @Test
    public void test10() throws Exception {
        String json = "{\"sourceSystem\":\"diwork\",\"tenantId\":\"beodq5f5\",\"roleUsers\":\"[{\\\"id\\\":\\\"519551e2b3ce41ce978028afb987e2b6\\\",\\\"roleCode\\\":\\\"HR01\\\",\\\"roleId\\\":\\\"a4d63c41-a25b-470c-8604-5fda407d9870\\\",\\\"systemCode\\\":\\\"diwork\\\",\\\"tenantId\\\":\\\"beodq5f5\\\",\\\"userCode\\\":\\\"YHT-132-1191520569303319\\\",\\\"userId\\\":\\\"06da4854-17fe-41dd-b53c-cbe700927472\\\",\\\"versionNum\\\":0}]\"}";
        A a = new A();
        invoke(a, json);
    }


    @Test
    public void test9() throws Exception {
        String url = "file-cdn.yonyoucloud.com/workbench-image-path-applicationIcon/3d9624e1-7610-4036-bcd0-f9477a4823ae/屏幕快照03-01+下午4.37.13.png";
        String utf8 = URLEncoder.encode(url, "UTF8");
        System.out.println(utf8);
        String utf9 = URLEncoder.encode(utf8, "UTF8");
        System.out.println(utf9);
        System.out.println(utf8.equals(utf9));

        System.out.println(URLDecoder.decode(utf9, "UTF8"));
        System.out.println(URLDecoder.decode(URLDecoder.decode(utf9, "UTF8"), "UTF8"));
        System.out.println(url);
    }

    @Test
    public void test8() {
        Map<String, String> map = new HashMap<>();
        map.put("1", "1");
        System.out.println(map);
    }

    @Test
    public void test7() {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        System.out.println(set);
    }

    @Test
    public void test6() {
        List<TeamConfigVO> list = new ArrayList<>();
        TeamConfigVO teamConfigVO = new TeamConfigVO();
        list.add(teamConfigVO);
        String s = JSONObject.toJSONString(list);
        System.out.println(s);
    }

    @Test
    public void test5() {
        TeamConfigVO teamConfigVO = new TeamConfigVO();
//        System.out.println(net.sf.json.JSONObject.fromObject(teamConfigVO).toString());
    }


    @Test
    public void test4() {
        TeamConfigVO teamConfigVO = new TeamConfigVO();
        String s = JSONObject.toJSONString(teamConfigVO);
        System.out.println(s);
    }

    @Test
    public void test3() {
        String s = "方法名称{0}，传入参数{1},{2}";
        String format = MessageFormat.format(s, 11, 22);
        System.out.println(format);
    }

    @Test
    public void test1() {
        Map<String, String> params = new HashMap<String, String>();
        params.put("sss", "1");
        JSONObject json = JSONObject.parseObject(JSON.toJSONString(params));
        System.out.println(json.toString());
    }

    @Test
    public void test() {
        Map<String, String> params = new HashMap<String, String>();
        params.put("sss", "1");
        System.out.println(params);
    }

    @Test
    public void test111() {
        SuperVO teamConfigVO = new TeamConfigVO();
        teamConfigVO.get11();
    }


}
