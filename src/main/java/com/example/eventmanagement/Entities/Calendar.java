package com.example.eventmanagement.Entities;

import lombok.AllArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@AllArgsConstructor
public class Calendar implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int CalendarId  ;

    @ManyToOne
    Evenement event;


    public Calendar() {

    }
}
