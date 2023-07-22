package com.example.eventmanagement.Services;

import com.example.eventmanagement.Entities.Ticket;
import com.example.eventmanagement.Entities.Evenement;
import com.example.eventmanagement.Repositories.EventRepository;
import com.example.eventmanagement.Repositories.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;


@Service
public class TicketServiceImpl implements ITicketService {
    @Autowired
    TicketRepository ticketRepository;
    @Autowired
    EventRepository eventRepository;

    private static final int THRESHOLD_LIKES = 5; // Constante pour le nombre de likes minimum pour être le "Best Event"


    @Override
    public Ticket addTicket(Ticket ticket) {
        // Récupérer l'ID de l'événement associé au ticket
        Integer id = ticket.getEvent().getId();

        // Rechercher l'événement par son ID dans la base de données
        Optional<Evenement> optionalEvent = eventRepository.findById(id);

        // Si l'événement existe, le lier au ticket et l'enregistrer dans la base de données
        if (optionalEvent.isPresent()) {
            Evenement evenement = optionalEvent.get();
            ticket.setEvent(evenement); // Lier le ticket à l'événement en utilisant la méthode setEvent()
            return ticketRepository.save(ticket); // Enregistrez le ticket dans la base de données en utilisant le repository
        } else {
            // Gérer le cas où l'événement n'existe pas ou l'ID est incorrect
            throw new IllegalArgumentException("Événement introuvable pour cet ID : " + id);
        }
    }
    @Override
    public List<Ticket> RetrieveAllTickets() {
        return (List<Ticket>) ticketRepository.findAll();
    }

    @Override
    public Ticket getTicketById(Integer ticketId) {

        return ticketRepository.findById(ticketId).orElse(null);
    }

    @Override
    public Ticket updateTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    @Override
    public void deteteTicket(Integer ticketId) {
        ticketRepository.deleteById(ticketId);
    }


    @Override
    public Evenement getEventByTicketId(Integer ticketId) {
        Optional<Ticket> ticketOptional = ticketRepository.findById(ticketId);
        if (ticketOptional.isPresent()) {
            Ticket ticket = ticketOptional.get();
            return ticket.getEvent();
        }
        return null; // ou lève une exception si nécessaire
    }
    @Override
    public Evenement findEventById(Integer eventId) {
        Optional<Evenement> optionalEvent = eventRepository.findById(eventId);
        return optionalEvent.orElse(null);
    }

    @Override
    public List<Ticket> acheterTicket(Integer ticketId)  {
            Ticket ticket = ticketRepository.findById(ticketId).get();

            // Vérifier si le billet est en stock

                ticket.setQuantity(ticket.getQuantity() - 1);
                ticketRepository.save(ticket);

                 return RetrieveAllTickets();
    }

    @Override
    public List<Ticket> getTicketByEvent(Integer id){
        Evenement evenement= eventRepository.findById(id).orElse(null);
        return ticketRepository.findByEvent(evenement);
    }

  /* @Override
    public void addLikeToTicket(Integer ticketId) {
        Ticket ticket = ticketRepository.findById(ticketId)
                .orElseThrow(() -> new IllegalArgumentException("Ticket introuvable pour cet ID : " + ticketId));

        ticket.addLike();
        ticketRepository.save(ticket);

        if (ticket.getLikes() > THRESHOLD_LIKES) {
            System.out.println("Best Event");
        } else {
            System.out.println("Regular Event");
        }
    }*/


}

