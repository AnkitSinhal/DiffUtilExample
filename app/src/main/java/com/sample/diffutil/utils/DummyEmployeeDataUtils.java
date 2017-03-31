package com.sample.diffutil.utils;

import com.sample.diffutil.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DummyEmployeeDataUtils {
    public static List<Employee> getEmployeeListSortedByName() {
        final List<Employee> employeeList = getEmployeeList();

        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee a1, Employee a2) {
                return a1.getName().compareTo(a2.getName());
            }
        });

        return employeeList;
    }

    public static List<Employee> getEmployeeListSortedByRole() {
        final List<Employee> employeeList = getEmployeeList();

        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee a1, Employee a2) {
                return a2.getRole().compareTo(a1.getRole());
            }
        });
        return employeeList;
    }

    private static List<Employee> getEmployeeList() {
        final List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "Employee 1", "Developer"));
        employees.add(new Employee(2, "Employee 2", "Tester"));
        employees.add(new Employee(3, "Employee 3", "Support"));
        employees.add(new Employee(4, "Employee 4", "Sales Manager"));
        employees.add(new Employee(5, "Employee 5", "Manager"));
        employees.add(new Employee(6, "Employee 6", "Team lead"));
        employees.add(new Employee(7, "Employee 7", "Scrum Master"));
        employees.add(new Employee(8, "Employee 8", "Sr. Tester"));
        employees.add(new Employee(9, "Employee 9", "Sr. Developer"));
        return employees;
    }

}
