package com.example.eventmanagement.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Evenement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nameEvent;
    @Enumerated(EnumType.STRING)
    private EventCategory eventCategory;
    @Enumerated(EnumType.STRING)
    private TypeEvent typeEvent;
    private String localisation;
    private String description;
    private Integer nbrMax;
    private LocalDate startDateEvent;

    private LocalDate endDate;

    @Column(name = "statut")
    @Enumerated(EnumType.STRING)
    private Statut statut;

<<<<<<< HEAD
<<<<<<< HEAD
    @OneToMany(cascade = CascadeType.ALL, mappedBy="event")
    private Set<Ticket> tickets;
=======
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "event")
    private Set<Calendar> calendars;
>>>>>>> a4b603bc14ab0f2f3b9089fad2617df123b47279
=======

<<<<<<< HEAD
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "event")
    private Set<Calendar> calendars;
=======
    @OneToMany(cascade = CascadeType.ALL, mappedBy="event")
    private Set<Ticket> tickets;



>>>>>>> 5e4d26d739a0749c074a3d5534c64e858be8b6bd
>>>>>>> 031699a640452afb30b887b2646ee6612033b17e

    @JsonIgnore
    @ManyToOne
    User user;

    @JsonIgnore
    @OneToOne
    private FinancialReport financialReport;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "event")
    private Set<Facture> factures;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "event")
    private Set<Reservation> reservations;


}
