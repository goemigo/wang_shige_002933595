/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import AppSystem.AppSystem;
import Library.User.UserAccount;
import UI.AdminInterface.AdminJFrame;
import UI.LibrarianInterface.LibrarianJFrame;
import javax.swing.JFrame;

/**
 *
 * @author emi
 */
public class LibrarianRole extends Role{
    
    @Override
    public JFrame getWorkArea(AppSystem app, UserAccount ua) {
        return new LibrarianJFrame(app,ua);
    }
}
