/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentservicesapp;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Niall Martin x00110321,
 * Peter Barry x12112631,
 * Aidan O’ Brien x12117498,
 * Leon Daly x12112381
 */
public class StudentServicesAppGUI extends javax.swing.JFrame {

    /**
     * Creates new form StudentServicesAppGUI
     */
    public StudentServicesAppGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    //I got the picture on this page from google images this is the link: http://www.bps101.net/sites/default/files/service/photo/student-services.jpg
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bGroundJp = new javax.swing.JPanel();
        mathBtn = new javax.swing.JButton();
        compSBtn = new javax.swing.JButton();
        learnBtn = new javax.swing.JButton();
        disabilityBtn = new javax.swing.JButton();
        titleLbl = new javax.swing.JLabel();
        picLbl = new javax.swing.JLabel();
        nciLogoLbl = new javax.swing.JLabel();
        nciBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Services");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(320, 480));

        bGroundJp.setBackground(new java.awt.Color(0, 255, 204));
        bGroundJp.setMaximumSize(new java.awt.Dimension(320, 480));
        bGroundJp.setMinimumSize(new java.awt.Dimension(320, 480));
        bGroundJp.setPreferredSize(new java.awt.Dimension(320, 480));

        mathBtn.setForeground(new java.awt.Color(0, 0, 204));
        mathBtn.setText("Maths Support");
        mathBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mathBtnActionPerformed(evt);
            }
        });

        compSBtn.setForeground(new java.awt.Color(0, 0, 204));
        compSBtn.setText("Computer Support");
        compSBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compSBtnActionPerformed(evt);
            }
        });

        learnBtn.setForeground(new java.awt.Color(0, 0, 204));
        learnBtn.setText("Learning Support");
        learnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                learnBtnActionPerformed(evt);
            }
        });

        disabilityBtn.setForeground(new java.awt.Color(0, 0, 204));
        disabilityBtn.setText("Disability Support");
        disabilityBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disabilityBtnActionPerformed(evt);
            }
        });

        titleLbl.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        titleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLbl.setText("Student Services");

        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentservicesapp/student-services.jpg"))); // NOI18N

        nciLogoLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentservicesapp/nci logo.gif"))); // NOI18N

        nciBtn.setForeground(new java.awt.Color(0, 0, 204));
        nciBtn.setText("NCI Home Page");
        nciBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nciBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bGroundJpLayout = new javax.swing.GroupLayout(bGroundJp);
        bGroundJp.setLayout(bGroundJpLayout);
        bGroundJpLayout.setHorizontalGroup(
            bGroundJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bGroundJpLayout.createSequentialGroup()
                .addGroup(bGroundJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bGroundJpLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(bGroundJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nciLogoLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nciBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(bGroundJpLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bGroundJpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bGroundJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bGroundJpLayout.createSequentialGroup()
                        .addGroup(bGroundJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mathBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(learnBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(bGroundJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(disabilityBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(compSBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18))
                    .addComponent(picLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        bGroundJpLayout.setVerticalGroup(
            bGroundJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bGroundJpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nciLogoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nciBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(picLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(bGroundJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(compSBtn)
                    .addComponent(mathBtn))
                .addGap(18, 18, 18)
                .addGroup(bGroundJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(disabilityBtn)
                    .addComponent(learnBtn))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bGroundJp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bGroundJp, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-336)/2, (screenSize.height-519)/2, 336, 519);
    }// </editor-fold>//GEN-END:initComponents

    private void mathBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mathBtnActionPerformed
        SupportOfficerGUI myGui = new SupportOfficerGUI();
           myGui.setVisible (true);
           this.setVisible(false);
    }//GEN-LAST:event_mathBtnActionPerformed

    private void compSBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compSBtnActionPerformed
        // TODO add your handling code here:
        ComputerServicesGUI myGUI = new ComputerServicesGUI();
        myGUI.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_compSBtnActionPerformed

    private void disabilityBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disabilityBtnActionPerformed
        DisabilitySupportGUI myGUI = new DisabilitySupportGUI();
        myGUI.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_disabilityBtnActionPerformed

    private void nciBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nciBtnActionPerformed
        //I got this code from the project fourm
        try {
            String URL = "http://www.ncirl.ie/";
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(URL));
        } 
        
        catch (IOException ex) {
            Logger.getLogger(ComputerServicesGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_nciBtnActionPerformed

    private void learnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_learnBtnActionPerformed
        LearningSupportGui myGUI = new LearningSupportGui();
        myGUI.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_learnBtnActionPerformed

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
            java.util.logging.Logger.getLogger(StudentServicesAppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentServicesAppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentServicesAppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentServicesAppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new StudentServicesAppGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bGroundJp;
    private javax.swing.JButton compSBtn;
    private javax.swing.JButton disabilityBtn;
    private javax.swing.JButton learnBtn;
    private javax.swing.JButton mathBtn;
    private javax.swing.JButton nciBtn;
    private javax.swing.JLabel nciLogoLbl;
    private javax.swing.JLabel picLbl;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
}