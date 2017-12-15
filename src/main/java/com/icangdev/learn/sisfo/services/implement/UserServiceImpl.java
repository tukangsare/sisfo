package com.icangdev.learn.sisfo.services.implement;

import com.icangdev.learn.sisfo.models.Role;
import com.icangdev.learn.sisfo.models.User;
import com.icangdev.learn.sisfo.repositories.Rolerepository;
import com.icangdev.learn.sisfo.repositories.UserRepository;
import com.icangdev.learn.sisfo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashSet;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private Rolerepository rolerepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    @Override
    public User findUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public void saveUser(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setActive(1);
        Role userRole = rolerepository.findByRole("admin");
        user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
        userRepository.save(user);
    }
}
