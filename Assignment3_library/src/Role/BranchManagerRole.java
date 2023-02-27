/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import AppSystem.AppSystem;
import User.UserAccount;
import UI.AdminInterface.AdminJFrame;
import UI.BranchManagerInterface.BranchManagerJFrame;
import javax.swing.JFrame;

/**
 *
 * @author emi
 */
public class BranchManagerRole extends Role{
    
    @Override
    public JFrame getWorkArea(AppSystem app, UserAccount ua) {
        return new BranchManagerJFrame(app,ua);
    }
}
