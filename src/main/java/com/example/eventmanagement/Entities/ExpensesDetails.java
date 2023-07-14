package com.example.eventmanagement.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
public class ExpensesDetails implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ExpensesDetailId;
    /*  private String ExpensesDetailType; //Type de dépense (par exemple, frais de personnel, frais de voyage, fournitures...)
    private double amount; //Montant de la dépense.
    @Temporal(TemporalType.DATE)
    private Date date; // Date de la dépense.
    private String description;//Description ou commentaire supplémentaire sur la dépense




    public Integer getExpensesDetailId() {
        return ExpensesDetailId;
    }

    public void setExpensesDetailId(Integer expensesDetailId) {
        ExpensesDetailId = expensesDetailId;
    }

    public String getExpensesDetailType() {
        return ExpensesDetailType;
    }

    public void setExpensesDetailType(String expensesDetailType) {
        ExpensesDetailType = expensesDetailType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public FinancialReport getFinancialReport() {
        return financialReport;
    }

    public void setFinancialReport(FinancialReport financialReport) {
        this.financialReport = financialReport;
    }


    @ManyToOne
    @JoinColumn(name = "fianceReport")
    private FinancialReport financialReport;
    */}
