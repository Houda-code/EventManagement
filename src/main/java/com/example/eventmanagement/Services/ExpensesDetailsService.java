package com.example.eventmanagement.Services;

import com.example.eventmanagement.Entities.ExpensesDetails;

import java.util.List;

public interface ExpensesDetailsService {
    ExpensesDetails createExpensesDetail(ExpensesDetails expensesDetail);

    List<ExpensesDetails> getAllExpensesDetails();

    ExpensesDetails createExpensesDetail(ExpensesDetails expensesDetail, Integer financialReportId);

    ExpensesDetails getExpensesDetailById(Integer id);

    ExpensesDetails updateExpensesDetail(Integer id, ExpensesDetails updatedExpensesDetail);

    void deleteExpensesDetail(Integer id);
}
