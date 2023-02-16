package com.shop.project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults;
import javax.servlet.DispatcherType;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf().disable().cors().disable()
                .authorizeHttpRequests(request -> request
                        .dispatcherTypeMatchers(DispatcherType.FORWARD).permitAll()
                        .anyRequest().authenticated())
                .formLogin(login -> login
                        .loginPage("/ShopMiniMall/member") // [A] 커스텀 로그인 페이지 지정
                        .loginProcessingUrl("/ShopMiniMall/login") // [B] submit 받을 url
                        .usernameParameter("id") // [C] submit할 아이디
                        .passwordParameter("pwd") // [D] submit할 비밀번호
                        .defaultSuccessUrl("/view/dashboard", true)
                        .permitAll())
                .logout(withDefaults());
        return http.build();
    }
}