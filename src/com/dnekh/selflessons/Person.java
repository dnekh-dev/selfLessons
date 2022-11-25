package com.dnekh.selflessons;

public class Person {

    private static long id = 0;
    private String name;
    private int age;

    public Person() {}

    public Person(String name, int age) {
        this.id += 1;
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static String getId() {
        return "Count of staff: " + String.valueOf(id);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age + '}';
    }
}
