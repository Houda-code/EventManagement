package com.example.eventmanagement.Services;

import com.example.eventmanagement.Entities.Evenement;
import com.example.eventmanagement.Entities.EventCategory;
import com.example.eventmanagement.Entities.Facture;
import com.example.eventmanagement.Repositories.EventRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;

@AllArgsConstructor
@Service
@Slf4j
public class EventServiceImpl implements IEventService{
    @Autowired
    EventRepository eventRepository;

  @Override
  public Evenement addEvent(Evenement event) {
      return eventRepository.save(event);
    }
    public  Evenement getEventById(Integer id) {
      return  eventRepository.findById(id).orElse(null);
    }
    @Override
    public  List<Evenement> searchEventByCategory(EventCategory eventCategory) {
       return eventRepository.findByEventCategory(eventCategory);
  }

    public void deleteEvent(Integer id){
      eventRepository.deleteById(id);
    }

    @Override
    public List<Evenement> RetrieveAllEvents() {

        return (List<Evenement>) eventRepository.findAll();
    }
    @Override
    public Evenement updateEvent(Evenement evenement){
        return eventRepository.save(evenement);
    }

    @Override
    public List<Evenement> searchByName(String name) {
        String searchc = name.toLowerCase();
        List<Evenement> le = eventRepository.findAll();
        List<Evenement> lf = new ArrayList<>();
        for(Evenement e: le) {
            if(e.getNameEvent()!=null){
                if(e.getNameEvent().toLowerCase().equals(searchc)){
                    lf.add(e);
                }
            }
        }
        return lf;
    }
    @Scheduled(cron ="*/5 * * * * *")
    @Override
    public void rappelEvents(){
        List<Evenement> le = eventRepository.findByStartDateEvent(LocalDate.now());
        System.out.println("Rappel des evenements de : "+LocalDate.now());
        for (Evenement e : le){
            System.out.println(e.getNameEvent()+" "+e.getEventCategory());
        }
    }

    @Override
    public List<Evenement> getEventsbyDateBetween(LocalDate startDate, LocalDate endDate){
        List<Evenement> le = eventRepository.findByStartDateEventBetween(startDate,endDate);
        return le;
    }
}
