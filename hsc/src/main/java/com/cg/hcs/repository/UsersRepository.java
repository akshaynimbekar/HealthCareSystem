package com.cg.hcs.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.hcs.entity.User;

@Repository
public interface UsersRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
