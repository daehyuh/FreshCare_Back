package com.example.freshcare.Service;

import com.example.freshcare.Domain.User;
import com.example.freshcare.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;
    private PasswordEncoder passwordEncoder;
    @Autowired
    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public Long save(User user){
        user.setUserPw(passwordEncoder.encode(user.getUserPw()));
        userRepository.save(user);
        return user.getUserIdx();
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

}
