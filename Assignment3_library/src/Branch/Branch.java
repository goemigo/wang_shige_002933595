/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Branch;

import Library.Library;
import Library.User.UserAccount;
import Library.User.UserAccountDirectory;

/**
 *
 * @author emi
 */
public class Branch {
    private String name;
    private Library library;
    UserAccountDirectory uad;
    
    public Branch(String name, int buildingNo){
        this.name = name;
        this.library = new Library(buildingNo);
        this.uad = new UserAccountDirectory();
        
//        UserAccount user = this.uad.createUserAccount("admin", "admin", "admin");
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

    public UserAccountDirectory getUad() {
        return uad;
    }

    public void setUad(UserAccountDirectory uad) {
        this.uad = uad;
    }
    
    
    
    
    
}
