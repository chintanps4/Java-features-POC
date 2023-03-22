package com.java.serialization;

import java.io.Serializable;

public class Employee extends Person implements Serializable {

    private Person employee;
    private String department;
    private String employeeCode;

    /*public Employee() {
        System.out.println("Default employee constructor");
    }*/

    /*public Employee(Person employee, String department, String employeeCode) {
        this.employee = employee;
        this.department = department;
        this.employeeCode = employeeCode;
        System.out.println("Employee constructor with 3 args called");
    }*/

    public Person getEmployee() {
        return employee;
    }

    public void setEmployee(Person employee) {
        this.employee = employee;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employee=" + employee +
                ", department='" + department + '\'' +
                ", employeeCode='" + employeeCode + '\'' +
                '}';
    }
}
