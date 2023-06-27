package com.example.eventmanagement.Controller;

import com.example.eventmanagement.Entities.User;
import com.example.eventmanagement.Repositories.UserRepository;
import com.example.eventmanagement.Services.IUserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/User")
public class UserRestController {
    IUserService iUserService;
    public final UserRepository userRepository;
    @PostMapping("/add-User")
    @ResponseBody
    public User addUser(@RequestBody User user){
      return    iUserService.addUser(user);
    }

    @GetMapping("/retrieve-all-Users")
    public List<User> getUsers() {
        List<User> listUsers = iUserService.RetrieveAllUsers();
        return listUsers;
    }
}
