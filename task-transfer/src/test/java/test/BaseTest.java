package test;

import com.zc.web.Application;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 
 * @ActiveProfiles 注解为根据不同的环境加载不同的资源文件
 *
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@ActiveProfiles("dev")
public class BaseTest {
	
	@Test
	public void baseTest() {
		// your code;
	}
}
