/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.ProGeeks.ContactsManager.GUI;

import com.ProGeeks.ContactsManager.MainClass;
import com.ProGeeks.ContactsManager.Model.Contact.Contact;
import com.ProGeeks.ContactsManager.Model.Email.Email;
import com.ProGeeks.ContactsManager.Model.Email.InvalidEmailAddressException;
import com.ProGeeks.ContactsManager.Model.PhoneNumber.InvalidPhoneNumberException;
import com.ProGeeks.ContactsManager.Model.PhoneNumber.PhoneNumber;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hady Elkatatny
 */
public class AddContactFrame extends javax.swing.JFrame {

    /**
     * Creates new form ContactDetailsFrame
     */
    Contact c;
    DefaultTableModel phoneNumbersModel;
    DefaultTableModel emailsModel;
    public AddContactFrame() throws SQLException, InvalidEmailAddressException, InvalidPhoneNumberException {
        
        initComponents();
        c = new Contact();
        init();
        PhoneNumbersTable.setModel(phoneNumbersModel);
        EmailsTable.setModel(emailsModel);
    }
    void updateUI() {
        firstNameTF.setText(c.firstName);
        lastNameTF.setText(c.lastName);
        JobTF.setText(c.jobTitle);
        PhoneNumbersTable.setModel(phoneNumbersModel);
        EmailsTable.setModel(emailsModel);
    }
    
