/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import Library.Library;
import Library.User.UserAccount;
import javax.swing.JFrame;

/**
 *
 * @author emi
 */
public abstract class Role {
    static String[] roles = {"admin","customer","librarian","branchManager"};
    
    public static String[] getRoles(){
        return roles;
    }
    
    public abstract JFrame getWorkArea(Library l, UserAccount ua);
}
