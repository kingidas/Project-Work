/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentservicesapp;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Peter Barry x12112631
 */
//The home button image was found on google images and edited in fireworks the link is: http://images.all-free-download.com/images/graphiclarge/rounded_blue_home_button_4805.jpg
//The back button image was found on google images and edited in fireworks the link is: http://4.bp.blogspot.com/-hTRk-er3XlY/TZwLBAy9Y6I/AAAAAAAAAQA/upea2uWVG5A/s1600/back_button.jpg
public class WritingGui extends javax.swing.JFrame {

    File academicWriting;

    /**
     * Creates new form WritingGui
     */
    public WritingGui() {
        initComponents();

        academicWriting = new File("..\\Group C\\src\\files\\Unit 3 academic writing and referencing.ppt");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        writingJp = new javax.swing.JPanel();
        writingLbl = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();
        writingJps = new javax.swing.JScrollPane();
        writingTa = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Writing");
        setMaximumSize(new java.awt.Dimension(320, 480));
        setMinimumSize(new java.awt.Dimension(320, 480));
        setResizable(false);

        writingJp.setBackground(new java.awt.Color(0, 255, 204));
        writingJp.setForeground(new java.awt.Color(0, 255, 204));
        writingJp.setEnabled(false);
        writingJp.setMaximumSize(new java.awt.Dimension(320, 480));
        writingJp.setMinimumSize(new java.awt.Dimension(320, 480));
        writingJp.setPreferredSize(new java.awt.Dimension(320, 480));

        writingLbl.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        writingLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        writingLbl.setText("Writing");

        backBtn.setBackground(new java.awt.Color(0, 255, 204));
        backBtn.setForeground(new java.awt.Color(0, 255, 204));
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentservicesapp/Back.jpg"))); // NOI18N
        backBtn.setBorder(null);
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        homeBtn.setBackground(new java.awt.Color(0, 255, 204));
        homeBtn.setForeground(new java.awt.Color(0, 255, 204));
        homeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentservicesapp/Home.jpg"))); // NOI18N
        homeBtn.setBorder(null);
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });

        writingJps.setBorder(null);
        writingJps.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        writingJps.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        writingTa.setEditable(false);
        writingTa.setBackground(new java.awt.Color(0, 255, 204));
        writingTa.setColumns(20);
        writingTa.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        writingTa.setForeground(new java.awt.Color(0, 255, 204));
        writingTa.setRows(5);
        writingTa.setText("The Academic Writing Club (AWC)\nhas resumed in Semester Two in\nthe Centre for Research and Innovation\nin the Learning and Teaching (CRILT),\n3rd floor, which began on Tuesday 12th\nFebuarary 2013.\nThis semester we will run club meetings\non the dates above.. Whether you are \nfull-time or a part-time student,I hope\nyou willl find a time on the AWC schedule\nsuiting your timetable. We will continue\nto provide advice on approaches to sucessful\nacademic writing in the club. Between the \nmeetings, on-going support will be available\nto all club members via Moodle.\n\n\nNo regristration is required. \n\n ");
        writingTa.setBorder(null);
        writingTa.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        writingTa.setEnabled(false);
        writingJps.setViewportView(writingTa);

        jButton1.setForeground(new java.awt.Color(0, 0, 204));
        jButton1.setText("Academic Writing");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout writingJpLayout = new javax.swing.GroupLayout(writingJp);
        writingJp.setLayout(writingJpLayout);
        writingJpLayout.setHorizontalGroup(
            writingJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(writingJpLayout.createSequentialGroup()
                .addGroup(writingJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, writingJpLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(homeBtn))
                    .addGroup(writingJpLayout.createSequentialGroup()
                        .addGroup(writingJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(writingJpLayout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(writingLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(writingJpLayout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(writingJpLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(writingJps, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 25, Short.MAX_VALUE)))
                .addContainerGap())
        );
        writingJpLayout.setVerticalGroup(
            writingJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, writingJpLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(writingLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(writingJps, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(10, 10, 10)
                .addGroup(writingJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(homeBtn, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(writingJp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(writingJp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(336, 519));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        TopicsGui myGui = new TopicsGui();
        myGui.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backBtnActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        StudentServicesAppGUI myGUI = new StudentServicesAppGUI();
        myGUI.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //i.e I got some of this code from the stackoverflow website forum:  
        if (academicWriting.toString().endsWith(".ppt")) {
            
            try {

                Process exec = Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + academicWriting);
            } 
            
            catch (IOException ex) {
                Logger.getLogger(WritingGui.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
        
        else {
            Desktop desktop = Desktop.getDesktop();
            try {
                desktop.open(academicWriting);
            } 
            
            catch (IOException ex) {
                Logger.getLogger(WritingGui.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WritingGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WritingGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WritingGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WritingGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WritingGui().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton homeBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JPanel writingJp;
    private javax.swing.JScrollPane writingJps;
    private javax.swing.JLabel writingLbl;
    private javax.swing.JTextArea writingTa;
    // End of variables declaration//GEN-END:variables
}