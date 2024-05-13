/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.ProGeeks.ContactsManager.GUI;

import com.ProGeeks.ContactsManager.MainClass;

/**
 *
 * @author Hady Elkatatny
 */
public class MainContactsList extends javax.swing.JFrame {

    /**
     * Creates new form GUI1
     */
    
    
    public MainContactsList() {
        initComponents();
        menu.add(panel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        deletebutton = new javax.swing.JButton();
        updatabutton = new javax.swing.JButton();
        menu = new javax.swing.JPopupMenu();
        addContact1 = new javax.swing.JButton();
        searchbar1 = new javax.swing.JTextField();
        searchLabel1 = new javax.swing.JLabel();
        printContacts1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jScrollPane1.setViewportView(jList1);

        deletebutton.setBackground(new java.awt.Color(255, 0, 0));
        deletebutton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deletebutton.setText("Delete");

        updatabutton.setBackground(new java.awt.Color(51, 204, 0));
        updatabutton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        updatabutton.setForeground(new java.awt.Color(255, 255, 255));
        updatabutton.setText("Update");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(deletebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(updatabutton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deletebutton, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(updatabutton, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(11, 11, 11))
        );

        menu.setFocusable(false);

        addContact1.setBackground(new java.awt.Color(115, 115, 115));
        addContact1.setForeground(new java.awt.Color(0, 0, 0));
        addContact1.setText("Add Contact");
        addContact1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addContact1ActionPerformed(evt);
            }
        });

        searchbar1.setBackground(new java.awt.Color(204, 204, 204));
        searchbar1.setForeground(new java.awt.Color(0, 0, 0));
        searchbar1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                searchbar1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        searchbar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbar1ActionPerformed(evt);
            }
        });
        searchbar1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchbar1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchbar1KeyTyped(evt);
            }
        });

        searchLabel1.setText("Search");

        printContacts1.setBackground(new java.awt.Color(200, 200, 200));
        printContacts1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        printContacts1.setForeground(new java.awt.Color(0, 0, 0));
        printContacts1.setText("Print");
        printContacts1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        printContacts1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                printContacts1ComponentShown(evt);
            }
        });
        printContacts1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printContacts1ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 0, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Quit");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(printContacts1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(searchLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchbar1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addContact1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchbar1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchLabel1)
                        .addComponent(addContact1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(printContacts1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addContact1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addContact1ActionPerformed
      AddContact addcon =new AddContact();
      addcon.show();
        // TODO add your handling code here:
    }//GEN-LAST:event_addContact1ActionPerformed

    private void searchbar1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_searchbar1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_searchbar1AncestorAdded

    private void printContacts1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_printContacts1ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_printContacts1ComponentShown

    private void searchbar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbar1ActionPerformed
// TODO add your handling code here:
    }//GEN-LAST:event_searchbar1ActionPerformed

    private void printContacts1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printContacts1ActionPerformed
 ContactsList printall = new ContactsList(); 
 printall.show(); // TODO add your handling code here:
    }//GEN-LAST:event_printContacts1ActionPerformed

    private void searchbar1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchbar1KeyReleased
// Event > key released
    String search = searchbar1.getText().trim();
    if (!search.equals("")){
    System.out.println(search);
    } 
    menu.show(searchbar1,0,searchbar1.getHeight());        
    }//GEN-LAST:event_searchbar1KeyReleased

    private void searchbar1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchbar1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_searchbar1KeyTyped

    /**
     * @param args the command line arguments
     */
    public void start_ui() {
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
            java.util.logging.Logger.getLogger(AddContact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddContact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddContact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddContact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainContactsList().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addContact1;
    private javax.swing.JButton deletebutton;
    private javax.swing.JButton jButton1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu menu;
    private javax.swing.JPanel panel;
    private javax.swing.JButton printContacts1;
    private javax.swing.JLabel searchLabel1;
    private javax.swing.JTextField searchbar1;
    private javax.swing.JButton updatabutton;
    // End of variables declaration//GEN-END:variables
}
