package com.example.eventmanagement.Repositories;

import com.example.eventmanagement.Entities.Evenement;
import org.springframework.data.jpa.repository.JpaRepository;



public interface EventRepository extends JpaRepository<Evenement,Integer> {
}
