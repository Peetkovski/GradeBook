package com.example.edziennik.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class MainSecurityPanel {

    @Configuration
    @EnableWebSecurity
    public class SecurityPanel extends WebSecurityConfigurerAdapter {


        @Override
        protected void configure(HttpSecurity http) throws Exception {

            http
                    .csrf().disable()
                    .authorizeRequests()
                    .antMatchers("/", "index", "/css/*", "/js/*").permitAll()
                    .antMatchers("/search/**").permitAll()
                    .antMatchers("/movie/**").permitAll()
                    .antMatchers("/profile/**").hasAnyRole()
                    .anyRequest()
                    .authenticated()
                    .and()
                    .formLogin()
                    .loginPage("/login").permitAll()
                    .defaultSuccessUrl("/home", true);

        }
    }

}