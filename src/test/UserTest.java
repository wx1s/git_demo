package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.UserService;

public class UserTest {
	@Test
	public void test1(){
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml","applicationContext-dao.xml","applicationContext-service.xml");
		UserService userS=(UserService)ac.getBean("userservice");
		userS.saveUser("he", "111111");
	}

}
