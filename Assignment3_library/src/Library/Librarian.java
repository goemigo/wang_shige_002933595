/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

import Person.Person;
import RentalRequest.RentalRequest;
import java.util.ArrayList;

/**
 *
 * @author emi
 */
public class Librarian extends Person{
    public ArrayList<RentalRequest> requestList;
    
    public Librarian(){
        super();
        this.requestList = new ArrayList<RentalRequest>();
    }

    public ArrayList<RentalRequest> getRequestList() {
        return requestList;
    }


}
