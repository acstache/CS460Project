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
public class CustomerAccount_MakePayment extends javax.swing.JFrame {
    private Database db;
    private User currentUser;
    /**
     * Creates new form CustomerAccount_MakePayment
     */
    public CustomerAccount_MakePayment(Database db, User currentUser) {
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

        makePaymentPanel = new javax.swing.JPanel();
        sideBarPanel = new javax.swing.JPanel();
        rentalsRULogoSmallLabel = new javax.swing.JLabel();
        blackBarPanel = new javax.swing.JPanel();
        viewPaymentHistoryToolBar = new javax.swing.JToolBar();
        viewRentalHistoryToolBar = new javax.swing.JToolBar();
        deleteAccountToolBar = new javax.swing.JToolBar();
        toolBar = new javax.swing.JToolBar();
        homeButton = new javax.swing.JButton();
        divider1 = new javax.swing.JLabel();
        myAccountButton = new javax.swing.JButton();
        divider2 = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        paymentlPolicyPanel = new javax.swing.JPanel();
        paymentTxt1 = new javax.swing.JLabel();
        payButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        rentalPolicyLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1800, 1000));
        setMinimumSize(new java.awt.Dimension(1800, 1000));
        setPreferredSize(new java.awt.Dimension(1800, 1000));

        makePaymentPanel.setBackground(new java.awt.Color(255, 255, 255));
        makePaymentPanel.setMaximumSize(new java.awt.Dimension(1800, 100));
        makePaymentPanel.setName(""); // NOI18N
        makePaymentPanel.setPreferredSize(new java.awt.Dimension(18000, 1000));

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

        viewRentalHistoryToolBar.setBorder(null);
        viewRentalHistoryToolBar.setFloatable(false);
        viewRentalHistoryToolBar.setForeground(new java.awt.Color(255, 255, 255));
        viewRentalHistoryToolBar.setRollover(true);
        viewRentalHistoryToolBar.setBorderPainted(false);

        deleteAccountToolBar.setBorder(null);
        deleteAccountToolBar.setFloatable(false);
        deleteAccountToolBar.setForeground(new java.awt.Color(255, 255, 255));
        deleteAccountToolBar.setRollover(true);
        deleteAccountToolBar.setBorderPainted(false);

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
                            .addComponent(viewRentalHistoryToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(sideBarPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(deleteAccountToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 32, Short.MAX_VALUE)
                .addComponent(blackBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        sideBarPanelLayout.setVerticalGroup(
            sideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideBarPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(rentalsRULogoSmallLabel)
                .addGap(70, 70, 70)
                .addComponent(viewPaymentHistoryToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(viewRentalHistoryToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(920, 920, 920)
                .addComponent(deleteAccountToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(550, Short.MAX_VALUE))
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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/videorentalstore/gui/Image_MakePaymentLabel.png"))); // NOI18N

        paymentlPolicyPanel.setBackground(new java.awt.Color(153, 0, 0));
        paymentlPolicyPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        paymentTxt1.setFont(new java.awt.Font("Vani", 1, 18)); // NOI18N
        paymentTxt1.setForeground(new java.awt.Color(255, 255, 255));
        paymentTxt1.setText("Balance:  $1.00 ");

        payButton.setText("Make Payment");
        payButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payButtonActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        rentalPolicyLabel.setBackground(new java.awt.Color(0, 0, 0));
        rentalPolicyLabel.setFont(new java.awt.Font("Vani", 1, 24)); // NOI18N
        rentalPolicyLabel.setForeground(new java.awt.Color(255, 255, 255));
        rentalPolicyLabel.setText("Pay:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rentalPolicyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rentalPolicyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout paymentlPolicyPanelLayout = new javax.swing.GroupLayout(paymentlPolicyPanel);
        paymentlPolicyPanel.setLayout(paymentlPolicyPanelLayout);
        paymentlPolicyPanelLayout.setHorizontalGroup(
            paymentlPolicyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(paymentlPolicyPanelLayout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addGroup(paymentlPolicyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(payButton, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paymentTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(198, Short.MAX_VALUE))
        );
        paymentlPolicyPanelLayout.setVerticalGroup(
            paymentlPolicyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paymentlPolicyPanelLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(paymentTxt1)
                .addGap(37, 37, 37)
                .addComponent(payButton)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout makePaymentPanelLayout = new javax.swing.GroupLayout(makePaymentPanel);
        makePaymentPanel.setLayout(makePaymentPanelLayout);
        makePaymentPanelLayout.setHorizontalGroup(
            makePaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(makePaymentPanelLayout.createSequentialGroup()
                .addComponent(sideBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(makePaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(makePaymentPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(679, 679, 679)
                        .addComponent(toolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(makePaymentPanelLayout.createSequentialGroup()
                        .addGap(341, 341, 341)
                        .addComponent(paymentlPolicyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        makePaymentPanelLayout.setVerticalGroup(
            makePaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sideBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(makePaymentPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(makePaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(toolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(201, 201, 201)
                .addComponent(paymentlPolicyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(makePaymentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(makePaymentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1022, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        dispose();
        CustomerAccount_Movie f = new CustomerAccount_Movie(db, currentUser);
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

    private void payButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payButtonActionPerformed
        dispose();
        CustomerAccount_Movie f = new CustomerAccount_Movie(db, currentUser);
        f.setVisible(true);
    }//GEN-LAST:event_payButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerAccount_MakePayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerAccount_MakePayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerAccount_MakePayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerAccount_MakePayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerAccount_MakePayment(db, currentUser).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel blackBarPanel;
    private javax.swing.JToolBar deleteAccountToolBar;
    private javax.swing.JLabel divider1;
    private javax.swing.JLabel divider2;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logoutButton;
    private javax.swing.JPanel makePaymentPanel;
    private javax.swing.JButton myAccountButton;
    private javax.swing.JButton payButton;
    private javax.swing.JLabel paymentTxt1;
    private javax.swing.JPanel paymentlPolicyPanel;
    private javax.swing.JLabel rentalPolicyLabel;
    private javax.swing.JLabel rentalsRULogoSmallLabel;
    private javax.swing.JPanel sideBarPanel;
    private javax.swing.JToolBar toolBar;
    private javax.swing.JToolBar viewPaymentHistoryToolBar;
    private javax.swing.JToolBar viewRentalHistoryToolBar;
    // End of variables declaration//GEN-END:variables
}
