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
//The back button image was found on google images and edited in fireworks the link is: http://4.bp.blogspot.com/-hTRk-er3XlY/TZwLBAy9Y6I/AAAAAAAAAQA/upea2uWVG5A/s1600/back_button.jpg
//Picture is sorced from: https//myncistudent.ncirl.ie/StudentServicesAndSupport/StudentSupport/DisabilitySupport/default.aspx
public class NeedsAssesmentGUI extends javax.swing.JFrame {

    /**
     * Creates new form NeedsAssesment
     */
    public NeedsAssesmentGUI() {
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

        jLabel2 = new javax.swing.JLabel();
        BackgroundJp = new javax.swing.JPanel();
        HomeBtn = new javax.swing.JButton();
        HeadingLbl = new javax.swing.JLabel();
        InformationPaneJsp = new javax.swing.JScrollPane();
        InfomationText = new javax.swing.JTextArea();
        PictureLbl = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Needs Assesment");
        setMaximumSize(new java.awt.Dimension(320, 480));
        setMinimumSize(new java.awt.Dimension(320, 480));
        setResizable(false);

        BackgroundJp.setBackground(new java.awt.Color(0, 255, 204));
        BackgroundJp.setEnabled(false);
        BackgroundJp.setMaximumSize(new java.awt.Dimension(320, 480));
        BackgroundJp.setMinimumSize(new java.awt.Dimension(320, 480));
        BackgroundJp.setPreferredSize(new java.awt.Dimension(320, 480));

        HomeBtn.setBackground(new java.awt.Color(0, 255, 204));
        HomeBtn.setForeground(new java.awt.Color(0, 255, 204));
        HomeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentservicesapp/Home.jpg"))); // NOI18N
        HomeBtn.setBorder(null);
        HomeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeBtnActionPerformed(evt);
            }
        });

        HeadingLbl.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        HeadingLbl.setText("Needs Assesment Page");

        InformationPaneJsp.setBorder(null);

        InfomationText.setEditable(false);
        InfomationText.setBackground(new java.awt.Color(0, 255, 204));
        InfomationText.setColumns(20);
        InfomationText.setRows(5);
        InfomationText.setText("The needs assesment\nofficer will have a\none to one dissussion\nwith the individual to \ncomfirm if they a \neligiable to enter the \nprogramme. ");
        InformationPaneJsp.setViewportView(InfomationText);

        PictureLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentservicesapp/confidential.jpg"))); // NOI18N
        PictureLbl.setText("jLabel3");

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
                .addGroup(BackgroundJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundJpLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(BackgroundJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HeadingLbl)
                            .addComponent(InformationPaneJsp, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(BackgroundJpLayout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(PictureLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 28, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundJpLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(HomeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        BackgroundJpLayout.setVerticalGroup(
            BackgroundJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundJpLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(HeadingLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(PictureLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(InformationPaneJsp, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(BackgroundJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HomeBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundJp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundJp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(336, 519));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void HomeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeBtnActionPerformed
        StudentServicesAppGUI myGUI = new StudentServicesAppGUI();
        myGUI.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_HomeBtnActionPerformed

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
            java.util.logging.Logger.getLogger(NeedsAssesmentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NeedsAssesmentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NeedsAssesmentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NeedsAssesmentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NeedsAssesmentGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundJp;
    private javax.swing.JLabel HeadingLbl;
    private javax.swing.JButton HomeBtn;
    private javax.swing.JTextArea InfomationText;
    private javax.swing.JScrollPane InformationPaneJsp;
    private javax.swing.JLabel PictureLbl;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
