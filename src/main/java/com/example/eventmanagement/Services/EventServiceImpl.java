package com.example.eventmanagement.Services;

import com.example.eventmanagement.Entities.Evenement;
import com.example.eventmanagement.Repositories.EventRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
@AllArgsConstructor
@Service
@Slf4j
public class EventServiceImpl implements IEventService{
  EventRepository eventRepository;
    public Evenement addEvent(Evenement event) {
        return eventRepository.save(event);
    }

}
