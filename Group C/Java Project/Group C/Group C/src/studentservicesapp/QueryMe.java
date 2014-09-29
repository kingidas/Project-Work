/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentservicesapp;

import java.io.Serializable;

/**
 *
 * @author Aidan O’ Brien x12117498
 */
public class QueryMe implements Serializable {

    private String sName;
    private int sNum;
    private String mail;
    private String qDetails;

    public QueryMe() {
        sName = new String();
        sNum = 0;
        mail = new String();
        qDetails = new String();

    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getqDetails() {
        return qDetails;
    }

    public void setqDetails(String qDetails) {
        this.qDetails = qDetails;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getsNum() {
        return sNum;
    }

    public void setsNum(int sNum) {
        this.sNum = sNum;
    }
}