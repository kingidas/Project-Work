/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentservicesapp;

/**
 *
 * @author Peter Barry x12112631
 */
//The home button image was found on google images and edited in fireworks the link is: http://images.all-free-download.com/images/graphiclarge/rounded_blue_home_button_4805.jpg
public class LearningSupportGui extends javax.swing.JFrame {

    private static class HomeGui {

        public HomeGui() {
        }

        private void setVisible(boolean b) {
            throw new UnsupportedOperationException("Not yet implemented");
        }
    }

    private static class IndividualHelpGui {

        public IndividualHelpGui() {
        }

        private void setVisible(boolean b) {
            throw new UnsupportedOperationException("Not yet implemented");
        }
    }

    private static class StudentServices {

        public StudentServices() {
        }

        private void setVisible(boolean b) {
            throw new UnsupportedOperationException("Not yet implemented");
        }
    }

    private static class StudentsServices extends StudentServices {

        public StudentsServices() {
        }
    }

    /**
     * Creates new form LearningSupportGui
     */
    public LearningSupportGui() {
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

        learningSupportJp = new javax.swing.JPanel();
        learningSupportLbl = new javax.swing.JLabel();
        workshopsBtn = new javax.swing.JButton();
        contactLbl = new javax.swing.JLabel();
        phoneLbl = new javax.swing.JLabel();
        emailLbl = new javax.swing.JLabel();
        homeBtn = new javax.swing.JButton();
        learningSupportJsp = new javax.swing.JScrollPane();
        learningSupportTa = new javax.swing.JTextArea();
        lQBtn = new javax.swing.JButton();
        mikeLbl = new javax.swing.JLabel();
        qLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Learning Support");
        setBackground(new java.awt.Color(0, 255, 204));
        setMaximumSize(new java.awt.Dimension(320, 480));
        setMinimumSize(new java.awt.Dimension(320, 480));
        setResizable(false);

        learningSupportJp.setBackground(new java.awt.Color(0, 255, 204));
        learningSupportJp.setForeground(new java.awt.Color(0, 255, 204));
        learningSupportJp.setEnabled(false);
        learningSupportJp.setMaximumSize(new java.awt.Dimension(320, 480));
        learningSupportJp.setMinimumSize(new java.awt.Dimension(320, 480));
        learningSupportJp.setPreferredSize(new java.awt.Dimension(320, 480));

        learningSupportLbl.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        learningSupportLbl.setText("Learning Support");

        workshopsBtn.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        workshopsBtn.setForeground(new java.awt.Color(0, 0, 204));
        workshopsBtn.setText("Enter Workshops");
        workshopsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workshopsBtnActionPerformed(evt);
            }
        });

        contactLbl.setText("Contact: Mike Goldrick");

        phoneLbl.setText("Phone: 01 6599245");

        emailLbl.setText("Email: michael.goldrick@ncirl.ie");

        homeBtn.setBackground(new java.awt.Color(0, 255, 204));
        homeBtn.setForeground(new java.awt.Color(0, 255, 204));
        homeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentservicesapp/Home.jpg"))); // NOI18N
        homeBtn.setBorder(null);
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });

        learningSupportJsp.setBorder(null);
        learningSupportJsp.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        learningSupportJsp.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        learningSupportTa.setBackground(new java.awt.Color(0, 255, 204));
        learningSupportTa.setColumns(20);
        learningSupportTa.setEditable(false);
        learningSupportTa.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        learningSupportTa.setRows(5);
        learningSupportTa.setText("Here at the NCI we believe that each\nstudent can have affective and enjoyable\nlearning experience. To ensure that this\nbelief becomes practice, it is my goal \nto support all full-time, part-time, and\noff campus students in their academic\nstudies.");
        learningSupportTa.setBorder(null);
        learningSupportTa.setDisabledTextColor(new java.awt.Color(0, 51, 51));
        learningSupportTa.setEnabled(false);
        learningSupportJsp.setViewportView(learningSupportTa);

        lQBtn.setForeground(new java.awt.Color(0, 0, 204));
        lQBtn.setText("Leave Query");
        lQBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lQBtnActionPerformed(evt);
            }
        });

        mikeLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/StudentServicesApp/mike2.jpg"))); // NOI18N

        qLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/StudentServicesApp/qm1.jpg"))); // NOI18N

        javax.swing.GroupLayout learningSupportJpLayout = new javax.swing.GroupLayout(learningSupportJp);
        learningSupportJp.setLayout(learningSupportJpLayout);
        learningSupportJpLayout.setHorizontalGroup(
            learningSupportJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(learningSupportJpLayout.createSequentialGroup()
                .addGroup(learningSupportJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, learningSupportJpLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(learningSupportJsp))
                    .addGroup(learningSupportJpLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(learningSupportJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(learningSupportJpLayout.createSequentialGroup()
                                .addGroup(learningSupportJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(contactLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(phoneLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 19, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mikeLbl))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, learningSupportJpLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(workshopsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))
                    .addGroup(learningSupportJpLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lQBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(qLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(homeBtn))
                    .addGroup(learningSupportJpLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(learningSupportLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        learningSupportJpLayout.setVerticalGroup(
            learningSupportJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(learningSupportJpLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(learningSupportLbl)
                .addGap(15, 15, 15)
                .addGroup(learningSupportJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(learningSupportJpLayout.createSequentialGroup()
                        .addComponent(contactLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(phoneLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(emailLbl))
                    .addComponent(mikeLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(learningSupportJsp, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(workshopsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(learningSupportJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(learningSupportJpLayout.createSequentialGroup()
                        .addComponent(lQBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(9, 9, 9))
                    .addComponent(qLbl)
                    .addComponent(homeBtn, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(learningSupportJp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(learningSupportJp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(336, 519));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void workshopsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workshopsBtnActionPerformed
        TopicsGui myGui = new TopicsGui();
        myGui.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_workshopsBtnActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        StudentServicesAppGUI myGUI = new StudentServicesAppGUI();
        myGUI.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeBtnActionPerformed

    private void lQBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lQBtnActionPerformed
        ContactPersonGui myGui = new ContactPersonGui();
        myGui.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lQBtnActionPerformed

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
            java.util.logging.Logger.getLogger(LearningSupportGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LearningSupportGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LearningSupportGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LearningSupportGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LearningSupportGui().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel contactLbl;
    private javax.swing.JLabel emailLbl;
    private javax.swing.JButton homeBtn;
    private javax.swing.JButton lQBtn;
    private javax.swing.JPanel learningSupportJp;
    private javax.swing.JScrollPane learningSupportJsp;
    private javax.swing.JLabel learningSupportLbl;
    private javax.swing.JTextArea learningSupportTa;
    private javax.swing.JLabel mikeLbl;
    private javax.swing.JLabel phoneLbl;
    private javax.swing.JLabel qLbl;
    private javax.swing.JButton workshopsBtn;
    // End of variables declaration//GEN-END:variables
}