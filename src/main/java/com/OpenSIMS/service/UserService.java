package com.OpenSIMS.service;

import com.OpenSIMS.exception.UserNotFoundException;
import com.OpenSIMS.model.User;
import com.OpenSIMS.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }
    public User getUser(Long userId) {
        return userRepository.findById(userId).get();
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }
    public User updateUser(Long userId, User user) {
        User dbUser = userRepository.findById(userId)
                .orElseThrow(() -> new UserNotFoundException("User not found with ID: " + userId));

        dbUser.setFirstName(user.getFirstName());
        dbUser.setMiddleName(user.getMiddleName());
        dbUser.setLastName(user.getLastName());
        dbUser.setUsername(user.getUsername());
        dbUser.setEmail(user.getEmail());
        dbUser.setPassword(user.getPassword());

        return userRepository.save(dbUser);
    }
    public void deleteUser(Long userId) {
        Optional<User> user = userRepository.findById(userId);
        if (user.isPresent()) {
            userRepository.delete(user.get());
        } else {
            throw new UserNotFoundException("User not found with ID: " + userId);
        }
    }
}
