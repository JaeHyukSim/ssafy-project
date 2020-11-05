package com.ssafy.happyhouse;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ssafy.happyhouse.repository.mapper")
public class HappyhouseApplication {

	public static void main(String[] args) {
		SpringApplication.run(HappyhouseApplication.class, args);
	}

}
