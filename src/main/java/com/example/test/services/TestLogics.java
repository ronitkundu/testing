package com.example.test.services;


import com.example.test.entity.TestSteps;
import com.example.test.repository.TestCasesRepo;
import com.example.test.repository.TestStepsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestLogics {
    @Autowired
    private TestStepsRepo testStepsRepo;
    @Autowired
    private TestCasesRepo testCasesRepo;
    public int logics(TestSteps testSteps){
         testStepsRepo.save(testSteps);
         int countEffected=testCasesRepo.countCases(testSteps);
        return countEffected;
    }
}