    void init_PhoneNumbersModel() {
        phoneNumbersModel = new DefaultTableModel();
        phoneNumbersModel.addColumn("Phone Number");
        for(int i = 0;i < c.phoneNumbers.size();i++) {
            phoneNumbersModel.addRow(new Object[] { c.phoneNumbers.get(i).toString() });
        }
    }
    void init_EmailsModel() {
        emailsModel = new DefaultTableModel();
        emailsModel.addColumn("Email");
        for(int i = 0;i < c.emails.size();i++) {
            emailsModel.addRow(new Object[] { c.emails.get(i).toString() });
        }
    }
    void init() {
        
        init_PhoneNumbersModel();
        init_EmailsModel();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        DeleteBtn = new javax.swing.JButton();
        SaveBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        EmailsTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        PhoneNumbersTable = new javax.swing.JTable();
        firstNameTF = new javax.swing.JTextField();
        PhoneNumberAdd = new javax.swing.JButton();
        PhoneNumberDelete = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        PhoneNumberTF = new javax.swing.JTextField();
        EmailAdd = new javax.swing.JButton();
        EmailDelete = new javax.swing.JButton();
        EmailTF = new javax.swing.JTextField();
        JobTF = new javax.swing.JTextField();
        lastNameTF = new javax.swing.JTextField();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        DeleteBtn.setBackground(new java.awt.Color(255, 0, 0));
        DeleteBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        SaveBtn.setBackground(new java.awt.Color(0, 153, 255));
        SaveBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SaveBtn.setForeground(new java.awt.Color(255, 255, 255));
        SaveBtn.setText("Add");
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });

        EmailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(EmailsTable);

        PhoneNumbersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(PhoneNumbersTable);

        firstNameTF.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        firstNameTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        firstNameTF.setText("first");
        firstNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTFActionPerformed(evt);
            }
        });
        firstNameTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                firstNameTFKeyReleased(evt);
            }
        });

        PhoneNumberAdd.setBackground(new java.awt.Color(0, 255, 0));
        PhoneNumberAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PhoneNumberAdd.setForeground(new java.awt.Color(255, 255, 255));
        PhoneNumberAdd.setText("Add");
        PhoneNumberAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneNumberAddActionPerformed(evt);
            }
        });

        PhoneNumberDelete.setBackground(new java.awt.Color(255, 0, 0));
        PhoneNumberDelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PhoneNumberDelete.setForeground(new java.awt.Color(255, 255, 255));
        PhoneNumberDelete.setText("Delete");
        PhoneNumberDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneNumberDeleteActionPerformed(evt);
            }
        });

        jTextField3.setEditable(false);
        jTextField3.setText("+20");

        EmailAdd.setBackground(new java.awt.Color(0, 255, 0));
        EmailAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EmailAdd.setForeground(new java.awt.Color(255, 255, 255));
        EmailAdd.setText("Add");
        EmailAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailAddActionPerformed(evt);
            }
        });

        EmailDelete.setBackground(new java.awt.Color(255, 0, 0));
        EmailDelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EmailDelete.setForeground(new java.awt.Color(255, 255, 255));
        EmailDelete.setText("Delete");
        EmailDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailDeleteActionPerformed(evt);
            }
        });

        JobTF.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JobTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JobTF.setText("job title");
        JobTF.setMaximumSize(new java.awt.Dimension(18, 16));
        JobTF.setMinimumSize(new java.awt.Dimension(18, 16));
        JobTF.setPreferredSize(new java.awt.Dimension(18, 16));
        JobTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JobTFActionPerformed(evt);
            }
        });
        JobTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JobTFKeyReleased(evt);
            }
        });

        lastNameTF.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lastNameTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lastNameTF.setText("last");
        lastNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameTFActionPerformed(evt);
            }
        });
        lastNameTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lastNameTFKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DeleteBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SaveBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PhoneNumberDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PhoneNumberAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PhoneNumberTF, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(EmailDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EmailAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(EmailTF, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JobTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(firstNameTF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lastNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeleteBtn)
                    .addComponent(SaveBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(JobTF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PhoneNumberDelete)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PhoneNumberTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PhoneNumberAdd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EmailTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmailAdd)
                    .addComponent(EmailDelete))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        try {
            MainClass.manager.addContact(c);
            
        } catch (SQLException ex) {
            Logger.getLogger(AddContactFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void PhoneNumberAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneNumberAddActionPerformed
        try {
            PhoneNumber p = new PhoneNumber("20" + PhoneNumberTF.getText());
            c.phoneNumbers.add(p);
            phoneNumbersModel.addRow(new Object[] { p.toString() });
            PhoneNumberTF.setText("");
            // TODO add your handling code here:
        } catch (InvalidPhoneNumberException ex) {
            Logger.getLogger(AddContactFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_PhoneNumberAddActionPerformed

    private void PhoneNumberDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneNumberDeleteActionPerformed
        int x = 0;
        int[] s = PhoneNumbersTable.getSelectedRows();
        Arrays.sort(s);
        
        for(int i = s.length - 1;i >= 0;i--) {
            c.phoneNumbers.remove(s[i]);
        }
        
        init_PhoneNumbersModel();
        updateUI();
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneNumberDeleteActionPerformed

    private void EmailAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailAddActionPerformed
        try {
            Email e = new Email(EmailTF.getText());
            c.emails.add(e);
            emailsModel.addRow(new Object[] { e.toString() });
            EmailTF.setText("");
            // TODO add your handling code here:
        }catch (InvalidEmailAddressException ex) {
            Logger.getLogger(AddContactFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailAddActionPerformed

    private void EmailDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailDeleteActionPerformed
        int x = 0;
        int[] s = EmailsTable.getSelectedRows();
        Arrays.sort(s);
        
        for(int i = s.length - 1;i >= 0;i--) {
            c.emails.remove(s[i]);
        }
        
        init_EmailsModel();
        updateUI();

        // TODO add your handling code here:
    }//GEN-LAST:event_EmailDeleteActionPerformed

    private void JobTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JobTFActionPerformed
        
        // TODO add your handling code here:
    }//GEN-LAST:event_JobTFActionPerformed

    private void firstNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameTFActionPerformed

        
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameTFActionPerformed

    private void lastNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameTFActionPerformed
        
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameTFActionPerformed

    private void JobTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JobTFKeyReleased
        c.jobTitle = JobTF.getText();
// TODO add your handling code here:
    }//GEN-LAST:event_JobTFKeyReleased

    private void firstNameTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_firstNameTFKeyReleased
        c.firstName = firstNameTF.getText();
// TODO add your handling code here:
    }//GEN-LAST:event_firstNameTFKeyReleased

    private void lastNameTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lastNameTFKeyReleased
        c.lastName = lastNameTF.getText();
// TODO add your handling code here:
    }//GEN-LAST:event_lastNameTFKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EmailAdd;
    private javax.swing.JButton EmailDelete;
    private javax.swing.JTextField EmailTF;
    private javax.swing.JTable EmailsTable;
    private javax.swing.JTextField JobTF;
    private javax.swing.JButton PhoneNumberAdd;
    private javax.swing.JButton PhoneNumberDelete;
    private javax.swing.JTextField PhoneNumberTF;
    private javax.swing.JTable PhoneNumbersTable;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JTextField firstNameTF;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField lastNameTF;
    // End of variables declaration//GEN-END:variables
}
