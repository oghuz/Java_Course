package com.java.LambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaMain {


    public static void main(String[] args) {
        new Thread(()->System.out.println("Printing from Lambda Expression")).start();

        Employee john = new Employee("John", 32);
        Employee Tim = new Employee("Tim", 23);
        Employee Dil = new Employee("Dil", 22);
        Employee snow = new Employee("snow", 41);

        List<Employee> employees = new ArrayList<>();

        employees.add(john);
        employees.add(Tim);
        employees.add(Dil);
        employees.add(snow);

//        Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee employee1, Employee employee2) {
//                return employee1.getName().compareToIgnoreCase(employee2.getName());
//            }
//        });

        Collections.sort(employees, (employee1, employee2)->employee1.getName().compareToIgnoreCase(employee2.getName()));

        for(Employee employee: employees) {
            System.out.println(employee.getName());
        }

    }




}
