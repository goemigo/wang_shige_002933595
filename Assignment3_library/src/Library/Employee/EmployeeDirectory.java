/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library.Employee;
import Library.Library;
import java.util.ArrayList;

/**
 *
 * @author emi
 */
public class EmployeeDirectory {
    ArrayList<Employee> employees;
    private Library lib;
    
    public EmployeeDirectory(){
        this.employees = new ArrayList<Employee>();
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }
    
    public Employee createEmployee(int exp, String des,String name,String id, Library lib){
        Employee e = new Employee(exp,des,id);
        
        e.setPersonid(e.getEmployeeId());
        e.setName(name);
        
        e.setLibrary(lib);
        this.lib = lib;
        
        this.employees.add(e);
        return e;
    }

    public Library getLib() {
        return lib;
    }
    
    
}
