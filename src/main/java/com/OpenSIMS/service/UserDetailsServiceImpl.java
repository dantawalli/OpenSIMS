package com.OpenSIMS.service;

import com.OpenSIMS.model.User;
import com.OpenSIMS.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    private final UserRepository userRepository;
    public UserDetailsServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       Optional<User> user =  userRepository.findByUsername(username);
        org.springframework.security.core.userdetails.User.UserBuilder userBuilder = null;
       if(user.isPresent()) {
           User userDetails = user.get();
           userBuilder = org.springframework.security.core.userdetails.User.withUsername(userDetails.getUsername()).password(userDetails.getPassword()).roles(userDetails.getRole());
       }else{
           throw new UsernameNotFoundException("User not found");
       }
        return userBuilder.build();
    }
}
