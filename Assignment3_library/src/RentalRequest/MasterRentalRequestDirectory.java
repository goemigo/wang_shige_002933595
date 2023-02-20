/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RentalRequest;

import Customer.Customer;
import java.util.ArrayList;

/**
 *
 * @author emi
 */
public class MasterRentalRequestDirectory {
    private ArrayList<RentalRequest> masterRequestList;
    
    public MasterRentalRequestDirectory(){
        this.masterRequestList = new ArrayList<RentalRequest>();
    }

    public ArrayList<RentalRequest> getMasterRequestList() {
        return masterRequestList;
    }
    
    public RentalRequest requestRental(Customer c){
        RentalRequest rr = new RentalRequest();
        rr.setCustomer(c); 
        
        this.masterRequestList.add(rr);
        return rr;
    }
}
