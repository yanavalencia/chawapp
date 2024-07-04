package com.yana.ChawApp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

private UserDetailsService userDetailsService;

public SecurityConfig(UserDetailsService userDetailsService){
    this.userDetailsService = userDetailsService;
}

@Bean
static PasswordEncoder PasswordEncoder(){
    return new BCryptPassword();
}

@Bean
AuthencationManager AuthencationManager(AuthenticatinConfiguration configuration)
throws Exception{
    return configuration.getAuthenticationManager();
}

@Bean
SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{

    http.crsf(csrf -> crsf.disable())
        .authorizeHttpRequest((authorize))
              authorize.requestMatchers(HttpMethod.GET, "/api/v2/**").permitAll()
                       .requestMatchers("/api/v2/auth/**").permitAll()
                       .anyRequest().authenticated()

     );
return http.build();

}

}
