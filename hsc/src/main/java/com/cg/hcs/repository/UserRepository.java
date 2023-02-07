package com.cg.hcs.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import com.cg.hcs.dto.User;
@Repository
public interface UserRepository extends CrudRepository{
	
}
