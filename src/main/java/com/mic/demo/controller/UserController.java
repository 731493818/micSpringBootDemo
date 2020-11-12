package com.mic.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/hello",method = {RequestMethod.GET,RequestMethod.POST})
public class UserController {


    @RequestMapping("/mic")
    @ResponseBody
    public String mic(String username){
        return "Hello Mic !";
    }



}