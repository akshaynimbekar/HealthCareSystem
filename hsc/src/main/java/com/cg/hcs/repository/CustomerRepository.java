package com.cg.hcs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cg.hcs.entity.User;


public interface CustomerRepository extends JpaRepository<User,Long> {

}
