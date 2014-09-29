/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentservicesapp;

import javax.swing.JOptionPane;

/**
 *
 * @author Niall Martin x00110321
 */
//The home button image was found on google images and edited in fireworks the link is: http://images.all-free-download.com/images/graphiclarge/rounded_blue_home_button_4805.jpg
//The back button image was found on google images and edited in fireworks the link is: http://4.bp.blogspot.com/-hTRk-er3XlY/TZwLBAy9Y6I/AAAAAAAAAQA/upea2uWVG5A/s1600/back_button.jpg
public class HTMLQuizGUI extends javax.swing.JFrame {

    /**
     * Creates new form HTMLQuizGUI
     */
    public HTMLQuizGUI() {
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

        question1Bg = new javax.swing.ButtonGroup();
        question2Bg = new javax.swing.ButtonGroup();
        question3Bg = new javax.swing.ButtonGroup();
        HymlQuizJp = new javax.swing.JPanel();
        htmlTLbl = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();
        q1Lbl = new javax.swing.JLabel();
        q1ARb = new javax.swing.JRadioButton();
        q1BRb = new javax.swing.JRadioButton();
        q1CRb = new javax.swing.JRadioButton();
        q2Lbl = new javax.swing.JLabel();
        q2ARb = new javax.swing.JRadioButton();
        q2BRb = new javax.swing.JRadioButton();
        q2CRb = new javax.swing.JRadioButton();
        q3Lbl = new javax.swing.JLabel();
        q3ARb = new javax.swing.JRadioButton();
        q3BRb = new javax.swing.JRadioButton();
        q3CRb = new javax.swing.JRadioButton();
        submitBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HTML QUIZ");
        setBackground(new java.awt.Color(0, 204, 204));
        setMinimumSize(new java.awt.Dimension(320, 480));
        setResizable(false);

        HymlQuizJp.setBackground(new java.awt.Color(0, 255, 204));
        HymlQuizJp.setMaximumSize(new java.awt.Dimension(320, 480));
        HymlQuizJp.setMinimumSize(new java.awt.Dimension(320, 480));
        HymlQuizJp.setPreferredSize(new java.awt.Dimension(320, 480));

        htmlTLbl.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        htmlTLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        htmlTLbl.setText("HTML QUIZ");

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

        q1Lbl.setText("Q1. What does this HTML tag <ul> stand for?");

        question1Bg.add(q1ARb);
        q1ARb.setText("a. Unordered List");
        q1ARb.setOpaque(false);

        question1Bg.add(q1BRb);
        q1BRb.setText("b. List");
        q1BRb.setOpaque(false);
        q1BRb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q1BRbActionPerformed(evt);
            }
        });

        question1Bg.add(q1CRb);
        q1CRb.setText("c. Ordered List");
        q1CRb.setOpaque(false);

        q2Lbl.setText("Q2. What is W3C short for?");

        question2Bg.add(q2ARb);
        q2ARb.setText("a. World Wide Web Consortium");
        q2ARb.setOpaque(false);

        question2Bg.add(q2BRb);
        q2BRb.setText("b. World 3 Consortium");
        q2BRb.setOpaque(false);

        question2Bg.add(q2CRb);
        q2CRb.setText("c. Will West Web Consortium");
        q2CRb.setOpaque(false);

        q3Lbl.setText("Q3. What is HTTP short for?");

        question3Bg.add(q3ARb);
        q3ARb.setText("a. High Transfer Text Protocol");
        q3ARb.setOpaque(false);

        question3Bg.add(q3BRb);
        q3BRb.setText("b. Hyper Transfer Text Protocol");
        q3BRb.setOpaque(false);

        question3Bg.add(q3CRb);
        q3CRb.setText("c. Hyper Text Transfer Protocol");
        q3CRb.setOpaque(false);

        submitBtn.setForeground(new java.awt.Color(0, 0, 204));
        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HymlQuizJpLayout = new javax.swing.GroupLayout(HymlQuizJp);
        HymlQuizJp.setLayout(HymlQuizJpLayout);
        HymlQuizJpLayout.setHorizontalGroup(
            HymlQuizJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(htmlTLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(HymlQuizJpLayout.createSequentialGroup()
                .addGroup(HymlQuizJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HymlQuizJpLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(HymlQuizJpLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(HymlQuizJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(q2Lbl)
                            .addComponent(q1Lbl)
                            .addComponent(q3Lbl))
                        .addGap(0, 56, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(HymlQuizJpLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(HymlQuizJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HymlQuizJpLayout.createSequentialGroup()
                        .addComponent(q1ARb)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(HymlQuizJpLayout.createSequentialGroup()
                        .addGroup(HymlQuizJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(q1BRb)
                            .addComponent(q1CRb))
                        .addContainerGap())))
            .addGroup(HymlQuizJpLayout.createSequentialGroup()
                .addGroup(HymlQuizJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HymlQuizJpLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(HymlQuizJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(HymlQuizJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(q3BRb)
                                .addComponent(q3CRb)
                                .addComponent(q3ARb))
                            .addGroup(HymlQuizJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(q2BRb)
                                .addComponent(q2ARb)
                                .addComponent(q2CRb))))
                    .addGroup(HymlQuizJpLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        HymlQuizJpLayout.setVerticalGroup(
            HymlQuizJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HymlQuizJpLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(htmlTLbl)
                .addGap(18, 18, 18)
                .addComponent(q1Lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(q1ARb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addComponent(q1BRb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(q1CRb)
                .addGap(18, 18, 18)
                .addComponent(q2Lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(q2ARb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(q2BRb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(q2CRb)
                .addGap(18, 18, 18)
                .addComponent(q3Lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(q3ARb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(q3BRb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(q3CRb)
                .addGap(18, 18, 18)
                .addComponent(submitBtn)
                .addGap(15, 15, 15)
                .addGroup(HymlQuizJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(homeBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HymlQuizJp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HymlQuizJp, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-336)/2, (screenSize.height-519)/2, 336, 519);
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

    private void q1BRbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q1BRbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_q1BRbActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        //If statement for HTML quiz        
        if (q1ARb.isSelected() && q2ARb.isSelected() && q3CRb.isSelected()) {

            JOptionPane.showMessageDialog(null, "Well Done" + "\n" + " You answered all right");

        } 
        
        else if (q1ARb.isSelected() && q2ARb.isSelected() && q3ARb.isSelected() || q1ARb.isSelected()
                && q2ARb.isSelected() && q3BRb.isSelected() || q1BRb.isSelected() && q2ARb.isSelected()
                && q3CRb.isSelected() || q1ARb.isSelected() && q2BRb.isSelected() && q3CRb.isSelected()
                || q1CRb.isSelected() && q2ARb.isSelected() && q3CRb.isSelected() || q1ARb.isSelected()
                && q2CRb.isSelected() && q3CRb.isSelected()) {

            JOptionPane.showMessageDialog(null, "You got 2 out of 3 right");

        } 
        
        else if (q1ARb.isSelected() && q2BRb.isSelected() && q3ARb.isSelected() || q1ARb.isSelected()
                && q2BRb.isSelected() && q3BRb.isSelected() || q1ARb.isSelected() && q2CRb.isSelected()
                && q3ARb.isSelected() || q1ARb.isSelected() && q2CRb.isSelected() && q3BRb.isSelected()
                || q1BRb.isSelected() && q2ARb.isSelected() && q3ARb.isSelected() || q1BRb.isSelected()
                && q2ARb.isSelected() && q3BRb.isSelected() || q1CRb.isSelected() && q2ARb.isSelected()
                && q3ARb.isSelected() || q1CRb.isSelected() && q2ARb.isSelected() && q3BRb.isSelected()
                || q1BRb.isSelected() && q2BRb.isSelected() && q3CRb.isSelected() || q1CRb.isSelected()
                && q2BRb.isSelected() && q3CRb.isSelected() || q1CRb.isSelected() && q2CRb.isSelected()
                && q3CRb.isSelected() || q1BRb.isSelected() && q2CRb.isSelected() && q3CRb.isSelected()) {

            JOptionPane.showMessageDialog(null, "You only got 1 question right");

        } 
        
        else {
            JOptionPane.showMessageDialog(null, "Un Lucky" + "\n" + "You answered all questions  wrong");
        }
    }//GEN-LAST:event_submitBtnActionPerformed

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
            java.util.logging.Logger.getLogger(HTMLQuizGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HTMLQuizGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HTMLQuizGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HTMLQuizGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new HTMLQuizGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HymlQuizJp;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton homeBtn;
    private javax.swing.JLabel htmlTLbl;
    private javax.swing.JRadioButton q1ARb;
    private javax.swing.JRadioButton q1BRb;
    private javax.swing.JRadioButton q1CRb;
    private javax.swing.JLabel q1Lbl;
    private javax.swing.JRadioButton q2ARb;
    private javax.swing.JRadioButton q2BRb;
    private javax.swing.JRadioButton q2CRb;
    private javax.swing.JLabel q2Lbl;
    private javax.swing.JRadioButton q3ARb;
    private javax.swing.JRadioButton q3BRb;
    private javax.swing.JRadioButton q3CRb;
    private javax.swing.JLabel q3Lbl;
    private javax.swing.ButtonGroup question1Bg;
    private javax.swing.ButtonGroup question2Bg;
    private javax.swing.ButtonGroup question3Bg;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables
}
