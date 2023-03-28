//package com.genspark.HRmanagement.secureconfig;
//
//import com.genspark.HRmanagement.service.UserServiceInt;
//import lombok.Data;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
//
//@Configuration
//@EnableWebSecurity
//@Data
////@AllArgsConstructor
////@NoArgsConstructor
//public class SecurityConfiguration extends WebSecurityConfigurerAdapter{
//
//	@Autowired
//	private UserServiceInt userService;
//
//	@Autowired private LoginSuccessHandler loginSuccessHandler;
//
//	@Autowired
//	private BCryptPasswordEncoder passwordEncoder;
//
////	@Bean
////	public BCryptPasswordEncoder passwordEncoder() {
////		return new BCryptPasswordEncoder();
////	}
//
//	@Bean
//	public DaoAuthenticationProvider authenticationProvider() {
//		 DaoAuthenticationProvider auth =new  DaoAuthenticationProvider();
//		 auth.setUserDetailsService(userService);
//		 auth.setPasswordEncoder(passwordEncoder);//());
//		 return auth;
//	}
//
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
//		auth.authenticationProvider(authenticationProvider());
//	}
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception{
//		http.authorizeHttpRequests()
//		//.antMatchers("/signup**",
//						//"/js/**",
//						//"/style/**",
//						//"/img/**")
//		//.permitAll()
//		.anyRequest().authenticated()
//		.and()
//		.formLogin()
//		.loginPage("/login")
//		.usernameParameter("username")
//		.successHandler(loginSuccessHandler)
//		//.loginProcessingUrl("/login")
//		//.defaultSuccessUrl("/admin",true)
//		.permitAll()
//		.and()
//		.logout()
//		.invalidateHttpSession(true)
//		.clearAuthentication(true)
//		.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
//		.logoutSuccessUrl("/login?logout")
//		.permitAll();
//	}
//}
