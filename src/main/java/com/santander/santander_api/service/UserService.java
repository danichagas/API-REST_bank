package com.santander.santander_api.service;

import com.santander.santander_api.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);

}
