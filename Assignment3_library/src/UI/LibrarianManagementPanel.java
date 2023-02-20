/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Customer.Customer;
import Library.Employee.Librarian;
import Library.Library;
import Library.User.UserAccount;
import Library.User.UserAccountDirectory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author emi
 */
public class LibrarianManagementPanel extends javax.swing.JPanel {

    /**
     * Creates new form LibrarianManagementPanel
     */
    private Library library;
    private UserAccount ua;
    
    public LibrarianManagementPanel() {
        initComponents();
    }
    
    public LibrarianManagementPanel(Library l, UserAccount ua) {
        initComponents();
        
        this.library = l;
        this.ua = ua;
      
        
 
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fieldusername1 = new javax.swing.JTextField();
        fieldPassword1 = new javax.swing.JTextField();
        fieldname1 = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(fieldusername1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 120, 30));
        add(fieldPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 120, 30));
        add(fieldname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 120, 30));

        addBtn.setText("ADD LIBRARIAN");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, -1, -1));

        jLabel5.setText("name");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, 20));

        jLabel2.setText("password");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, 20));

        jLabel6.setText("username");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:

        UserAccountDirectory ua = this.library.getUserAccountDirectory();

        if(ua.accountExists(fieldusername1.getText(), fieldPassword1.getText(), "librarian")) {
            JOptionPane.showMessageDialog(null, "Sorry credentials are taken.");
        }
        else {
            
            UserAccount user = this.library.getUserAccountDirectory().createUserAccount(fieldusername1.getText(), fieldPassword1.getText(), "librarian");
            this.library.getLibrarian().setPersonid(user.getAccountid());
            this.library.getLibrarian().setName(fieldname1.getText());

   
        }
    }//GEN-LAST:event_addBtnActionPerformed

        
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField fieldPassword1;
    private javax.swing.JTextField fieldname1;
    private javax.swing.JTextField fieldusername1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
