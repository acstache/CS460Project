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
public class CustomerAccount_RentalHistory extends javax.swing.JFrame {
    private Database db;
    private User currentUser;
    /**
     * Creates new form CustomerAccount_RentalHistory
     */
    public CustomerAccount_RentalHistory(Database db, User currentUser) {
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

        rentalHistoryPanel = new javax.swing.JPanel();
        sideBarPanel = new javax.swing.JPanel();
        rentalsRULogoSmallLabel = new javax.swing.JLabel();
        blackBarPanel = new javax.swing.JPanel();
        viewPaymentHistoryToolBar = new javax.swing.JToolBar();
        deleteAccountToolBar = new javax.swing.JToolBar();
        accountInfoToolBar = new javax.swing.JToolBar();
        sideBarInfoPanel = new javax.swing.JPanel();
        viewPaymentHistoryToolBar1 = new javax.swing.JToolBar();
        ViewPaymentHistoryButton = new javax.swing.JButton();
        accountInfoToolBar1 = new javax.swing.JToolBar();
        AccountInfoButton = new javax.swing.JButton();
        deleteAccountToolBar1 = new javax.swing.JToolBar();
        deleteMyAcountButton = new javax.swing.JButton();
        toolBar = new javax.swing.JToolBar();
        homeButton = new javax.swing.JButton();
        divider1 = new javax.swing.JLabel();
        myAccountButton = new javax.swing.JButton();
        divider2 = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        rentalHistoryScollPane = new javax.swing.JScrollPane();
        rentalHistoryTablr = new javax.swing.JTable();
        rentalHistoryLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rentalHistoryPanel.setBackground(new java.awt.Color(255, 255, 255));
        rentalHistoryPanel.setMaximumSize(new java.awt.Dimension(1800, 100));
        rentalHistoryPanel.setName(""); // NOI18N
        rentalHistoryPanel.setPreferredSize(new java.awt.Dimension(18000, 1000));

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

        viewPaymentHistoryToolBar.setBackground(new java.awt.Color(153, 0, 0));
        viewPaymentHistoryToolBar.setBorder(null);
        viewPaymentHistoryToolBar.setFloatable(false);
        viewPaymentHistoryToolBar.setRollover(true);
        viewPaymentHistoryToolBar.setBorderPainted(false);

        deleteAccountToolBar.setBorder(null);
        deleteAccountToolBar.setFloatable(false);
        deleteAccountToolBar.setForeground(new java.awt.Color(255, 255, 255));
        deleteAccountToolBar.setRollover(true);
        deleteAccountToolBar.setBorderPainted(false);

        accountInfoToolBar.setBackground(new java.awt.Color(153, 0, 0));
        accountInfoToolBar.setBorder(null);
        accountInfoToolBar.setFloatable(false);
        accountInfoToolBar.setRollover(true);
        accountInfoToolBar.setBorderPainted(false);

        sideBarInfoPanel.setBackground(new java.awt.Color(153, 0, 0));

        viewPaymentHistoryToolBar1.setBackground(new java.awt.Color(153, 0, 0));
        viewPaymentHistoryToolBar1.setBorder(null);
        viewPaymentHistoryToolBar1.setFloatable(false);
        viewPaymentHistoryToolBar1.setRollover(true);
        viewPaymentHistoryToolBar1.setBorderPainted(false);

        ViewPaymentHistoryButton.setBackground(new java.awt.Color(153, 0, 0));
        ViewPaymentHistoryButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ViewPaymentHistoryButton.setForeground(new java.awt.Color(255, 255, 255));
        ViewPaymentHistoryButton.setText("View Payment History");
        ViewPaymentHistoryButton.setFocusPainted(false);
        ViewPaymentHistoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewPaymentHistoryButtonActionPerformed(evt);
            }
        });
        viewPaymentHistoryToolBar1.add(ViewPaymentHistoryButton);

        accountInfoToolBar1.setBackground(new java.awt.Color(153, 0, 0));
        accountInfoToolBar1.setBorder(null);
        accountInfoToolBar1.setFloatable(false);
        accountInfoToolBar1.setRollover(true);
        accountInfoToolBar1.setBorderPainted(false);

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
        accountInfoToolBar1.add(AccountInfoButton);

        deleteAccountToolBar1.setBackground(new java.awt.Color(153, 0, 0));
        deleteAccountToolBar1.setBorder(null);
        deleteAccountToolBar1.setFloatable(false);
        deleteAccountToolBar1.setForeground(new java.awt.Color(255, 255, 255));
        deleteAccountToolBar1.setRollover(true);
        deleteAccountToolBar1.setBorderPainted(false);

        deleteMyAcountButton.setBackground(new java.awt.Color(153, 0, 0));
        deleteMyAcountButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deleteMyAcountButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteMyAcountButton.setText("Delete My Account");
        deleteMyAcountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMyAcountButtonActionPerformed(evt);
            }
        });
        deleteAccountToolBar1.add(deleteMyAcountButton);

        javax.swing.GroupLayout sideBarInfoPanelLayout = new javax.swing.GroupLayout(sideBarInfoPanel);
        sideBarInfoPanel.setLayout(sideBarInfoPanelLayout);
        sideBarInfoPanelLayout.setHorizontalGroup(
            sideBarInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideBarInfoPanelLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(sideBarInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(accountInfoToolBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sideBarInfoPanelLayout.createSequentialGroup()
                        .addComponent(deleteAccountToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addComponent(viewPaymentHistoryToolBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        sideBarInfoPanelLayout.setVerticalGroup(
            sideBarInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideBarInfoPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(accountInfoToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(viewPaymentHistoryToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(deleteAccountToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(241, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout sideBarPanelLayout = new javax.swing.GroupLayout(sideBarPanel);
        sideBarPanel.setLayout(sideBarPanelLayout);
        sideBarPanelLayout.setHorizontalGroup(
            sideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideBarPanelLayout.createSequentialGroup()
                .addGroup(sideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sideBarPanelLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(sideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rentalsRULogoSmallLabel)
                            .addComponent(viewPaymentHistoryToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(accountInfoToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(sideBarPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(deleteAccountToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(blackBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(sideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(sideBarPanelLayout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addComponent(sideBarInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(39, Short.MAX_VALUE)))
        );
        sideBarPanelLayout.setVerticalGroup(
            sideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideBarPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(rentalsRULogoSmallLabel)
                .addGap(147, 147, 147)
                .addComponent(accountInfoToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(viewPaymentHistoryToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115)
                .addComponent(deleteAccountToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(blackBarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(sideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(sideBarPanelLayout.createSequentialGroup()
                    .addGap(258, 258, 258)
                    .addComponent(sideBarInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(329, Short.MAX_VALUE)))
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

        rentalHistoryTablr.setModel(new javax.swing.table.DefaultTableModel(
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
        rentalHistoryTablr.getTableHeader().setReorderingAllowed(false);
        rentalHistoryScollPane.setViewportView(rentalHistoryTablr);

        rentalHistoryLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/videorentalstore/gui/Image_RentalHistoryLabel.png"))); // NOI18N

        javax.swing.GroupLayout rentalHistoryPanelLayout = new javax.swing.GroupLayout(rentalHistoryPanel);
        rentalHistoryPanel.setLayout(rentalHistoryPanelLayout);
        rentalHistoryPanelLayout.setHorizontalGroup(
            rentalHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rentalHistoryPanelLayout.createSequentialGroup()
                .addComponent(sideBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(rentalHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(rentalHistoryPanelLayout.createSequentialGroup()
                        .addComponent(rentalHistoryLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(toolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rentalHistoryScollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        rentalHistoryPanelLayout.setVerticalGroup(
            rentalHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rentalHistoryPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(rentalHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rentalHistoryLabel)
                    .addComponent(toolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(148, 148, 148)
                .addComponent(rentalHistoryScollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(334, Short.MAX_VALUE))
            .addComponent(sideBarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(rentalHistoryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1497, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rentalHistoryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 999, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        dispose();
        Account_SignIn f = new Account_SignIn(db);
        f.setVisible(true);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void myAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myAccountButtonActionPerformed
        dispose();
        CustomerAccount_MyAccount f = new CustomerAccount_MyAccount(db, currentUser);
        f.setVisible(true);
    }//GEN-LAST:event_myAccountButtonActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        dispose();
        CustomerAccount_Movies f = new CustomerAccount_Movies(db, currentUser);
        f.setVisible(true);
    }//GEN-LAST:event_homeButtonActionPerformed

    private void deleteMyAcountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMyAcountButtonActionPerformed
        dispose();
        CustomerAccount_DeleteAccount f = new CustomerAccount_DeleteAccount(db, currentUser);
        f.setVisible(true);
    }//GEN-LAST:event_deleteMyAcountButtonActionPerformed

    private void AccountInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccountInfoButtonActionPerformed
        dispose();
        CustomerAccount_MyAccount f = new CustomerAccount_MyAccount(db, currentUser);
        f.setVisible(true);
    }//GEN-LAST:event_AccountInfoButtonActionPerformed

    private void ViewPaymentHistoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewPaymentHistoryButtonActionPerformed
        dispose();
        CustomerAccount_PaymentHistory f = new CustomerAccount_PaymentHistory(db, currentUser);
        f.setVisible(true);
    }//GEN-LAST:event_ViewPaymentHistoryButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerAccount_RentalHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerAccount_RentalHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerAccount_RentalHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerAccount_RentalHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerAccount_RentalHistory(db, currentUser).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AccountInfoButton;
    private javax.swing.JButton ViewPaymentHistoryButton;
    private javax.swing.JToolBar accountInfoToolBar;
    private javax.swing.JToolBar accountInfoToolBar1;
    private javax.swing.JPanel blackBarPanel;
    private javax.swing.JToolBar deleteAccountToolBar;
    private javax.swing.JToolBar deleteAccountToolBar1;
    private javax.swing.JButton deleteMyAcountButton;
    private javax.swing.JLabel divider1;
    private javax.swing.JLabel divider2;
    private javax.swing.JButton homeButton;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton myAccountButton;
    private javax.swing.JLabel rentalHistoryLabel;
    private javax.swing.JPanel rentalHistoryPanel;
    private javax.swing.JScrollPane rentalHistoryScollPane;
    private javax.swing.JTable rentalHistoryTablr;
    private javax.swing.JLabel rentalsRULogoSmallLabel;
    private javax.swing.JPanel sideBarInfoPanel;
    private javax.swing.JPanel sideBarPanel;
    private javax.swing.JToolBar toolBar;
    private javax.swing.JToolBar viewPaymentHistoryToolBar;
    private javax.swing.JToolBar viewPaymentHistoryToolBar1;
    // End of variables declaration//GEN-END:variables
}
