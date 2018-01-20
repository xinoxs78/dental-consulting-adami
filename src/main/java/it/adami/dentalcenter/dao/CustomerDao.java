/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.adami.dentalcenter.dao;


import it.adami.dentalcenter.model.Customer;
import java.io.Serializable;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author giorgio.visentin
 */
@Repository
public interface CustomerDao extends MongoRepository<Customer, String>, Serializable{
   
    @Query("{firstname:?0}")
    List<Customer> findByFirstname(String firstname);

    @Query("{surname:?0}")
    List<Customer> findBySurname(String surname);

    @Query("{firstname:?0, surname:?1}")
    List<Customer> findByFirstnameSurname(String firstname, String surname);
}
