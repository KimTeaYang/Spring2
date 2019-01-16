package ex06;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAppTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		
		// scope => prototype
		System.out.println(ctx.getBean("e1",Emp.class));
		System.out.println(ctx.getBean("e1",Emp.class));
		System.out.println("=========================");
		
		System.out.println(ctx.getBean("e3",Emp.class).getName());
		System.out.println("=========================");
		
		//Bean name이 지정되지 않았을 경우 메소드이름이 Bean name이 된다.
		System.out.println(ctx.getBean("test2",Emp.class).getName());
		System.out.println("=========================");
		
		System.out.println(ctx.getBean("d1",Date.class));
		System.out.println("=========================");
		
		ServiceImpl sv = ctx.getBean("sv1",ServiceImpl.class);
		sv.test();
		System.out.println("=========================");
	}

}
