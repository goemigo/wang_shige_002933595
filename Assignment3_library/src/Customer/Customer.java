/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Customer;

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
    
    public void addRequest(RentalRequest rr){
        this.requests.add(rr);
    }

    public ArrayList<RentalRequest> getRequests() {
        return requests;
    }
    
    
}
