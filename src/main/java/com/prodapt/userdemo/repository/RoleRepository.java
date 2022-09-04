package com.prodapt.userdemo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prodapt.userdemo.entity.Role;


@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {

}
