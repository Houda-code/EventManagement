package com.example.eventmanagement.Services;

import com.example.eventmanagement.Entities.User;

import java.util.List;

public interface IUserService {
      User addUser(User user);
      List <User> RetrieveAllUsers();

}
