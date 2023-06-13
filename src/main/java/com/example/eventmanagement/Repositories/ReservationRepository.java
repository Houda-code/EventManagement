package com.example.eventmanagement.Repositories;

import com.example.eventmanagement.Entities.Reservation;
import com.example.eventmanagement.Entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation,Integer> {
}

