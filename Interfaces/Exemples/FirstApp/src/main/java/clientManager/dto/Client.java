/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clientManager.dto;

import java.nio.file.ProviderNotFoundException;
import java.util.Date;

/**
 *
 * @author Alumne
 */
public class Client {
    private String name; 
    private String surname; 
    private Date dateAdded; 
    private String province ; 

    public Client(String name, String surname, Date dateAdded, String province) {
        this.name = name;
        this.surname = surname;
        this.dateAdded = dateAdded;
        this.province = province;
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

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
    
    public String[] ToStringArray(){
        String[] s = new String[4]; 
        s[0] = name; 
        s[1] = surname; 
        s[2] = dateAdded.toString(); 
        s[3] = province; 
        return s; 
    }
    
    
}
