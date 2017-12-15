package com.icangdev.learn.sisfo.services;

import com.icangdev.learn.sisfo.models.User;

public interface UserService {
    public User findUserByUsername(String username);
    public void saveUser(User user);
}
