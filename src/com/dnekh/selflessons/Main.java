package com.dnekh.selflessons;

public class Main {

    public static void main(String[] args) {

        Employee firstManager = new Employee("Mors", 25, 75000, 5000);
        Employee secondManager = new Employee("Vasya", 27, 60000, 5000);
        Employee thirdManager = new Employee("Oleg", 30, 60000, 20000);

        Employee driver = new Employee("Ivan", 24, 30000, 1000);
        Employee guard = new Employee("Misha", 34, 45000, 3000);

        guard.setName("Dmitrii");



        System.out.println(firstManager);
        System.out.println(secondManager);
        System.out.println(thirdManager);
        System.out.println(driver);
        System.out.println(guard);
        System.out.println(Person.getId());
    }
}
