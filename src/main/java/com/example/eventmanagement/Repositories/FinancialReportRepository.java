package com.example.eventmanagement.Repositories;

import com.example.eventmanagement.Entities.Evenement;
import com.example.eventmanagement.Entities.EventCategory;
import com.example.eventmanagement.Entities.FinancialReport;
import com.example.eventmanagement.Services.FinancialReportService;
import com.example.eventmanagement.Services.FinancialReportServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface FinancialReportRepository  extends JpaRepository<FinancialReport,Integer>
{

}