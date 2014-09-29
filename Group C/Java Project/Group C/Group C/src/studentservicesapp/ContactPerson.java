/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentservicesapp;

import java.io.Serializable;

/**
 *
 * @author Peter Barry x12112631
 */
public class ContactPerson implements Serializable {

    private String name;
    private int number;
    private String query;
    private String email;

    public ContactPerson() {
        name = new String();
        number = 0;
        email = new String();
        query = new String();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}