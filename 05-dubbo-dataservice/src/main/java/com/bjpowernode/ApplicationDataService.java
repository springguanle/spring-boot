package com.bjpowernode;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration//开启dubbo配置支持
public class ApplicationDataService {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationDataService.class, args);
	}

}
