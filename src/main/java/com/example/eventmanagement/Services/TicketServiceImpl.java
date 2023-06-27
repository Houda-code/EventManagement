
package com.example.eventmanagement.Services;

import com.example.eventmanagement.Entities.Ticket;
import com.example.eventmanagement.Repositories.TicketRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
@Slf4j
public class TicketServiceImpl implements TicketService{
    TicketRepository ticketRepository ;

}