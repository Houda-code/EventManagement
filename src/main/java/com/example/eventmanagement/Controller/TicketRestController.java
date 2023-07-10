package com.example.eventmanagement.Controller;

import com.example.eventmanagement.Entities.Ticket;
import com.example.eventmanagement.Services.ITicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/api/Tickets")
public class TicketRestController {

    private ITicketService ticketService;
    @Autowired
    public TicketRestController(ITicketService ticketService) {
        this.ticketService = ticketService;
    }
    @GetMapping("/retrieveAllTickets")
    public ResponseEntity<List<Ticket>> getAllTickets() {
        List<Ticket> tickets = ticketService.getAllTickets();
        return new ResponseEntity<>(tickets, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ticket> getTicketById(Integer Ticketid) {
        Ticket ticket = ticketService.getTicketById(Ticketid);
        if (ticket != null) {
            return new ResponseEntity<>(ticket, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/addTicket")
    public ResponseEntity<Ticket> createTicket(@RequestBody Ticket ticket) {
        Ticket createdTicket = ticketService.createTicket(ticket);
        return new ResponseEntity<>(createdTicket, HttpStatus.CREATED);
    }

    @DeleteMapping("/deleteTicket/{id}")
    public ResponseEntity<Void> deleteTicket(@PathVariable("id") Integer Ticketid) {
        boolean deleted = ticketService.deleteTicket(Ticketid);
        if (deleted) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
