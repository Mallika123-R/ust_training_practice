package scanner_method;

import java.util.Scanner;

public class main_emp {

    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Employee Name");
        String name=scan.next();

        System.out.println("Employee id");
        int id=scan.nextInt();

        System.out.println("Employee mobile");
        int mobile=scan.nextInt();

        System.out.println("Employee salary");
        Double salary=scan.nextDouble();

        details_emp dm=new details_emp();
        dm.setEmp_id(id);
        dm.setName(name);
        dm.setMobile(mobile);
        dm.setSalary(salary);

        System.out.println("Employee details");
        System.out.println("Employee id: "+dm.getEmp_id());
        System.out.println("Employee Name: "+dm.getName());
        System.out.println("Employee mobile: "+dm.getMobile());
        System.out.println("Employee salary: "+dm.getSalary());


    }



}
