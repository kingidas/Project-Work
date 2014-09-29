/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentservicesapp;

/**
 *
 * @author Aidan O’ Brien x12117498
 */
//The home button image was found on google images and edited in fireworks the link is: http://images.all-free-download.com/images/graphiclarge/rounded_blue_home_button_4805.jpg
//Picture is sorced form: https//myncistudent.ncirl.ie/StudentServicesAndSupport/StudentSupport/DisabilitySupport/default.aspx
//The picture of Karen Mooney was sorced from: https://myncistudent.ncirl.ie/StudentServicesAndSupport/StudentSupport/DisabilitySupport/MeetingDisabilityOfficer/default.aspx
public class DisabilitySupportGUI extends javax.swing.JFrame {

    /**
     * Creates new form DisabilitySupportGUI
     */
    public DisabilitySupportGUI() {
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

        BackgroundPanel = new javax.swing.JPanel();
        HomeBtn = new javax.swing.JButton();
        HeadingLbl = new javax.swing.JLabel();
        FirstMeetingBtn = new javax.swing.JButton();
        NeedsAssesmentBtn = new javax.swing.JButton();
        EducationSuppBtn = new javax.swing.JButton();
        JoinHandsLbl = new javax.swing.JLabel();
        tutorLbl = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        emailLbl = new javax.swing.JLabel();
        phoneNumberLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Disability Support");
        setMaximumSize(new java.awt.Dimension(320, 480));
        setMinimumSize(new java.awt.Dimension(320, 480));
        setResizable(false);

        BackgroundPanel.setBackground(new java.awt.Color(0, 255, 204));
        BackgroundPanel.setMaximumSize(new java.awt.Dimension(320, 480));
        BackgroundPanel.setPreferredSize(new java.awt.Dimension(320, 480));

        HomeBtn.setBackground(new java.awt.Color(0, 255, 204));
        HomeBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        HomeBtn.setForeground(new java.awt.Color(51, 255, 204));
        HomeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentservicesapp/Home.jpg"))); // NOI18N
        HomeBtn.setBorder(null);
        HomeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeBtnActionPerformed(evt);
            }
        });

        HeadingLbl.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        HeadingLbl.setText("Disability Support Page");

        FirstMeetingBtn.setForeground(new java.awt.Color(0, 0, 204));
        FirstMeetingBtn.setText("FirstMeeting");
        FirstMeetingBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstMeetingBtnActionPerformed(evt);
            }
        });

        NeedsAssesmentBtn.setForeground(new java.awt.Color(0, 0, 204));
        NeedsAssesmentBtn.setText("NeedsAssesment");
        NeedsAssesmentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NeedsAssesmentBtnActionPerformed(evt);
            }
        });

        EducationSuppBtn.setForeground(new java.awt.Color(0, 0, 204));
        EducationSuppBtn.setText("Education Support");
        EducationSuppBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EducationSuppBtnActionPerformed(evt);
            }
        });

        JoinHandsLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentservicesapp/supportPicture.jpg"))); // NOI18N

        tutorLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentservicesapp/Tutor.gif"))); // NOI18N

        nameLbl.setText(" Karen Mooney");

        emailLbl.setText("01 6599269");

        phoneNumberLbl.setText("karen.mooney@ncirl.ie");

        javax.swing.GroupLayout BackgroundPanelLayout = new javax.swing.GroupLayout(BackgroundPanel);
        BackgroundPanel.setLayout(BackgroundPanelLayout);
        BackgroundPanelLayout.setHorizontalGroup(
            BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundPanelLayout.createSequentialGroup()
                .addGroup(BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundPanelLayout.createSequentialGroup()
                        .addGroup(BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BackgroundPanelLayout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(NeedsAssesmentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FirstMeetingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EducationSuppBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(BackgroundPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(tutorLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addGroup(BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JoinHandsLbl)
                                    .addComponent(emailLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(phoneNumberLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(BackgroundPanelLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(HeadingLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 20, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(HomeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        BackgroundPanelLayout.setVerticalGroup(
            BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HeadingLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JoinHandsLbl)
                .addGap(18, 18, 18)
                .addGroup(BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(tutorLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(BackgroundPanelLayout.createSequentialGroup()
                        .addComponent(nameLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(emailLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(phoneNumberLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(FirstMeetingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(NeedsAssesmentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EducationSuppBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HomeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(336, 519));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void HomeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeBtnActionPerformed
        StudentServicesAppGUI myGUI = new StudentServicesAppGUI();
        myGUI.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_HomeBtnActionPerformed

    private void NeedsAssesmentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NeedsAssesmentBtnActionPerformed
        NeedsAssesmentGUI myGui = new NeedsAssesmentGUI();
        myGui.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_NeedsAssesmentBtnActionPerformed

    private void FirstMeetingBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstMeetingBtnActionPerformed
        FirstMeetingGUI myGui = new FirstMeetingGUI();
        myGui.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_FirstMeetingBtnActionPerformed

    private void EducationSuppBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EducationSuppBtnActionPerformed
        EduSupportGUI myGui = new EduSupportGUI();
        myGui.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_EducationSuppBtnActionPerformed

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
            java.util.logging.Logger.getLogger(DisabilitySupportGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisabilitySupportGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisabilitySupportGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisabilitySupportGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DisabilitySupportGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundPanel;
    private javax.swing.JButton EducationSuppBtn;
    private javax.swing.JButton FirstMeetingBtn;
    private javax.swing.JLabel HeadingLbl;
    private javax.swing.JButton HomeBtn;
    private javax.swing.JLabel JoinHandsLbl;
    private javax.swing.JButton NeedsAssesmentBtn;
    private javax.swing.JLabel emailLbl;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JLabel phoneNumberLbl;
    private javax.swing.JLabel tutorLbl;
    // End of variables declaration//GEN-END:variables
}