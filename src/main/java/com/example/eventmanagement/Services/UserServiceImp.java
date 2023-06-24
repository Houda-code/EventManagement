package com.example.eventmanagement.Services;

import com.example.eventmanagement.Entities.User;
import com.example.eventmanagement.Repositories.UserRepository;
import com.example.eventmanagement.Services.IUserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
@Slf4j
public class UserServiceImp implements IUserService {
    UserRepository userRepository;
    @Override
    public User addUser(User user) {
        return userRepository.save(user) ;
    }
    @Override
    public List<User> RetrieveAllUsers() {
        return (List<User>) userRepository.findAll();
    }

}
