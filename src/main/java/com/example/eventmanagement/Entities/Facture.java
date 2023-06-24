package com.example.eventmanagement.Entities;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class Facture implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Idfacture;

<<<<<<< HEAD
=======
    @ManyToOne
    Evenement event;


    public void setIdfacture(Integer idfacture) {
    }
>>>>>>> 255fc19a8e2721a0c49422200de44af950acc3ce
}
