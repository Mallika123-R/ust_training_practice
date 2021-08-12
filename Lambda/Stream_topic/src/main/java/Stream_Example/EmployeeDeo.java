package Stream_Example;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDeo {

    public static ArrayList<Employee> employeeList=new ArrayList<>();

    public void addEmployee(Employee employee){
        employeeList.add(employee);

    }
    public List<Employee> getEmployeeList()
    {
        return employeeList;
    }
  //  public List<Employee>

}
