/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasegui;

import java.sql.*;

/**
 *
 * @author Chris
 */
public class DBGUI extends javax.swing.JFrame {

    /**
     * Creates new form DBGUI
     */
    public DBGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cdtInfo = new javax.swing.JButton();
        apftInfo = new javax.swing.JButton();
        adminInfo = new javax.swing.JButton();
        aviation = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        answers = new javax.swing.JTextArea();
        title = new javax.swing.JLabel();
        nonContract = new javax.swing.JButton();
        nonClear = new javax.swing.JButton();
        failedAPFT = new javax.swing.JButton();
        missingIDs = new javax.swing.JButton();
        failedCWST = new javax.swing.JButton();
        noHistory = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cdtInfo.setText("CDT Info");
        cdtInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdtInfoActionPerformed(evt);
            }
        });

        apftInfo.setText("APFT Info");
        apftInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apftInfoActionPerformed(evt);
            }
        });

        adminInfo.setText("Admin Info");
        adminInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminInfoActionPerformed(evt);
            }
        });

        aviation.setText("Aviation Interest");
        aviation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aviationActionPerformed(evt);
            }
        });

        answers.setEditable(false);
        answers.setColumns(20);
        answers.setRows(5);
        jScrollPane1.setViewportView(answers);

        title.setText("DATA REVIEWER CONSOLE");

        nonContract.setText("Non Contracted");
        nonContract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nonContractActionPerformed(evt);
            }
        });

        nonClear.setText("Non Clearance");
        nonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nonClearActionPerformed(evt);
            }
        });

        failedAPFT.setText("Failed APFT");
        failedAPFT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                failedAPFTActionPerformed(evt);
            }
        });

        missingIDs.setText("Missing ID's");
        missingIDs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                missingIDsActionPerformed(evt);
            }
        });

        failedCWST.setText("Failed CWST");
        failedCWST.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                failedCWSTActionPerformed(evt);
            }
        });

        noHistory.setText("No Mil History");
        noHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noHistoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cdtInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(apftInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adminInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(aviation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                    .addComponent(nonContract, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nonClear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(failedAPFT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(missingIDs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(failedCWST, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(noHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cdtInfo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(apftInfo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adminInfo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(aviation)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nonContract)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nonClear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(failedAPFT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(missingIDs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(failedCWST)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(noHistory)
                        .addGap(0, 114, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cdtInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdtInfoActionPerformed
        try {
            // 1. Get a connection to database
            Connection myConn = DriverManager.getConnection("jdbc:mysql://cs-database:3306/cmridgely1", "cmridgely1", "1611498");
            // 2. Create a statement
            Statement myStmt = myConn.createStatement();
            // 3. Execute SQL query
            ResultSet myRs = myStmt.executeQuery("SELECT cdtName, cdtMajor,"
                    + "cdtGradYear, cdtContractStatus, cdtID FROM cadet");
            // 4. Process the result set
            while (myRs.next()) {
                answers.append(myRs.getString("cdtName") + ", " 
                        + myRs.getString("cdtMajor") + ", " 
                        + myRs.getDate("cdtGradYear") + ", " 
                        + myRs.getBoolean("cdtContractStatus") + "\n");
            }
        }
        catch (Exception exc) { 
            exc.printStackTrace();
        }
    }//GEN-LAST:event_cdtInfoActionPerformed

    private void apftInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apftInfoActionPerformed
            try {
        // 1. Get a connection to database
        Connection myConn = DriverManager.getConnection("jdbc:mysql://cs-database:3306/cmridgely1", "cmridgely1", "1611498");
        // 2. Create a statement
        Statement myStmt = myConn.createStatement();
        // 3. Execute SQL query
        ResultSet myRs = myStmt.executeQuery("SELECT cdtName, cdtPFT,"
                + "cdtHeight, cdtWeight, cdtID FROM cadet");
        // 4. Process the result set
        while (myRs.next()) {
            answers.append(myRs.getString("cdtName") + ", " 
                    + myRs.getInt("cdtAPFT") + ", " 
                    + myRs.getInt("cdtHeight") + ", " 
                    + myRs.getInt("cdtWeight") + "\n");
        }
    }
    catch (Exception exc) { 
        exc.printStackTrace();
    }
    }//GEN-LAST:event_apftInfoActionPerformed

    private void adminInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminInfoActionPerformed
        // TODO add your handling code here:
            try {
        // 1. Get a connection to database
        Connection myConn = DriverManager.getConnection("jdbc:mysql://cs-database:3306/cmridgely1", "cmridgely1", "1611498");
        // 2. Create a statement
        Statement myStmt = myConn.createStatement();
        // 3. Execute SQL query
        ResultSet myRs = myStmt.executeQuery("SELECT cdtName, cdtStipend,"
                + "cdtContractStatus, cdtClearance, cdtID FROM cadet");
        // 4. Process the result set
        while (myRs.next()) {
            answers.append(myRs.getString("cdtName") + ", " 
                    + myRs.getInt("cdtStipend") + ", " 
                    + myRs.getBoolean("cdtContractStatus") + ", " 
                    + myRs.getBoolean("cdtClearance") + "\n");
        }
    }
    catch (Exception exc) { 
        exc.printStackTrace();
    }
    }//GEN-LAST:event_adminInfoActionPerformed

    private void aviationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aviationActionPerformed
        // TODO add your handling code here:
        try {
            // 1. Get a connection to database
            Connection myConn = DriverManager.getConnection("jdbc:mysql://cs-database:3306/cmridgely1", "cmridgely1", "1611498");
            // 2. Create a statement
            Statement myStmt = myConn.createStatement();
            // 3. Execute SQL query
            ResultSet myRs = myStmt.executeQuery("SELECT cdtName, cdtMajor,"
                    + "cdtGradYear, cdtContractStatus, cdtID FROM cadet WHERE "
                    + "cdtAviation IS true");
            // 4. Process the result set
            while (myRs.next()) {
                answers.append(myRs.getString("cdtName") + ", " 
                        + myRs.getString("cdtMajor") + ", " 
                        + myRs.getDate("cdtGradYear") + ", " 
                        + myRs.getBoolean("cdtContractStatus") + "\n");
            }
        }
        catch (Exception exc) { 
            exc.printStackTrace();
        }
    }//GEN-LAST:event_aviationActionPerformed

    private void nonContractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nonContractActionPerformed
        try {
            // 1. Get a connection to database
            Connection myConn = DriverManager.getConnection("jdbc:mysql://cs-database:3306/cmridgely1", "cmridgely1", "1611498");
            // 2. Create a statement
            Statement myStmt = myConn.createStatement();
            // 3. Execute SQL query
            ResultSet myRs = myStmt.executeQuery("SELECT cdtName, cdtMajor,"
                    + "cdtGradYear, cdtContractStatus, cdtID FROM cadet WHERE "
                    + "cdtContractStatus IS false");
            // 4. Process the result set
            while (myRs.next()) {
                answers.append(myRs.getString("cdtName") + ", " 
                        + myRs.getString("cdtMajor") + ", " 
                        + myRs.getDate("cdtGradYear") + ", " 
                        + myRs.getBoolean("cdtContractStatus") + "\n");
            }
        }
        catch (Exception exc) { 
            exc.printStackTrace();
        }
    }//GEN-LAST:event_nonContractActionPerformed

    private void nonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nonClearActionPerformed
        try {
            // 1. Get a connection to database
            Connection myConn = DriverManager.getConnection("jdbc:mysql://cs-database:3306/cmridgely1", "cmridgely1", "1611498");
            // 2. Create a statement
            Statement myStmt = myConn.createStatement();
            // 3. Execute SQL query
            ResultSet myRs = myStmt.executeQuery("SELECT cdtName, cdtMajor,"
                    + "cdtGradYear, cdtContractStatus, cdtClearance, cdtID FROM cadet WHERE "
                    + "cdtClearance IS false");
            // 4. Process the result set
            while (myRs.next()) {
                answers.append(myRs.getString("cdtName") + ", " 
                        + myRs.getString("cdtMajor") + ", " 
                        + myRs.getDate("cdtGradYear") + ", " 
                        + myRs.getBoolean("cdtContractStatus")
                        + myRs.getBoolean("cdtClearance") + "\n");
            }
        }
        catch (Exception exc) { 
            exc.printStackTrace();
        }
    }//GEN-LAST:event_nonClearActionPerformed

    private void failedAPFTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_failedAPFTActionPerformed
        try {
            // 1. Get a connection to database
            Connection myConn = DriverManager.getConnection("jdbc:mysql://cs-database:3306/cmridgely1", "cmridgely1", "1611498");
            // 2. Create a statement
            Statement myStmt = myConn.createStatement();
            // 3. Execute SQL query
            ResultSet myRs = myStmt.executeQuery("SELECT cdtName, cdtMajor,"
                    + "cdtGradYear, cdtContractStatus, cdtAPFT, cdtID FROM cadet WHERE "
                    + "cdtAPFT < 180");
            // 4. Process the result set
            while (myRs.next()) {
                answers.append(myRs.getString("cdtName") + ", " 
                        + myRs.getString("cdtMajor") + ", " 
                        + myRs.getDate("cdtGradYear") + ", " 
                        + myRs.getBoolean("cdtContractStatus")
                        + myRs.getInt("cdtAPFT") + "\n");
            }
        }
        catch (Exception exc) { 
            exc.printStackTrace();
        }
    }//GEN-LAST:event_failedAPFTActionPerformed

    private void missingIDsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_missingIDsActionPerformed
        try {
            // 1. Get a connection to database
            Connection myConn = DriverManager.getConnection("jdbc:mysql://cs-database:3306/cmridgely1", "cmridgely1", "1611498");
            // 2. Create a statement
            Statement myStmt = myConn.createStatement();
            // 3. Execute SQL query
            ResultSet myRs = myStmt.executeQuery("SELECT cdtName, cdtMajor,"
                    + "cdtGradYear, cdtContractStatus, cdtCAC, cdtTags cdtID FROM cadet WHERE "
                    + "cdtTags IS false OR cdtCAC IS false");
            // 4. Process the result set
            while (myRs.next()) {
                answers.append(myRs.getString("cdtName") + ", " 
                        + myRs.getString("cdtMajor") + ", " 
                        + myRs.getDate("cdtGradYear") + ", " 
                        + myRs.getBoolean("cdtContractStatus") + "\n");
            }
        }
        catch (Exception exc) { 
            exc.printStackTrace();
        } 
    }//GEN-LAST:event_missingIDsActionPerformed

    private void failedCWSTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_failedCWSTActionPerformed
        try {
            // 1. Get a connection to database
            Connection myConn = DriverManager.getConnection("jdbc:mysql://cs-database:3306/cmridgely1", "cmridgely1", "1611498");
            // 2. Create a statement
            Statement myStmt = myConn.createStatement();
            // 3. Execute SQL query
            ResultSet myRs = myStmt.executeQuery("SELECT cdtName, cdtMajor,"
                    + "cdtGradYear, cdtContractStatus, cdtCWST, cdtID FROM cadet WHERE "
                    + "cdtCWST IS false");
            // 4. Process the result set
            while (myRs.next()) {
                answers.append(myRs.getString("cdtName") + ", " 
                        + myRs.getString("cdtMajor") + ", " 
                        + myRs.getDate("cdtGradYear") + ", " 
                        + myRs.getBoolean("cdtContractStatus") + "\n");
            }
        }
        catch (Exception exc) { 
            exc.printStackTrace();
        }  
    }//GEN-LAST:event_failedCWSTActionPerformed

    private void noHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noHistoryActionPerformed
        try {
            // 1. Get a connection to database
            Connection myConn = DriverManager.getConnection("jdbc:mysql://cs-database:3306/cridgely", "cmridgely1", "1611498");
            // 2. Create a statement
            Statement myStmt = myConn.createStatement();
            // 3. Execute SQL query
            ResultSet myRs = myStmt.executeQuery("SELECT cdtName, cdtMajor,"
                    + "cdtGradYear, cdtContractStatus, cdtMilHistory, cdtID FROM cadet WHERE "
                    + "cdtMilHistory IS false");
            // 4. Process the result set
            while (myRs.next()) {
                answers.append(myRs.getString("cdtName") + ", " 
                        + myRs.getString("cdtMajor") + ", " 
                        + myRs.getDate("cdtGradYear") + ", " 
                        + myRs.getBoolean("cdtContractStatus") + "\n");
            }
        }
        catch (Exception exc) { 
            exc.printStackTrace();
        }
    }//GEN-LAST:event_noHistoryActionPerformed

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
            java.util.logging.Logger.getLogger(DBGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DBGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DBGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DBGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DBGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminInfo;
    private javax.swing.JTextArea answers;
    private javax.swing.JButton apftInfo;
    private javax.swing.JButton aviation;
    private javax.swing.JButton cdtInfo;
    private javax.swing.JButton failedAPFT;
    private javax.swing.JButton failedCWST;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton missingIDs;
    private javax.swing.JButton noHistory;
    private javax.swing.JButton nonClear;
    private javax.swing.JButton nonContract;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
