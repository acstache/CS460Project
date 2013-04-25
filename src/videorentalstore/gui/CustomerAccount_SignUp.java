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
public class CustomerAccount_SignUp extends javax.swing.JFrame {
    private Database db;
    /**
     * Creates new form CustomerAccount_SignUp
     */
    public CustomerAccount_SignUp(Database db) {
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

        signUpPanel = new javax.swing.JPanel();
        signUpTxtPanel = new javax.swing.JPanel();
        rentals4UlogoLabel = new javax.swing.JLabel();
        greetingLabel = new javax.swing.JLabel();
        signUpInfoPanel = new javax.swing.JPanel();
        newUsernameLabel = new javax.swing.JLabel();
        newUserPasswordLabel = new javax.swing.JLabel();
        newUserEmailLabel = new javax.swing.JLabel();
        newUsernameTxt = new javax.swing.JTextField();
        newUserPasswordTxt = new javax.swing.JPasswordField();
        newUserEmailTxt = new javax.swing.JTextField();
        firstNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        firstNameTxt = new javax.swing.JTextField();
        lastNameTxt = new javax.swing.JTextField();
        cityLabel = new javax.swing.JLabel();
        cityTxt = new javax.swing.JTextField();
        zipcodeLabel = new javax.swing.JLabel();
        zipcodeTxt = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        birthdayLabel = new javax.swing.JLabel();
        creditCardNumLabel = new javax.swing.JLabel();
        creditCardNumTxt = new javax.swing.JTextField();
        creditCardExpLabel = new javax.swing.JLabel();
        signUpButton = new javax.swing.JButton();
        addressTxt = new javax.swing.JTextField();
        stateLabel = new javax.swing.JLabel();
        birthdayMonth = new javax.swing.JComboBox();
        birthdayDay = new javax.swing.JComboBox();
        birthdayYear = new javax.swing.JComboBox();
        stateTxt = new javax.swing.JComboBox();
        creditCardExpirationMonth = new javax.swing.JComboBox();
        creditCardExpirationYear = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        signUpPanel.setBackground(new java.awt.Color(153, 0, 0));

        signUpTxtPanel.setBackground(new java.awt.Color(153, 0, 0));

        rentals4UlogoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/videorentalstore/gui/Image_Rent4ULogoLarge.jpg"))); // NOI18N

        greetingLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        greetingLabel.setText("Join Us And Rent Great Movies For Great Prices");

        signUpInfoPanel.setBackground(new java.awt.Color(153, 0, 0));
        signUpInfoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sign Up", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Vani", 1, 30), new java.awt.Color(0, 0, 0))); // NOI18N
        signUpInfoPanel.setForeground(new java.awt.Color(51, 51, 51));

        newUsernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        newUsernameLabel.setText("Username:");

        newUserPasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        newUserPasswordLabel.setText("Password:");

        newUserEmailLabel.setForeground(new java.awt.Color(255, 255, 255));
        newUserEmailLabel.setText("Email:");

        firstNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        firstNameLabel.setText("First Name:");

        lastNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        lastNameLabel.setText("Last Name:");

        cityLabel.setForeground(new java.awt.Color(255, 255, 255));
        cityLabel.setText("City:");

        zipcodeLabel.setForeground(new java.awt.Color(255, 255, 255));
        zipcodeLabel.setText("Zipcode:");

        addressLabel.setForeground(new java.awt.Color(255, 255, 255));
        addressLabel.setText("Address:");

        birthdayLabel.setForeground(new java.awt.Color(255, 255, 255));
        birthdayLabel.setText("Birthday:");

        creditCardNumLabel.setForeground(new java.awt.Color(255, 255, 255));
        creditCardNumLabel.setText("Credit Card Number: ");

        creditCardExpLabel.setForeground(new java.awt.Color(255, 255, 255));
        creditCardExpLabel.setText("Credit Card Expiration Date:");

        signUpButton.setText("Sign Up");
        signUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonActionPerformed(evt);
            }
        });
        signUpButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                signUpButtonKeyPressed(evt);
            }
        });

        stateLabel.setForeground(new java.awt.Color(255, 255, 255));
        stateLabel.setText("State:");

        birthdayMonth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Month", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }));

        birthdayDay.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Day", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        birthdayYear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Year", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920", "1919", "1918", "1917", "1916", "1915", "1914", "1913" }));

        stateTxt.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "AK - Alaska", "AL - Alabama", "AR - Arkansas", "AZ - Arizona", "CA - California", "CO - Colorado", "CT - Connecticut", "DE - Delaware", "FL - Florida", "GA - Georgia", "HI - Hawaii", "IA - Iowa", "ID - Idaho", "IL - Illinois", "IN -Indiana", "KS - Kansas", "KY - Kentucky", "LA - Louisiana", "MA - Massachusetts", "MD - Maryland", "ME - Maine", "MI - Michigan", "MN - Minnesota", "MO - Missouri", "MS - Mississippi", "MT - Montana", "NC - North Carolina", "ND - North Dakota", "NE - Nebraska", "NH - New Hampshire", "NJ - New Jersey", "NM - New Mexico", "NV - Nevada", "NY - New York", "OH - Ohio", "OK - Oklahoma", "OR - Oregon", "PA - Pennsylvania", "RI - Rhode Island", "SC - South Carolina", "SD - South Dakota", "TN - Tennessee", "TX - Texas", "UT - Utah", "VA - Virginia", "VT - Vermont", "WA - Washington", "WI - Wisconsin", "WV - West Virginia", "WY - Wyoming" }));

        creditCardExpirationMonth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Month", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        creditCardExpirationYear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Year", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022" }));

        javax.swing.GroupLayout signUpInfoPanelLayout = new javax.swing.GroupLayout(signUpInfoPanel);
        signUpInfoPanel.setLayout(signUpInfoPanelLayout);
        signUpInfoPanelLayout.setHorizontalGroup(
            signUpInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signUpInfoPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(signUpInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(signUpInfoPanelLayout.createSequentialGroup()
                        .addComponent(lastNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lastNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(signUpInfoPanelLayout.createSequentialGroup()
                        .addGroup(signUpInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstNameLabel)
                            .addComponent(newUserEmailLabel)
                            .addComponent(newUserPasswordLabel)
                            .addComponent(newUsernameLabel))
                        .addGap(11, 11, 11)
                        .addGroup(signUpInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(newUserPasswordTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstNameTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newUserEmailTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newUsernameTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(signUpInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(signUpButton)
                        .addGroup(signUpInfoPanelLayout.createSequentialGroup()
                            .addGroup(signUpInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(creditCardNumLabel)
                                .addComponent(creditCardExpLabel))
                            .addGroup(signUpInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(signUpInfoPanelLayout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(creditCardExpirationMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(creditCardExpirationYear, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(signUpInfoPanelLayout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(creditCardNumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(signUpInfoPanelLayout.createSequentialGroup()
                        .addGroup(signUpInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(birthdayLabel)
                            .addComponent(addressLabel)
                            .addComponent(cityLabel)
                            .addComponent(stateLabel)
                            .addComponent(zipcodeLabel))
                        .addGap(18, 18, 18)
                        .addGroup(signUpInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(zipcodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(signUpInfoPanelLayout.createSequentialGroup()
                                .addComponent(birthdayMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(birthdayDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(birthdayYear, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        signUpInfoPanelLayout.setVerticalGroup(
            signUpInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signUpInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(signUpInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newUsernameLabel)
                    .addComponent(newUsernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(signUpInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newUserPasswordLabel)
                    .addComponent(newUserPasswordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(signUpInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newUserEmailLabel)
                    .addComponent(newUserEmailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(signUpInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel)
                    .addComponent(firstNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(signUpInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameLabel)
                    .addComponent(lastNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(signUpInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(birthdayLabel)
                    .addComponent(birthdayMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(birthdayYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(birthdayDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(signUpInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressLabel))
                .addGap(18, 18, 18)
                .addGroup(signUpInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cityLabel))
                .addGap(21, 21, 21)
                .addGroup(signUpInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stateLabel)
                    .addComponent(stateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(signUpInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zipcodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zipcodeLabel))
                .addGap(18, 18, 18)
                .addGroup(signUpInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(signUpInfoPanelLayout.createSequentialGroup()
                        .addComponent(creditCardNumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(signUpInfoPanelLayout.createSequentialGroup()
                        .addComponent(creditCardNumLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(signUpInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(creditCardExpLabel)
                            .addComponent(creditCardExpirationMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(creditCardExpirationYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(signUpButton)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout signUpTxtPanelLayout = new javax.swing.GroupLayout(signUpTxtPanel);
        signUpTxtPanel.setLayout(signUpTxtPanelLayout);
        signUpTxtPanelLayout.setHorizontalGroup(
            signUpTxtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signUpTxtPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(signUpTxtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rentals4UlogoLabel)
                    .addGroup(signUpTxtPanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(signUpTxtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(greetingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(signUpTxtPanelLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(signUpInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(52, 52, 52))
        );
        signUpTxtPanelLayout.setVerticalGroup(
            signUpTxtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signUpTxtPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rentals4UlogoLabel)
                .addGap(18, 18, 18)
                .addComponent(greetingLabel)
                .addGap(29, 29, 29)
                .addComponent(signUpInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout signUpPanelLayout = new javax.swing.GroupLayout(signUpPanel);
        signUpPanel.setLayout(signUpPanelLayout);
        signUpPanelLayout.setHorizontalGroup(
            signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signUpPanelLayout.createSequentialGroup()
                .addGap(402, 402, 402)
                .addComponent(signUpTxtPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(397, Short.MAX_VALUE))
        );
        signUpPanelLayout.setVerticalGroup(
            signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(signUpTxtPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(signUpPanel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpButtonActionPerformed
        char[] pw = newUserPasswordTxt.getPassword();
        String password = pw.toString();
        String email = newUserEmailTxt.getText();
        String firstName = firstNameTxt.getText();
        String lastName = lastNameTxt.getText();
        String birthday = birthdayMonth.getSelectedItem().toString() + "/" + birthdayDay.getSelectedItem().toString() + "/" + birthdayYear.getSelectedItem().toString();  
        String city = cityTxt.getText();
        String state = stateTxt.getSelectedItem().toString();
        String zipCode = zipcodeTxt.getText();
        String address = addressTxt.getText();
        String creditCardNum = creditCardNumTxt.getText();
        String creditCardExpireDate = creditCardExpirationMonth.getSelectedItem().toString() + "/" + creditCardExpirationYear.getSelectedItem().toString();

        User u = new User(firstName, lastName, email, password,  birthday , creditCardNum,  creditCardExpireDate,  address,  city,  state,  zipCode, false);
        db.addUsertoDB(u);
        System.out.println("user added");

        
        dispose();
        CustomerAccount_Movies f = new CustomerAccount_Movies(db, u);
        f.setVisible(true);
    }//GEN-LAST:event_signUpButtonActionPerformed

    private void signUpButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_signUpButtonKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_signUpButtonKeyPressed

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
            java.util.logging.Logger.getLogger(CustomerAccount_SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerAccount_SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerAccount_SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerAccount_SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerAccount_SignUp(db).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressTxt;
    private javax.swing.JComboBox birthdayDay;
    private javax.swing.JLabel birthdayLabel;
    private javax.swing.JComboBox birthdayMonth;
    private javax.swing.JComboBox birthdayYear;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JTextField cityTxt;
    private javax.swing.JLabel creditCardExpLabel;
    private javax.swing.JComboBox creditCardExpirationMonth;
    private javax.swing.JComboBox creditCardExpirationYear;
    private javax.swing.JLabel creditCardNumLabel;
    private javax.swing.JTextField creditCardNumTxt;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameTxt;
    private javax.swing.JLabel greetingLabel;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameTxt;
    private javax.swing.JLabel newUserEmailLabel;
    private javax.swing.JTextField newUserEmailTxt;
    private javax.swing.JLabel newUserPasswordLabel;
    private javax.swing.JPasswordField newUserPasswordTxt;
    private javax.swing.JLabel newUsernameLabel;
    private javax.swing.JTextField newUsernameTxt;
    private javax.swing.JLabel rentals4UlogoLabel;
    private javax.swing.JButton signUpButton;
    private javax.swing.JPanel signUpInfoPanel;
    private javax.swing.JPanel signUpPanel;
    private javax.swing.JPanel signUpTxtPanel;
    private javax.swing.JLabel stateLabel;
    private javax.swing.JComboBox stateTxt;
    private javax.swing.JLabel zipcodeLabel;
    private javax.swing.JTextField zipcodeTxt;
    // End of variables declaration//GEN-END:variables
}
