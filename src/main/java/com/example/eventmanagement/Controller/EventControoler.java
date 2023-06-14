package com.example.eventmanagement.Controller;

import com.example.eventmanagement.Entities.Evenement;
import com.example.eventmanagement.Repositories.EventRepository;
import com.example.eventmanagement.Services.IEventService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/Event")
public class EventControoler {
    IEventService eventService;
   public final EventRepository eventRepository;
    @PostMapping("/add-Event")
    public Evenement addEvent(@RequestBody Evenement evenement){
        return eventRepository.save(evenement);
    }



}
