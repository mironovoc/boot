package com.example.boot.dao;

import com.example.boot.model.User;

import java.util.List;

public interface UserDAO {
    List<User> allUsers();

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(User user);

    User findUserById(Long id);
}
