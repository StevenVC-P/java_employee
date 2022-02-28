package com.teksystems;

public class Employee {
    long id;
    String name;
    String employeeAddress;
    long employeePhone;
    double basicSalary;
    double specialAllowance = 250.80;
    double hra = 1000.50;

    Employee() {

    }

    Employee(long id, String name, String employeeAddress, long employeePhone) {
        this.id = id;
        this.name = name;
        this.employeeAddress = employeeAddress;
        this.employeePhone = employeePhone;
    }

    double calculateSalary() {
        return basicSalary + (basicSalary * specialAllowance / 100d) + (basicSalary * hra / 100d);
    }

    double calculateTransportAllowance() {
        return .10 * basicSalary;

    }

}
