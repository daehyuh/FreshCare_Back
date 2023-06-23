package com.example.freshcare.Repository;

import com.example.freshcare.Domain.User;

import java.util.List;

public interface UserRepository {
    User save(User user);
    List<User> findAll();
}