package com.example.eventmanagement.Repositories;

import com.example.eventmanagement.Entities.FinancialReport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FactureRepository  extends JpaRepository<FactureRepository,Integer> {
}
