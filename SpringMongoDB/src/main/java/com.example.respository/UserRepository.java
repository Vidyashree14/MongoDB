/**
  * Created by Vidyashree on 04/28/2018
  */
  
  
package com.example.respository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.SpringMongo.document.Users;

public interface UserRepository extends MongoRepository<Users, Integer>{

}
