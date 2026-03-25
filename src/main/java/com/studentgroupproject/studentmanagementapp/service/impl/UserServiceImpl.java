package com.studentgroupproject.studentmanagementapp.service.impl;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.studentgroupproject.studentmanagementapp.model.Users;
import com.studentgroupproject.studentmanagementapp.repository.UsersRepository;

@Service
public class UserServiceImpl implements UserDetailsService {

    private UsersRepository usersRepository;

    public UserServiceImpl(UsersRepository usersRepository) {

        this.usersRepository = usersRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users users = usersRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("Invalid username"));

        return User.withUsername(username)
                .password(users.getPassword())
                .disabled(!users.isActive())
                .build();
    }

}
