package com.example.eventmanagement.Services;

import com.example.eventmanagement.Entities.Calendar;
import com.example.eventmanagement.Entities.Evenement;
import com.example.eventmanagement.Entities.EventCategory;
import com.example.eventmanagement.Entities.Facture;

import java.util.List;
import java.time.LocalDate;
import org.springframework.scheduling.annotation.Scheduled;

public interface IEventService  {

    Evenement addEvent(Evenement event);

    Evenement getEventById(Integer id);
    List<Evenement> RetrieveAllEvents();

    List<Evenement> searchEventByCategory(EventCategory eventCategory);



    Evenement updateEvent(Evenement evenement);

    List<Evenement> searchByName(String name);

    @Scheduled(cron =" 0 0 0 1/1 * ?")
    void rappelEvents();

    //Facture saveEvent(Evenement event);

    List<Evenement> getEventsbyDateBetween(LocalDate startDate, LocalDate endDate);
}
