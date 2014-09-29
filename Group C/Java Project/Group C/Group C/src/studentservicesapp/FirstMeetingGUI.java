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
public class FirstMeetingGUI extends javax.swing.JFrame {

    /**
     * Creates new form firstMetting
     */
    public FirstMeetingGUI() {
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
        InformationJsp = new javax.swing.JScrollPane();
        InformationTa = new javax.swing.JTextArea();
        HomeBtn = new javax.swing.JButton();
        HeadingLbl = new javax.swing.JLabel();
        QueryBtn = new javax.swing.JButton();
        PictureLbl = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("First Meeting");
        setBackground(new java.awt.Color(255, 153, 51));
        setMaximumSize(new java.awt.Dimension(320, 480));
        setMinimumSize(new java.awt.Dimension(320, 480));
        setResizable(false);

        BackgroundJp.setBackground(new java.awt.Color(0, 255, 204));
        BackgroundJp.setMaximumSize(new java.awt.Dimension(320, 480));
        BackgroundJp.setMinimumSize(new java.awt.Dimension(320, 480));
        BackgroundJp.setPreferredSize(new java.awt.Dimension(320, 480));

        InformationJsp.setBorder(null);

        InformationTa.setEditable(false);
        InformationTa.setBackground(new java.awt.Color(0, 255, 204));
        InformationTa.setColumns(20);
        InformationTa.setRows(5);
        InformationTa.setText("NCI has made a firm commitment to\nthe principle of widening\nparticipation and works to develop\na student body that reflects the\ndiversity in Irish society.");
        InformationJsp.setViewportView(InformationTa);

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
        HeadingLbl.setText("First Meeting Page");

        QueryBtn.setForeground(new java.awt.Color(0, 0, 204));
        QueryBtn.setText("Query");
        QueryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QueryBtnActionPerformed(evt);
            }
        });

        PictureLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentservicesapp/support.jpg"))); // NOI18N

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundJpLayout.createSequentialGroup()
                .addGap(0, 21, Short.MAX_VALUE)
                .addComponent(InformationJsp, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(BackgroundJpLayout.createSequentialGroup()
                .addGroup(BackgroundJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundJpLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(HomeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BackgroundJpLayout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(PictureLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundJpLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(HeadingLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(BackgroundJpLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(QueryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BackgroundJpLayout.setVerticalGroup(
            BackgroundJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundJpLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(HeadingLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(PictureLbl)
                .addGap(40, 40, 40)
                .addComponent(InformationJsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(QueryBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(BackgroundJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(HomeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void QueryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QueryBtnActionPerformed
        QueryMeGUI myGui = new QueryMeGUI();
        myGui.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_QueryBtnActionPerformed

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
            java.util.logging.Logger.getLogger(FirstMeetingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FirstMeetingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FirstMeetingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FirstMeetingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FirstMeetingGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundJp;
    private javax.swing.JLabel HeadingLbl;
    private javax.swing.JButton HomeBtn;
    private javax.swing.JScrollPane InformationJsp;
    private javax.swing.JTextArea InformationTa;
    private javax.swing.JLabel PictureLbl;
    private javax.swing.JButton QueryBtn;
    private javax.swing.JButton backBtn;
    // End of variables declaration//GEN-END:variables
}