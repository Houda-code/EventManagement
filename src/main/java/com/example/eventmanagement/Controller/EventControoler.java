package com.example.eventmanagement.Controller;

import com.example.eventmanagement.Entities.Evenement;
<<<<<<< HEAD
<<<<<<< HEAD
=======
import com.example.eventmanagement.Entities.EventCategory;
import com.example.eventmanagement.Entities.Facture;
>>>>>>> a4b603bc14ab0f2f3b9089fad2617df123b47279
=======

import com.example.eventmanagement.Entities.EventCategory;
import com.example.eventmanagement.Entities.Facture;
>>>>>>> 031699a640452afb30b887b2646ee6612033b17e
import com.example.eventmanagement.Repositories.EventRepository;
import com.example.eventmanagement.Services.IEventService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.format.DateTimeFormatter;
import java.util.List;
import java.time.LocalDate;

@CrossOrigin(origins = "*")
@RestController
@AllArgsConstructor
@RequestMapping("/Event")
public class EventControoler {

    @Autowired
    EventRepository eventRepository;
    @Autowired
    IEventService iEventService;
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

@GetMapping("/search-by-categorie/{categorie}")
public List<Evenement> searchByCategory(@PathVariable("categorie") EventCategory eventCategory){
        return iEventService.searchEventByCategory(eventCategory);
}

@PutMapping("updateEvents")
    public Evenement updateEvent(@RequestBody Evenement event){

        return iEventService.updateEvent(event);
}

    @GetMapping("/search-by-name/{name}") // Search b Name
    public List<Evenement> searchByName(@PathVariable("name") String name){
        return iEventService.searchByName(name);
    }

    @GetMapping("/search-by-date/{startDate}/{endDate}")
    public List<Evenement> searchByDateBetween(@PathVariable("startDate") String sStartDate,
                                               @PathVariable("endDate") String sEndDate){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate startDate = LocalDate.parse(sStartDate, formatter);
        LocalDate endDate = LocalDate.parse(sEndDate, formatter);
        //  start from the 1st day of the month
        Integer day = startDate.getDayOfMonth()-1;
        startDate = startDate.minusDays(day);
        //  end
        return iEventService.getEventsbyDateBetween(startDate,endDate);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteEvent(@PathVariable("id") Integer id){
        eventRepository.deleteById(id);
    }
}




