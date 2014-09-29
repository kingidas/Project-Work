
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentservicesapp;

import java.awt.event.ActionListener;

/**
 *
 * @author Niall Martin x00110321,
 * Peter Barry x12112631,
 * Aidan O’ Brien x12117498,
 * Leon Daly x12112381
 */
public class StudentServicesApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
            
            StudentServicesAppGUI myGui = new StudentServicesAppGUI();
            myGui.setVisible(true);
            
            ActionListener Listener = new MyActionListener();
    }
}
