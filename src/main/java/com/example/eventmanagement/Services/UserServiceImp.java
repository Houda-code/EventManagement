package com.example.eventmanagement.Services;

import com.example.eventmanagement.Entities.User;
import com.example.eventmanagement.Repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UserServiceImp implements IUserService {
    UserRepository userRepository;
    @Override
    public User addUser(User user) {
        return userRepository.save(user) ;
    }
}
