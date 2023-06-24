package com.example.eventmanagement.Entities;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class Facture implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Idfacture;


    @ManyToOne
    Evenement event;


    public void setIdfacture(Integer idfacture) {
    }
}
