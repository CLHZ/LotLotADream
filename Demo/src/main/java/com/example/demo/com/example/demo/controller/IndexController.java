package com.example.demo.com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping("/one.html")
    public String one(Model model) {
        System.out.println("=========执行==========");
        // 往model中放数据
        model.addAttribute("score",18);
        model.addAttribute("name","何婷华");
        return "one";
    }
}
