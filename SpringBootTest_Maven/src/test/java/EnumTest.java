import java.time.Instant;

/**
 *
 * 当参数值在一定范围内变化时，推荐使用枚举类
 * @auther zhangchy
 * @create 2018/2/6
 */
public class EnumTest {



    /**
     * 获取纳秒
     */
    public void test1(){
        long l = System.nanoTime();
        Instant now = Instant.now();

    }



    public static void main(String[] args) {
        int index = ColorEum.YELLOW.getIndex();
        System.out.println(index);
    }




}
enum ColorEum{
    YELLOW(1),GREEN(2);

    private int index;

    ColorEum(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

}

