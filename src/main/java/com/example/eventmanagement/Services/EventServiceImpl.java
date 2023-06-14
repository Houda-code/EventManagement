package com.example.eventmanagement.Services;

import com.example.eventmanagement.Entities.Evenement;
import com.example.eventmanagement.Repositories.EventRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
@AllArgsConstructor
@Service

public class EventServiceImpl implements IEventService{
    EventRepository eventRepository;
    @Override
    public Evenement addEvent(Evenement evenement) {

        return eventRepository.save(evenement);

    }

    @Override
    public Evenement updateEvent(Evenement evenement) {
        return eventRepository.save(evenement);
    }

    @Override
    public Evenement retreiveEventById(Integer id) {
        return eventRepository.findById(id).get();
    }

    @Override
    public Evenement deleteEvent(Evenement evenement) {
         eventRepository.delete(evenement);
        return evenement;
    }
}
