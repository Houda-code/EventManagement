package com.example.eventmanagement.Services;

import com.example.eventmanagement.Entities.Evenement;

import java.util.List;

public interface IEventService  {

    /*@Autowired
     public void IEventService(EventRepository eventRepository){
         this.eventRepository = eventRepository ;
     }*/
    Evenement addEvent(Evenement event);

    Evenement getEventById(Integer id);

    List<Evenement> RetrieveAllEvents();

   // Evenement updateEvent(Integer eventId, Evenement updatedEvent);


}
