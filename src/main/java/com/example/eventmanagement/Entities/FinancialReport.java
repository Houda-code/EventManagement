package com.example.eventmanagement.Entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity

@AllArgsConstructor
@NoArgsConstructor
public class FinancialReport implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ReportId;
    private float TotalPrices;

    @OneToOne(mappedBy = "financialReport")
    private Evenement event;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="financialReport")
    private Set<ExpensesDetails> expensesDetails;

}
