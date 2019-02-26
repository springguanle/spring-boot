package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhangguanle
 * @create 2019-02-22 18:29
 * Spring boot 中使用jsp
 */
@Controller
public class JspController {

    @RequestMapping("/jsp")
    public String jsp(Model model){
        model.addAttribute("msg","spring boot use jsp");
        return "header";
    }
}
