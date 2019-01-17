package ex10;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@Configuration
public class AppConfig {
	
	//admin.properties에 기술된 adminId키에 해당하는 value값을 주입해준다.
	@Value("${adminId}")
	private String adminId;
	
	@Value("${adminPwd}")
	private String adminPwd;
	
	@Value("soctt")
	private String subadminId;
	
	@Value("tiger123")
	private String subadminPwd;

	@Bean
	public static PropertySourcesPlaceholderConfigurer properties() {
		
		PropertySourcesPlaceholderConfigurer config
			= new PropertySourcesPlaceholderConfigurer();
		
		Resource res = new ClassPathResource("ex10/admin.properties");
		
		config.setLocation(res);
		
		return config;
	}
	
	@Bean
	@Scope("prototype")
	public AdminInfo admin3() {
		AdminInfo a = new AdminInfo();
		a.setAdminId(adminId);
		a.setAdminPwd(adminPwd);
		return a;
	}
	
	@Bean
	public AdminInfo admin4() {
		AdminInfo a = admin3();
		a.setAdminId(subadminId);
		a.setAdminPwd(subadminPwd);
		return a;
	}
	
	
}
