package com.mic.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping(value = {"/","/index.html"})
    public String index(){
        return "index";
    }

}
