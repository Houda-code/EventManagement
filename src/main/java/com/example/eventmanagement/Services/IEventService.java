package com.example.eventmanagement.Services;

import com.example.eventmanagement.Entities.Evenement;

public interface IEventService  {
    Evenement addEvent(Evenement evenement);
    Evenement updateEvent(Evenement evenement);
    Evenement retreiveEventById(Integer id);
    Evenement deleteEvent(Evenement evenement);

}
