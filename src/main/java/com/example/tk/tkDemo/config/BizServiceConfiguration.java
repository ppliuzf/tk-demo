package com.example.tk.tkDemo.config;

import com.example.tk.tkDemo.support.ApplicationContextUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "com.example.tk.tkDemo.service",
        "com.example.tk.tkDemo.web"
})
public class BizServiceConfiguration {
    @Bean
    public ApplicationContextUtil applicationContextUtil() {
        return new ApplicationContextUtil();
    }
}
