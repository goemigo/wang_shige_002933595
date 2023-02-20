/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library.Author;

import Library.Author.Author;
import java.util.ArrayList;

/**
 *
 * @author emi
 */
public class AuthorDirectory {
    ArrayList<Author> authors;
    
    public AuthorDirectory(){
        this.authors = new ArrayList<Author>();
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }
    
    public Author addAuthor(String name){
        Author author = new Author(name);
        for(Author a: this.authors){
            if (!a.getName().equals(name)){
                this.authors.add(author);
            }
        }

        return author;
    }
    
    public Author findAuthor(String name){
        for (Author a: this.authors){
            if (a.getName().equals(name)){
                return a;
            }
        }
        return null;
    }
}
