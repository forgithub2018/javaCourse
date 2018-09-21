package com.javacourse.Day4.EmployeeGenerator;

public class Employee {
    int id;
    String firstName;
    String lastName;
    double salary;


    public Employee(int id, String firstName, String lastName, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    void showAllFieds() {

        String s = "Id =" + this.id + "; FirstName = " + this.firstName + "; LastName = " + this.lastName + "; Salary = " + this.salary;
        System.out.println(s);
    }
}

