/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package videorentalstore.gui;

import videorentalstore.User.User;
import videorentalstore.database.Database;

/**
 *
 * @author Ashley
 */
public class CustomerAccount_PaymentHistory extends javax.swing.JFrame {
    private Database db;
    private User currentUser;
    /**
     * Creates new form CustomerAccount_PaymentHistory
     */
    public CustomerAccount_PaymentHistory(Database db, User currentUser) {
        initComponents();
        this.db = db;
        this.currentUser = currentUser;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paymentHistoryPanel = new javax.swing.JPanel();
        sideBarPanel = new javax.swing.JPanel();
        rentalsRULogoSmallLabel = new javax.swing.JLabel();
        blackBarPanel = new javax.swing.JPanel();
        sideBarInfoPanel = new javax.swing.JPanel();
        accountInfoToolBar = new javax.swing.JToolBar();
        AccountInfoButton = new javax.swing.JButton();
        viewRentalHistoryToolBar = new javax.swing.JToolBar();
        viewRentalHistoryButton = new javax.swing.JButton();
        deleteAccountToolBar = new javax.swing.JToolBar();
        deleteMyAcountButton = new javax.swing.JButton();
        toolBar = new javax.swing.JToolBar();
        homeButton = new javax.swing.JButton();
        divider1 = new javax.swing.JLabel();
        myAccountButton = new javax.swing.JButton();
        divider2 = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        paymentHistorSycollPane = new javax.swing.JScrollPane();
        paymentHistoryTable = new javax.swing.JTable();
        paymentHistoryLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1800, 1000));
        setPreferredSize(new java.awt.Dimension(1800, 1000));

        paymentHistoryPanel.setBackground(new java.awt.Color(255, 255, 255));
        paymentHistoryPanel.setMaximumSize(new java.awt.Dimension(1800, 100));
        paymentHistoryPanel.setName(""); // NOI18N
        paymentHistoryPanel.setPreferredSize(new java.awt.Dimension(18000, 1000));

        sideBarPanel.setBackground(new java.awt.Color(153, 0, 0));

        rentalsRULogoSmallLabel.setBackground(new java.awt.Color(153, 0, 0));
        rentalsRULogoSmallLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/videorentalstore/gui/Image_Rent4ULogoSmall.jpg"))); // NOI18N

        blackBarPanel.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout blackBarPanelLayout = new javax.swing.GroupLayout(blackBarPanel);
        blackBarPanel.setLayout(blackBarPanelLayout);
        blackBarPanelLayout.setHorizontalGroup(
            blackBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        blackBarPanelLayout.setVerticalGroup(
            blackBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        sideBarInfoPanel.setBackground(new java.awt.Color(153, 0, 0));

        accountInfoToolBar.setBackground(new java.awt.Color(153, 0, 0));
        accountInfoToolBar.setBorder(null);
        accountInfoToolBar.setFloatable(false);
        accountInfoToolBar.setRollover(true);
        accountInfoToolBar.setBorderPainted(false);

        AccountInfoButton.setBackground(new java.awt.Color(153, 0, 0));
        AccountInfoButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AccountInfoButton.setForeground(new java.awt.Color(255, 255, 255));
        AccountInfoButton.setText("Account Information");
        AccountInfoButton.setFocusPainted(false);
        AccountInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccountInfoButtonActionPerformed(evt);
            }
        });
        accountInfoToolBar.add(AccountInfoButton);

        viewRentalHistoryToolBar.setBackground(new java.awt.Color(153, 0, 0));
        viewRentalHistoryToolBar.setBorder(null);
        viewRentalHistoryToolBar.setFloatable(false);
        viewRentalHistoryToolBar.setForeground(new java.awt.Color(255, 255, 255));
        viewRentalHistoryToolBar.setRollover(true);
        viewRentalHistoryToolBar.setBorderPainted(false);

        viewRentalHistoryButton.setBackground(new java.awt.Color(153, 0, 0));
        viewRentalHistoryButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        viewRentalHistoryButton.setForeground(new java.awt.Color(255, 255, 255));
        viewRentalHistoryButton.setText("View Rental History");
        viewRentalHistoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRentalHistoryButtonActionPerformed(evt);
            }
        });
        viewRentalHistoryToolBar.add(viewRentalHistoryButton);

        deleteAccountToolBar.setBackground(new java.awt.Color(153, 0, 0));
        deleteAccountToolBar.setBorder(null);
        deleteAccountToolBar.setFloatable(false);
        deleteAccountToolBar.setForeground(new java.awt.Color(255, 255, 255));
        deleteAccountToolBar.setRollover(true);
        deleteAccountToolBar.setBorderPainted(false);

        deleteMyAcountButton.setBackground(new java.awt.Color(153, 0, 0));
        deleteMyAcountButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deleteMyAcountButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteMyAcountButton.setText("Delete My Account");
        deleteMyAcountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMyAcountButtonActionPerformed(evt);
            }
        });
        deleteAccountToolBar.add(deleteMyAcountButton);

        javax.swing.GroupLayout sideBarInfoPanelLayout = new javax.swing.GroupLayout(sideBarInfoPanel);
        sideBarInfoPanel.setLayout(sideBarInfoPanelLayout);
        sideBarInfoPanelLayout.setHorizontalGroup(
            sideBarInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideBarInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sideBarInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sideBarInfoPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(accountInfoToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sideBarInfoPanelLayout.createSequentialGroup()
                        .addGroup(sideBarInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(viewRentalHistoryToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteAccountToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        sideBarInfoPanelLayout.setVerticalGroup(
            sideBarInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideBarInfoPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(accountInfoToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(viewRentalHistoryToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(deleteAccountToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout sideBarPanelLayout = new javax.swing.GroupLayout(sideBarPanel);
        sideBarPanel.setLayout(sideBarPanelLayout);
        sideBarPanelLayout.setHorizontalGroup(
            sideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideBarPanelLayout.createSequentialGroup()
                .addGroup(sideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sideBarPanelLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(rentalsRULogoSmallLabel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sideBarPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(sideBarInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(blackBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        sideBarPanelLayout.setVerticalGroup(
            sideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideBarPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(rentalsRULogoSmallLabel)
                .addGap(117, 117, 117)
                .addComponent(sideBarInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(750, Short.MAX_VALUE))
            .addComponent(blackBarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        toolBar.setBackground(new java.awt.Color(255, 255, 255));
        toolBar.setBorder(null);
        toolBar.setFloatable(false);
        toolBar.setRollover(true);
        toolBar.setBorderPainted(false);

        homeButton.setBackground(new java.awt.Color(255, 255, 255));
        homeButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        homeButton.setText("Home");
        homeButton.setBorderPainted(false);
        homeButton.setFocusable(false);
        homeButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        homeButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });
        toolBar.add(homeButton);

        divider1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        divider1.setText("  |  ");
        toolBar.add(divider1);

        myAccountButton.setBackground(new java.awt.Color(255, 255, 255));
        myAccountButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        myAccountButton.setText("My Account");
        myAccountButton.setFocusable(false);
        myAccountButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        myAccountButton.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        myAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myAccountButtonActionPerformed(evt);
            }
        });
        toolBar.add(myAccountButton);

        divider2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        divider2.setText("  |  ");
        toolBar.add(divider2);

        logoutButton.setBackground(new java.awt.Color(255, 255, 255));
        logoutButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logoutButton.setText("Logout");
        logoutButton.setFocusable(false);
        logoutButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logoutButton.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        logoutButton.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });
        toolBar.add(logoutButton);

        paymentHistoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Movie", "Rental Price", "Late Fee", "Rented", "Returned", "Paid On"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        paymentHistoryTable.getTableHeader().setReorderingAllowed(false);
        paymentHistorSycollPane.setViewportView(paymentHistoryTable);

        paymentHistoryLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/videorentalstore/gui/Image_PaymentHistoryLabel.png"))); // NOI18N

        javax.swing.GroupLayout paymentHistoryPanelLayout = new javax.swing.GroupLayout(paymentHistoryPanel);
        paymentHistoryPanel.setLayout(paymentHistoryPanelLayout);
        paymentHistoryPanelLayout.setHorizontalGroup(
            paymentHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paymentHistoryPanelLayout.createSequentialGroup()
                .addComponent(sideBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(paymentHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paymentHistoryPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(paymentHistoryLabel)
                        .addGap(692, 692, 692)
                        .addComponent(toolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paymentHistoryPanelLayout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(paymentHistorSycollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1025, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        paymentHistoryPanelLayout.setVerticalGroup(
            paymentHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paymentHistoryPanelLayout.createSequentialGroup()
                .addGroup(paymentHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sideBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(paymentHistoryPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(paymentHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(paymentHistoryLabel)
                            .addComponent(toolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(164, 164, 164)
                        .addComponent(paymentHistorSycollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(paymentHistoryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paymentHistoryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1001, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewRentalHistoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRentalHistoryButtonActionPerformed
        dispose();
        CustomerAccount_RentalHistory f = new CustomerAccount_RentalHistory(db, currentUser);
        f.setVisible(true);
    }//GEN-LAST:event_viewRentalHistoryButtonActionPerformed

    private void deleteMyAcountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMyAcountButtonActionPerformed
        dispose();
        CustomerAccount_DeleteAccount f = new CustomerAccount_DeleteAccount(db, currentUser);
        f.setVisible(true);
    }//GEN-LAST:event_deleteMyAcountButtonActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        dispose();
        CustomerAccount_Movies f = new CustomerAccount_Movies(db, currentUser);
        f.setVisible(true);
    }//GEN-LAST:event_homeButtonActionPerformed

    private void myAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myAccountButtonActionPerformed
        dispose();
        CustomerAccount_MyAccount f = new CustomerAccount_MyAccount(db, currentUser);
        f.setVisible(true);
    }//GEN-LAST:event_myAccountButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        dispose();
        Account_SignIn f = new Account_SignIn(db);
        f.setVisible(true);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void AccountInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccountInfoButtonActionPerformed
        dispose();
        CustomerAccount_MyAccount f = new CustomerAccount_MyAccount(db, currentUser);
        f.setVisible(true);
    }//GEN-LAST:event_AccountInfoButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public void main(String args[]) {
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
            java.util.logging.Logger.getLogger(CustomerAccount_PaymentHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerAccount_PaymentHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerAccount_PaymentHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerAccount_PaymentHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerAccount_PaymentHistory(db, currentUser).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AccountInfoButton;
    private javax.swing.JToolBar accountInfoToolBar;
    private javax.swing.JPanel blackBarPanel;
    private javax.swing.JToolBar deleteAccountToolBar;
    private javax.swing.JButton deleteMyAcountButton;
    private javax.swing.JLabel divider1;
    private javax.swing.JLabel divider2;
    private javax.swing.JButton homeButton;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton myAccountButton;
    private javax.swing.JScrollPane paymentHistorSycollPane;
    private javax.swing.JLabel paymentHistoryLabel;
    private javax.swing.JPanel paymentHistoryPanel;
    private javax.swing.JTable paymentHistoryTable;
    private javax.swing.JLabel rentalsRULogoSmallLabel;
    private javax.swing.JPanel sideBarInfoPanel;
    private javax.swing.JPanel sideBarPanel;
    private javax.swing.JToolBar toolBar;
    private javax.swing.JButton viewRentalHistoryButton;
    private javax.swing.JToolBar viewRentalHistoryToolBar;
    // End of variables declaration//GEN-END:variables
}
