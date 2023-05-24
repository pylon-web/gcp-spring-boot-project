package com.gcp.dev.demo.springbootgoogledatastorecrud.repository;

import com.gcp.dev.demo.springbootgoogledatastorecrud.entity.User;
import com.google.cloud.spring.data.datastore.repository.DatastoreRepository;
import com.google.cloud.spring.data.datastore.repository.query.Query;


import java.util.List;

public interface UserRepository extends DatastoreRepository<User, Long> {
    List<User> findByCountry(String country);

    @Query("select * from |com.gcp.dev.demo.springbootgoogledatastorecrud.entity.User| where name = @name")
    List<User> findByName(String name);
}
