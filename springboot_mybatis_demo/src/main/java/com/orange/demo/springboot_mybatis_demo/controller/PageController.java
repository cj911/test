package com.orange.demo.springboot_mybatis_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @GetMapping("/test")
    public String test()throws Exception{
        return "test";
    }
    @RequestMapping("/b1")
    public String b1()throws Exception{
        return "bootstrap/b1";
    }
    @RequestMapping("/ang")
    public String ang()throws Exception{
        return "angularjs/ang";
    }
}
