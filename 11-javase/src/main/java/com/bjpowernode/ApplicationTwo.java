package com.bjpowernode;

import com.bjpowernode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/*
* 方式二
* */
@SpringBootApplication
public class ApplicationTwo {

	@Autowired
	private UserService userService;

	public static void main(String[] args) {
//		ConfigurableApplicationContext context = SpringApplication.run(ApplicationTwo.class, args);
//		UserService user=(UserService) context.getBean("userServiceImpl");
//		user.hello();
		/*
		* 关闭spring boot 日志图标
		* */
		SpringApplication springApplication = new SpringApplication(ApplicationTwo.class);
		springApplication.setBannerMode(Banner.Mode.OFF);
		springApplication.run(args);
	}


}
