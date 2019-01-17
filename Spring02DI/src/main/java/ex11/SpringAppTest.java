package ex11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAppTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig.class);

		ctx.getBean("svInfo",Service.class).test();
		
		ctx.getBean("svInfo",Service.class).test2();
		
		Service sv = (Service) ctx.getBean("svInfo");
		sv.test();
	}

}
