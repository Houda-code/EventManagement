package com.example.eventmanagement.Services;

import com.example.eventmanagement.Entities.User;
import com.example.eventmanagement.Repositories.UserRepository;
import com.example.eventmanagement.Services.IUserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
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
