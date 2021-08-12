package Stream_Example;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {


        static{
            new EmployeeDeo().addEmployee(new Employee(1,"A",25000));
            new EmployeeDeo().addEmployee(new Employee(3,"H",45000));
            new EmployeeDeo().addEmployee(new Employee(2,"G",65000));
            new EmployeeDeo().addEmployee(new Employee(5,"P",75000));
            new EmployeeDeo().addEmployee(new Employee(4,"Z",85000));
        }



    public static void main(String[] args)
    {

        List<Employee> employeeList = new EmployeeDeo().getEmployeeList();
        // List Employeess - salary -> 50000

        List<Employee> empSalarygreaterthan50 = employeeList.stream()
                .filter((employee -> employee.getSalary() > 5000))
                .collect(Collectors.toList());
        empSalarygreaterthan50.forEach(employee -> {
            System.out.println(employee.getId() + "---" + employee.getName()+"---"+ employee.getSalary());
        });

        // list of employeess - salary 50000 -1 lac

        System.out.println("increment salary by 20000 whose salary<50000");
        List<Employee> result2 = employeeList.stream()
                .filter(employee -> employee.getSalary() < 50000)
                .map(employee -> {
                    employee.setSalary(employee.getSalary() + 20000);
                    return employee;
                })
                .collect(Collectors.toList());
        result2.forEach(System.out::println);

        System.out.println("Decending order by employee name");
        employeeList.stream()
                .sorted(Comparator.comparing(Employee::getName).reversed()) // Employee::getName -->employee -> employee.getName()
                .forEach(System.out::println);
        System.out.println("Ascending Order by employee id");
        employeeList.stream()
                .sorted(Comparator.comparing(Employee::getId))
                .forEach(System.out::println);
        System.out.println("Print Only Employee Names slaray> 50000");
        List<String> names=employeeList.stream()
                .map(employee -> employee.getName().toUpperCase())
                .sorted()
                .collect(Collectors.toList());
        System.out.println(names);

    }

}
