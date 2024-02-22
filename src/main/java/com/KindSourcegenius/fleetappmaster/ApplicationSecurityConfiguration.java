package com.KindSourcegenius.fleetappmaster;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@EnableWebSecurity
@Configuration
public class ApplicationSecurityConfiguration extends WebSecurityConfigurerAdapter {


    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
auth
        .inMemoryAuthentication()
        .withUser("Holla").password("151046879").roles("ADMIN")
        .and()
        .withUser("Hall").password("123456").roles("USER");

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.
                authorizeRequests()

                .anyRequest().authenticated()
                .and()
                .httpBasic();


    }

 @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder(){
        return new BCryptPasswordEncoder();
 }

}
