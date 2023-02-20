/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library.User;

import Library.Library;
import UI.AdminJFrame;
import UI.CustomerJFrame;
import UI.LibrarianJFrame;
import javax.swing.JFrame;

/**
 *
 * @author emi
 */
public class UserAccount {
    private static int count = 0;
    private String accountid;
    private String username;
    private String password;
    
    private String role;
    
    public UserAccount(){
        this.accountid = "ACC" + count++; //for when there is no actual user
        this.username = username;
        this.password = password;
        this.role = role;
    }
    
    public UserAccount(String username, String password, String role){ //for when real users register
        this.accountid = role + count++;
        this.username = username;
        this.password = password;
        this.role = role;
    }
    
    public static int getCount(){
        return count;
    }
    
    public static void setCount(int count){
        UserAccount.count = count;
    }

    public String getAccountid() {
        return accountid;
    }

    public void setAccountid(String accountid) {
        this.accountid = accountid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
        
    public JFrame getWorkArea(String role, Library l, UserAccount u){
        if (role.equals("admin")){
            return new AdminJFrame(l,u);
        }
        if (role.equals("customer")){
            return new CustomerJFrame(l,u);
        }
        if (role.equals("librarian")){
            return new LibrarianJFrame(l,u);
        }
        return null;
        
    }
    
}
