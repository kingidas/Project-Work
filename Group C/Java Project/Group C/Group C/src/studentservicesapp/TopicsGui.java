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
public class TopicsGui extends javax.swing.JFrame {

    File studyskills;
    File examRevision;
    File questionnaire;
    File manual;

    /**
     * Creates new form TopicsGui
     */
    public TopicsGui() {
        initComponents();
        studyskills = new File("..\\Group C\\src\\files\\studyskills.ppt");
        examRevision = new File("..\\Group C\\src\\files\\Unit 4 exam revision.ppt");
        questionnaire = new File("..\\Group C\\src\\files\\Dyslexia questionnaire.doc");
        manual = new File("..\\Group C\\src\\files\\Learning Development Manual 10-11.pdf");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        topicsJp = new javax.swing.JPanel();
        writingBtn = new javax.swing.JButton();
        studyskillsBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();
        topicsLbl = new javax.swing.JLabel();
        imgLbl = new javax.swing.JLabel();
        qBtn = new javax.swing.JButton();
        lmBtn = new javax.swing.JButton();
        examBtn = new javax.swing.JButton();
        onetoBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Topics");
        setBackground(new java.awt.Color(0, 255, 204));
        setMaximumSize(new java.awt.Dimension(320, 480));
        setMinimumSize(new java.awt.Dimension(320, 480));
        setResizable(false);

        topicsJp.setBackground(new java.awt.Color(0, 255, 204));
        topicsJp.setForeground(new java.awt.Color(0, 255, 204));
        topicsJp.setEnabled(false);
        topicsJp.setMaximumSize(new java.awt.Dimension(320, 480));
        topicsJp.setMinimumSize(new java.awt.Dimension(320, 480));
        topicsJp.setPreferredSize(new java.awt.Dimension(320, 480));

        writingBtn.setForeground(new java.awt.Color(0, 0, 204));
        writingBtn.setText("Writing");
        writingBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                writingBtnActionPerformed(evt);
            }
        });

        studyskillsBtn.setForeground(new java.awt.Color(0, 0, 204));
        studyskillsBtn.setText("Study skills");
        studyskillsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studyskillsBtnActionPerformed(evt);
            }
        });

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

        topicsLbl.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        topicsLbl.setText("Topics");

        imgLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/StudentServicesApp/study1.jpg"))); // NOI18N

        qBtn.setForeground(new java.awt.Color(0, 0, 204));
        qBtn.setText("Questionnaire");
        qBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qBtnActionPerformed(evt);
            }
        });

        lmBtn.setForeground(new java.awt.Color(0, 0, 204));
        lmBtn.setText("Learning Manual");
        lmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lmBtnActionPerformed(evt);
            }
        });

        examBtn.setForeground(new java.awt.Color(0, 0, 204));
        examBtn.setText("Exam Revision");
        examBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                examBtnActionPerformed(evt);
            }
        });

        onetoBtn.setForeground(new java.awt.Color(0, 0, 204));
        onetoBtn.setText("One To One");
        onetoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onetoBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout topicsJpLayout = new javax.swing.GroupLayout(topicsJp);
        topicsJp.setLayout(topicsJpLayout);
        topicsJpLayout.setHorizontalGroup(
            topicsJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topicsJpLayout.createSequentialGroup()
                .addGroup(topicsJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(topicsJpLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(topicsJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(examBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(writingBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(qBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(45, 45, 45)
                        .addGroup(topicsJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(studyskillsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lmBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(onetoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(topicsJpLayout.createSequentialGroup()
                        .addGroup(topicsJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(topicsJpLayout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(topicsLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(topicsJpLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(imgLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 5, Short.MAX_VALUE))
                    .addGroup(topicsJpLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(homeBtn)))
                .addContainerGap())
        );
        topicsJpLayout.setVerticalGroup(
            topicsJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topicsJpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(topicsJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(topicsJpLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(homeBtn))
                    .addGroup(topicsJpLayout.createSequentialGroup()
                        .addComponent(topicsLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(imgLbl)
                        .addGap(34, 34, 34)
                        .addGroup(topicsJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(writingBtn)
                            .addComponent(studyskillsBtn))
                        .addGap(18, 18, 18)
                        .addGroup(topicsJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(examBtn)
                            .addComponent(onetoBtn))
                        .addGap(18, 18, 18)
                        .addGroup(topicsJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(qBtn)
                            .addComponent(lmBtn))
                        .addGap(43, 43, 43)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topicsJp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topicsJp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(336, 519));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        StudentServicesAppGUI myGUI = new StudentServicesAppGUI();
        myGUI.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeBtnActionPerformed

    private void writingBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_writingBtnActionPerformed
        WritingGui myGui = new WritingGui();
        myGui.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_writingBtnActionPerformed

    private void studyskillsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studyskillsBtnActionPerformed
        //i.e I got some of this code from the stackoverflow website forum:  
        if (studyskills.toString().endsWith(".ppt")) {
            
            try {
                Process exec = Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + studyskills);
            } 
            
            catch (IOException ex) {
                Logger.getLogger(TopicsGui.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
        
        else {
            Desktop desktop = Desktop.getDesktop();
            
            try {
                desktop.open(studyskills);
            } 
            
            catch (IOException ex) {
                Logger.getLogger(TopicsGui.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_studyskillsBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        LearningSupportGui myGui = new LearningSupportGui();
        myGui.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backBtnActionPerformed

    private void qBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qBtnActionPerformed
        //i.e I got some of this code from the stackoverflow website forum:
        if (questionnaire.toString().endsWith(".doc")) {
            
            try {
                Process exec = Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + questionnaire);
            } 
            
            catch (IOException ex) {
                Logger.getLogger(TopicsGui.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
        
        else {
            Desktop desktop = Desktop.getDesktop();
            
            try {
                desktop.open(questionnaire);
            } 
            
            catch (IOException ex) {
                Logger.getLogger(TopicsGui.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_qBtnActionPerformed

    private void onetoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onetoBtnActionPerformed
        IndividualHelpGui myGui = new IndividualHelpGui();
        myGui.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_onetoBtnActionPerformed

    private void examBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_examBtnActionPerformed
        //i.e I got some of this code from the stackoverflow website forum:
        if (examRevision.toString().endsWith(".ppt")) {
            
            try {
                Process exec = Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + examRevision);
            } 
            
            catch (IOException ex) {
                Logger.getLogger(TopicsGui.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
        
        else {
            Desktop desktop = Desktop.getDesktop();
            
            try {
                desktop.open(examRevision);
            } 
            
            catch (IOException ex) {
                Logger.getLogger(TopicsGui.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_examBtnActionPerformed

    private void lmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lmBtnActionPerformed
        //i.e I got some of this code from the stackoverflow website forum:
        if (manual.toString().endsWith(".pdf")) {
            
            try {
                Process exec = Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + manual);
            } 
            
            catch (IOException ex) {
                Logger.getLogger(TopicsGui.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
        
        else {
            Desktop desktop = Desktop.getDesktop();
            
            try {
                desktop.open(manual);
            } 
            
            catch (IOException ex) {
                Logger.getLogger(TopicsGui.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_lmBtnActionPerformed

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
            java.util.logging.Logger.getLogger(TopicsGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TopicsGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TopicsGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TopicsGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TopicsGui().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton examBtn;
    private javax.swing.JButton homeBtn;
    private javax.swing.JLabel imgLbl;
    private javax.swing.JButton lmBtn;
    private javax.swing.JButton onetoBtn;
    private javax.swing.JButton qBtn;
    private javax.swing.JButton studyskillsBtn;
    private javax.swing.JPanel topicsJp;
    private javax.swing.JLabel topicsLbl;
    private javax.swing.JButton writingBtn;
    // End of variables declaration//GEN-END:variables
}
