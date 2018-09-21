package com.javacourse.Day5.AccountingSystem;


public class Developer extends Person {

    int fixedBugs;

    public Developer(int id, String firstName, String lastName, double salary, int age, int bonus, String gender, int fixedBugs) {
        super(id, firstName, lastName, salary, age, bonus, gender);
        this.fixedBugs = fixedBugs;
    }


}
