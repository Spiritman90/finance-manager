package com.peterkin.finance_manager.service;


import com.peterkin.finance_manager.entity.User;
import org.springframework.stereotype.Service;
import com.peterkin.finance_manager.repository.UserRepository;

@Service
public class UserService {
    private UserRepository userRepository;

    public User createUser(User user){
        return userRepository.save(user);
    }



}
