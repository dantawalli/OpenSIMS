package com.opensourcesms.service;

import com.opensourcesms.model.User;
import com.opensourcesms.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }
    public User getUser(Long userId) {
        return userRepository.findById(userId).orElseThrow();
    }
}

