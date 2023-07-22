package com.example.eventmanagement.Controller;

import com.example.eventmanagement.Entities.Evenement;
import com.example.eventmanagement.Entities.Ticket;
import com.example.eventmanagement.Repositories.TicketRepository;
import com.example.eventmanagement.Services.ITicketService;
import com.example.eventmanagement.Services.OutOfStockException;
import com.example.eventmanagement.Services.TicketNotFoundException;
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
    public ResponseEntity<Ticket> addTicket(@RequestBody Ticket ticket) {
        try {
            Ticket addedTicket = ticketService.addTicket(ticket);
            return new ResponseEntity<>(addedTicket, HttpStatus.CREATED);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
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
    public void deleteTicket(@PathVariable("id") Integer ticketId) {
        ticketService.deteteTicket(ticketId);
    }


    @GetMapping("/getEventByTicketId/{ticketId}")
    public ResponseEntity<Evenement> getEventByTicketId(@PathVariable Integer ticketId) {
        Evenement event = ticketService.getEventByTicketId(ticketId);
        if (event != null) {
            return new ResponseEntity<>(event, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    /*@GetMapping("/getTicketByEvent/{id}") {
        public List<Ticket> getTicketByEvent(@PathVariable("id") Integer id){
            return ticketService.getTicketByEvent(id);
        }
    }*/
    @GetMapping("/tickets/event/{id}")
    public ResponseEntity<List<Ticket>> getTicketsByEvent(@PathVariable Integer id) {
        List<Ticket> tickets = ticketService.getTicketByEvent(id);
        if (tickets.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(tickets, HttpStatus.OK);
    }

    @GetMapping("/findEvent/{eventId}")
    public ResponseEntity<Evenement> findEventById(@PathVariable Integer eventId) {
        Evenement event = ticketService.findEventById(eventId);
        if (event != null) {
            return new ResponseEntity<>(event, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/tickets/{ticketId}/acheter")
    public List<Ticket> acheterTicket(@PathVariable Integer ticketId) {

        // Appeler le service pour acheter le billet avec l'ID spécifié
        return ticketService.acheterTicket(ticketId);

    }
   /* @PostMapping("/addLike/{ticketId}")
    public ResponseEntity<Void> addLikeToTicket(@PathVariable Integer ticketId) {
        ticketService.addLikeToTicket(ticketId);
        return new ResponseEntity<>(HttpStatus.OK);
    } */

}
