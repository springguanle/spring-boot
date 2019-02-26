package com.bjpowernode.controller;

import com.bjpowernode.config.ConfigInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhangguanle
 * @create 2019-02-22 17:58
 *
 * 读取配置文件实例
 */
@Controller
public class ConfigInfoController {

    //第一种：
    @Value("${school.name}")
    private  String  name;

    @Value("${school.address}")
    private String address;

    @Value("${school.age}")
    private int age;

    @Autowired
    private ConfigInfo configInfo;

    @RequestMapping(value = "/init",method = RequestMethod.GET)
    @ResponseBody
    public String initConfig(){
        // return name+","+address+","+age;
        return configInfo.getName()+","+configInfo.getAddress()+","+configInfo.getAge();
    }
}
