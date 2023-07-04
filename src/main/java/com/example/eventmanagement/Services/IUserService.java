package com.example.eventmanagement.Services;


import com.example.eventmanagement.Entities.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IUserService {
    User addUser(User user);
    User getUserById(Integer userId);
    User updateUser(User user);

    List<User> getAllUsers();

     void deleteUser(Integer userId);
}
