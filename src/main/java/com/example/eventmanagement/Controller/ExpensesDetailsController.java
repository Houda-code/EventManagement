package com.example.eventmanagement.Controller;

import com.example.eventmanagement.Entities.ExpensesDetails;
import com.example.eventmanagement.Services.ExpensesDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
    @RequestMapping("/ExpensesDetails")
public class ExpensesDetailsController {
    /*
    private final ExpensesDetailsService expensesDetailsService;


    @Autowired
    public ExpensesDetailsController(ExpensesDetailsService expensesDetailsService) {
        this.expensesDetailsService = expensesDetailsService;
    }

    // Endpoint pour créer une dépense
    @PostMapping
    public ResponseEntity<ExpensesDetails> createExpensesDetail(@RequestBody ExpensesDetails expensesDetail) {
        ExpensesDetails createdExpensesDetail = expensesDetailsService.createExpensesDetail(expensesDetail);
        return new ResponseEntity<>(createdExpensesDetail, HttpStatus.CREATED);
    }

    // Endpoint pour récupérer toutes les dépenses
    @GetMapping
    public ResponseEntity<List<ExpensesDetails>> getAllExpensesDetails() {
        List<ExpensesDetails> expensesDetails = expensesDetailsService.getAllExpensesDetails();
        return new ResponseEntity<>(expensesDetails, HttpStatus.OK);
    }

    // Endpoint pour récupérer une dépense par son ID
    @GetMapping("/{id}")
    public ResponseEntity<ExpensesDetails> getExpensesDetailById(@PathVariable("id") Integer id) {
        ExpensesDetails expensesDetail = expensesDetailsService.getExpensesDetailById(id);
        return new ResponseEntity<>(expensesDetail, HttpStatus.OK);
    }

    // Endpoint pour mettre à jour une dépense
    @PutMapping("/{id}")
    public ResponseEntity<ExpensesDetails> updateExpensesDetail(
            @PathVariable("id") Integer id,
            @RequestBody ExpensesDetails updatedExpensesDetail
    ) {
        ExpensesDetails expensesDetail = expensesDetailsService.updateExpensesDetail(id, updatedExpensesDetail);
        return new ResponseEntity<>(expensesDetail, HttpStatus.OK);
    }

    // Endpoint pour supprimer une dépense
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteExpensesDetail(@PathVariable("id") Integer id) {
        expensesDetailsService.deleteExpensesDetail(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
*/


    private final ExpensesDetailsService expensesDetailsService;

    @Autowired
    public ExpensesDetailsController(ExpensesDetailsService expensesDetailsService) {
        this.expensesDetailsService = expensesDetailsService;
    }

    @PostMapping
    public ResponseEntity<ExpensesDetails> createExpensesDetail(@RequestBody ExpensesDetails expensesDetail) {
        ExpensesDetails createdExpensesDetail = expensesDetailsService.createExpensesDetail(expensesDetail);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdExpensesDetail);
    }

    @GetMapping
    public ResponseEntity<List<ExpensesDetails>> getAllExpensesDetails() {
        List<ExpensesDetails> expensesDetails = expensesDetailsService.getAllExpensesDetails();
        return ResponseEntity.ok(expensesDetails);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ExpensesDetails> getExpensesDetailById(@PathVariable Integer id) {
        ExpensesDetails expensesDetail = expensesDetailsService.getExpensesDetailById(id);
        return ResponseEntity.ok(expensesDetail);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ExpensesDetails> updateExpensesDetail(@PathVariable Integer id,
                                                                @RequestBody ExpensesDetails updatedExpensesDetail) {
        ExpensesDetails expensesDetail = expensesDetailsService.updateExpensesDetail(id, updatedExpensesDetail);
        return ResponseEntity.ok(expensesDetail);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteExpensesDetail(@PathVariable Integer id) {
        expensesDetailsService.deleteExpensesDetail(id);
        return ResponseEntity.noContent().build();
    }
}
