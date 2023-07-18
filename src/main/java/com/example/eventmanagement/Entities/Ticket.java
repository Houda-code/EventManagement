package com.example.eventmanagement.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Ticket implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Ticketid;

    private String NumeroTicket;

    private Integer Price;

   private LocalDate DateNow;

    @Enumerated(EnumType.STRING)
    private TypeTicket typeTicket;

    @ManyToOne
    Evenement event;
    @OneToOne(mappedBy = "ticket")
    private Reservation reservation;

    @OneToOne(mappedBy = "ticket")
    private Payment payment;

    public void setTicketId(Integer Ticketid) {
    }
}
