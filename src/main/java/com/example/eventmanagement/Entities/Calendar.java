package com.example.eventmanagement.Entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Calendar implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int CalendarId  ;

    @ManyToOne
    Evenement event;



}
