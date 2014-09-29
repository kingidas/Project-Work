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
 * @author Aidan O’ Brien x12117498
 */
//The home button image was found on google images and edited in fireworks the link is: http://images.all-free-download.com/images/graphiclarge/rounded_blue_home_button_4805.jpg
//The back button image was found on google images and edited in fireworks the link is: http://4.bp.blogspot.com/-hTRk-er3XlY/TZwLBAy9Y6I/AAAAAAAAAQA/upea2uWVG5A/s1600/back_button.jpg
//Picture is sorced form: https//myncistudent.ncirl.ie/StudentServicesAndSupport/StudentSupport/DisabilitySupport/default.aspx;
public class EduSupportGUI extends javax.swing.JFrame {

    /**
     * Creates new form EduSuopBtn
     */
    public EduSupportGUI() {
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

        BackgroundJp = new javax.swing.JPanel();
        HeadingBtn = new javax.swing.JLabel();
        HomeBtn = new javax.swing.JButton();
        OverviewLbl = new javax.swing.JLabel();
        InformationPaneJsp = new javax.swing.JScrollPane();
        InformationTa = new javax.swing.JTextArea();
        PictureLbl = new javax.swing.JLabel();
        UserGuideBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Education Support");
        setMaximumSize(new java.awt.Dimension(320, 480));
        setMinimumSize(new java.awt.Dimension(320, 480));
        setResizable(false);

        BackgroundJp.setBackground(new java.awt.Color(0, 255, 204));
        BackgroundJp.setEnabled(false);
        BackgroundJp.setMaximumSize(new java.awt.Dimension(320, 480));
        BackgroundJp.setMinimumSize(new java.awt.Dimension(320, 480));
        BackgroundJp.setPreferredSize(new java.awt.Dimension(320, 480));

        HeadingBtn.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        HeadingBtn.setText("Education Support");
        HeadingBtn.setMaximumSize(new java.awt.Dimension(320, 480));

        HomeBtn.setBackground(new java.awt.Color(0, 255, 204));
        HomeBtn.setForeground(new java.awt.Color(0, 255, 204));
        HomeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentservicesapp/Home.jpg"))); // NOI18N
        HomeBtn.setBorder(null);
        HomeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeBtnActionPerformed(evt);
            }
        });

        OverviewLbl.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        OverviewLbl.setText("Overview");

        InformationPaneJsp.setBorder(null);

        InformationTa.setBackground(new java.awt.Color(0, 255, 204));
        InformationTa.setColumns(20);
        InformationTa.setEditable(false);
        InformationTa.setRows(5);
        InformationTa.setText("Provisions:\nNote Takers;\nAcademic Tutors;\nSign Language \nInterpreters;\nEducational Assist;\nAcademic Assist;\nReading Support;\n");
        InformationTa.setBorder(null);
        InformationPaneJsp.setViewportView(InformationTa);

        PictureLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentservicesapp/equal.jpg"))); // NOI18N
        PictureLbl.setText("jLabel2");

        UserGuideBtn.setForeground(new java.awt.Color(0, 0, 204));
        UserGuideBtn.setText("UserGuide");
        UserGuideBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserGuideBtnActionPerformed(evt);
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

        javax.swing.GroupLayout BackgroundJpLayout = new javax.swing.GroupLayout(BackgroundJp);
        BackgroundJp.setLayout(BackgroundJpLayout);
        BackgroundJpLayout.setHorizontalGroup(
            BackgroundJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundJpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BackgroundJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundJpLayout.createSequentialGroup()
                        .addGroup(BackgroundJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BackgroundJpLayout.createSequentialGroup()
                                .addComponent(PictureLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(HeadingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BackgroundJpLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(BackgroundJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(InformationPaneJsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(OverviewLbl)
                                    .addGroup(BackgroundJpLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(UserGuideBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 47, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundJpLayout.createSequentialGroup()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(HomeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        BackgroundJpLayout.setVerticalGroup(
            BackgroundJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundJpLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(BackgroundJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PictureLbl)
                    .addComponent(HeadingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(BackgroundJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundJpLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(OverviewLbl)
                        .addGap(18, 18, 18)
                        .addComponent(InformationPaneJsp, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UserGuideBtn)
                        .addGap(30, 98, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundJpLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(BackgroundJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(HomeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundJp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundJp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(336, 519));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void HomeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeBtnActionPerformed
        StudentServicesAppGUI myGUI = new StudentServicesAppGUI();
        myGUI.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_HomeBtnActionPerformed

    private void UserGuideBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserGuideBtnActionPerformed
        //This code was sourced from the project log fourm
        try {
            String URL = "https://myncistudent.ncirl.ie/StudentServicesAndSupport/StudentSupport/DisabilitySupport/AssistiveTechnology/User%20Guides/User%20Guides.aspxyourURL.com";
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(URL));

        } 
        
        catch (IOException ex) {
            Logger.getLogger(EduSupportGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_UserGuideBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        DisabilitySupportGUI myGUI = new DisabilitySupportGUI();
        myGUI.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backBtnActionPerformed

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
            java.util.logging.Logger.getLogger(EduSupportGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EduSupportGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EduSupportGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EduSupportGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EduSupportGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundJp;
    private javax.swing.JLabel HeadingBtn;
    private javax.swing.JButton HomeBtn;
    private javax.swing.JScrollPane InformationPaneJsp;
    private javax.swing.JTextArea InformationTa;
    private javax.swing.JLabel OverviewLbl;
    private javax.swing.JLabel PictureLbl;
    private javax.swing.JButton UserGuideBtn;
    private javax.swing.JButton backBtn;
    // End of variables declaration//GEN-END:variables
}