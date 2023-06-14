package com.example.eventmanagement.Entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Ticket implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Ticketid;

    @OneToOne(mappedBy = "ticket")
    private Reservation reservation;

    @OneToOne(mappedBy = "ticket")
    private Payment payment;
}
