package com.example.eventmanagement.Entities;
import javax.persistence.*;
import java.io.Serializable;
@Entity

public class Payment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idPaymentOperation;
    private String modePaiement;
    private Double montant;
    
    @OneToOne
    private Ticket ticket;
    
    public String getModePaiement() {
        return modePaiement;
    }

    public void setModePaiement(String modePaiement) {
        this.modePaiement = modePaiement;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public void setIdPaymentOperation(Integer idPaymentOperation) {
    }
}
