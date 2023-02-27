/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Branch;

import Library.Library;
import User.UserAccount;
import User.UserAccountDirectory;

/**
 *
 * @author emi
 */
public class Branch {
    private String name;
    private Library library;

    
    public Branch(String name){
        this.name = name;       
//        UserAccount user = this.uad.createUserAccount("admin", "admin", "admin");
    }
    
    public Library addLibrary(int buildingNo){
        return this.library = new Library(buildingNo);
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }


    @Override
    public String toString(){
        return this.name;
    }
    
    
    
    
}
