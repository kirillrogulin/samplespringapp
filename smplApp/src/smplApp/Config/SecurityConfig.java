package smplApp.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("admin").password("123").roles("ADMIN");
		auth.inMemoryAuthentication().withUser("user").password("123").roles("USER");
		auth.inMemoryAuthentication().withUser("sa").password("123").roles("DBA");
	}
	
	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
			.antMatchers("/admin/*").access("hasRole('ROLE_ADMIN')")
			.antMatchers("/sa/*").access("hasRole('ROLE_DBA')")
			.and().formLogin();
	}
}
