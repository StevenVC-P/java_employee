package com.teksystems;

public class Manager extends Employee {

    Manager(long id, String name, String employeeAddress, long employeePhone, double basicSalary) {
        this.id = id;
        this.name = name;
        this.employeeAddress = employeeAddress;
        this.employeePhone = employeePhone;
        this.basicSalary = basicSalary;
    }

    @Override
    double calculateTransportAllowance() {
        return .15 * basicSalary;
    }
}
