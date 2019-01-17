package ex10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAppTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		ctx.getBean("admin3",AdminInfo.class).printInfo();
		
		ctx.getBean("admin4",AdminInfo.class).printInfo();

	}

}
