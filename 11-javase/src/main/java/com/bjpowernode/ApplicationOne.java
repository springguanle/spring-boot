package com.bjpowernode;

import com.bjpowernode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
* 方式一
* */
@SpringBootApplication
public class ApplicationOne implements CommandLineRunner{

	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(ApplicationOne.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//在run方法中编写代码
		userService.hello();
	}
}
