package com.example.eventmanagement.Services;

import com.example.eventmanagement.Entities.Evenement;
import com.example.eventmanagement.Entities.Ticket;

import java.util.List;

public interface ITicketService {

  Ticket addTicket(Ticket ticket);
  List<Ticket> RetrieveAllTickets();
  Ticket getTicketById(Integer ticketId);
  Ticket updateTicket(Ticket ticket);
  void deteteTicket(Integer ticketId);

  Evenement getEventByTicketId(Integer ticketId);
  Evenement findEventById(Integer eventId);
  List<Ticket> acheterTicket(Integer ticketId) ;

List<Ticket> getTicketByEvent(Integer id);
  // void addLikeToTicket(Integer ticketId);


}
