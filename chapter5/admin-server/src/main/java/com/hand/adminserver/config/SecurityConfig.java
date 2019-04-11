package com.hand.adminserver.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * description
 *
 * @author zhiying.dong@hand-china.com 2019/03/31 14:15
 */
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin().loginPage("/login.html")
                .loginProcessingUrl("/login").permitAll()
                .and()
                .logout().logoutUrl("/logout")
                .and()
                .csrf().disable()
                .authorizeRequests()
                .antMatchers("login.html","/**/**.css","/img/**","/third-party/**")
                .permitAll()
                .and()
                .authorizeRequests().antMatchers("/**").authenticated()
                .and()
                .httpBasic();
    }
}
