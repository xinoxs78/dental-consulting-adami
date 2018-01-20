/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.adami.dentalcenter.model;

import java.io.Serializable;
import java.util.UUID;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author giorgio.visentin
 */
@Document(collection = "customer")
public class Customer implements Serializable{
    
    @Id
    private String id;
    
    private String firstname;
    
    private String surname;
    
    public Customer(){
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    
}
