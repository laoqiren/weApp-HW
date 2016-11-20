package com.umis.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/*

@Configuration
public class WebAppConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new AccessInterceptor())
                .addPathPatterns("/**");
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/api/**");
        super.addInterceptors(registry);
    }
}
*/