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

}
