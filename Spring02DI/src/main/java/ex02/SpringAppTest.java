package ex02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SpringAppTest {

	public static void main(String[] args) {
		
		String config = "classpath:ex02/empBean.xml";
		
		ApplicationContext ctx = new GenericXmlApplicationContext(config);
		
		Emp e = ctx.getBean("emp",Emp.class);
		e.info1();
		
		Emp e1 = ctx.getBean("emp1",Emp.class);
		e1.info2();
		
		Emp e2 = ctx.getBean("emp2",Emp.class);
		e2.info3();
		
		Emp e3 = ctx.getBean("emp3",Emp.class);
		e3.info4();

	}

}
