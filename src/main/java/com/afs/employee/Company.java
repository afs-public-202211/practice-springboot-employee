package com.afs.employee;

import com.afs.employee.Employee;

import java.util.List;

public class Company {
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    private String name;
    private List<Employee> employeeList;

    public Company (Integer id, String name, List<Employee> employeeList){

        this.id = id;
        this.name = name;
        this.employeeList = employeeList;
    }


}
