import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.springboot.util.MapUtils;
import com.springboot.vo.TeamConfigVO;
import org.junit.Test;

import java.beans.IntrospectionException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;

/**
 * @auther zhangchy
 * @create 2018/3/7
 */
public class ObjectToMapTest {


    @Test
    public void test1()throws  Exception{
        TeamConfigVO team = new TeamConfigVO();

        ObjectMapper objectMapper = new ObjectMapper();
        String s = objectMapper.writeValueAsString(team);
        System.out.println(s);
        System.out.println("=============");
        String s1 = JSONObject.toJSONString(team);
        System.out.println(s1);
        //objectMapper.

    }

    @Test
    public void test3(){
        String json = "{\"allowExit\":\"0\",\"createTime\":1530001031439,\"invitePermission\":\"1\",\"joinPermission\":\"0\",\"tenantSize\":\"A\",\"terminal\":\"web\"}";
        try {
            TeamConfigVO teamConfigVO = JSONObject.parseObject(json, TeamConfigVO.class);
            System.out.println(teamConfigVO.getTenantSize());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test(){
        TeamConfigVO team = new TeamConfigVO();
        try {
            Map<String, String> map = MapUtils.toStringMap2(team);
            System.out.println(map);
        } catch (IntrospectionException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
