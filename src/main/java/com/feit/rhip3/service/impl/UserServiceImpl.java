package com.feit.rhip3.service.impl;

import com.feit.rhip3.domain.User;
import com.feit.rhip3.domain.UserRepository;
import com.feit.rhip3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public User findByName(String name) {
        return userRepository.findByName(name);
    }
}
