package com.example.eventmanagement.Controller;

import com.example.eventmanagement.Entities.Ticket;
import com.example.eventmanagement.Repositories.TicketRepository;
import com.example.eventmanagement.Services.ITicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/Tickets")
public class TicketRestController {
    @Autowired
    private ITicketService ticketService;
    @Autowired
    TicketRepository ticketRepository;
    @PostMapping("/addTicket")
    public Ticket addTicket(@RequestBody Ticket ticket){

        return ticketRepository.save(ticket);
    }
    @GetMapping("/retrieveAllTickets")
    public List<Ticket> getTickets() {
        List<Ticket> listTickets = ticketService.RetrieveAllTickets();
        return listTickets;
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<Ticket> getTicketById(@PathVariable("id") Integer ticketId) {
        Ticket ticket = ticketService.getTicketById(ticketId);
        if (ticket != null) {
            return ResponseEntity.ok(ticket);
        }else {
            return  ResponseEntity.notFound().build();
        }
    }
    @PutMapping("updateTicket")
    public Ticket updateTicket(@RequestBody Ticket ticket){

        return ticketService.updateTicket(ticket);
    }

    @DeleteMapping("/deleteTicket/{id}")
    public void deleteTicket(@RequestBody Integer ticketId){
        ticketService.deteteTicket(ticketId);
    }

}
