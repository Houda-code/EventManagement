package com.example.eventmanagement.Repositories;

import com.example.eventmanagement.Entities.Ticket;
import com.example.eventmanagement.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket,Integer> {
}
