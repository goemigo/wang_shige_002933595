/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RentalRequest;

import Customer.Customer;
import Library.Library;
import Library.Material.Book;
import Library.Material.Magazine;
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
    
    public RentalRequest requestRental(int duration, Book b, Magazine m, Library lib, Customer c){
        RentalRequest rr = new RentalRequest(duration, b, m, lib, c);
//        rr.setCustomer(c); 
        this.masterRequestList.add(rr);
        return rr;
    }
}
