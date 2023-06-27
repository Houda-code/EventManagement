package com.example.eventmanagement.Repositories;

import com.example.eventmanagement.Entities.Calendar;
import com.example.eventmanagement.Entities.FinancialReport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalendarRepository extends JpaRepository<Calendar,Integer> {
}
