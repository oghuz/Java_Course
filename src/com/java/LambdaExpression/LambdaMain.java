package com.java.LambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LambdaMain {


    public static void main(String[] args) {
        new Thread(() -> System.out.println("Printing from Lambda Expression")).start();

        Employee john = new Employee("John", 32);
        Employee Tim = new Employee("Tim", 23);
        Employee Dil = new Employee("Dil", 22);
        Employee snow = new Employee("snow", 41);
        Employee Dot = new Employee("Dot", 24);
        Employee Japan = new Employee("Japan", 54);


        List<Employee> employees = new ArrayList<>();

        employees.add(john);
        employees.add(Tim);
        employees.add(Dil);
        employees.add(snow);
        employees.add(Dot);
        employees.add(Japan);

        printEmployeesByAge(employees,"Employees over 30 ", employee->employee.getAge() > 30);
        printEmployeesByAge(employees, "Employees 30 and under ", employee -> employee.getAge() <= 30);

    }

    private static void printEmployeesByAge(List<Employee> employees, String ageText, Predicate<Employee> predicate) {
        System.out.println("\n" + ageText);
        System.out.println("====================");

        for (Employee employee: employees){
            if (predicate.test(employee)){
                System.out.println(employee.getName());
            }
        }

    }
}
