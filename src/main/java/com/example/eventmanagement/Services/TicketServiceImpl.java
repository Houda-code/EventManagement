package com.example.eventmanagement.Services;

import com.example.eventmanagement.Entities.Ticket;
import com.example.eventmanagement.Entities.Evenement;
import com.example.eventmanagement.Repositories.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TicketServiceImpl implements ITicketService {
    @Autowired
    TicketRepository ticketRepository;

    @Override
    public Ticket addTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
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



}

