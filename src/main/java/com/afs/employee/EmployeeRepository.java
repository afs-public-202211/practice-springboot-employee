package com.afs.employee;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeRepository {
    List<Employee> employeeList;

    public EmployeeRepository(List<Employee> employeeList) {
        this.employeeList = employeeList;
        this.employeeList.add(new Employee(1, "Lily", 20, "Female", 8000));
        this.employeeList.add(new Employee(2, "Lucy", 21, "Female", 7000));
        this.employeeList.add(new Employee(3, "Leo", 19, "Male", 6000));
    }

    public List<Employee> getAll() {
        return employeeList;
    }
}
//{
//"id": 5,
//"name": "Lily",
//"age": 20,
//"gender": "Female",
//"salary": 8000
//}
