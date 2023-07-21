package com.example.eventmanagement.Controller;
import com.example.eventmanagement.Entities.Evenement;
import com.example.eventmanagement.Entities.FinancialReport;
import com.example.eventmanagement.Repositories.EventRepository;
import com.example.eventmanagement.Repositories.FinancialReportRepository;
import com.example.eventmanagement.Repositories.TicketRepository;
import com.example.eventmanagement.Services.FinancialReportService;
import com.example.eventmanagement.Services.FinancialReportServiceImpl;
import com.example.eventmanagement.Services.IEventService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@AllArgsConstructor
@RequestMapping("/financialReports")
public class FinancialReportController {

    @Autowired
    private FinancialReportService financialReportService;
    @Autowired
    FinancialReportRepository financialReportRepository;
    @PostMapping("/addRpport")
    public FinancialReport addRapport(@RequestBody FinancialReport financialReport){

        return financialReportRepository.save(financialReport);
    }
    @GetMapping("/retrieveAllRapports")
    public List<FinancialReport> getRapports() {
        List<FinancialReport> listRapports = financialReportService.RetrieveAllRapports();
        return listRapports;
    }
    @GetMapping("/get/{ReportId}")
    public ResponseEntity<FinancialReport> getRapportById(@PathVariable("ReportId") Integer ReportId) {
        FinancialReport financialReport = financialReportService.getRapportById(ReportId);
        if (financialReport != null) {
            return ResponseEntity.ok(financialReport);
        }else {
            return  ResponseEntity.notFound().build();
        }
    }
    @PutMapping("updateRapport")
    public FinancialReport updateRapport(@RequestBody FinancialReport financialReport){
        return financialReportService.updateRapport(financialReport);
    }

    @DeleteMapping("/deleteRapport/{id}")
    public void deleteRapport(@PathVariable("id") Integer ReportId){
        financialReportService.deteteRapport(ReportId);
    }

}



//nadine
    /*
    @Autowired
    FinancialReportRepository financialReportRepository;
    @Autowired
    FinancialReportService financialReportService;
    @PostMapping("/add-rapport")

    public FinancialReport addRapport(@RequestBody FinancialReport financialReport){

        return financialReportRepository.save(financialReport);
    }
    @CrossOrigin(origins = "*")

    @GetMapping("/retrieve-all-rapports")
    public List<FinancialReport> getRapports() {
        List<FinancialReport> listRapports = financialReportService.RetrieveAllRapport();
        return listRapports;
    }

    @GetMapping("/{id}")
    public ResponseEntity<FinancialReport> getRapportById(@PathVariable("id") Integer Id) {
        FinancialReport financialReport = financialReportService.getRapportById(Id);
        if (financialReport != null) {
            return ResponseEntity.ok(financialReport);
        }else {
            return  ResponseEntity.notFound().build();
        }
    }
    @PutMapping("updateRapport")
    public FinancialReport updateRapport(@RequestBody FinancialReport financialReport){

        return financialReportService.updateRapport(financialReport);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteRapport(@PathVariable("id") Integer id){
        financialReportService.deleteById(id);
    }
*/
//amina
  /*
    private final FinancialReportService financialReportService;

    @Autowired
    public FinancialReportController(FinancialReportService financialReportService) {
        this.financialReportService = financialReportService;
    }
    @CrossOrigin(origins = "http://localhost:4200")

    @GetMapping
    public ResponseEntity<List<FinancialReport>> getAllFinancialReports() {
        List<FinancialReport> financialReports = financialReportService.getAllFinancialReports();
        return ResponseEntity.ok(financialReports);
    }
    @CrossOrigin(origins = "http://localhost:4200")

    @GetMapping("/{id}")
    public ResponseEntity<FinancialReport> getFinancialReportById(@PathVariable("id") Integer reportId) {
        FinancialReport financialReport = financialReportService.getFinancialReportById(reportId);
        return ResponseEntity.ok(financialReport);
    }
    @CrossOrigin(origins = "http://localhost:4200")

    @PostMapping
    public ResponseEntity<FinancialReport> createFinancialReport(@RequestBody FinancialReport financialReport) {
        FinancialReport createdReport = financialReportService.createFinancialReport(financialReport);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdReport);
    }
    @CrossOrigin(origins = "http://localhost:4200")

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
}*/


