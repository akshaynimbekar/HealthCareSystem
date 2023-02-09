package com.cg.hcs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cg.hcs.entity.Customer;
public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
