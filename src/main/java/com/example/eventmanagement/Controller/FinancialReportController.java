package com.example.eventmanagement.Controller;
import com.example.eventmanagement.Entities.FinancialReport;
import com.example.eventmanagement.Repositories.FinancialReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/financialReports")
public class FinancialReportController {
        private final FinancialReportRepository reportRepository;

        @Autowired
        public FinancialReportController(FinancialReportRepository reportRepository) {
            this.reportRepository = reportRepository;
        }

        @GetMapping
        public List<FinancialReport> getAllReports() {
            return reportRepository.findAll();
        }

        @GetMapping("/{ReportI}")
        public FinancialReport getReportById(@PathVariable("ReportId") Integer reportId) {
            return reportRepository.findById(reportId).orElse(null);
        }

        @PostMapping
        public FinancialReport createReport(@RequestBody FinancialReport report) {
            return reportRepository.save(report);
        }

    //   @PutMapping("/{id}")
      //  public FinancialReport updateReport(@PathVariable("ReportId") Integer ReportId, @RequestBody FinancialReport report) {
        //   report.setReportId(ReportId);
          // return reportRepository.save(report);
        //}

        @DeleteMapping("/{id}")
        public void deleteReport(@PathVariable("id") Integer id) {
            reportRepository.deleteById(id);
        }
    }


