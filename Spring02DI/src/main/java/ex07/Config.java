package ex07;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

//자바로 스프링빈 설정하는 방법.. 
//annotation을 통해 현재 Config클래스가 IOC컨테이너임을 명시
@Configuration //현재 클래스를 환경설정으로 사용함을 의미한다.
public class Config {

	//Emp빈 생성
	//스프링은 기본적으로 Bean의 범위를 singleton으로 설정한다.
	//만일 싱글톤이 아니라 매번 다른 객체로 생성하고 싶다면 prototype으로 값을 주자
	@Bean(name="e1")
	@Scope(value="prototype") 
	public Emp empInfo() {
		Emp e = new Emp("King","SALES",5000);
		return e;
	}
	
	@Bean(name="e3")
	public Emp empInfo2() {
		Emp e = new Emp("Scott","Opertaion",4500);
		return e;
	}
	
	//Bean의 name을 지정하지 않는다면 메소드 이름이 Bean 이름이된다.
	@Bean
	public Emp test2() {
		return new Emp("Willson","Research",4000);
	}
	
	@Bean(name="d1")
	public Date dateInfo() {
		Date d = new Date();
		return d;
	}
	
	@Bean(name="sv1")
	public ServiceImpl svInfo() {
		ServiceImpl sv = new ServiceImpl();
		sv.setEmp(test2());
		return sv;
	}
}