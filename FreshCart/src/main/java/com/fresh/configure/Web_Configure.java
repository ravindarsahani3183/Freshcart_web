/*package com.fresh.configure;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class Web_Configure{
	
	
	
	  @Bean 
	  public UserDetailsService getUserCustomerService() 
	  { 
		  return new UserCustomerService();
	  }
	  
	  @Bean
	  public BCryptPasswordEncoder passwordEncoder()
	  { 
		  return new BCryptPasswordEncoder(); 
	  }
	 
	  @Bean 
	  public DaoAuthenticationProvider authenticationProvider()
	  {
	    DaoAuthenticationProvider authenticationProvider = new
	    DaoAuthenticationProvider();
	    authenticationProvider.setUserDetailsService(this.getUserCustomerService());
	    authenticationProvider.setPasswordEncoder(passwordEncoder()); return
	    authenticationProvider; 
	  }
	 
	  
	  public void configure(AuthenticationManagerBuilder
	  authenticationManagerBuilder) throws Exception {
	  authenticationManagerBuilder.authenticationProvider(authenticationProvider())
	 ; }
	 
     
     @Bean
     public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
         http
                 .csrf().disable()
                 .authorizeHttpRequests()
                 .requestMatchers("/")
                 .permitAll()
                 .requestMatchers("/create")
                 .permitAll()
                 .requestMatchers("/Sighup_Img/**")
                 .permitAll()
                 .requestMatchers("/profile")
                 .permitAll()
                 .requestMatchers("/Css/**").permitAll()
                 .requestMatchers("/download3/**").permitAll()
                 .anyRequest()
                 .authenticated()
                 .and()
                 .formLogin();
         http.authenticationProvider(authenticationProvider());
         return http.build();
     }
}
	*/