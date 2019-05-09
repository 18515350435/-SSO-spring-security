package com.zc.web.filter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;



@Configuration
@EnableWebSecurity
@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
public class MyWebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private PasswordEncoder bCryptPasswordEncoder;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        String [] unfilterurls={
                                "/configuration/ui", 
                                "/swagger-resources",
                                "/configuration/security", 
                                "/goLogin",
                                "/logintest.html*",
                                "/nocallback.html",
                                "/webjars/**",
                                "/swagger-resources/configuration/ui",
                                "/swagge‌​r-ui.html"
        };
       http.cors().and().csrf().disable().authorizeRequests()
               .antMatchers(unfilterurls).permitAll()
               .anyRequest().authenticated().and().formLogin()
               .and()
               .addFilter(new JWTLoginFilter(authenticationManager()));
//               .addFilter(new JwtAuthenticationFilter(authenticationManager()));//因为只做单点登录,权限访问控制可以没有
    }

    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(bCryptPasswordEncoder);
    }
}