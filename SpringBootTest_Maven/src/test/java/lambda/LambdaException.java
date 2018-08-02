package lambda;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @auther zhangchy
 * @create 2018/7/24
 */
public class LambdaException {

    @Test
    public void lambdaThrowException(){
        List<Integer> list = Arrays.asList(1,2,3);
        try {
            list.forEach(num->{
                try {
                    System.out.println("来个异常");
                }catch (Exception e){
                    throw new RuntimeException("异常啊");
                }
            });
        }catch (RuntimeException e){
            System.out.println("111"+e.getMessage());
        }




    }

}
