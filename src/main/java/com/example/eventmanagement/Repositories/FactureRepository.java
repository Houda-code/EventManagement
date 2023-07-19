package com.example.eventmanagement.Repositories;

import com.example.eventmanagement.Entities.Facture;
import com.example.eventmanagement.Entities.FinancialReport;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FactureRepository  extends JpaRepository<Facture,Integer> {
    List<Facture> findByUserId(Integer id);
}
