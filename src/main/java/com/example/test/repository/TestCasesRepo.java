package com.example.test.repository;

import com.example.test.entity.TestCases;
import com.example.test.entity.TestSteps;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TestCasesRepo extends JpaRepository<TestCases, Integer> {

    @Query("Select count(*) from TestCases e  WHERE e.steps = :condition")
    int countCases( @Param("condition") TestSteps condition);
}
