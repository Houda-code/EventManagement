package com.example.eventmanagement.Entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
@Entity

@AllArgsConstructor
@NoArgsConstructor
public class ExpensesDetails implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ExpensesDetailId;
    private String ExpensesDetailType;

    @ManyToOne
    FinancialReport financialReport;
}
