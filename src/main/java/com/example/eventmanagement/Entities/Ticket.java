package com.example.eventmanagement.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
    private Integer quantity ;
   private LocalDate DateNow;

@PrePersist
    public void prePersist() {
        DateNow = LocalDate.now();
    }

    @Enumerated(EnumType.STRING)
    private TypeTicket typeTicket;

    @ManyToOne
    @JoinColumn(name = "id")
    @JsonBackReference // casser la référence cyclique lors de la sérialisation
    @JsonManagedReference // gérer la sérialisation de la relation bidirectionnelle

    private Evenement event;

    @OneToOne(mappedBy = "ticket")
    private Reservation reservation;

    @OneToOne(mappedBy = "ticket")
    private Payment payment;

    public void setTicketId(Integer Ticketid) {
    }
}
