package com.example.eventmanagement.Services;

import com.example.eventmanagement.Entities.Ticket;

import java.util.List;

public interface ITicketService {

  Ticket addTicket(Ticket ticket);
  List<Ticket> RetrieveAllTickets();
  Ticket getTicketById(Integer ticketId);
  Ticket updateTicket(Ticket ticket);
  void deteteTicket(Integer ticketId);





}
