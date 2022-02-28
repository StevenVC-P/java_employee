package com.teksystems;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        Manager manager = new Manager(126534, "Peter", "Chennai India", 237844, 65000);
        Trainee trainee = new Trainee(29846, "Jack", "Mumbair India", 442085, 45000);

        System.out.println(manager.calculateSalary());
        System.out.println(trainee.calculateSalary());

        System.out.println(manager.calculateTransportAllowance());
        System.out.println(trainee.calculateTransportAllowance());
    }

}
