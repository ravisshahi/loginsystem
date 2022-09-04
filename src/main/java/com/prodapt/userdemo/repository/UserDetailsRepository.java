package com.prodapt.userdemo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prodapt.userdemo.entity.User;
import com.prodapt.userdemo.entity.UserDetails;

@Repository
public interface UserDetailsRepository extends CrudRepository<UserDetails, Long> {
	User findByEmail(String email);

}
