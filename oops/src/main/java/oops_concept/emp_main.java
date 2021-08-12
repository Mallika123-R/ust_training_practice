package oops_concept;

public class emp_main {

    public static void main(String[] args)
    {
        emp_details emp=new emp_details();
        emp.setEmp_id(101);
        emp.setName("Mallika");
        emp.setMobile(124568);
        emp.setSalary(50000.2);

        System.out.println("Employee details");
        System.out.println("Employee Name: "+emp.getEmp_id());
        System.out.println("Employee Name: "+emp.getName());
        System.out.println("Employee Name: "+emp.getMobile());
        System.out.println("Employee Name: "+emp.getSalary());


    }
}
