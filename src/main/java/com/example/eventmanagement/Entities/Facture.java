package com.example.eventmanagement.Entities;

import com.example.eventmanagement.Entities.Evenement;
import com.example.eventmanagement.Entities.User;
import com.example.eventmanagement.Entities.Facture;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Facture implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idfacture;
    private String refFacture;
    private Date dateFacture;

    @ManyToOne
    private Evenement event;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private boolean estPayee;
    private Date datePaiement;
    private Double montantPaye;

    public boolean isEstPayee() {
        return estPayee;
    }

    public void setEstPayee(boolean estPayee) {
        this.estPayee = estPayee;
    }

    public Date getDatePaiement() {
        return datePaiement;
    }

    public void setDatePaiement(Date datePaiement) {
        this.datePaiement = datePaiement;
    }

    public Double getMontantPaye() {
        return montantPaye;
    }

    public void setMontantPaye(Double montantPaye) {
        this.montantPaye = montantPaye;
    }

    public void setRefFacture(String s) {
    }

    public void setDateFacture(Date date) {
    }

    public void setEvent(Evenement event) {
    }

    public void setTicket(Ticket ticket) {
    }

    public void setIdfacture(Integer idfacture) {
    }
}
