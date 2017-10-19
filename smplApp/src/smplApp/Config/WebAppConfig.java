package smplApp.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import smplApp.Device;

@Configuration
@ComponentScan("smplApp.*")
public class WebAppConfig implements WebMvcConfigurer {
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/WEB_INF/jsp/*");
	}
	
	@Bean
	public InternalResourceViewResolver setupViewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB_INF/jsp/");
		viewResolver.setSuffix(".jsp");
		viewResolver.setViewClass(JstlView.class);
		return viewResolver;
	}
	
	@Bean
	@Scope("protorype")
	public Device getDevice() {
		return new Device();
	}
//	@Bean
//	
//	public Device getDeviceDAOImpl() {
//		return new DeviceDAOImpl();
//	}
	
	@Bean
	public DriverManagerDataSource dataSource() {
		DriverManagerDataSource manager = new DriverManagerDataSource();
		manager.setDriverClassName("org.h2.Driver");
		manager.setUrl("jdbc:h2:~/devsandprobes");
		manager.setUsername("sa");
		manager.setPassword("");
		return manager;
	}
}
