/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library.Genre;

import Library.Genre.Genre;
import java.util.ArrayList;

/**
 *
 * @author emi
 */
public class GenreDirectory {
    ArrayList<Genre> genres;
    
    public GenreDirectory(){
        this.genres = new ArrayList<Genre>();
        
    }
    
    public Genre addGenre(String g){
        Genre genre = new Genre(g);
        
        for(Genre ge: this.genres){
            if (!ge.getGenre().equals(g)){
                this.genres.add(genre);
            }
        }

        return genre;
    }

    public ArrayList<Genre> getGenres() {
        return genres;
    }

    public Genre findGenre(String name) {
        for (Genre g: this.genres){
            if(g.getGenre().equals(name)){
                return g;
            }
        }
        return null;
    }    
    
    
}
