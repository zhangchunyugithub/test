import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang.StringUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @auther zhangchy
 * @create 2018/3/31
 */
public class CollectionUtilsTest {


    @Test
    public void test3(){
        List<String> list = new ArrayList<>();
        list.add(null);
        list.add(null);
        list.add(null);
        list.removeIf(str->StringUtils.isBlank(null));
        list.forEach(System.out::println);

    }





    @Test
    public void test1(){
        List<String> list = new ArrayList<>();
        list.add(null);
        list.add("");
        list.add("1212");
        list.removeIf(StringUtils::isBlank);
        System.out.println(list);
    }

    @Test
    public void test(){
        List<String> list = new ArrayList<>();
        list.add(null);
        list.add(null);
        list.add(null);
        if (CollectionUtils.isEmpty(list)) {
            System.out.println("list为空");
        }else {
            System.out.println("list不为空");
        }
        List<String> list1 = null;
        if (CollectionUtils.isEmpty(list1)) {
            System.out.println("list1为空");
        }else {
            System.out.println("list1不为空");
        }


        Map<String, String> map = new HashMap<>();
        map.put("1", "1");
        map.put("2", "2");
        if (MapUtils.isEmpty(map)) {
            System.out.println("map为空");
        }else {
            System.out.println("map不为空");
        }
        Map<String, String> map1 = null;
        if (MapUtils.isEmpty(map1)) {
            System.out.println("map1为空");
        }else {
            System.out.println("map1不为空");
        }

    }
}
