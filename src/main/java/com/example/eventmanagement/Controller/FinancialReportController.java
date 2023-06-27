package com.example.eventmanagement.Controller;
import com.example.eventmanagement.Entities.FinancialReport;
import com.example.eventmanagement.Repositories.FinancialReportRepository;
import com.example.eventmanagement.Services.FinancialReportService;
import com.example.eventmanagement.Services.FinancialReportServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/financialReports")
public class FinancialReportController {

    private final FinancialReportService financialReportService;

    @Autowired
    public FinancialReportController(FinancialReportService financialReportService) {
        this.financialReportService = financialReportService;
    }

    @GetMapping
    public ResponseEntity<List<FinancialReport>> getAllFinancialReports() {
        List<FinancialReport> financialReports = financialReportService.getAllFinancialReports();
        return ResponseEntity.ok(financialReports);
    }

    @GetMapping("/{id}")
    public ResponseEntity<FinancialReport> getFinancialReportById(@PathVariable("id") Integer reportId) {
        FinancialReport financialReport = financialReportService.getFinancialReportById(reportId);
        return ResponseEntity.ok(financialReport);
    }

    @PostMapping
    public ResponseEntity<FinancialReport> createFinancialReport(@RequestBody FinancialReport financialReport) {
        FinancialReport createdReport = financialReportService.createFinancialReport(financialReport);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdReport);
    }

    @PutMapping("/{id}")
    public ResponseEntity<FinancialReport> updateFinancialReport(
            @PathVariable("id") Integer reportId, @RequestBody FinancialReport updatedFinancialReport) {
        FinancialReport updatedReport = financialReportService.updateFinancialReport(reportId, updatedFinancialReport);
        return ResponseEntity.ok(updatedReport);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFinancialReport(@PathVariable("id") Integer reportId) {
        financialReportService.deleteFinancialReport(reportId);
        return ResponseEntity.noContent().build();
    }
}


