package com.example.eventmanagement.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Reservation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Reservtid;
    private String ReservName;
    @Temporal(TemporalType.DATE)
    private Date ReservDate;

    @ManyToOne
    Evenement event;

    @OneToOne
    private Ticket ticket;
}
