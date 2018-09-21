package com.javacourse.Day1;// ====== part 1
// приминает 2 инта, а и б, возвращает большее их этих 2х чисел
// принимает 3 инта, возвращает большее из них
// приминает 5 интов, возвращает большее из них
// метод принимает инт, и возвращает факториал от заданого инта
// принимает инт год, и возвращает тру если год высокосный
// метод принимает int n, и выводит на экран первые n чисел Фибоначи


//https://join.skype.com/dclv5PAMOo8d

class JavaPracticePart1 {
    public static void main(String[] args) {

        System.out.print("greatest_from_two = ");
        System.out.println(max(3, 5));
        System.out.print("greatest_from_three = ");
        System.out.println(max(41, 2, 4));
        System.out.print("greatest_from_five = ");
        System.out.println(max(7, 2, 99, 9, 5));
        System.out.print("factorial = ");
        System.out.println(factorial(4));
        System.out.print("isLeapYear = ");
        System.out.println(isLeapYear(1980));
        Fibbo(2);
    }

    // приминает 2 инта, а и б, возвращает большее их этих 2х чисел
    static int max(int a, int b) {
        return a >= b ? a : b;
    }


    // принимает 3 инта, возвращает большее из них
    static int max(int a, int b, int c) {
        return max(max(a, b), c);
    }

    // приминает 5 интов, возвращает большее из них
    static int max(int a, int b, int c, int d, int e) {
        return max(max(a, b, c), d, e);
    }

    // метод принимает инт, и возвращает факториал от заданого инта
    static long factorial(int value) {
        long result = 1;
        for (int i = value; i > 0; i--)
            result = i * result;
        return result;
    }

    // принимает инт год, и возвращает тру если год высокосный
// one line
    static boolean isLeapYear(int year) {

        return (year % 4 == 0 && year % 100 != 100) || (year % 4 == 0 && year % 100 == 0 && year % 400 != 0);
    }

    // метод принимает int n, и выводит на экран первые n чисел Фибоначи
    static int Fibbo(int f) {
        int fibonacci;

        if (f <= 1) {
            fibonacci = f;
        } else {
            fibonacci = Fibbo(f - 1) + Fibbo(f - 2);
        }

        System.out.print(fibonacci + " ");
        return fibonacci;
    }

}