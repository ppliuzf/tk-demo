package com.example.tk.tkDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication(scanBasePackages = {
        "com.example.tk.tkDemo.config"
})
@EnableWebMvc
public class TkDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TkDemoApplication.class, args);
    }

}
