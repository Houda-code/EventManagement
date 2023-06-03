package com.example.eventmanagement.Entities;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class Evenement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nameEvent;
    @Enumerated(EnumType.STRING)
    private  EventCategory eventCategory;
    @Enumerated(EnumType.STRING)
    private TypeEvent typeEvent;


}
