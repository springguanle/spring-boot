package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhangguanle
 * @create 2019-02-22 12:05
 */
@Controller
public class FirstController {

    @RequestMapping("/first")
    @ResponseBody
    public String first(Model model){
        return "first spring boot";
    }
}
