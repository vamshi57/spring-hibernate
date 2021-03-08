package com.vamshi.cfgs;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	@Autowired
	private DataSource ds;
	private static final String USERS_BY_UNAME="select uname,pwd,status from users where uname=?";
	private static final String ROLES_BY_UNAME="select uname,role from users_roles where uname=?";
	
   public void configure(AuthenticationManagerBuilder auth) throws Exception{
	   auth.jdbcAuthentication().dataSource(ds).usersByUsernameQuery(USERS_BY_UNAME).authoritiesByUsernameQuery(ROLES_BY_UNAME); 
   }
   
   public void configure(HttpSecurity http)throws Exception{
	http.authorizeRequests().antMatchers("/welcome.htm").access("permitAll")
	.antMatchers("/admin.htm").access("hasAnyRole('ROLE_ADMIN','ROLE_FACULTY')")
	.antMatchers("/welcome.htm").access("permitAll")
	.antMatchers("/faculty.htm").access("hasAnyRole('ROLE_ADMIN','ROLE_FACULTY')")
	.and().logout().logoutSuccessUrl("/welcome.htm")
	.and().formLogin().and().rememberMe().and().exceptionHandling()
	.accessDeniedPage("/secure/access_denied.jsp");
   }	

}
