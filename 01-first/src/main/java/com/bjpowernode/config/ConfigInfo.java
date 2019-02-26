package com.bjpowernode.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author zhangguanle
 * @create 2019-02-22 18:10
 * 自定义配置文件
 * */
@Component
@ConfigurationProperties(prefix = "school")//前缀
public class ConfigInfo {
    private String name;//对应配置文件中的name

    private String address;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
