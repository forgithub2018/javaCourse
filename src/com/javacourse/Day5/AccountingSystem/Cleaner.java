package com.javacourse.Day5.AccountingSystem;

public class Cleaner extends Person {

    int workingDays;

    public Cleaner(int id, String firstName, String lastName, double salary, int age, int bonus, String gender, int workingDays) {
        super(id, firstName, lastName, salary, age, bonus, gender);
        this.workingDays = workingDays;
    }

}
