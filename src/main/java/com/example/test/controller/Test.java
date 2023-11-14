package com.example.test.controller;

import com.example.test.entity.TestSteps;
import com.example.test.services.TestLogics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @Autowired
    private TestLogics testLogics;
    @RequestMapping(value="/updateSteps",method= RequestMethod.POST)
    public String startRets(@RequestBody TestSteps testStep){
        return "Updating Step "+testStep.getStep_id()+" effected "+testLogics.logics(testStep) +" Test Cases";
    }

}
