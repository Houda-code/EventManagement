package com.example.eventmanagement.Repositories;

import com.example.eventmanagement.Entities.ExpensesDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpensesDetailsRepository extends JpaRepository<ExpensesDetails,Integer> {
}
