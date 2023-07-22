package com.example.eventmanagement.Repositories;

import com.example.eventmanagement.Entities.Evenement;
import com.example.eventmanagement.Entities.Ticket;
import com.example.eventmanagement.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket,Integer> {
    List<Ticket> findByEvent(Evenement evenement);

}
