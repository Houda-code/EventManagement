package com.example.eventmanagement.Services;

import com.example.eventmanagement.Entities.Ticket;

import java.util.List;

public interface ITicketService {

  List<Ticket> getAllTickets();
  Ticket getTicketById(Integer Ticketid);
  Ticket createTicket( Ticket ticket);
  Ticket updateTicket(Integer Ticketid, Ticket ticket);
  boolean deleteTicket(Integer Ticketid);





}
