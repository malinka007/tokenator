package org.tokenator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"org.tokenator.controller"})
public class TokenatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(TokenatorApplication.class, args);
    }

}
