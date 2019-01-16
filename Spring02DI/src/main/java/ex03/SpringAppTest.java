package ex03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SpringAppTest {

	public static void main(String[] args) {
		
//		String config = "classpath:ex03/appContext.xml";
//		ApplicationContext ctx = new GenericXmlApplicationContext(config);
		
		String config2 = "classpath:ex03/appContext2.xml";
		ApplicationContext ctx = new GenericXmlApplicationContext(config2);
		
		ctx.getBean("emp",Emp.class).info1();
		ctx.getBean("emp",Emp.class).info2();
		ctx.getBean("emp",Emp.class).info3();

		ctx.getBean("emp1",Emp.class).info2();
		ctx.getBean("emp2",Emp.class).info3();
		
	}

}
