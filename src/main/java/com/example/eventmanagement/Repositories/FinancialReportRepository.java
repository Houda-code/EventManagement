package com.example.eventmanagement.Repositories;

import com.example.eventmanagement.Entities.FinancialReport;
import com.example.eventmanagement.Services.FinancialReportService;
import com.example.eventmanagement.Services.FinancialReportServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FinancialReportRepository  extends JpaRepository<FinancialReport,Integer>
{

}
