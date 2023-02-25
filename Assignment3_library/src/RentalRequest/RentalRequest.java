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
    private Customer customer;
    private Book book;
    private Magazine mag;
    private int duration; //days
    private static int price = 100; //price is fixed
    private String status;
    private Library lib;
    
    public RentalRequest(Customer cus, Book b, Magazine m, int duration, Library lib){
        this.count++;
        this.id = "RequestId" + this.count;
        
        this.customer = cus;
        this.book = b;
        this.mag = m;
        this.duration = duration;
        this.status = "Created";
        this.lib = lib;
    }

    public int getPrice() {
        return price;
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
