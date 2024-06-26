/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp;

import config.login_db;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author SCC-PC
 */
public class changepass extends javax.swing.JFrame {
    
    
    public changepass() {
        initComponents();
    }
     public String hashPassword(String password) throws NoSuchAlgorithmException {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(password.getBytes());
            byte[] digest = md.digest();
            return String.format("%064x", new java.math.BigInteger(1, digest));
     }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        cancel = new javax.swing.JButton();
        update = new javax.swing.JButton();
        conpass = new javax.swing.JPasswordField();
        newpass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(132, 50, 39));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(222, 140, 135));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Change Password");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(762, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 940, 40);

        username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        username.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel1.add(username);
        username.setBounds(160, 190, 260, 30);

        cancel.setBackground(new java.awt.Color(222, 141, 135));
        cancel.setText("CANCEL");
        cancel.setBorder(null);
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel1.add(cancel);
        cancel.setBounds(180, 340, 90, 30);

        update.setBackground(new java.awt.Color(222, 141, 135));
        update.setText("CONFIRM");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update);
        update.setBounds(310, 340, 90, 30);

        conpass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        conpass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(conpass);
        conpass.setBounds(160, 270, 260, 30);

        newpass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        newpass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        newpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newpassActionPerformed(evt);
            }
        });
        jPanel1.add(newpass);
        newpass.setBounds(160, 230, 260, 30);

        jLabel1.setBackground(new java.awt.Color(0, 121, 111));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(217, 222, 135));
        jLabel1.setText("Confirm Password:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 280, 170, 30);

        jLabel3.setBackground(new java.awt.Color(0, 121, 111));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(217, 222, 135));
        jLabel3.setText("New Password:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 240, 140, 20);

        jLabel7.setBackground(new java.awt.Color(0, 121, 111));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(217, 222, 135));
        jLabel7.setText("Username:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(60, 200, 130, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Downloads\\34.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(440, 30, 480, 440);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 932, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
         loginForm lf = new loginForm();
       lf.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
      String usename,confirmpassword;
      usename = username.getText();      
      String newpassword = String.valueOf(newpass.getPassword());
      confirmpassword = conpass.getText();
      
      if (usename.equals(""))
        {
            JOptionPane.showMessageDialog(null, "All Fields Are Required!");
        }else if (newpassword.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Add a password");
        }else if (!newpassword.equals(confirmpassword))
        {
            JOptionPane.showMessageDialog(null, "Password Don't Match");
        }else{
            PreparedStatement ps ;
ResultSet rs;
String changeQuery = ("UPDATE user_db SET pass_word = ? where user_name = '"+usename+"'");

             try{
                 ps = login_db.getConnection().prepareStatement(changeQuery);
                ps.setString(1, hashPassword(newpassword));
                ps.executeUpdate();
         
          if(ps.executeUpdate() > 0){
      
          
              JOptionPane.showMessageDialog(null,"Password Changed Successfully");
              loginForm lf = new loginForm();
        this.dispose();
        lf.setVisible(true);
          }else{
               JOptionPane.showMessageDialog(null, "Error: Check Your Information");
          }
      }
     catch (SQLException ex) {
    Logger.getLogger(registerform.class.getName()).log(Level.SEVERE, null, ex);
}  catch (NoSuchAlgorithmException ex) {      
             Logger.getLogger(changepass.class.getName()).log(Level.SEVERE, null, ex);
         }      
        }
      
     
    }//GEN-LAST:event_updateActionPerformed

    private void newpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newpassActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

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
            java.util.logging.Logger.getLogger(changepass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(changepass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(changepass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(changepass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new changepass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JPasswordField conpass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField newpass;
    private javax.swing.JButton update;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
