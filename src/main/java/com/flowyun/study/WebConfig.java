package com.flowyun.study;

import com.flowyun.boot.web.configure.WebConfigurer;
import com.flowyun.boot.web.interceptor.TokenInterEnum;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfig {

    @Bean
    public WebConfigurer webConfigurer() {
        return WebConfigurer.builder()
                .enableNonTokenInterceptor()
                .build();
    }


}
