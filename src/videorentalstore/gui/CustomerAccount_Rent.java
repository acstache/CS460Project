/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package videorentalstore.gui;

import videorentalstore.database.Database;

/**
 *
 * @author Ashley
 */
public class CustomerAccount_Rent extends javax.swing.JFrame {
    private Database db;
    /**
     * Creates new form CustomerAccount_Rent
     */
    public CustomerAccount_Rent(Database db) {
        initComponents();
        this.db = db;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rentPanel = new javax.swing.JPanel();
        sideBarPanel = new javax.swing.JPanel();
        rentalsRULogoSmallLabel = new javax.swing.JLabel();
        blackBarPanel = new javax.swing.JPanel();
        viewPaymentHistoryToolBar = new javax.swing.JToolBar();
        viewRentalHistoryToolBar = new javax.swing.JToolBar();
        deleteAccountToolBar = new javax.swing.JToolBar();
        sideBarInfoPanel = new javax.swing.JPanel();
        viewPaymentHistoryToolBar1 = new javax.swing.JToolBar();
        ViewPaymentHistoryButton = new javax.swing.JButton();
        accountInfoToolBar = new javax.swing.JToolBar();
        AccountInfoButton = new javax.swing.JButton();
        viewRentalHistoryToolBar1 = new javax.swing.JToolBar();
        viewRentalHistoryButton = new javax.swing.JButton();
        deleteAccountToolBar1 = new javax.swing.JToolBar();
        deleteMyAcountButton = new javax.swing.JButton();
        toolBar = new javax.swing.JToolBar();
        homeButton = new javax.swing.JButton();
        divider1 = new javax.swing.JLabel();
        myAccountButton = new javax.swing.JButton();
        divider2 = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        rentalPolicyPanel = new javax.swing.JPanel();
        rentalPolicyTxt1 = new javax.swing.JLabel();
        rentalPolicyTxt2 = new javax.swing.JLabel();
        acceptRentAgreementButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        rentalPolicyLabel = new javax.swing.JLabel();
        rentYourMovieLabel = new javax.swing.JLabel();
        toolBar1 = new javax.swing.JToolBar();
        homeButton1 = new javax.swing.JButton();
        divider3 = new javax.swing.JLabel();
        myAccountButton1 = new javax.swing.JButton();
        divider4 = new javax.swing.JLabel();
        logoutButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rentPanel.setBackground(new java.awt.Color(255, 255, 255));
        rentPanel.setMaximumSize(new java.awt.Dimension(1800, 100));
        rentPanel.setName(""); // NOI18N
        rentPanel.setPreferredSize(new java.awt.Dimension(18000, 1000));

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

        sideBarInfoPanel.setBackground(new java.awt.Color(153, 0, 0));

        viewPaymentHistoryToolBar1.setBackground(new java.awt.Color(153, 0, 0));
        viewPaymentHistoryToolBar1.setBorder(null);
        viewPaymentHistoryToolBar1.setFloatable(false);
        viewPaymentHistoryToolBar1.setRollover(true);
        viewPaymentHistoryToolBar1.setBorderPainted(false);

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

        accountInfoToolBar.setBackground(new java.awt.Color(153, 0, 0));
        accountInfoToolBar.setBorder(null);
        accountInfoToolBar.setFloatable(false);
        accountInfoToolBar.setRollover(true);
        accountInfoToolBar.setBorderPainted(false);

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

        viewRentalHistoryToolBar1.setBorder(null);
        viewRentalHistoryToolBar1.setFloatable(false);
        viewRentalHistoryToolBar1.setForeground(new java.awt.Color(255, 255, 255));
        viewRentalHistoryToolBar1.setRollover(true);
        viewRentalHistoryToolBar1.setBorderPainted(false);

        viewRentalHistoryButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        viewRentalHistoryButton.setForeground(new java.awt.Color(255, 255, 255));
        viewRentalHistoryButton.setText("View Rental History");
        viewRentalHistoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRentalHistoryButtonActionPerformed(evt);
            }
        });
        viewRentalHistoryToolBar1.add(viewRentalHistoryButton);

        deleteAccountToolBar1.setBorder(null);
        deleteAccountToolBar1.setFloatable(false);
        deleteAccountToolBar1.setForeground(new java.awt.Color(255, 255, 255));
        deleteAccountToolBar1.setRollover(true);
        deleteAccountToolBar1.setBorderPainted(false);

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
                    .addComponent(accountInfoToolBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sideBarInfoPanelLayout.createSequentialGroup()
                        .addGroup(sideBarInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(deleteAccountToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewRentalHistoryToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8))
                    .addComponent(viewPaymentHistoryToolBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        sideBarInfoPanelLayout.setVerticalGroup(
            sideBarInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideBarInfoPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(accountInfoToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(viewPaymentHistoryToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(viewRentalHistoryToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(deleteAccountToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(185, Short.MAX_VALUE))
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
                            .addComponent(viewRentalHistoryToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(sideBarPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(deleteAccountToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sideBarPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(sideBarInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sideBarInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(501, 501, 501)
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

        rentalPolicyPanel.setBackground(new java.awt.Color(153, 0, 0));
        rentalPolicyPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        rentalPolicyTxt1.setFont(new java.awt.Font("Vani", 1, 18)); // NOI18N
        rentalPolicyTxt1.setForeground(new java.awt.Color(255, 255, 255));
        rentalPolicyTxt1.setText("Rental Fee:  $1.00 for 7 Days");

        rentalPolicyTxt2.setFont(new java.awt.Font("Vani", 1, 18)); // NOI18N
        rentalPolicyTxt2.setForeground(new java.awt.Color(255, 255, 255));
        rentalPolicyTxt2.setText("Late Fees:  $1.00 for every day past 7 Days");

        acceptRentAgreementButton.setText("I Accept");
        acceptRentAgreementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptRentAgreementButtonActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        rentalPolicyLabel.setBackground(new java.awt.Color(0, 0, 0));
        rentalPolicyLabel.setFont(new java.awt.Font("Vani", 1, 24)); // NOI18N
        rentalPolicyLabel.setForeground(new java.awt.Color(255, 255, 255));
        rentalPolicyLabel.setText("Rental Policy:");

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

        javax.swing.GroupLayout rentalPolicyPanelLayout = new javax.swing.GroupLayout(rentalPolicyPanel);
        rentalPolicyPanel.setLayout(rentalPolicyPanelLayout);
        rentalPolicyPanelLayout.setHorizontalGroup(
            rentalPolicyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rentalPolicyPanelLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(rentalPolicyTxt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(rentalPolicyPanelLayout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addGroup(rentalPolicyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rentalPolicyTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(rentalPolicyPanelLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(acceptRentAgreementButton, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        rentalPolicyPanelLayout.setVerticalGroup(
            rentalPolicyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rentalPolicyPanelLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(rentalPolicyTxt1)
                .addGap(30, 30, 30)
                .addComponent(rentalPolicyTxt2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(acceptRentAgreementButton)
                .addGap(36, 36, 36))
        );

        rentYourMovieLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/videorentalstore/gui/Image_RentLabel.png"))); // NOI18N

        toolBar1.setBackground(new java.awt.Color(255, 255, 255));
        toolBar1.setBorder(null);
        toolBar1.setFloatable(false);
        toolBar1.setRollover(true);
        toolBar1.setBorderPainted(false);

        homeButton1.setBackground(new java.awt.Color(255, 255, 255));
        homeButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        homeButton1.setText("Home");
        homeButton1.setBorderPainted(false);
        homeButton1.setFocusable(false);
        homeButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        homeButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        homeButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButton1ActionPerformed(evt);
            }
        });
        toolBar1.add(homeButton1);

        divider3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        divider3.setText("  |  ");
        toolBar1.add(divider3);

        myAccountButton1.setBackground(new java.awt.Color(255, 255, 255));
        myAccountButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        myAccountButton1.setText("My Account");
        myAccountButton1.setFocusable(false);
        myAccountButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        myAccountButton1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        myAccountButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myAccountButton1ActionPerformed(evt);
            }
        });
        toolBar1.add(myAccountButton1);

        divider4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        divider4.setText("  |  ");
        toolBar1.add(divider4);

        logoutButton1.setBackground(new java.awt.Color(255, 255, 255));
        logoutButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logoutButton1.setText("Logout");
        logoutButton1.setFocusable(false);
        logoutButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logoutButton1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        logoutButton1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        logoutButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButton1ActionPerformed(evt);
            }
        });
        toolBar1.add(logoutButton1);

        javax.swing.GroupLayout rentPanelLayout = new javax.swing.GroupLayout(rentPanel);
        rentPanel.setLayout(rentPanelLayout);
        rentPanelLayout.setHorizontalGroup(
            rentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rentPanelLayout.createSequentialGroup()
                .addComponent(sideBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(rentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rentPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(rentYourMovieLabel)
                        .addGap(930, 930, 930)
                        .addComponent(toolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2092, 2092, 2092)
                        .addComponent(toolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(rentPanelLayout.createSequentialGroup()
                        .addGap(593, 593, 593)
                        .addComponent(rentalPolicyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        rentPanelLayout.setVerticalGroup(
            rentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rentPanelLayout.createSequentialGroup()
                .addGroup(rentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sideBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(rentPanelLayout.createSequentialGroup()
                        .addGroup(rentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(rentPanelLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(toolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(rentPanelLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(rentYourMovieLabel))
                            .addGroup(rentPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(toolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(156, 156, 156)
                        .addComponent(rentalPolicyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1829, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1987, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(rentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 3495, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ViewPaymentHistoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewPaymentHistoryButtonActionPerformed
        dispose();
        CustomerAccount_PaymentHistory f = new CustomerAccount_PaymentHistory(db);
        f.setVisible(true);
    }//GEN-LAST:event_ViewPaymentHistoryButtonActionPerformed

    private void AccountInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccountInfoButtonActionPerformed
        dispose();
        CustomerAccount_MyAccount f = new CustomerAccount_MyAccount(db);
        f.setVisible(true);
    }//GEN-LAST:event_AccountInfoButtonActionPerformed

    private void viewRentalHistoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRentalHistoryButtonActionPerformed
        dispose();
        CustomerAccount_RentalHistory f = new CustomerAccount_RentalHistory(db);
        f.setVisible(true);
    }//GEN-LAST:event_viewRentalHistoryButtonActionPerformed

    private void deleteMyAcountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMyAcountButtonActionPerformed
        dispose();
        CustomerAccount_DeleteAccount f = new CustomerAccount_DeleteAccount(db);
        f.setVisible(true);
    }//GEN-LAST:event_deleteMyAcountButtonActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        dispose();
        CustomerAccount_Movies f = new CustomerAccount_Movies(db);
        f.setVisible(true);
    }//GEN-LAST:event_homeButtonActionPerformed

    private void myAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myAccountButtonActionPerformed
        dispose();
        CustomerAccount_MyAccount f = new CustomerAccount_MyAccount(db);
        f.setVisible(true);
    }//GEN-LAST:event_myAccountButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        dispose();
        Account_SignIn f = new Account_SignIn(db);
        f.setVisible(true);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void acceptRentAgreementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptRentAgreementButtonActionPerformed
        dispose();
        CustomerAccount_MakePayment f = new CustomerAccount_MakePayment(db);
        f.setVisible(true);
    }//GEN-LAST:event_acceptRentAgreementButtonActionPerformed

    private void homeButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButton1ActionPerformed
        dispose();
        CustomerAccount_Movies f = new CustomerAccount_Movies(db);
        f.setVisible(true);
    }//GEN-LAST:event_homeButton1ActionPerformed

    private void myAccountButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myAccountButton1ActionPerformed
        dispose();
        CustomerAccount_MyAccount f = new CustomerAccount_MyAccount(db);
        f.setVisible(true);
    }//GEN-LAST:event_myAccountButton1ActionPerformed

    private void logoutButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButton1ActionPerformed
        dispose();
        Account_SignIn f = new Account_SignIn(db);
        f.setVisible(true);
    }//GEN-LAST:event_logoutButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerAccount_Rent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerAccount_Rent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerAccount_Rent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerAccount_Rent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerAccount_Rent(db).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AccountInfoButton;
    private javax.swing.JButton ViewPaymentHistoryButton;
    private javax.swing.JButton acceptRentAgreementButton;
    private javax.swing.JToolBar accountInfoToolBar;
    private javax.swing.JPanel blackBarPanel;
    private javax.swing.JToolBar deleteAccountToolBar;
    private javax.swing.JToolBar deleteAccountToolBar1;
    private javax.swing.JButton deleteMyAcountButton;
    private javax.swing.JLabel divider1;
    private javax.swing.JLabel divider2;
    private javax.swing.JLabel divider3;
    private javax.swing.JLabel divider4;
    private javax.swing.JButton homeButton;
    private javax.swing.JButton homeButton1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton logoutButton1;
    private javax.swing.JButton myAccountButton;
    private javax.swing.JButton myAccountButton1;
    private javax.swing.JPanel rentPanel;
    private javax.swing.JLabel rentYourMovieLabel;
    private javax.swing.JLabel rentalPolicyLabel;
    private javax.swing.JPanel rentalPolicyPanel;
    private javax.swing.JLabel rentalPolicyTxt1;
    private javax.swing.JLabel rentalPolicyTxt2;
    private javax.swing.JLabel rentalsRULogoSmallLabel;
    private javax.swing.JPanel sideBarInfoPanel;
    private javax.swing.JPanel sideBarPanel;
    private javax.swing.JToolBar toolBar;
    private javax.swing.JToolBar toolBar1;
    private javax.swing.JToolBar viewPaymentHistoryToolBar;
    private javax.swing.JToolBar viewPaymentHistoryToolBar1;
    private javax.swing.JButton viewRentalHistoryButton;
    private javax.swing.JToolBar viewRentalHistoryToolBar;
    private javax.swing.JToolBar viewRentalHistoryToolBar1;
    // End of variables declaration//GEN-END:variables
}