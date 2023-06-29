package com.example.eventmanagement.Services;




public class EventServiceImpl implements IEventService{

import com.example.eventmanagement.Entities.Evenement;
import com.example.eventmanagement.Repositories.EventRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
@Slf4j
public class EventServiceImpl implements IEventService{
  EventRepository eventRepository;

 /*@Autowired
  public void IEventService(EventRepository eventRepository){
      this.eventRepository = eventRepository ;
  }*/
  @Override
  public Evenement addEvent(Evenement event) {
      return eventRepository.save(event);
    }
    public  Evenement getEventById(Integer id) {
      return  eventRepository.findById(id).orElse(null);
    }

    public void deleteEvent(Integer id){
      eventRepository.deleteById(id);
    }
    /*public  Iterable<Evenement>getAllEvents(){
    return eventRepository.findAll();
    }*/
    @Override
    public List<Evenement> RetrieveAllEvents() {

        return (List<Evenement>) eventRepository.findAll();
    }


}
