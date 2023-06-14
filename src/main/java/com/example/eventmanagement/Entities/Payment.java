package com.example.eventmanagement.Entities;
import javax.persistence.*;
import java.io.Serializable;
@Entity

public class Payment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer IdPaymentOperation;

    @OneToOne
    private Ticket ticket;
}
