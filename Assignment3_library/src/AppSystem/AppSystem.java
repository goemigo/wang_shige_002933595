package AppSystem;

import Branch.Branch;
import Branch.BranchDirectory;
import Customer.CustomerDirectory;
import Library.Employee.EmployeeDirectory;
import Library.User.UserAccount;
import Library.User.UserAccountDirectory;
import Role.AdminRole;

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
    BranchDirectory branchDirectory;   
    UserAccountDirectory uad;
    
    public AppSystem(){
        this.customerDirectory = new CustomerDirectory();
        this.branchDirectory = new BranchDirectory();
        this.uad = new UserAccountDirectory();
        
        UserAccount user = this.uad.createUserAccount("a", "a", new AdminRole());
    }
    
    public static AppSystem getAppSystem(){
        return new AppSystem();
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }
    
    public UserAccountDirectory getUad() {
        return uad;
    }

    public void setUad(UserAccountDirectory uad) {
        this.uad = uad;
    }

    public BranchDirectory getBranchDirectory() {
        return branchDirectory;
    }
    
    
    
}
