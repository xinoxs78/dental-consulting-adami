/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.adami.dentalcenter.controller;

import it.adami.dentalcenter.model.Customer;
import it.adami.dentalcenter.service.CustomerService;
import java.io.Serializable;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import static org.springframework.web.context.WebApplicationContext.SCOPE_REQUEST;

/**
 *
 * @author giorgio.visentin
 */
@Controller
@Scope(SCOPE_REQUEST)
public class CustomerSearchController implements Serializable{
    
    private String firstname;
    
    private String surname;
    
    public List<Customer> customerList;
    
    @Resource
    private CustomerService customerService;

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

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }
    
    public void search(){
        if ((firstname.trim().equals("")) && (!surname.trim().equals(""))) {
            customerList = customerService.findBySurname(surname);

        } else if ((!firstname.trim().equals("")) && (surname.trim().equals(""))) {
            customerList = customerService.findByFirstname(firstname);

        } else {
            customerList = customerService.findByFirstnameSurname(firstname, surname);
        }
    }
    
     public List<Customer> findAll(){
        
        List<Customer> customers = customerService.findAll();
        
        System.out.println("Customer size : " + customers.size());
        
        customers.forEach(System.out::println);
        
        return customers;
    }
}
