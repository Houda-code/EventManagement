package com.example.eventmanagement.Services;

import com.example.eventmanagement.Entities.Payment;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public interface PaymentService {
    Iterable<Payment> getAllPayments();
    Optional<Payment> getPaymentById(Integer IdPaymentOperation);
    Payment savePayment(Payment payment);
    void deletePayment(Integer IdPaymentOperation);
}
