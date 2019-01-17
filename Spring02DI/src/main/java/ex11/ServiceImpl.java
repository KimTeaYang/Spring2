package ex11;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

/* Annotation으로 주입하는 방법
 * [1] @Autowired => 참조형 주입시 사용. by Type으로 주입함(자료유형으로 주입)
 * [2] @Resource => 참조형 주입시 사용. by Name으로 주입함(빈 이름으로 주입)
 * [3] @Value => 주료 기본자료형 값을 주입할 때
 * [4] @Inject => javax.inject library를 pom.xml에 등록해야 사용 가능
 * */

public class ServiceImpl implements Service {
	
	/* @Autowired : Emp라는 클래스유형의 빈이 있으면 주입해준다.
	 *  - 이 때 Emp type의 빈이 여러 개 있을 경우 예외가 발생한다.
	 *  - 해결 방법으로 @Qualifier("빈 이름")을 함께 사용하면 해결 가능하다. 
	 * */
	@Autowired
	@Qualifier("empInfo2")
	private Emp emp;
	
	@Resource(name="userInfo")
	private Member user;
	
	@Value("A001")
	private String svcId;

	@Override
	public void test() {
		System.out.println(emp.toString());
	}

	@Override
	public void test2() {
		System.out.println(user.toString());
	}

}