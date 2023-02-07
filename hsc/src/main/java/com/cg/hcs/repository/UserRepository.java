package com.cg.hcs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.hcs.dto.User;
@Repository
public interface UserRepository extends CrudRepository{
	
}
