package ex11;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
	
	@Bean
	public Emp empInfo() {
		return new Emp("홍길동","SALES",4000);
	}
	
	@Bean
	public Emp empInfo2() {
		return new Emp("최길동","인사부",5500);
	}
	
	@Bean
	public Member userInfo() {
		return new Member();
	}
	
	@Bean
	public ServiceImpl svInfo() {
		
		return new ServiceImpl();
	}
	
}