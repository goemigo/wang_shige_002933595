/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import Library.Library;
import Library.User.UserAccount;
import Library.User.UserAccountDirectory;
import javax.swing.JOptionPane;

/**
 *
 * @author emi
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    
    private Library library;
    private UserAccountDirectory userAccountDirectory;
    
    public MainJFrame() {
        initComponents();
        
        this.library = Library.getLibrary();
        this.userAccountDirectory = library.getUserAccountDirectory();
        
        populateDropDown();
    }
    
    public MainJFrame(Library l, UserAccount userAccount){
        initComponents();
        this.setVisible(true);
        
        this.library = l;
        this.userAccountDirectory = library.getUserAccountDirectory();
        
        populateDropDown();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnlogin = new javax.swing.JButton();
        roleCombo = new javax.swing.JComboBox<>();
        fieldpass = new javax.swing.JTextField();
        fieldusername = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnlogin.setText("LOGIN");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        jPanel1.add(btnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 120, -1));

        jPanel1.add(roleCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 120, -1));
        jPanel1.add(fieldpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 121, -1));
        jPanel1.add(fieldusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 121, -1));

        jLabel1.setText("Welcome to Library management system");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 300, -1));

        jLabel2.setText("password");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, 20));

        jLabel3.setText("role");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 60, 20));

        jLabel5.setText("username");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, 20));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void populateDropDown(){
        for (String role: this.library.getUserAccountDirectory().getAllRoles()){
            roleCombo.addItem(role);
        }
    }
    
    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        // TODO add your handling code here:
        String username = fieldusername.getText();
        String password = fieldpass.getText();
        String role = (String) roleCombo.getSelectedItem();

        if(this.userAccountDirectory.accountExists(username, password, role)){
            UserAccount user = this.userAccountDirectory.getUserAccount(username, password, role);
            this.setVisible(false);
            user.getWorkArea(role,library,user);
        }else{
            JOptionPane.showMessageDialog(null, "invalid credentials");
        }
        
    }//GEN-LAST:event_btnloginActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlogin;
    private javax.swing.JTextField fieldpass;
    private javax.swing.JTextField fieldusername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> roleCombo;
    // End of variables declaration//GEN-END:variables
}
