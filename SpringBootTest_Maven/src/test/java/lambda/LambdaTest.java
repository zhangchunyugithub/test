package lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * lambda 表达式 练习
 */
public class LambdaTest {

    public <T> void checkNull(Student<T
            > s, T b){
        s.learn(b);
    }

    @Test
    public void listTest(){
        List<String> list = Arrays.asList("1",null,"2");
        list.stream().forEach(i-> check2(i));
    }

    public void  check2(String s){
        if (s==null)
            throw new RuntimeException("不能为null");
    }


    public void check(String b) {
        checkNull((a)-> {
            if (a==null)
                throw new  RuntimeException(b+"不能为null");
        },null);
    }
}

@FunctionalInterface
interface Student<T> {
    void learn(T t);
}