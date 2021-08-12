package main;

import Deo.EmployeedeoI;
import Deo.employeeDeo;
import com.model.Employee;
//import com.model.employee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class mainex {

    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        EmployeedeoI employeedoI =new EmployeedeoI();
        System.out.println("Enter number of employee");

        do{
            System.out.println("Press 1. Add Employee 2. List Employee 3.Exit");
            System.out.print("Enter the choice");
            int choice = Integer.parseInt(reader.readLine());
            switch (choice) {
                case 1:
                    System.out.println("enter the employee details");
                    Employee emp=new Employee();
                    System.out.println("enter the name");
                    emp.setName(reader.readLine());
                    System.out.println("enter the id");
                    emp.setId(Integer.parseInt(reader.readLine()));
                    System.out.println("enter the salary");
                    emp.setSalary(Double.parseDouble(reader.readLine()));

                    boolean status=employeedoI.addEmployeeDetails(emp);
                    if(status)
                    {
                        System.out.println("Data insert successfully");

                    }
                    else
                        System.out.println("check your code");

                    break;

                case 2:
                    System.out.println("List of employee");
                    List<Employee> list =employeedoI.getAllEmployeeDetails();
                    for(Employee empl :list)
                    {
                        System.out.println(empl.getId()+".."+empl.getName()+".."+empl.getSalary());
                    }
                    break;
                default:
                    System.exit(0);


            }

        }while(true);
    }
    /*Employee amal=new employee(1,"Amal",34000.56);
    employee chand=new employee(2,"Chand",44000.56);
    employee hema=new employee(3,"Hemalatha",24000.56);
    employee karthika=new employee(4,"Karthika",64000.56);
    employee magesh=new employee(5,"Magesh",34000.56);

    EmployeedeoI employeeDao=new EmployeedeoI();
        employeeDao.addEmployeeDetails(amal);
        employeeDao.addEmployeeDetails(chand);
        employeeDao.addEmployeeDetails(hema);
        employeeDao.addEmployeeDetails(karthika);
        employeeDao.addEmployeeDetails(magesh);

        List<employee> list=employeeDao.getAllEmployeeDetails();

        for(employee emp: list ) {
            System.out.println(emp.getId() + "--" + emp.getName()+ "---" + emp.getSalary());
            }*/



}
