/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import Library.Library;
import Library.User.UserAccount;
import Person.Person;
import UI.LibrarianJFrame;
import javax.swing.JFrame;

/**
 *
 * @author emi
 */
public class LibrarianRole extends Person{
    private Library library;
    private UserAccount ua;
    
    public JFrame getWorkArea(Library l, UserAccount ua){
        return new LibrarianJFrame(l,ua);
    }
}
