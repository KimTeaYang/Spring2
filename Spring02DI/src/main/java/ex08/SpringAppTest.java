package ex08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAppTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		
		Emp e2 = ctx.getBean("e2",Emp.class);
		
		Emp exml = ctx.getBean("exmlBean",Emp.class);
		System.out.println(exml);
		
		ctx.getBean("sv2",ServiceImpl.class).test();
		
	}

}
