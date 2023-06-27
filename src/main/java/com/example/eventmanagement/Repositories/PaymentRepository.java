package com.example.eventmanagement.Repositories;

import com.example.eventmanagement.Entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment,Integer> {
}
