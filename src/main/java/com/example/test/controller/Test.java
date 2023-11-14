package com.example.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
    @RequestMapping(value="/hello",method= RequestMethod.POST)
    public String startRets(){

        return "ssssq11";
    }

}
