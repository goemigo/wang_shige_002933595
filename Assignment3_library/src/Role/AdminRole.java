/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import Library.Library;
import Library.User.UserAccount;
import UI.LibrarianJFrame;
import javax.swing.JFrame;

/**
 *
 * @author emi
 */
public class AdminRole extends Role{
    private Library library;
    private UserAccount ua;

    @Override
    public JFrame getWorkArea(Library l, UserAccount ua) {
        return new LibrarianJFrame(l, ua);
    }
    
}
