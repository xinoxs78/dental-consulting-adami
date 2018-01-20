/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.adami.dentalcenter.service;


import it.adami.dentalcenter.dao.CustomerDao;
import it.adami.dentalcenter.model.Customer;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 *
 * @author giorgio.visentin
 */
@Service
public class CustomerService {
    
    @Resource
    private CustomerDao customerDao;
    
    public void deleteCustomer(Customer customer){
        customerDao.delete(customer);
    }
   
//    public Customer findById(String id){
//        //return customerDao.findOne(id);
//        
//        return null;
//    }
    
    public void save(Customer customer){
        customerDao.save(customer);
    }
    
    public List<Customer> findAll(){
        return customerDao.findAll();
    }
   
    public List<Customer> findByFirstname(String firstname){
        return customerDao.findByFirstname(firstname);
    }
    
    public List<Customer> findBySurname(String surname){
        return customerDao.findBySurname(surname);
    }
   
    public List<Customer> findByFirstnameSurname(String firstname, String surname){
         return customerDao.findByFirstnameSurname(firstname, surname);
    }
}
