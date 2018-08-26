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
