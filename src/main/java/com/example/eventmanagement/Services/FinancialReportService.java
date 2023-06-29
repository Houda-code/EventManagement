package com.example.eventmanagement.Services;

import com.example.eventmanagement.Entities.FinancialReport;

import java.util.List;

public interface FinancialReportService {
        FinancialReport createFinancialReport(FinancialReport financialReport);
        List<FinancialReport> getAllFinancialReports();
        FinancialReport getFinancialReportById(Integer id);
        FinancialReport updateFinancialReport(Integer id, FinancialReport updatedFinancialReport);
        void deleteFinancialReport(Integer id);
    }


