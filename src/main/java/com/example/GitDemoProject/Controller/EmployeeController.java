package com.example.GitDemoProject.Controller;

import com.example.GitDemoProject.Entity.EmployeDetails;
import com.example.GitDemoProject.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;


    @GetMapping("/getvalue")
    public String writtenSomthing() {
        return "hello Shashi kumar";
    }

    @PostMapping("/employees")
    public EmployeDetails createEmployee(@RequestBody EmployeDetails employee) {
        return employeeRepository.save(employee);
    }

    @GetMapping("/employeesList")
    public List<EmployeDetails> getAllEmployees(){
        return employeeRepository.findAll();
    }
}
