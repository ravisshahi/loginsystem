package com.prodapt.userdemo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prodapt.userdemo.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	
	User findByUserName(String userName);

}
