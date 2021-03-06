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
 * @author Niall Martin x00110321
 */
//The home button image was found on google images and edited in fireworks the link is: http://images.all-free-download.com/images/graphiclarge/rounded_blue_home_button_4805.jpg
//The back button image was found on google images and edited in fireworks the link is: http://4.bp.blogspot.com/-hTRk-er3XlY/TZwLBAy9Y6I/AAAAAAAAAQA/upea2uWVG5A/s1600/back_button.jpg
//The image on this page I found on google images the link is:http://sd.keepcalm-o-matic.co.uk/i/keep-calm-and-carry-on-studying-20.png
public class StudyHelpGUI extends javax.swing.JFrame {
    // I am declaring my file varables

    File codePlag;
    File codeRev;
    File codePolicy;
    File timeTable;

    /**
     * Creates new form StudyHelpGUI
     */
    public StudyHelpGUI() {
        initComponents();
        // I am creating my new files and giving them the file path
        // I found the .. method on stack overflow it allows the file to be open on any machine without having to change the path
        codePlag = new File("..\\Group C\\src\\files\\CodePlagiarism.ppt");
        codeRev = new File("..\\Group C\\src\\files\\HowToDocumentYourCodeProperlyRev.doc");
        codePolicy = new File("..\\Group C\\src\\files\\PlagiarismofSoftwareCodePolicy.doc");
        timeTable = new File("..\\Group C\\src\\files\\SemesterTwoTimetablebyProgrammeMay2013.pdf");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        studyJp = new javax.swing.JPanel();
        studyLbl = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();
        examTBtn = new javax.swing.JButton();
        codePBtn = new javax.swing.JButton();
        docCBtn = new javax.swing.JButton();
        softCBtn = new javax.swing.JButton();
        helpTf = new javax.swing.JTextField();
        previousPapersBtn = new javax.swing.JButton();
        typingBtn = new javax.swing.JButton();
        typingGameBtn = new javax.swing.JButton();
        studyTipsBtn = new javax.swing.JButton();
        imgLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Study Help");
        setBackground(new java.awt.Color(51, 255, 204));
        setMinimumSize(new java.awt.Dimension(320, 480));
        setResizable(false);

        studyJp.setBackground(new java.awt.Color(0, 255, 204));
        studyJp.setMaximumSize(new java.awt.Dimension(320, 480));
        studyJp.setMinimumSize(new java.awt.Dimension(320, 480));
        studyJp.setPreferredSize(new java.awt.Dimension(320, 480));

        studyLbl.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        studyLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        studyLbl.setText("Study Help");

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

        examTBtn.setForeground(new java.awt.Color(0, 0, 204));
        examTBtn.setText("Exam Timetables");
        examTBtn.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                examTBtnMouseMoved(evt);
            }
        });
        examTBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                examTBtnActionPerformed(evt);
            }
        });

        codePBtn.setForeground(new java.awt.Color(0, 0, 204));
        codePBtn.setText("Code Plagiarism");
        codePBtn.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                codePBtnMouseMoved(evt);
            }
        });
        codePBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codePBtnActionPerformed(evt);
            }
        });

        docCBtn.setForeground(new java.awt.Color(0, 0, 204));
        docCBtn.setText("Document your code");
        docCBtn.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                docCBtnMouseMoved(evt);
            }
        });
        docCBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docCBtnActionPerformed(evt);
            }
        });

        softCBtn.setForeground(new java.awt.Color(0, 0, 204));
        softCBtn.setText("Software Code Policy");
        softCBtn.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                softCBtnMouseMoved(evt);
            }
        });
        softCBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                softCBtnActionPerformed(evt);
            }
        });

        helpTf.setEditable(false);
        helpTf.setBorder(null);
        helpTf.setOpaque(false);
        helpTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpTfActionPerformed(evt);
            }
        });

        previousPapersBtn.setForeground(new java.awt.Color(0, 0, 204));
        previousPapersBtn.setText("Exam Papers");
        previousPapersBtn.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                previousPapersBtnMouseMoved(evt);
            }
        });
        previousPapersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousPapersBtnActionPerformed(evt);
            }
        });

        typingBtn.setForeground(new java.awt.Color(0, 0, 204));
        typingBtn.setText("Touch Typing");
        typingBtn.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                typingBtnMouseMoved(evt);
            }
        });
        typingBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typingBtnActionPerformed(evt);
            }
        });

        typingGameBtn.setForeground(new java.awt.Color(0, 0, 204));
        typingGameBtn.setText("Typing Games");
        typingGameBtn.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                typingGameBtnMouseMoved(evt);
            }
        });
        typingGameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typingGameBtnActionPerformed(evt);
            }
        });

        studyTipsBtn.setForeground(new java.awt.Color(0, 0, 204));
        studyTipsBtn.setText("Study Tips");
        studyTipsBtn.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                studyTipsBtnMouseMoved(evt);
            }
        });
        studyTipsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studyTipsBtnActionPerformed(evt);
            }
        });

        imgLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentservicesapp/calm.gif"))); // NOI18N

        javax.swing.GroupLayout studyJpLayout = new javax.swing.GroupLayout(studyJp);
        studyJp.setLayout(studyJpLayout);
        studyJpLayout.setHorizontalGroup(
            studyJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studyJpLayout.createSequentialGroup()
                .addGroup(studyJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(studyLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(studyJpLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(studyJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(studyJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(examTBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                .addComponent(previousPapersBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                .addComponent(typingBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                .addComponent(typingGameBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                .addComponent(studyTipsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                            .addComponent(codePBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(docCBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(softCBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, studyJpLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(helpTf, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, studyJpLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imgLbl)
                .addContainerGap())
        );
        studyJpLayout.setVerticalGroup(
            studyJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studyJpLayout.createSequentialGroup()
                .addComponent(studyLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imgLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(helpTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(studyTipsBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(typingGameBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(typingBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(previousPapersBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(examTBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(codePBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(docCBtn)
                .addGap(7, 7, 7)
                .addGroup(studyJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(softCBtn, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(studyJp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(studyJp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(336, 519));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        ComputerServicesGUI myGUI = new ComputerServicesGUI();
        myGUI.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backBtnActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        StudentServicesAppGUI myGUI = new StudentServicesAppGUI();
        myGUI.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeBtnActionPerformed

    private void codePBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codePBtnActionPerformed
        //This code is to open a powerpoint file.
        //i.e I got some of this code from the stackoverflow website:
        if (codePlag.toString().endsWith(".ppt")) {

            try {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + codePlag);
            } 
            
            catch (IOException ex) {
                Logger.getLogger(StudyHelpGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
        
        else {
            Desktop desktop = Desktop.getDesktop();

            try {
                desktop.open(codePlag);
            } 
            
            catch (IOException ex) {
                Logger.getLogger(StudyHelpGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_codePBtnActionPerformed

    private void examTBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_examTBtnActionPerformed
        //This code is to open a pdf file.
        //i.e I got some of this code from the stackoverflow website:
        if (timeTable.toString().endsWith(".pdf")) {

            try {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + timeTable);
            } 
            
            catch (IOException ex) {
                Logger.getLogger(StudyHelpGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
        
        else {
            Desktop desktop = Desktop.getDesktop();

            try {
                desktop.open(timeTable);
            } 
            
            catch (IOException ex) {
                Logger.getLogger(StudyHelpGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_examTBtnActionPerformed

    private void docCBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docCBtnActionPerformed
        //This code is to open a word document file.
        //i.e I got some of this code from the stackoverflow website:
        if (codeRev.toString().endsWith(".doc")) {

            try {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + codeRev);
            } 
            
            catch (IOException ex) {
                Logger.getLogger(StudyHelpGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
        
        else {
            Desktop desktop = Desktop.getDesktop();

            try {
                desktop.open(codeRev);
            } 
            
            catch (IOException ex) {
                Logger.getLogger(StudyHelpGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_docCBtnActionPerformed

    private void softCBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_softCBtnActionPerformed
        //This code is to open a word document file.
        //i.e I got some of this code from the stackoverflow website:
        if (codePolicy.toString().endsWith(".doc")) {

            try {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + codePolicy);
            } 
            
            catch (IOException ex) {
                Logger.getLogger(StudyHelpGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
        
        else {
            Desktop desktop = Desktop.getDesktop();

            try {
                desktop.open(codePolicy);
            } 
            
            catch (IOException ex) {
                Logger.getLogger(StudyHelpGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_softCBtnActionPerformed

    private void examTBtnMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_examTBtnMouseMoved
        // Code to display help to the user
        // I found this code on youtube and here is the link: https://www.youtube.com/watch?v=kAftA1LKNds
        helpTf.setText("Exam timetables just scroll to find your course");
    }//GEN-LAST:event_examTBtnMouseMoved

    private void codePBtnMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_codePBtnMouseMoved
        // Code to display help to the user
        // I found this code on youtube and here is the link: https://www.youtube.com/watch?v=kAftA1LKNds
        helpTf.setText("Short powerpoint slide on code plagiarism");
    }//GEN-LAST:event_codePBtnMouseMoved

    private void docCBtnMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_docCBtnMouseMoved
        // Code to display help to the user
        // I found this code on youtube and here is the link: https://www.youtube.com/watch?v=kAftA1LKNds
        helpTf.setText("A word document on how to refrence your code");
    }//GEN-LAST:event_docCBtnMouseMoved

    private void softCBtnMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_softCBtnMouseMoved
        // Code to display help to the user
        // I found this code on youtube and here is the link: https://www.youtube.com/watch?v=kAftA1LKNds
        helpTf.setText("A word document on plagiarism software code policy");
    }//GEN-LAST:event_softCBtnMouseMoved

    private void helpTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_helpTfActionPerformed

    private void previousPapersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousPapersBtnActionPerformed
        //I got this code from the project fourm
        try {
            String URL = "http://nci.silverink.ie/";
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(URL));
        } 
        
        catch (IOException ex) {
            Logger.getLogger(ComputerServicesGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_previousPapersBtnActionPerformed

    private void typingBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typingBtnActionPerformed
        //I got this code from the project fourm
        try {
            String URL = "http://www.typingstudy.com/";
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(URL));
        } 
        
        catch (IOException ex) {
            Logger.getLogger(ComputerServicesGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_typingBtnActionPerformed

    private void typingGameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typingGameBtnActionPerformed
        //I got this code from the project log fourm
        try {
            String URL = "http://games.sense-lang.org/";
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(URL));
        } 
        
        catch (IOException ex) {
            Logger.getLogger(ComputerServicesGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_typingGameBtnActionPerformed

    private void studyTipsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studyTipsBtnActionPerformed
        //I got this code from the project log fourm
        try {
            String URL = "http://www.testtakingtips.com/study/";
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(URL));
        } 
        
        catch (IOException ex) {
            Logger.getLogger(ComputerServicesGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_studyTipsBtnActionPerformed

    private void previousPapersBtnMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previousPapersBtnMouseMoved
        // Code to display help to the user
        // I found this code on youtube and here is the link: https://www.youtube.com/watch?v=kAftA1LKNds
        helpTf.setText("Search the libary for prevous exam papers");
    }//GEN-LAST:event_previousPapersBtnMouseMoved

    private void typingBtnMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_typingBtnMouseMoved
        // Code to display help to the user
        // I found this code on youtube and here is the link: https://www.youtube.com/watch?v=kAftA1LKNds
        helpTf.setText("Pratice your touch typing");
    }//GEN-LAST:event_typingBtnMouseMoved

    private void typingGameBtnMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_typingGameBtnMouseMoved
        // Code to display help to the user
        // I found this code on youtube and here is the link: https://www.youtube.com/watch?v=kAftA1LKNds
        helpTf.setText("Online typing games to help improve your typing");
    }//GEN-LAST:event_typingGameBtnMouseMoved

    private void studyTipsBtnMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studyTipsBtnMouseMoved
        // Code to display help to the user
        // I found this code on youtube and here is the link: https://www.youtube.com/watch?v=kAftA1LKNds
        helpTf.setText("A website with lots of study tips");
    }//GEN-LAST:event_studyTipsBtnMouseMoved

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
            java.util.logging.Logger.getLogger(StudyHelpGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudyHelpGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudyHelpGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudyHelpGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new StudyHelpGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton codePBtn;
    private javax.swing.JButton docCBtn;
    private javax.swing.JButton examTBtn;
    private javax.swing.JTextField helpTf;
    private javax.swing.JButton homeBtn;
    private javax.swing.JLabel imgLbl;
    private javax.swing.JButton previousPapersBtn;
    private javax.swing.JButton softCBtn;
    private javax.swing.JPanel studyJp;
    private javax.swing.JLabel studyLbl;
    private javax.swing.JButton studyTipsBtn;
    private javax.swing.JButton typingBtn;
    private javax.swing.JButton typingGameBtn;
    // End of variables declaration//GEN-END:variables
}
