/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentservicesapp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Niall Martin x00110321
 */
//The home button image was found on google images and edited in fireworks the link is: http://images.all-free-download.com/images/graphiclarge/rounded_blue_home_button_4805.jpg
//The back button image was found on google images and edited in fireworks the link is: http://4.bp.blogspot.com/-hTRk-er3XlY/TZwLBAy9Y6I/AAAAAAAAAQA/upea2uWVG5A/s1600/back_button.jpg
public class ContactUsGUI extends javax.swing.JFrame {

    private ArrayList<ContactUs> details;
    private String fName, daysFree, email, cTitle, query;
    private int count, sNum;

    /**
     * Creates new form ContactUsGUI
     */
    public ContactUsGUI() {
        initComponents();

        details = new ArrayList<>();
        fName = new String();
        daysFree = new String();
        email = new String();
        cTitle = new String();
        query = new String();
        sNum = 0;
        count = 0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contactJp = new javax.swing.JPanel();
        fNameLbl = new javax.swing.JLabel();
        fNameTf = new javax.swing.JTextField();
        sNumLbl = new javax.swing.JLabel();
        sNumTf = new javax.swing.JTextField();
        emailLbl = new javax.swing.JLabel();
        emailTf = new javax.swing.JTextField();
        cTitleLbl = new javax.swing.JLabel();
        cTitleTf = new javax.swing.JTextField();
        QueryLbl = new javax.swing.JLabel();
        daysFreeLbl = new javax.swing.JLabel();
        daysFreeTf = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();
        contactTitleLbl = new javax.swing.JLabel();
        displayBtn = new javax.swing.JButton();
        clearAllBtn = new javax.swing.JButton();
        submitBtn = new javax.swing.JButton();
        hoverBarTf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        qTA = new javax.swing.JTextArea();
        saveBtn = new javax.swing.JButton();
        viewBtn = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();
        delBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 204));
        setMinimumSize(new java.awt.Dimension(320, 420));
        setResizable(false);

        contactJp.setBackground(new java.awt.Color(0, 255, 204));
        contactJp.setForeground(new java.awt.Color(255, 255, 255));
        contactJp.setMaximumSize(new java.awt.Dimension(320, 480));
        contactJp.setMinimumSize(new java.awt.Dimension(320, 480));
        contactJp.setPreferredSize(new java.awt.Dimension(320, 480));

        fNameLbl.setText("Student Name");

        fNameTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNameTfActionPerformed(evt);
            }
        });

        sNumLbl.setText("Student Number");

        sNumTf.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                sNumTfMouseMoved(evt);
            }
        });

        emailLbl.setText("E-mail");

        emailTf.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                emailTfMouseMoved(evt);
            }
        });

        cTitleLbl.setText("Course Title");

        cTitleTf.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                cTitleTfMouseMoved(evt);
            }
        });
        cTitleTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cTitleTfActionPerformed(evt);
            }
        });

        QueryLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        QueryLbl.setText("Please Leave Us Your Query");

        daysFreeLbl.setText("Days you are free");

        daysFreeTf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                daysFreeTfMouseClicked(evt);
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

        contactTitleLbl.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        contactTitleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contactTitleLbl.setText("Contact Us");

        displayBtn.setForeground(new java.awt.Color(0, 0, 204));
        displayBtn.setText("Display");
        displayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayBtnActionPerformed(evt);
            }
        });

        clearAllBtn.setForeground(new java.awt.Color(0, 0, 204));
        clearAllBtn.setText("Clear");
        clearAllBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearAllBtnActionPerformed(evt);
            }
        });

        submitBtn.setForeground(new java.awt.Color(0, 0, 204));
        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        hoverBarTf.setEditable(false);
        hoverBarTf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        hoverBarTf.setBorder(null);
        hoverBarTf.setOpaque(false);
        hoverBarTf.setPreferredSize(new java.awt.Dimension(18, 14));

        qTA.setColumns(20);
        qTA.setRows(5);
        jScrollPane1.setViewportView(qTA);

        saveBtn.setForeground(new java.awt.Color(0, 0, 204));
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        viewBtn.setForeground(new java.awt.Color(0, 0, 204));
        viewBtn.setText("View saved");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });

        searchBtn.setForeground(new java.awt.Color(0, 0, 204));
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        delBtn.setForeground(new java.awt.Color(0, 0, 204));
        delBtn.setText("Delete");
        delBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contactJpLayout = new javax.swing.GroupLayout(contactJp);
        contactJp.setLayout(contactJpLayout);
        contactJpLayout.setHorizontalGroup(
            contactJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contactJpLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(contactTitleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(contactJpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contactJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contactJpLayout.createSequentialGroup()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hoverBarTf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(58, 58, 58)
                        .addComponent(homeBtn))
                    .addGroup(contactJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(QueryLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(contactJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(contactJpLayout.createSequentialGroup()
                                .addGroup(contactJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cTitleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(emailLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(contactJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cTitleTf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailTf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(contactJpLayout.createSequentialGroup()
                                .addGroup(contactJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(contactJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(viewBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(displayBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(delBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(contactJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(clearAllBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(searchBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contactJpLayout.createSequentialGroup()
                                .addGroup(contactJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(daysFreeLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fNameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sNumLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(contactJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sNumTf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fNameTf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(daysFreeTf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jScrollPane1))
                .addGap(37, 37, 37))
        );
        contactJpLayout.setVerticalGroup(
            contactJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contactJpLayout.createSequentialGroup()
                .addComponent(contactTitleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contactJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contactJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sNumTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sNumLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contactJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(daysFreeTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(daysFreeLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contactJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cTitleTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cTitleLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contactJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(QueryLbl)
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contactJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitBtn)
                    .addComponent(displayBtn)
                    .addComponent(clearAllBtn))
                .addGap(18, 18, 18)
                .addGroup(contactJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn)
                    .addComponent(viewBtn)
                    .addComponent(searchBtn))
                .addGap(18, 18, 18)
                .addGroup(contactJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(contactJpLayout.createSequentialGroup()
                        .addComponent(delBtn)
                        .addGap(28, 28, 28)
                        .addGroup(contactJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(hoverBarTf, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(homeBtn))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contactJp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contactJp, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-336)/2, (screenSize.height-523)/2, 336, 523);
    }// </editor-fold>//GEN-END:initComponents

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        //Code to check and store code in ArrayList
        fName = fNameTf.getText();
        sNum = Integer.parseInt(sNumTf.getText());
        daysFree = daysFreeTf.getText();
        email = emailTf.getText();
        cTitle = cTitleTf.getText();
        query = qTA.getText();

        ContactUs c = new ContactUs();

        c.setfName(fName);
        c.setDaysFree(daysFree);
        c.setsNum(sNum);
        c.setEmail(email);
        c.setcTitle(cTitle);
        c.setQuery(query);

        details.add(c);

        count++;
    }//GEN-LAST:event_submitBtnActionPerformed

    private void displayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayBtnActionPerformed
        // Code to loop through the ArrayList and then display its content
        for (int i = 0; i < details.size(); i++) {
            JOptionPane.showMessageDialog(null, "Student Name: " + details.get(i).getfName() + "\n Student Number: " + details.get(i).getsNum() + "\n Days you dont have lectures: " + details.get(i).getDaysFree() + "\n E-mail: " + details.get(i).getEmail() + "\n Course Title: " + details.get(i).getcTitle() + "\n Query: " + details.get(i).getQuery());
        }
    }//GEN-LAST:event_displayBtnActionPerformed

    private void cTitleTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cTitleTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cTitleTfActionPerformed

    private void clearAllBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearAllBtnActionPerformed
        // Code to clear the text in the textfields
        fNameTf.setText("");
        sNumTf.setText("");
        daysFreeTf.setText("");
        cTitleTf.setText("");
        emailTf.setText("");
        qTA.setText("");
    }//GEN-LAST:event_clearAllBtnActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        StudentServicesAppGUI myGUI = new StudentServicesAppGUI();
        myGUI.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        ComputerServicesGUI myGUI = new ComputerServicesGUI();
        myGUI.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backBtnActionPerformed

    private void sNumTfMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sNumTfMouseMoved
        // Code to display help to the user
        // I found this code on youtube and here is the link: https://www.youtube.com/watch?v=kAftA1LKNds
        hoverBarTf.setText("Your student number without the X");
    }//GEN-LAST:event_sNumTfMouseMoved

    private void cTitleTfMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cTitleTfMouseMoved
        // Code to display help to the user
        // // I found this code on youtube and here is the link: https://www.youtube.com/watch?v=kAftA1LKNds
        hoverBarTf.setText("Example HCC1");
    }//GEN-LAST:event_cTitleTfMouseMoved

    private void daysFreeTfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_daysFreeTfMouseClicked
    }//GEN-LAST:event_daysFreeTfMouseClicked

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        File outFile;
        FileOutputStream fStream;
        ObjectOutputStream oStream;

        try {
            outFile = new File("info.data");
            fStream = new FileOutputStream(outFile);
            oStream = new ObjectOutputStream(fStream);

            oStream.writeObject(details);

            JOptionPane.showMessageDialog(null, "File saved succsesfuly");

            oStream.close();
        } 
        
        catch (IOException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void emailTfMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailTfMouseMoved
        // I found this code on youtube and here is the link: https://www.youtube.com/watch?v=kAftA1LKNds
        hoverBarTf.setText("Your student e-mail");
    }//GEN-LAST:event_emailTfMouseMoved

    private void fNameTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNameTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fNameTfActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        File outFile;
        FileInputStream fStream;
        ObjectInputStream oStream;

        try {
            outFile = new File("info.data");
            fStream = new FileInputStream(outFile);
            oStream = new ObjectInputStream(fStream);

            ArrayList<ContactUs> xList;
            xList = (ArrayList<ContactUs>) oStream.readObject();
            
            for (ContactUs x : xList) {
                JOptionPane.showMessageDialog(null, "Name: " + x.getfName() + "\n Number: " + x.getsNum() + "\n Days free: " + x.getDaysFree() + "\n Course: " + x.getcTitle() + "\n E-mail: " + x.getEmail() + "\n Query: " + x.getQuery());
            }

            oStream.close();
        } 
        
        catch (IOException e) {
            System.out.println(e);
        } 
        
        catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_viewBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        String searchType = JOptionPane.showInputDialog(null, "Please enter the student name you wish to search for");

        for (ContactUs x : details) {
            
            if (searchType.equalsIgnoreCase(x.getfName())) {
                JOptionPane.showMessageDialog(null, "Student Name: " + x.getfName() + "\n Student Number: " + x.getsNum() + "\n Days your free: " + x.getDaysFree() + "\n Course Title: " + x.getcTitle() + "\n E-mail: " + x.getEmail() + "\n Your query: " + x.getQuery());
            }
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void delBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBtnActionPerformed
        if (fNameTf.getText().equals("") && sNumTf.getText().equals("") && emailTf.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "You must enter Student Name, Number Email you wish to delete");
        } 
        
        else if (count == 0) {
            JOptionPane.showMessageDialog(null, "Sorry, there are no items to delete at this time");
        } 
        
        else {
            fName = fNameTf.getText();
            sNum = Integer.parseInt(sNumTf.getText());
            email = emailTf.getText();

            for (int i = 0; i < details.size(); i++) {
                
                if (details.get(i).getfName().equals(fName) && details.get(i).getsNum() == sNum && details.get(i).getDaysFree().equals(daysFree) && details.get(i).getcTitle().equals(cTitle) && details.get(i).getEmail().equals(email) && details.get(i).getQuery().equals(query)) {
                    details.remove(i);
                    count = count - 1;
                    JOptionPane.showMessageDialog(null, "Deleted item at index " + i);
                    
                    break;
                    
                }
                
                if (i == count - 1) {
                    JOptionPane.showMessageDialog(null, "Sorry, that item could not be found");
                }
            }
        }
    }//GEN-LAST:event_delBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ContactUsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContactUsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContactUsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContactUsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ContactUsGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel QueryLbl;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel cTitleLbl;
    private javax.swing.JTextField cTitleTf;
    private javax.swing.JButton clearAllBtn;
    private javax.swing.JPanel contactJp;
    private javax.swing.JLabel contactTitleLbl;
    private javax.swing.JLabel daysFreeLbl;
    private javax.swing.JTextField daysFreeTf;
    private javax.swing.JButton delBtn;
    private javax.swing.JButton displayBtn;
    private javax.swing.JLabel emailLbl;
    private javax.swing.JTextField emailTf;
    private javax.swing.JLabel fNameLbl;
    private javax.swing.JTextField fNameTf;
    private javax.swing.JButton homeBtn;
    private javax.swing.JTextField hoverBarTf;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea qTA;
    private javax.swing.JLabel sNumLbl;
    private javax.swing.JTextField sNumTf;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton submitBtn;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables
}