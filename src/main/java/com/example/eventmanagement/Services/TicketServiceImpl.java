package com.example.eventmanagement.Services;

import com.example.eventmanagement.Entities.Ticket;
import com.example.eventmanagement.Repositories.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TicketServiceImpl implements ITicketService {
    @Autowired
    private TicketRepository ticketRepository;
    @Autowired
    public TicketServiceImpl(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }
    @Override
    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }

    @Override
    public Ticket getTicketById(Integer Ticketid) {
        return ticketRepository.findById(Ticketid).orElse(null);
    }

    @Override
    public Ticket createTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    @Override
    public Ticket updateTicket(Integer Ticketid, Ticket ticket) {
        if (ticketRepository.existsById(Ticketid)) {
            ticket.setTicketId(Ticketid);
            return ticketRepository.save(ticket);
        }
        return null;
    }
        @Override
        public boolean deleteTicket (Integer Ticketid){
            if (ticketRepository.existsById(Ticketid)) {
                ticketRepository.deleteById(Ticketid);
                return true;
            }
            return false;
        }



}

