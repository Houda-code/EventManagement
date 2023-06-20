package com.example.eventmanagement.Services;

import com.example.eventmanagement.Entities.FinancialReport;
import com.example.eventmanagement.Repositories.FinancialReportRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;


@Service
@Slf4j
@AllArgsConstructor
public class FinancialReportServiceImpl implements FinancialReportService {



    private final FinancialReportRepository financialReportRepository;

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
}
