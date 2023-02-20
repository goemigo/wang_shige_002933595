/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library.Employee;

import java.util.ArrayList;

/**
 *
 * @author emi
 */
public class EmployeeDirectory {
    ArrayList<Employee> employees;
    
    public EmployeeDirectory(){
        this.employees = new ArrayList<Employee>();
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }
    
    
}
