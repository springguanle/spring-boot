package com.bjpowernode.config;

import com.bjpowernode.interceptor.PermissionInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author zhangguanle
 * @create 2019-02-23 13:37
 */
@Configuration
public class InterceptorConfig extends WebMvcConfigurerAdapter{
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        super.addInterceptors(registry);
        registry.addInterceptor(new PermissionInterceptor())
                .addPathPatterns("/*").excludePathPatterns("/login");
    }
}
