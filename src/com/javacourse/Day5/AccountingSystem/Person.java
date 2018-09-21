package com.javacourse.Day5.AccountingSystem;

import com.javacourse.Day4.EmployeeGenerator.Employee;

public class Person extends Employee {

    int age;
    float bonus;
    String gender;


    public Person(int id, String firstName, String lastName, double salary, int age, int bonus, String gender) {

        super(id, firstName, lastName, salary);
        this.age = age;
        this.bonus = bonus;
        this.gender = gender;
    }

}
