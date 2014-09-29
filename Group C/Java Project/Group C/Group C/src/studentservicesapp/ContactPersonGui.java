package studentservicesapp;

import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 *
 * Peter Barry x12112631
 */
//The home button image was found on google images and edited in fireworks the link is: http://images.all-free-download.com/images/graphiclarge/rounded_blue_home_button_4805.jpg
//The back button image was found on google images and edited in fireworks the link is: http://4.bp.blogspot.com/-hTRk-er3XlY/TZwLBAy9Y6I/AAAAAAAAAQA/upea2uWVG5A/s1600/back_button.jpg
public class ContactPersonGui extends javax.swing.JFrame {

    private ArrayList<ContactPerson> aList;
    private String name;
    private String query;
    private String email;
    private int number;
    private int count;

    public ContactPersonGui() {
        initComponents();
        aList = new ArrayList<>();
        query = new String();
        name = new String();
        email = new String();
        number = 0;
        count = 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contactJp = new javax.swing.JPanel();
        nameTf = new javax.swing.JTextField();
        submitBtn = new javax.swing.JButton();
        contactLbl = new javax.swing.JLabel();
        displayBtn = new javax.swing.JButton();
        numberTf = new javax.swing.JTextField();
        queryLbl = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();
        snameLbl = new javax.swing.JLabel();
        snumLbl = new javax.swing.JLabel();
        emailLbl = new javax.swing.JLabel();
        emailTf = new javax.swing.JTextField();
        queryJsp = new javax.swing.JScrollPane();
        queryTf = new javax.swing.JTextArea();
        clearBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        viewBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Contact");
        setBackground(new java.awt.Color(0, 255, 204));
        setMaximumSize(new java.awt.Dimension(320, 480));
        setMinimumSize(new java.awt.Dimension(320, 480));
        setResizable(false);

        contactJp.setBackground(new java.awt.Color(0, 255, 204));
        contactJp.setForeground(new java.awt.Color(0, 255, 204));
        contactJp.setEnabled(false);
        contactJp.setMaximumSize(new java.awt.Dimension(320, 480));
        contactJp.setMinimumSize(new java.awt.Dimension(320, 480));
        contactJp.setPreferredSize(new java.awt.Dimension(320, 480));

        nameTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTfActionPerformed(evt);
            }
        });

        submitBtn.setForeground(new java.awt.Color(0, 0, 204));
        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        contactLbl.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        contactLbl.setText("Contact");

        displayBtn.setForeground(new java.awt.Color(0, 0, 204));
        displayBtn.setText("Display");
        displayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayBtnActionPerformed(evt);
            }
        });

        numberTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberTfActionPerformed(evt);
            }
        });

        queryLbl.setText("Please Enter your Query Below");

        backBtn.setBackground(new java.awt.Color(0, 255, 204));
        backBtn.setForeground(new java.awt.Color(0, 255, 204));
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentservicesapp/Back.jpg"))); // NOI18N
        backBtn.setBorder(null);
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        homeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentservicesapp/Home.jpg"))); // NOI18N
        homeBtn.setBorder(null);
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });

        snameLbl.setText("Student Name:");

        snumLbl.setText("Student Number:");

        emailLbl.setText("Email:");

        emailTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTfActionPerformed(evt);
            }
        });

        queryTf.setColumns(20);
        queryTf.setRows(5);
        queryJsp.setViewportView(queryTf);

        clearBtn.setForeground(new java.awt.Color(0, 0, 204));
        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        saveBtn.setForeground(new java.awt.Color(0, 0, 204));
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        viewBtn.setForeground(new java.awt.Color(0, 0, 204));
        viewBtn.setText("View");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });

        deleteBtn.setForeground(new java.awt.Color(0, 0, 204));
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        searchBtn.setForeground(new java.awt.Color(0, 51, 204));
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contactJpLayout = new javax.swing.GroupLayout(contactJp);
        contactJp.setLayout(contactJpLayout);
        contactJpLayout.setHorizontalGroup(
            contactJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contactJpLayout.createSequentialGroup()
                .addGroup(contactJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contactJpLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(queryJsp))
                    .addGroup(contactJpLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(contactJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contactJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(snumLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                .addComponent(snameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(emailLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(contactJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailTf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numberTf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameTf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(contactJpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contactJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contactJpLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(queryLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))
                    .addGroup(contactJpLayout.createSequentialGroup()
                        .addGroup(contactJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(contactJpLayout.createSequentialGroup()
                                .addGroup(contactJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(saveBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(displayBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
                                .addGap(27, 27, 27)
                                .addGroup(contactJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(clearBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(deleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)))
                            .addGroup(contactJpLayout.createSequentialGroup()
                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(contactJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(contactJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(submitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                .addComponent(viewBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(contactJpLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(contactLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        contactJpLayout.setVerticalGroup(
            contactJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contactJpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contactLbl)
                .addGap(29, 29, 29)
                .addGroup(contactJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(snameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contactJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(snumLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numberTf, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contactJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailTf, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(queryLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(queryJsp, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(contactJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(displayBtn)
                    .addComponent(submitBtn)
                    .addComponent(clearBtn))
                .addGap(18, 18, 18)
                .addGroup(contactJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saveBtn)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contactJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(deleteBtn)
                        .addComponent(viewBtn)))
                .addGroup(contactJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contactJpLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(contactJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contactJpLayout.createSequentialGroup()
                                .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(35, 35, 35))
                    .addGroup(contactJpLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(searchBtn)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contactJp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contactJp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(336, 519));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        //i.e. The code for the display,view,save,delete and search button was modiefied from your Assessment GUI
        name = nameTf.getText();
        number = Integer.parseInt(numberTf.getText());
        email = emailTf.getText();
        query = queryTf.getText();

        ContactPerson c = new ContactPerson();
        c.setName(name);
        c.setNumber(number);
        c.setEmail(email);
        c.setQuery(query);

        aList.add(c);

        count++;
    }//GEN-LAST:event_submitBtnActionPerformed

private void displayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayBtnActionPerformed
    for (int i = 0; i < aList.size(); i++) {
        JOptionPane.showMessageDialog(null, "Student Name " + aList.get(i).getName() + "\n Student Number " + aList.get(i).getNumber() + "\n Student Email " + aList.get(i).getEmail() + "\n Your Query  " + aList.get(i).getQuery());
    }
}//GEN-LAST:event_displayBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        LearningSupportGui myGui = new LearningSupportGui();
        myGui.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backBtnActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        StudentServicesAppGUI myGUI = new StudentServicesAppGUI();
        myGUI.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeBtnActionPerformed

    private void nameTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTfActionPerformed

    private void numberTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numberTfActionPerformed

    private void emailTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTfActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        nameTf.setText("");
        numberTf.setText("");
        emailTf.setText("");
        queryTf.setText("");
    }//GEN-LAST:event_clearBtnActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        File inFile;
        FileInputStream fStream;
        ObjectInputStream oStream;

        try {
            inFile = new File("contact.data");
            fStream = new FileInputStream(inFile);
            oStream = new ObjectInputStream(fStream);

            ArrayList<ContactPerson> xList;
            xList = (ArrayList<ContactPerson>) oStream.readObject();
            
            for (ContactPerson x : xList) {
                JOptionPane.showMessageDialog(null, "Name: " + x.getName() + "\n Number: " + x.getNumber() + "\n Email: " + x.getEmail() + "\n Query: " + x.getQuery());
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

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        name = nameTf.getText();
        email = emailTf.getText();
        query = queryTf.getText();
        number = Integer.parseInt(numberTf.getText());

        ContactPerson c = new ContactPerson();
        
        c.setName(name);
        c.setEmail(email);
        c.setName(query);
        c.setNumber(number);

        File outFile;
        FileOutputStream fStream;
        ObjectOutputStream oStream;

        try {
            outFile = new File("contact.data");
            fStream = new FileOutputStream(outFile);
            oStream = new ObjectOutputStream(fStream);

            oStream.writeObject(aList);

            JOptionPane.showMessageDialog(null, "Student Record Saved");

            
            oStream.close();
        } 
        
        catch (IOException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        if (nameTf.getText().equals("") || numberTf.getText().equals("") || emailTf.getText().equals("") || queryTf.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter name, number and email to delete");
        } 
        
        else if (count == 0) {
            JOptionPane.showMessageDialog(null, "Student record must be entered in order to delete ");
        } 
        
        else {
            name = nameTf.getText();
            number = Integer.parseInt(numberTf.getText());
            email = emailTf.getText();
            query = queryTf.getText();

            for (int i = 0; i < aList.size(); i++) {
                
                if (aList.get(i).getName().equals(name) && aList.get(i).getEmail().equals(email) && aList.get(i).getQuery().equals(query) && aList.get(i).getNumber() == number) {
                    aList.remove(i);
                    count = count - 1;
                    JOptionPane.showMessageDialog(null, "Item Deleted " + i);
                    
                    break;
                    
                }
                
                if (i == count - 1) {
                    JOptionPane.showMessageDialog(null, "Sorry, That Student is not in our college records ");
                }
            }
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        String searchType = JOptionPane.showInputDialog(null, "Please enter the student your looking for");

        for (ContactPerson x : aList) {
            
            if (searchType.equalsIgnoreCase(x.getName())) {
                JOptionPane.showMessageDialog(null, "Name: " + x.getName() + "\n Number: " + x.getNumber() + "\n Email: " + x.getEmail() + "\n Query: " + x.getQuery());
            }
        }

    }//GEN-LAST:event_searchBtnActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ContactPersonGui().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton clearBtn;
    private javax.swing.JPanel contactJp;
    private javax.swing.JLabel contactLbl;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton displayBtn;
    private javax.swing.JLabel emailLbl;
    private javax.swing.JTextField emailTf;
    private javax.swing.JButton homeBtn;
    private javax.swing.JTextField nameTf;
    private javax.swing.JTextField numberTf;
    private javax.swing.JScrollPane queryJsp;
    private javax.swing.JLabel queryLbl;
    private javax.swing.JTextArea queryTf;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JLabel snameLbl;
    private javax.swing.JLabel snumLbl;
    private javax.swing.JButton submitBtn;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables
}
