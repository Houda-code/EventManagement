package com.example.eventmanagement.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
public class FinancialReport implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ReportId;
    private String title;  //Titre ou nom du rapport financier
    private String description; //Titre ou nom du rapport financier
    @Temporal(TemporalType.DATE)
    private Date startDate; //Date de début de la période couverte par le rapport financier.
    @Temporal(TemporalType.DATE)
    private Date endDate; //Date de fin de la période couverte par le rapport financier.
    private double totalRevenue;//Montant total des revenus
    private double totalExpenses;//Montant total des dépenses
    private double netIncome;//total des revenus moins les dépenses



    // Autres attributs et constructeurs

    // Méthodes setter pour assigner les valeurs aux attributs
    public Integer getReportId() {
        return ReportId;
    }

    public void setReportId(Integer reportId) {
        this.ReportId = reportId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public double getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(double totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    public double getTotalExpenses() {
        return totalExpenses;
    }

    public void setTotalExpenses(double totalExpenses) {
        this.totalExpenses = totalExpenses;
    }

    public double getNetIncome() {
        return netIncome;
    }

    public void setNetIncome(double netIncome) {
        this.netIncome = netIncome;
    }


    @OneToOne(mappedBy = "financialReport")
    private Evenement event;

    @OneToMany(mappedBy = "financialReport", cascade = CascadeType.ALL)
    private List<ExpensesDetails> expensesDetails;

}
