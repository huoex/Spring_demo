package com.hex;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class hellospringTest {

	@Test
	public void test() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		hellospring hs = (hellospring) ac.getBean("hellospring");
		hs.sayhello();
//		fail("Not yet implemented");
	}

}
