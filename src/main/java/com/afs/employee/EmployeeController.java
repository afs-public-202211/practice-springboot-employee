package com.afs.employee;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping
    List<Employee> getAll() {
        return employeeRepository.getAll();
    }

    @GetMapping("/{id}")
    Employee getOneWithID(@PathVariable(required = true)Integer id){
        return employeeRepository.getOneWithID(id);
    }

    @GetMapping(params={"gender"})
    public List<Employee> getEmployeeByGender(@RequestParam String gender) {
        return employeeRepository.getEmployeeByGender(gender);
    }
}