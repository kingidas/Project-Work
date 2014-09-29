/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentservicesapp;

import java.io.Serializable;

/**
 *
 * @author Leon Daly x12112381
 */
public class Commons implements Serializable {

    private String Feedback;

    public Commons() {
        Feedback = new String();

    }

    public String getFeedback() {
        return Feedback;
    }

    public void setFeedback(String Feedback) {
        this.Feedback = Feedback;
    }
}