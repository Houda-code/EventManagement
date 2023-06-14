package com.example.eventmanagement.Entities;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class ExpensesDetails implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ExpensesDetailId;
    private String ExpensesDetailType;

    @ManyToOne
    FinancialReport financialReport;
}
