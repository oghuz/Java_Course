package com.java.LambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaMain {


    public static void main(String[] args) {
        new Thread(() -> System.out.println("Printing from Lambda Expression")).start();

        Employee john = new Employee("John Doe", 32);
        Employee Tim = new Employee("Tim Cookie", 23);
        Employee Dil = new Employee("Dil Shit", 22);
        Employee snow = new Employee("Snow Man", 41);
        Employee Dot = new Employee("Dot Ishak", 24);
        Employee Japan = new Employee("Japan Tokyo", 54);

        List<Employee> employees = new ArrayList<>();

        employees.add(john);
        employees.add(Tim);
        employees.add(Dil);
        employees.add(snow);
        employees.add(Dot);
        employees.add(Japan);

        printEmployeesByAge(employees, "Employees over 30 ", employee -> employee.getAge() > 30);
        printEmployeesByAge(employees, "Employees 30 and under ", employee -> employee.getAge() <= 30);

        System.out.println("====================================");

        Random random = new Random();
        Supplier<Integer> randIntSupplier = () -> random.nextInt(1000);
        for (int i = 0; i < 10; i++) {
            System.out.println(randIntSupplier.get());
        }

        System.out.println("====================================");

        employees.forEach(employee->{
            String lastName = employee.getName().substring(employee.getName().indexOf(" ") + 1);
            System.out.println("last names is : " + lastName);
        });

        System.out.println("====================================");

        Function<Employee, String> getLastName = (Employee employee)-> {
            return employee.getName().substring(employee.getName().indexOf(" ") + 1);
        };

        Function<Employee, String> getFirstName = (Employee employee)-> {
            return employee.getName().substring(0, employee.getName().indexOf(" "));
        };

        System.out.println("=============== Upper case names =====================");
        Function<Employee, String> upperCase = employee -> employee.getName().toUpperCase();

        employees.forEach(employee -> {
            System.out.println(upperCase.apply(employee));
        });

        employees.forEach(employee -> {
            System.out.println(getLastName.apply(employee));
        });
        System.out.println("====================================");

        employees.forEach(employee -> {
            System.out.println(getFirstName.apply(employee));
        });

    }

    private static void printEmployeesByAge(List<Employee> employees, String ageText, Predicate<Employee> predicate) {
        System.out.println("\n" + ageText);
        System.out.println("====================");

        for (Employee employee : employees) {
            if (predicate.test(employee)) {
                System.out.println(employee.getName());
            }
        }

    }
}
