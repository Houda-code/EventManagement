package com.example.eventmanagement.Controller;
import com.example.eventmanagement.Entities.Payment;
import com.example.eventmanagement.Services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    PaymentService paymentService;

    @Autowired
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping
    public ResponseEntity<Iterable<Payment>> getAllPayments() {
        Iterable<Payment> payments = paymentService.getAllPayments();
        return new ResponseEntity<>(payments, HttpStatus.OK);
    }

    @GetMapping("/{IdPaymentOperation}")
    public ResponseEntity<Payment> getPaymentById(@PathVariable Integer IdPaymentOperation) {
        return paymentService.getPaymentById(IdPaymentOperation)
                .map(payment -> new ResponseEntity<>(payment, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Payment> createPayment(@RequestBody Payment payment) {
        Payment savedPayment = paymentService.savePayment(payment);
        return new ResponseEntity<>(savedPayment, HttpStatus.CREATED);
    }

    @PutMapping("/{IdPaymentOperation}")
    public ResponseEntity<Payment> updatePayment(@PathVariable Integer IdPaymentOperation, @RequestBody Payment payment) {
        if (!paymentService.getPaymentById(IdPaymentOperation).isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        payment.setIdPaymentOperation(IdPaymentOperation);
        Payment updatedPayment = paymentService.savePayment(payment);
        return new ResponseEntity<>(updatedPayment, HttpStatus.OK);
    }

    @DeleteMapping("/{IdPaymentOperation}")
    public ResponseEntity<Void> deletePayment(@PathVariable Integer IdPaymentOperation) {
        if (!paymentService.getPaymentById(IdPaymentOperation).isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        paymentService.deletePayment(IdPaymentOperation);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}