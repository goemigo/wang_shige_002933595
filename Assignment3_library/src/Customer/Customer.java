/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Customer;

import Library.Library;
import Library.Material.Book;
import Library.Material.Magazine;
import Person.Person;
import RentalRequest.RentalRequest;
import java.util.ArrayList;

/**
 *
 * @author emi
 */
public class Customer extends Person{
    
    private ArrayList<RentalRequest> requests;
    
    public Customer(){
        super();
        this.requests = new ArrayList<RentalRequest>();
    }
    
    public RentalRequest addRequest(Customer cus, Book b, Magazine m, int duration, Library lib){
        RentalRequest rr = new RentalRequest(this,b,m,duration,lib);
        this.requests.add(rr);
        
        return rr;
    }

    public ArrayList<RentalRequest> getRequests() {
        return requests;
    }
    
    public RentalRequest findRequest(String id){
        for (RentalRequest rr: this.requests){
            if (rr.getId().equals(id)){
                return rr;
            }
        }
        return null;
    }
}
