/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iamshm.dotMail;

/**
 *
 * @author iam_shm
 */
public class MailMainGUI extends javax.swing.JFrame {

    /**
     * Creates new form MailMainGUI
     */
    public MailMainGUI() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        subjectMail = new javax.swing.JTextField();
        toEmail = new javax.swing.JTextField();
        sendBitton = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        backGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1024, 720));
        setMinimumSize(new java.awt.Dimension(1024, 720));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(null);
        jScrollPane1.setOpaque(false);

        jTextArea1.setBackground(new java.awt.Color(137, 94, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setBorder(null);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 351, 630, 260));

        subjectMail.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        subjectMail.setForeground(new java.awt.Color(255, 255, 255));
        subjectMail.setBorder(null);
        subjectMail.setMinimumSize(new java.awt.Dimension(6, 25));
        subjectMail.setName(""); // NOI18N
        subjectMail.setOpaque(false);
        subjectMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectMailActionPerformed(evt);
            }
        });
        getContentPane().add(subjectMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 218, 520, 30));

        toEmail.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        toEmail.setForeground(new java.awt.Color(255, 255, 255));
        toEmail.setBorder(null);
        toEmail.setMinimumSize(new java.awt.Dimension(6, 25));
        toEmail.setName(""); // NOI18N
        toEmail.setOpaque(false);
        toEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toEmailActionPerformed(evt);
            }
        });
        getContentPane().add(toEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 147, 520, 30));

        sendBitton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sendBitton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sendBittonMouseReleased(evt);
            }
        });
        getContentPane().add(sendBitton, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 660, 120, 35));

        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                closeMouseReleased(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(985, 0, 30, 30));

        backGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/iamshm/imagesdotMail/mail.png"))); // NOI18N
        getContentPane().add(backGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseReleased
        System.exit(0);
    }//GEN-LAST:event_closeMouseReleased

    private void toEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toEmailActionPerformed

    private void subjectMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subjectMailActionPerformed

    private void sendBittonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sendBittonMouseReleased
       sendMail SM= new sendMail(toEmail.getText(),subjectMail.getText(),jTextArea1.getText());
    }//GEN-LAST:event_sendBittonMouseReleased

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MailMainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MailMainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MailMainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MailMainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MailMainGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backGround;
    private javax.swing.JLabel close;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel sendBitton;
    private javax.swing.JTextField subjectMail;
    private javax.swing.JTextField toEmail;
    // End of variables declaration//GEN-END:variables

     
}
