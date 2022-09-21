package com.joseg.testcontainersdemo.repository;

import com.joseg.testcontainersdemo.repository.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {}
