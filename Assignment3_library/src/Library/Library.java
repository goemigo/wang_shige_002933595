/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

import Library.User.UserAccountDirectory;
import Library.User.UserAccount;
import Library.Genre.GenreDirectory;
import Library.Book.BookDirectory;
import Library.Author.AuthorDirectory;
import Customer.CustomerDirectory;
import RentalRequest.MasterRentalRequestDirectory;
import Role.Role;

/**
 *
 * @author emi
 */
public class Library {
    private UserAccountDirectory userAccountDirectory;
    private AuthorDirectory authorDirectory;
    private BookDirectory bookDirectory;
    private GenreDirectory genreDirectory;
    private CustomerDirectory customerDirectory;
    private MasterRentalRequestDirectory masterRentalRequestDirectory;
    private Librarian librarian;
    
    public Library(){
        this.userAccountDirectory = new UserAccountDirectory();
        this.authorDirectory  = new AuthorDirectory();
        this.bookDirectory = new BookDirectory();
        this.genreDirectory = new GenreDirectory();
        this.customerDirectory = new CustomerDirectory();
        this.masterRentalRequestDirectory = new MasterRentalRequestDirectory();
        this.librarian = new Librarian();
        

        
        //create a manager
        UserAccount user = this.userAccountDirectory.createUserAccount("admin", "admin", "admin");
        
    }

    public static Library getLibrary(){
        return new Library();
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public AuthorDirectory getAuthorDirectory() {
        return authorDirectory;
    }

    public BookDirectory getBookDirectory() {
        return bookDirectory;
    }

    public GenreDirectory getGenreDirectory() {
        return genreDirectory;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public MasterRentalRequestDirectory getMasterRentalRequestDirectory() {
        return masterRentalRequestDirectory;
    }

    public Librarian getLibrarian() {
        return librarian;
    }
    
    
    
}
