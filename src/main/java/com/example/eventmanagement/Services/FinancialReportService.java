package com.example.eventmanagement.Services;

import com.example.eventmanagement.Entities.Evenement;
import com.example.eventmanagement.Entities.EventCategory;
import com.example.eventmanagement.Entities.FinancialReport;
import com.example.eventmanagement.Entities.Ticket;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDate;
import java.util.List;

public interface FinancialReportService {



/*



        FinancialReport createFinancialReport(FinancialReport financialReport);
        List<FinancialReport> getAllFinancialReports();
        FinancialReport getFinancialReportById(Integer id);
        FinancialReport updateFinancialReport(Integer id, FinancialReport updatedFinancialReport);
        void deleteFinancialReport(Integer id);
    }*/

        FinancialReport addRapport(FinancialReport financialReport);
        List<FinancialReport> RetrieveAllRapports();
        FinancialReport getRapportById(Integer ReportId);
        FinancialReport updateRapport(FinancialReport financialReport);
        void deteteRapport(Integer ReportId);
}


