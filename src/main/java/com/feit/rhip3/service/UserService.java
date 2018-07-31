package com.feit.rhip3.service;

import com.feit.rhip3.domain.User;

public interface UserService {
    User findByName(String name);
}
