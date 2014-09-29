/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentservicesapp;

import java.io.Serializable;

/**
 *
 * @author Niall Martin x00110321
 */
public class ContactUs implements Serializable {

    private String fName;
    private String email;
    private String cTitle;
    private String query;
    private String daysFree;
    private int sNum;

    public ContactUs() {

        fName = new String();
        daysFree = new String();
        email = new String();
        cTitle = new String();
        query = new String();
        sNum = 0;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getcTitle() {
        return cTitle;
    }

    public void setcTitle(String cTitle) {
        this.cTitle = cTitle;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getDaysFree() {
        return daysFree;
    }

    public void setDaysFree(String daysFree) {
        this.daysFree = daysFree;
    }

    public int getsNum() {
        return sNum;
    }

    public void setsNum(int sNum) {
        this.sNum = sNum;
    }
}