import com.springboot.util.Validate;
import org.junit.Test;

/**
 * @auther zhangchy
 * @create 2018/5/3
 */
public class ValidateTest {

	@Test
	public void test1() {

		if (Validate.isUrl("http://hrcloud.yyuap.com/wap/#/router-bridge?platform=ykj&target=webzhangtest"))
			System.out.println(1111);
		else
			System.out.println(222);
	}
}
