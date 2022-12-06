package com.afs.employee;

import org.springframework.web.bind.annotation.*;

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
}