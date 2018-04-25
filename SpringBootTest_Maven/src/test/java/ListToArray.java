import com.beust.jcommander.internal.Lists;
import org.junit.Test;

import java.util.*;

/**
 * @auther zhangchy
 * @create 2018/3/26
 */
public class ListToArray {


    @Test
    public void test2(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        print(list);

      /*  Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        print(set);*/
    }


    private <T> void  print(Collection<T> collection){
        if (collection instanceof List){
            System.out.println("list");
            Set<T> collection1 = (Set<T>) collection;
            collection1.forEach(System.out::println);
        }
        if (collection instanceof Set){
            System.out.println("set");
        }

    }

    @Test
    public void test1(){
        List<String> list = Lists.newArrayList("1","2");
        String[] str = new String[list.size()];
        list.toArray(str);
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }


    @Test
    public void test3(){
        Integer int1 = 1;
        Integer int2 = 1;
        if (int1==int2)
            System.out.println(111);
    }
}
