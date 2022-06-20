package com.flowyun.study;

import com.flowyun.boot.auth.context.ContextVar;
import com.flowyun.boot.auth.context.UserActionContextUtils;
import com.flowyun.boot.web.configure.WebConfigurer;
import com.flowyun.boot.web.interceptor.TokenInterEnum;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Configuration
public class WebConfig {

    private HandlerInterceptor contextHandler = new HandlerInterceptor() {
        @Override
        public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
            UserActionContextUtils.set(ContextVar.ACCOUNT_ID, "10000");
            return true;
        }
    };

    @Bean
    public WebConfigurer webConfigurer() {
        return WebConfigurer.builder()
                .enableNonTokenInterceptor()
                .addInterceptor(contextHandler).register()
                .build();
    }


}
