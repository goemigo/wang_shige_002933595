/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library.Book;

import Library.Author.Author;
import Library.Genre.Genre;

/**
 *
 * @author emi
 */
public class Book {
    private String title;
    private Author author;
    private Genre genre;
    
    public Book(String title, Author a, Genre g){
        this.title = title;
        this.author = a;
        this.genre = g;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
    
    @Override
    public String toString(){
        return this.title;
    }
    
}
