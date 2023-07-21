package com.example.eventmanagement.Services;

import com.example.eventmanagement.Entities.Evenement;
import com.example.eventmanagement.Entities.EventCategory;
import com.example.eventmanagement.Entities.FinancialReport;
import com.example.eventmanagement.Entities.Ticket;
import com.example.eventmanagement.Repositories.EventRepository;
import com.example.eventmanagement.Repositories.FinancialReportRepository;
import com.example.eventmanagement.Repositories.TicketRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Service
@Slf4j
@AllArgsConstructor
public class FinancialReportServiceImpl implements FinancialReportService {






    @Autowired
    FinancialReportRepository financialReportRepository;

    @Override
    public FinancialReport addRapport(FinancialReport financialReport) {
        return financialReportRepository.save(financialReport);
    }

    @Override
    public List<FinancialReport> RetrieveAllRapports() {
        return (List<FinancialReport>) financialReportRepository.findAll();
    }

    @Override
    public FinancialReport getRapportById(Integer ReportId) {
        return financialReportRepository.findById(ReportId).orElse(null);
    }

    @Override
    public FinancialReport updateRapport(FinancialReport financialReport) {
        return financialReportRepository.save(financialReport);
    }

    @Override
    public void deteteRapport(Integer ReportId) {
        financialReportRepository.deleteById(ReportId);
    }



/*
    @Autowired
    FinancialReportRepository financialReportRepository;

    @Override
    public FinancialReport addRapport(FinancialReport financialReport) {
        return financialReportRepository.save(financialReport);
    }




    public  FinancialReport getRapportById(Integer id) {
        return  financialReportRepository.findById(id).orElse(null);
    }


    public void deleteEvent(Integer id){
        financialReportRepository.deleteById(id);
    }

    @Override
    public List<FinancialReport>RetrieveAllRapport() {

        return (List<FinancialReport>) financialReportRepository.findAll();
    }
    @Override
    public FinancialReport updateRapport(FinancialReport financialReport){
        return financialReportRepository.save(financialReport);
    }
/*
    @Override
    public List<FinancialReport> searchByName(String name) {
        String searchc = name.toLowerCase();
        List<FinancialReport> le = financialReportRepository.findAll();
        List<FinancialReport> lf = new ArrayList<>();
        for(FinancialReport e: le) {
            if(e.getTitle()!=null){
                if(e.getTitle().toLowerCase().equals(searchc)){
                    lf.add(e);
                }
            }
        }
        return lf;
    }*/


}















   /*private final FinancialReportRepository financialReportRepository;

    @Override
    public FinancialReport createFinancialReport(FinancialReport financialReport) {
        // Implémentez ici la logique pour créer un rapport financier
        // Vous pouvez effectuer des validations, des calculs ou d'autres opérations métier

        // Utilisez le repository pour enregistrer le rapport financier dans la base de données
        return financialReportRepository.save(financialReport);
    }

    @Override
    public List<FinancialReport> getAllFinancialReports() {
        // Utilisez le repository pour récupérer tous les rapports financiers de la base de données
        return financialReportRepository.findAll();
    }

    @Override
    public FinancialReport getFinancialReportById(Integer id) {
        // Utilisez le repository pour récupérer un rapport financier par son ID
        // Si aucun rapport financier correspondant n'est trouvé, vous pouvez lever une exception appropriée
        return financialReportRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Financial Report not found"));
    }

    @Override
    public FinancialReport updateFinancialReport(Integer id, FinancialReport updatedFinancialReport) {
        // Utilisez le repository pour récupérer le rapport financier à mettre à jour par son ID
        FinancialReport financialReport = financialReportRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Financial Report not found"));

        // Mettez à jour les propriétés du rapport financier avec les valeurs de updatedFinancialReport
        financialReport.setTitle(updatedFinancialReport.getTitle());
        financialReport.setDescription(updatedFinancialReport.getDescription());
        financialReport.setStartDate(updatedFinancialReport.getStartDate());
        financialReport.setEndDate(updatedFinancialReport.getEndDate());
        financialReport.setTotalRevenue(updatedFinancialReport.getTotalRevenue());
        financialReport.setTotalExpenses(updatedFinancialReport.getTotalExpenses());
        financialReport.setNetIncome(updatedFinancialReport.getNetIncome());

        // Utilisez le repository pour enregistrer les modifications dans la base de données
        return financialReportRepository.save(financialReport);
    }

    @Override
    public void deleteFinancialReport(Integer id) {
        // Utilisez le repository pour récupérer le rapport financier à supprimer par son ID
        FinancialReport financialReport = financialReportRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Financial Report not found"));

        // Utilisez le repository pour supprimer le rapport financier de la base de données
        financialReportRepository.delete(financialReport);
    }
}*/