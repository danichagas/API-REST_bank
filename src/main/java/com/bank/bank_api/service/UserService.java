package com.bank.bank_api.service;

import com.bank.bank_api.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);

}
