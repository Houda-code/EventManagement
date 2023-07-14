package com.example.eventmanagement.Services;

import com.example.eventmanagement.Entities.ExpensesDetails;
import com.example.eventmanagement.Entities.FinancialReport;
import com.example.eventmanagement.Repositories.ExpensesDetailsRepository;
import com.example.eventmanagement.Repositories.FinancialReportRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
@Slf4j
@AllArgsConstructor

public class ExpensesDetailsSericeImpl implements ExpensesDetailsService {
/*
    private ExpensesDetailsRepository expensesDetailsRepository;
    private FinancialReportRepository financialReportRepository;

    @Autowired
    public void ExpensesDetailsService(ExpensesDetailsRepository expensesDetailsRepository,
                                       FinancialReportRepository financialReportRepository) {
        this.expensesDetailsRepository = expensesDetailsRepository;
        this.financialReportRepository = financialReportRepository;
    }
    @Override
    public ExpensesDetails createExpensesDetail(ExpensesDetails expensesDetail) {
        return  expensesDetailsRepository.save(expensesDetail);
    }
    @Override
    public ExpensesDetails createExpensesDetail(ExpensesDetails expensesDetail, Integer financialReportId) {
        FinancialReport financialReport = financialReportRepository.findById(financialReportId)
                .orElseThrow(() -> new EntityNotFoundException("ExpensesDetail with id " + financialReportId + " not found"));;

        expensesDetail.setFinancialReport(financialReport);
        return expensesDetailsRepository.save(expensesDetail);
    }
@Override
    public ExpensesDetails getExpensesDetailById(Integer id) {
        return expensesDetailsRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("ExpensesDetail with id " + id + " not found"));
    }




    @Override
    public List<ExpensesDetails> getAllExpensesDetails() {
        return expensesDetailsRepository.findAll();
    }
    @Override
    public ExpensesDetails updateExpensesDetail(Integer id, ExpensesDetails updatedExpensesDetail) {
        ExpensesDetails expensesDetail = expensesDetailsRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("ExpensesDetail with id " + id + " not found"));

        expensesDetail.setExpensesDetailType(updatedExpensesDetail.getExpensesDetailType());
        expensesDetail.setAmount(updatedExpensesDetail.getAmount());
        expensesDetail.setDate(updatedExpensesDetail.getDate());
        expensesDetail.setDescription(updatedExpensesDetail.getDescription());

        return expensesDetailsRepository.save(expensesDetail);
    }
    @Override
    public void deleteExpensesDetail(Integer id) {
        ExpensesDetails expensesDetail = expensesDetailsRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("ExpensesDetail with id " + id + " not found"));

        expensesDetailsRepository.delete(expensesDetail);
    }*/
}
