package myapp;



import config.login_db;
import internalPages.account;
import java.awt.BasicStroke;
import java.awt.Color;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class loginForm extends javax.swing.JFrame {

    
    public loginForm() {
        initComponents();
    }
     public String hashPassword(String password) throws NoSuchAlgorithmException {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(password.getBytes());
            byte[] digest = md.digest();
            return String.format("%064x", new java.math.BigInteger(1, digest));
}
    
    Color hover = new Color(255,255,255);
    Color defbutton = new Color(153,153,153);
    Color body = new Color (1,121,111);
    Color bodycolor = new Color (4,57,39);
    
    Border empty = BorderFactory.createEmptyBorder();
    
    void buttonBorderAnimation(JPanel panel){
        panel.setBackground(hover);
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(2.0f)));
        
        
    }
    
    void buttonDefaultColor(JPanel panel){
        panel.setBackground(defbutton);
        panel.setBorder(empty);
    }   

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        forgotpass = new javax.swing.JLabel();
        login1 = new javax.swing.JButton();
        Login = new javax.swing.JButton();
        click = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        minimize = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(127, 48, 38));
        jPanel1.setLayout(null);

        jPanel5.setBackground(new java.awt.Color(222, 140, 135));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5);
        jPanel5.setBounds(0, 0, 440, 30);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(217, 222, 135));
        jLabel6.setText("Username");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(50, 160, 90, 17);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(217, 222, 135));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("WELCOME!");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 60, 390, 30);

        username.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        username.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        username.setOpaque(false);
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel1.add(username);
        username.setBounds(120, 150, 270, 40);

        password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        password.setOpaque(false);
        password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordMouseClicked(evt);
            }
        });
        jPanel1.add(password);
        password.setBounds(120, 220, 270, 40);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(217, 222, 135));
        jLabel5.setText("Password");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 230, 90, 17);

        forgotpass.setBackground(new java.awt.Color(255, 255, 255));
        forgotpass.setFont(new java.awt.Font("Century Gothic", 3, 10)); // NOI18N
        forgotpass.setForeground(new java.awt.Color(217, 222, 135));
        forgotpass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        forgotpass.setText("Forgot Password?");
        forgotpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotpassMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                forgotpassMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                forgotpassMouseExited(evt);
            }
        });
        jPanel1.add(forgotpass);
        forgotpass.setBounds(280, 300, 100, 30);

        login1.setBackground(new java.awt.Color(222, 141, 135));
        login1.setText("CANCEL");
        login1.setBorder(null);
        login1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login1MouseClicked(evt);
            }
        });
        login1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login1ActionPerformed(evt);
            }
        });
        jPanel1.add(login1);
        login1.setBounds(130, 270, 91, 33);

        Login.setBackground(new java.awt.Color(222, 141, 135));
        Login.setText("LOGIN");
        Login.setBorder(null);
        Login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginMouseClicked(evt);
            }
        });
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        jPanel1.add(Login);
        Login.setBounds(290, 270, 91, 33);

        click.setBackground(new java.awt.Color(255, 255, 255));
        click.setFont(new java.awt.Font("Century Gothic", 3, 10)); // NOI18N
        click.setForeground(new java.awt.Color(217, 222, 135));
        click.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        click.setText("New User?? Click here to Register!");
        click.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clickMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clickMouseExited(evt);
            }
        });
        jPanel1.add(click);
        click.setBounds(110, 360, 190, 30);

        jPanel2.setBackground(new java.awt.Color(222, 140, 135));

        minimize.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize.setText("—");
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });

        close.setBackground(new java.awt.Color(222, 141, 135));
        close.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setText("X");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(857, Short.MAX_VALUE)
                .addComponent(minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 930, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/vv.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(400, 30, 530, 440);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 930, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void clickMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickMouseClicked
        this.dispose();
        registerform sp = new registerform();
        sp.setVisible(true);
    }//GEN-LAST:event_clickMouseClicked

    private void clickMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickMouseEntered
      
    }//GEN-LAST:event_clickMouseEntered

    private void clickMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickMouseExited
      
    }//GEN-LAST:event_clickMouseExited

    private void login1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_login1MouseClicked

    private void login1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login1ActionPerformed
        username.setText(null);
        password.setText(null);
    }//GEN-LAST:event_login1ActionPerformed

    private void LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseClicked
        String user = username.getText();
        String pass = password.getText();
        if(user.isEmpty()|| user.equals("") || pass.isEmpty() || pass.equals("")){
            username.setText("Username");
            password.setText("Password");
            password.setEchoChar((char)0);
        }else{
            dashBoard db = new dashBoard();
            db.setVisible(true);

            this.setVisible(false);
            this.setDefaultCloseOperation(this.HIDE_ON_CLOSE);
            this.dispose();
        }
    }//GEN-LAST:event_LoginMouseClicked

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
       // String user = username.getText();
       // String pass = password.getText();
        //if(user.isEmpty()|| user.equals("") || pass.isEmpty() || pass.equals("")){
        //    username.setText("Username");
        //    password.setText("Password");
        //    password.setEchoChar((char)0);
        //}else{
          //  dashBoard db = new dashBoard();
          //  db.setVisible(true);
          //  dashBoard.firstname.setText(""+user);
           // this.setVisible(false);
          // this.setDefaultCloseOperation(this.HIDE_ON_CLOSE);
           // this.dispose();
        
        
       PreparedStatement ps;      
ResultSet rs;

// get the username & password
String user = username.getText();
String pass = String.valueOf(password.getPassword());

String query = "SELECT * FROM `user_db` WHERE `user_name`= ? AND `pass_word` = ?";

try {
    ps = login_db.getConnection().prepareStatement(query);

    ps.setString(1, user);
    ps.setString(2, hashPassword(pass)); // hash the password before querying the database

    rs = ps.executeQuery();

    if(rs.next())
    {
       dashBoard db = new dashBoard();
       db.setVisible(true);
       db.pack();
       db.setLocationRelativeTo(null);

       db.userni.setText("Welcome "+user+ "!");
       
      
       this.dispose();

    }
    else{
       
       JOptionPane.showMessageDialog(null, "Incorrect Username or Password");
    }

} catch (SQLException ex) {
    Logger.getLogger(loginForm.class.getName()).log(Level.SEVERE, null, ex);
} catch (NoSuchAlgorithmException ex) {
    Logger.getLogger(loginForm.class.getName()).log(Level.SEVERE, null, ex);
}

        
        
       
    }//GEN-LAST:event_LoginActionPerformed

    private void forgotpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotpassMouseClicked
        this.dispose();
        changepass cp = new changepass();
        cp.setVisible(true);
    }//GEN-LAST:event_forgotpassMouseClicked

    private void forgotpassMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotpassMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_forgotpassMouseEntered

    private void forgotpassMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotpassMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_forgotpassMouseExited

    private void passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        int a =JOptionPane.showConfirmDialog(null,"Confirm Exit?");
        if(a==JOptionPane.YES_OPTION){

            System.exit(0);
        }
    }//GEN-LAST:event_closeMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    
  
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
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Login;
    private javax.swing.JLabel click;
    private javax.swing.JLabel close;
    private javax.swing.JLabel forgotpass;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton login1;
    private javax.swing.JLabel minimize;
    private javax.swing.JPasswordField password;
    public static javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
