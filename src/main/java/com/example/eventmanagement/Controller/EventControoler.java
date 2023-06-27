package com.example.eventmanagement.Controller;

import com.example.eventmanagement.Entities.Calendar;
import com.example.eventmanagement.Entities.Evenement;
import com.example.eventmanagement.Entities.FinancialReport;
import com.example.eventmanagement.Repositories.EventRepository;
import com.example.eventmanagement.Services.IEventService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Event")
public class EventControoler {
 IEventService iEventService;
 public final EventRepository eventRepository ;
    @PostMapping("/add-Event")
    public Evenement addEvent(@RequestBody Evenement event){

        return eventRepository.save(event);
    }
    @GetMapping("/retrieve-all-Events")
    public List<Evenement> getEvents() {
        List<Evenement> listEvents = iEventService.RetrieveAllEvents();
        return listEvents;
    }
    @GetMapping("/{id}")
    public ResponseEntity<Evenement> getEventById(@PathVariable("id") Integer eventId) {
        Evenement event = iEventService.getEventById(eventId);
        if (event != null) {
            return ResponseEntity.ok(event);
        }else {
            return  ResponseEntity.notFound().build();
        }
    }

    /*@PutMapping("/{id}")
    public ResponseEntity<Evenement> updateEvent(@PathVariable("id") Integer eventId, @RequestBody Evenement event) {
        Evenement updateEvent = iEventService.updateEvent(eventId, event);
        if (updateEvent != null) {
            return ResponseEntity.ok(updateEvent);
        }else {
            return  ResponseEntity.notFound().build();
        }
    }*/





}




