package ex09;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SpringAppTest {

	public static void main(String[] args) {
		
		String loc = "classpath:ex09/appliaction.xml";
		ApplicationContext ctx = new GenericXmlApplicationContext(loc);
		
		ctx.getBean("admin2",AdminInfo.class).printInfo();

	}

}
