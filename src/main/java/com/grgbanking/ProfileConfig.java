package com.grgbanking;

import com.grgbanking.entity.ProfileBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ComponentScan("com.grgbanking")
public class ProfileConfig {
    @Bean
    @Profile("dev")
    public ProfileBean depDemo() {
        return new ProfileBean("development  开发环境");
    }

    @Bean
    @Profile("prod")
    public ProfileBean prodDemo() {
        return new ProfileBean("production 生产环境");
    }
}
