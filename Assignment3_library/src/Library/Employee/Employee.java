/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library.Employee;

/**
 *
 * @author emi
 */
public class Employee {
    private static int count = 0;
    private String employeeId;
    private int experience;
    private String designation; //librarian or branch manager
    
    public Employee(){
        this.employeeId = "ACC" + count++; 
    }
    
    public Employee(int exp, String des){
        this.employeeId = des + count++;
        this.experience = exp;
        this.designation = des;
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
