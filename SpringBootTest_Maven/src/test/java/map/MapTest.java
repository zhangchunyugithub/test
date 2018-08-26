package map;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @auther zhangchy
 * @create 2018/4/20
 */
public class MapTest {

    @Test
    public void test1() {
        Map<String, List<String>> map = new HashMap<>();
        map.computeIfAbsent("aa", k -> new ArrayList()).add("111");
//		map.computeIfPresent()

    }

}
