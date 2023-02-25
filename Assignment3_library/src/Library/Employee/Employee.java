/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library.Employee;

import Library.Library;
import Person.Person;

/**
 *
 * @author emi
 */
public class Employee extends Person{
//    private static int count = 0;
    
    private String employeeId;
    private int experience;
    private String designation; //librarian or branch manager
    
    private Library lib; //employee belongs to a certain library
    
//    public Employee(){
//        super();
//        this.employeeId = "ACC" + count++; 
//    }
    
    public Employee(int exp, String des, String id){
        super();
        this.employeeId = id; //this will be the same as user account id, which is static
//        this.employeeId = des + count++;
        this.experience = exp;
        this.designation = des;
    }
    
    public void setLibrary(Library lib){
        this.lib = lib;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    
    @Override
    public String toString(){
        return this.employeeId;
    }
}
