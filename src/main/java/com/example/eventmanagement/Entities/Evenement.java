package com.example.eventmanagement.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

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
    private  EventCategory eventCategory;
    @Enumerated(EnumType.STRING)
    private TypeEvent typeEvent;
    private String localisation;
    private String description;
    private Integer nbrMax;
    @Temporal(TemporalType.DATE)
    private Date satrtDate;
    @Temporal(TemporalType.DATE)
    private Date endDate;
    private Statut statur;


}
