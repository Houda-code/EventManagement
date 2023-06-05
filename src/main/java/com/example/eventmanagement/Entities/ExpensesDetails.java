package com.example.eventmanagement.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
@Entity
public class ExpensesDetails implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ExpensesDetailId;
    private String ExpensesDetailType;
}
