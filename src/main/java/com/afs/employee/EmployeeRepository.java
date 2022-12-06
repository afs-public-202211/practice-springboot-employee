package com.afs.employee;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository {
    List<Employee> employee;

    public EmployeeRepository(){
        this.employee = new ArrayList<>();
        employee.add(new Employee(1,"Lily",20,"Female",8000));
        employee.add(new Employee(2,"Lucy",60,"Female",4000000));
        employee.add(new Employee(3,"Xi",69,"Male",10000));
    }

    public List<Employee> findAll() {
        return employee;
    }
}
