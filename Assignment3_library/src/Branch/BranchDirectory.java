/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Branch;

import Library.Employee.Employee;
import Library.User.UserAccount;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author emi
 */
public class BranchDirectory {
    private ArrayList<Branch> branches;
    
    public BranchDirectory(){
        this.branches = new ArrayList<Branch>();
    }
    
    public Branch addBranch(String name){
        Branch b = new Branch(name);
        this.branches.add(b);
        return b;
    }
    
    public Branch findBranch(String name){
        for (Branch b: this.getBranches()){
            if (b.getName().equals(name)){
                return b;
            }
        }
        return null;  
    }
    
    public void delBranch(Branch b){
        this.branches.remove(b);
    }
    
    public ArrayList<Branch> getBranches() {
        return branches;
    }
    
    public Branch findBranchForEmployee(UserAccount ua){
        for (Branch b: branches){
            for (Employee e: b.getLibrary().getEmployeeDirectory().getEmployees()){
                if (e.getEmployeeId().equals(ua.getAccountid())){
                    return b;
                }
            }
        }
        return null;
    }
    
}
