package com.yh.nulboapi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yh.nulboapi.mapper")
public class NulboApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(NulboApiApplication.class, args);
	}

}
