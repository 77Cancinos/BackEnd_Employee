package com.victor.crud.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer emp0loyeeId;
    private String employeeName;
    private String employeeContactNumer;
    private String employeeAddress;
    private String employeedGender;
    private String employeeDepartment;
    private String employeeSkills;

    public Employee(){

    }

    public Integer getEmp0loyeeId() {
        return emp0loyeeId;
    }

    public void setEmp0loyeeId(Integer emp0loyeeId) {
        this.emp0loyeeId = emp0loyeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeContactNumer() {
        return employeeContactNumer;
    }

    public void setEmployeeContactNumer(String employeeContactNumer) {
        this.employeeContactNumer = employeeContactNumer;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public String getEmployeedGender() {
        return employeedGender;
    }

    public void setEmployeedGender(String employeedGender) {
        this.employeedGender = employeedGender;
    }

    public String getEmployeeDepartment() {
        return employeeDepartment;
    }

    public void setEmployeeDepartment(String employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }

    public String getEmployeeSkills() {
        return employeeSkills;
    }

    public void setEmployeeSkills(String employeeSkills) {
        this.employeeSkills = employeeSkills;
    }


}