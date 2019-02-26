package com.bjpowernode.config;

import com.bjpowernode.servlet.SecondServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhangguanle
 * @create 2019-02-23 15:2
 * servlet 配置类
 */
@Configuration
public class ServletConfig {

    @Bean
    public ServletRegistrationBean registrySecondServlet(){
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new SecondServlet(), "/second");
        return servletRegistrationBean;
    }
}
