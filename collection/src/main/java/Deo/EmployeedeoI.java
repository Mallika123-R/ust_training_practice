package Deo;

import com.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeedeoI implements employeeDeo{

    List<Employee> employeeList= new ArrayList()    ;
    @Override
    public boolean addEmployeeDetails(Employee employee) {
        boolean status=employeeList.add(employee);
        return status;
    }

    @Override
    public List<Employee> getAllEmployeeDetails() {
        return employeeList;
    }
}



