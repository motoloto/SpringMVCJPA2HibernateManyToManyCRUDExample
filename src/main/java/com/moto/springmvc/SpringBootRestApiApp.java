package com.moto.springmvc;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
 
 
@SpringBootApplication(scanBasePackages={"com.moto.springmvc"})// same as @Configuration @EnableAutoConfiguration @ComponentScan
public class SpringBootRestApiApp {
 
    public static void main(String[] args) {
        SpringApplication.run(SpringBootRestApiApp.class, args);
    }
}