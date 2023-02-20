package AppSystem;

import Branch.Branch;
import Customer.CustomerDirectory;
import Library.Employee.EmployeeDirectory;
import Library.User.UserAccount;
import Library.User.UserAccountDirectory;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author emi
 */
public class AppSystem {
    private CustomerDirectory customerDirectory;
    Branch branch;   
    
    public AppSystem(){
        
        UserAccount user = this.getBranch().getUad().createUserAccount("admin", "admin", "admin");
    }
    
    public static AppSystem getAppSystem(){
        return new AppSystem();
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public Branch getBranch() {
        return branch;
    }
    
    
}
