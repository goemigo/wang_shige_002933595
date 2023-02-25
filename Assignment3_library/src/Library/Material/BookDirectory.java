/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library.Material;

import Library.Author.Author;
import Library.Genre.Genre;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author emi
 */
public class BookDirectory {
    ArrayList<Book> books;
    
    public BookDirectory(){
        this.books = new ArrayList<Book>();
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
    
    public Book addBook(String name, Date registerDate, Author a, Genre g, int pages, String lang, String type){
        Book book = new Book(name, registerDate, a, g, pages, lang, type);
        this.books.add(book);
        
        return book;
    }
    
    public Book findBook(String title){
        for (Book b: books){
            if (b.getName().equals(title)){
                return b;
            }
        }
        return null;
    }
    
    
}
