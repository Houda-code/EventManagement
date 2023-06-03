package com.example.eventmanagement.Repositories;

import com.example.eventmanagement.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public class UserRepository extends JpaRepository<User,Integer> {
}
