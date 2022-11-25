package com.dnekh.selflessons;

public class Employee extends Person {

    private int income;
    private int bonus;

    public Employee() {}

    public Employee(String name, int age, int income, int bonus) {
        super(name, age);
        this.income = income;
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + Employee.super.getName() + '\'' +
                ", age=" + Employee.super.getAge() +
                ", income=" + income +
                ", bonus=" + bonus +
                '}';
    }


}
