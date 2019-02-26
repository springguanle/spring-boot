package com.bjpowernode.config;

import com.bjpowernode.filter.SecondFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhangguanle
 * @create 2019-02-23 15:52
 * spring boot 与 filter集成方式二的配置类
 */
@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean registrySecondFilter(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new SecondFilter());
        filterRegistrationBean.addUrlPatterns("/*");
        return  filterRegistrationBean;
    }
}
