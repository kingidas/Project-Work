/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentServicesApp;

import java.io.Serializable;

/**
 *
 * @author Leon Daly x12112381
 */
public class OneToOne implements Serializable {

    private String name;
    private String surname;
    private String email;
    private String areaofhelp;

    public OneToOne() {
        name = new String();
        surname = new String();
        email = new String();
        areaofhelp = new String();
    }

    public String getAreaofhelp() {
        return areaofhelp;
    }

    public void setAreaofhelp(String areaofhelp) {
        this.areaofhelp = areaofhelp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}