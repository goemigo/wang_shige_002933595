/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.BranchManagerInterface;

import UI.LibrarianInterface.*;
import AppSystem.AppSystem;
import Branch.Branch;
import Library.Library;
import RentalRequest.RentalRequest;
import User.UserAccount;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author emi
 */
public class BranchRentalRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageRentalRequestJPanel
     */
    private AppSystem app;
    private UserAccount ua;
    private DefaultTableModel tableModel;
    private Branch currentBranch;
    private Library currentLib;
    
    public BranchRentalRequestJPanel(AppSystem app,UserAccount ua) {
        initComponents();
        this.setVisible(true);
        
        this.app = app;
        this.ua = ua;
        this.tableModel = (DefaultTableModel) requestTable.getModel();
        this.currentBranch = app.getBranchDirectory().findBranchForEmployee(ua);
        
        this.currentLib = currentBranch.getLibrary();
        
        populate();
        
        //show total revenue for branch
        int rev = calBranchRevenue();
        fieldrev.setText(String.valueOf(rev));
    }
    
    public void populate(){
        if (this.currentLib.getMasterRentalRequestDirectory().getMasterRequestList().size()>0){
            tableModel.setRowCount(0);
            for (RentalRequest rr : this.currentLib.getMasterRentalRequestDirectory().getMasterRequestList()) {

                Object[] row = new Object[8];

                row[0] = rr;
                row[1] = rr.getCustomer().getPersonid();
                row[2] = (rr.getBook() == null) ? "N/A" : rr.getBook().getName(); 
                row[3] = (rr.getMag() == null) ? "N/A" :rr.getMag().getName();
                row[4] = rr.getDuration();
                row[5] = rr.getPrice();
                row[6] = rr.getStatus();
                row[7] = rr.getLib();

                tableModel.addRow(row);
            }
        }   
    }
    
    public int calBranchRevenue(){
        int rev = 0;
        for (RentalRequest rr : this.currentLib.getMasterRentalRequestDirectory().getMasterRequestList()) {
            //only requests that are approved or returned count for revenue
            if(rr.getStatus().equals("Approved") || rr.getStatus().equals("Returned")){
                rev += rr.getPrice();
            }
        }
        return rev;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        requestTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        fieldrev = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 255));

        requestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Id", "Customer Id", "Book", "Magazine", "Duration", "Price", "Status", "Library"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(requestTable);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel1.setText("Total Revenue: ");

        fieldrev.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(272, 272, 272)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldrev, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(fieldrev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fieldrev;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable requestTable;
    // End of variables declaration//GEN-END:variables
}
