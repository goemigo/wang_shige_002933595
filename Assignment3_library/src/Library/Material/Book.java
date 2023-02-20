/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library.Material;

import Library.Author.Author;
import Library.Genre.Genre;
import java.util.Date;

/**
 *
 * @author emi
 */
public class Book extends Material{
    private Author author;
    private Genre genre;
    private int pages;
    private String language;
    private String bindingType;
    
    public Book(String name, Date registerDate, boolean isAvail, Author a, Genre g, int pages, String lang, String type){
        super();
        this.name = name;
        this.registerDate = registerDate;
        this.isAvailable = isAvail;
        this.author = a;
        this.genre = g;
        this.pages = pages;
        this.language = lang;
        this.bindingType = type;
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

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }
    
    
    

    
}
