/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library.Book;

import Library.Book.Book;
import Library.Author.Author;
import Library.Genre.Genre;
import java.util.ArrayList;

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
    
    public Book addBook(String title, Author a, Genre g){
        Book book = new Book(title, a, g);
        this.books.add(book);
        
        return book;
    }
    
    public Book findBook(String title){
        for (Book b: books){
            if (b.getTitle().equals(title)){
                return b;
            }
        }
        return null;
    }
    
    
}
