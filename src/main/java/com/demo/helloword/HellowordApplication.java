package com.demo.helloword;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 此注解表明当springBoot启动后扫描com下的包
@SpringBootApplication(scanBasePackages = "com")
@MapperScan("com.demo.dao")
public class HellowordApplication {
    public static void main(String[] args) {
        SpringApplication.run(HellowordApplication.class, args);
    }
}
