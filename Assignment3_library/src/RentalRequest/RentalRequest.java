/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RentalRequest;

import Customer.Customer;
import Library.Book.Book;

/**
 *
 * @author emi
 */
public class RentalRequest {
    private Book book;
    private String id;
    String status;
    Customer customer;
    private int rentalpricePerMonth = 100;
    private int duration = 1; //default 1 month
    private int totalRentalPrice;
    
    private static int count = 0;

    
    public RentalRequest(){
        this.customer = new Customer();
        this.status = "Created";
        this.count++;
        
        this.id = "RequestId" + this.count;
    }
    
    //no need to assign a librarian to a request

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        RentalRequest.count = count;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int calTotalRentalprice() {
        totalRentalPrice = this.rentalpricePerMonth*this.getDuration(); 
        return totalRentalPrice;//multiply by the duration that customer inputs
    }

    public void setRentalprice(int rentalprice) {
        this.rentalpricePerMonth = rentalprice;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
    
    
    
    @Override
    public String toString(){
        return this.id;
    }
}
