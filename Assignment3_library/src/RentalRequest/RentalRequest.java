/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RentalRequest;

import Customer.Customer;
import Library.Library;
import Library.Material.Book;
import Library.Material.Magazine;

/**
 *
 * @author emi
 */
public class RentalRequest {
    private static int count = 0;
    private String id;
    Customer customer;
    private static int price = 100; //price no change
    String status;
    private int duration = 1; //default 1 week
    private Book book;
    private Magazine mag;
    private Library lib;
    
    public RentalRequest(int duration, Book b, Magazine m, Library lib, Customer cus){
        this.count++;
        this.id = "RequestId" + this.count;
        
//        this.customer = new Customer();
        this.status = "Created";
        
        this.customer = cus;
        this.duration = duration;
        this.book = b;
        this.mag = mag;
        this.lib = lib;
    }

    public static int getPrice() {
        return price;
    }

    public static void setPrice(int price) {
        RentalRequest.price = price;
    }

    public Magazine getMag() {
        return mag;
    }

    public void setMag(Magazine mag) {
        this.mag = mag;
    }

    public Library getLib() {
        return lib;
    }

    public void setLib(Library lib) {
        this.lib = lib;
    }
    
    

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
