package com.orange.demo.springboot_mybatis_demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.orange.demo.springboot_mybatis_demo.*")
@MapperScan(basePackages = "com.orange.demo.springboot_mybatis_demo.dao")
public class SpringbootMybatisDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringbootMybatisDemoApplication.class, args);
	}

}
