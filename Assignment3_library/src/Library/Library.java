/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

import Library.Employee.Librarian;
import User.UserAccountDirectory;
import User.UserAccount;
import Library.Genre.GenreDirectory;
import Library.Material.BookDirectory;
import Library.Author.AuthorDirectory;
import Customer.CustomerDirectory;
import Library.Employee.EmployeeDirectory;
import Library.Material.MagazineDirectory;
import RentalRequest.MasterRentalRequestDirectory;
import Role.Role;

/**
 *
 * @author emi
 */
public class Library {
    private int buildingNo;
//    private UserAccountDirectory userAccountDirectory;
    private AuthorDirectory authorDirectory;
    private BookDirectory bookDirectory;
    private MagazineDirectory magazineDirectory;
    private GenreDirectory genreDirectory;
//    private CustomerDirectory customerDirectory;
    private MasterRentalRequestDirectory masterRentalRequestDirectory;
    private Librarian librarian;
    private EmployeeDirectory employeeDirectory;
//    private RentalRequestDirectory rentalRequestDirectory;
    
    public Library(int no){
        this.buildingNo = no;
//        this.userAccountDirectory = new UserAccountDirectory();
        this.authorDirectory  = new AuthorDirectory();
        this.bookDirectory = new BookDirectory();
        this.magazineDirectory = new MagazineDirectory();
        this.genreDirectory = new GenreDirectory();
//        this.customerDirectory = new CustomerDirectory();
        this.masterRentalRequestDirectory = new MasterRentalRequestDirectory();
        this.librarian = new Librarian();
        this.employeeDirectory = new EmployeeDirectory();
        
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    
    public int getBuildingNo() {
        return buildingNo;
    }

//    public static Library getLibrary(){
//        return new Library();
//    }
    public void setBuildingNo(int buildingNo) {    
        this.buildingNo = buildingNo;
    }

//    public UserAccountDirectory getUserAccountDirectory() {
//        return userAccountDirectory;
//    }

    public AuthorDirectory getAuthorDirectory() {
        return authorDirectory;
    }

    public BookDirectory getBookDirectory() {
        return bookDirectory;
    }

    public GenreDirectory getGenreDirectory() {
        return genreDirectory;
    }

//    public CustomerDirectory getCustomerDirectory() {
//        return customerDirectory;
//    }
//
    public MasterRentalRequestDirectory getMasterRentalRequestDirectory() {
        return masterRentalRequestDirectory;
    }

    public Librarian getLibrarian() {
        return librarian;
    }

    public MagazineDirectory getMagazineDirectory() {
        return magazineDirectory;
    }
    
    @Override
    public String toString(){
        return String.valueOf(this.buildingNo);
    }

    
}
