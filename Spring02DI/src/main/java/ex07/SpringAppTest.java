package ex07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SpringAppTest {

	public static void main(String[] args) {
		
		String config = "classpath:ex07/application.xml";
		
		ApplicationContext ctx = new GenericXmlApplicationContext(config);
		
		ctx.getBean("sv2",ServiceImpl.class).test();
		System.out.println("====================");
		ctx.getBean("sv1",ServiceImpl.class).test();
		
	}

}
