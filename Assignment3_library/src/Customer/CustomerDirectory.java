/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Customer;

import Branch.Branch;
import Library.Employee.Employee;
import Library.User.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author emi
 */
public class CustomerDirectory {
    ArrayList<Customer> customerList;
    
    public CustomerDirectory(){
        this.customerList = new ArrayList<Customer>();
        
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public Customer findById(String id){
        for (Customer c:customerList){
            if (c.getPersonid().equals(id)){
                return c;
            }
        }
        return null;
    }
    
    public Customer createCustomer(String id, String name){
        Customer c = new Customer();
        c.setPersonid(id);
        c.setName(name);
        
        this.customerList.add(c);
        return c;
    }

}
