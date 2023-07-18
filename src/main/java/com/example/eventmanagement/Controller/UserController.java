package com.example.eventmanagement.Controller;

import com.example.eventmanagement.Entities.Evenement;
import com.example.eventmanagement.Entities.User;
import com.example.eventmanagement.Repositories.UserRepository;
import com.example.eventmanagement.Services.IUserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
@AllArgsConstructor
@RequestMapping ("/User")
public class UserController {
    IUserService iUserService;

    @PostMapping("/add-User")
    public User addUser(@RequestBody User user){

        return iUserService.addUser(user);
    }
    @GetMapping("/getAllUsers")
    public List<User> getUsers() {
        List<User> listUsers = iUserService.getAllUsers();
        return listUsers;
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") Integer userId) {
        User user = iUserService.getUserById(userId);
        if (user != null) {
            return ResponseEntity.ok(user);
        }else {
            return  ResponseEntity.notFound().build();
        }
    }
    @PutMapping("/updateUser")
    public User updateUser(@RequestBody User user){

        return iUserService.addUser(user);
    }
    @DeleteMapping("/deleteUser")
    public void deleteUser(@RequestBody Integer userId){
        iUserService.deleteUser(userId);
    }

}
