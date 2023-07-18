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


    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "event")
    private Set<Calendar> calendars;

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
