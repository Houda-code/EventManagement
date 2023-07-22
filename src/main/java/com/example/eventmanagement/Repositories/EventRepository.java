package com.example.eventmanagement.Repositories;

import com.example.eventmanagement.Entities.Evenement;
import com.example.eventmanagement.Entities.EventCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.time.LocalDate;

public interface EventRepository extends JpaRepository<Evenement,Integer> {
    List<Evenement> findByEventCategory(EventCategory eventCategory);
    List<Evenement> findByStartDateEventBetween(LocalDate startDate, LocalDate endDate);
    List<Evenement> findByStartDateEvent(LocalDate now);

}
