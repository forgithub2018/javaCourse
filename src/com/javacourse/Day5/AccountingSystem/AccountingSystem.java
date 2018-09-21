package com.javacourse.Day5.AccountingSystem;
//        Разработать приложение по учету сотрудников предприятия.
//        Типы сотрудников + характеристики для хранения:
//        Developer (id, name, age, salary, gender, fixedBugs)
//        Manager (id, name, age, salary, gender)
//        Cleaner (id, name, age, salary, gender, rate, workedDays)
//
//        ставка -> salary
//
//        Расчет итоговой зарплаты для Developer происходит по формуле:
//        (ставка + fixedBugs * коэффициент) * (randomBoolean ? 2 : 0)
//        Итоговой зарплатой Manager-а является его ставка:
//        Расчет итоговой зарплаты для Cleaner происходит по формуле:
//        ставка + rate * workedDays
//
//        Разработать класс EmployeeService который будет хранить всех сотрудников предприятия в массиве.
//        Класс должен содержать методы для работы с сотрудниками (которые представлены массивом внутри класса):
//        void printEmployees() -> вывод на экран информации о сотрудниках
//        double calculateSalaryAndBonus() -> возвращает количество денег необходимое для выплаты зарплат для всех сотрудников в этом месяце
//        Employee getById(long) -> возвращает сотрудника по заданному id
//        Employee[] getByName(String) -> возвращает сотрудника по заданному имени
//        Employee[] sortByName()
//        Employee[] sortByNameAndSalary() -> возвращают отсортированный массив с сотрудниками по критерию
//        Employee edit(Employee) -> находит сотрудника по id, и подменяет информацию о нем на новую. Старую версию сотрудника метод возвращает.
//
//        Использовать класс Test для создания объекта EmploeeService и тестирования описаных выше методов.

public class AccountingSystem {
    public static void main(String[] args) {

    }
}