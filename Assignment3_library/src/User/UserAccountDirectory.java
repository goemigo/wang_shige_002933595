/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

import User.UserAccount;
import Role.Role;
import java.util.ArrayList;

/**
 *
 * @author emi
 */
public class UserAccountDirectory {
    ArrayList<UserAccount> useraccountlist;
    
    public UserAccountDirectory(){
        this.useraccountlist = new ArrayList<UserAccount>();
    }
    
    public UserAccount createUserAccount(String username, String password, Role role){
        UserAccount user = new UserAccount(username, password, role);
        useraccountlist.add(user);
        return user;
        
    }
    
    public UserAccount findById(String id){
        for(UserAccount u:useraccountlist){
            if (u.getAccountid().equals(id)){
                return u;
            }
        }
        return null;
    }
    
    public UserAccount getUserAccount(String username, String password){
        for(UserAccount u:useraccountlist){
            if(u.getUsername().equals(username) && u.getPassword().equals(password) ){
                return u;
            }
        }
        return null;
    }
    
    public Boolean accountExists(String username, String password){
        for (UserAccount u:this.useraccountlist){
            if(u.getUsername().equals(username) && u.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }
    
    public Boolean checkUserNameUnique(String username){
        for (UserAccount u:this.useraccountlist){
            if(u.getUsername().equals(username)){
                return false;
            }
        }
        return true;
    }
    
    public String[] getAllRoles() {
       return Role.getRoles();
    }
}
