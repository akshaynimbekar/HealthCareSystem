package com.cg.hcs.service.impl;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import com.cg.hcs.entity.UserSecurity;
import com.cg.hcs.repository.UsersRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Repository
public class JpaUserDetailsService implements UserDetailsService {
    private final UsersRepository usersRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return usersRepository.findByUsername(username).map(UserSecurity::new).orElseThrow(() -> new UsernameNotFoundException("User Not Found!"));
    }
}
