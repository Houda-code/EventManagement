package com.example.eventmanagement.Controller;
import com.example.eventmanagement.Entities.Facture;
import com.example.eventmanagement.Repositories.FactureRepository;
import com.example.eventmanagement.Repositories.ReservationRepository;
import com.example.eventmanagement.Services.FactureService;
import com.example.eventmanagement.Services.ReservationService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Facture")
public class FactureController {
    FactureService factureService;
    public final FactureRepository factureRepository;
    @PostMapping("/add-Facture")
    public Facture addFacture(@RequestBody Facture facture){
        return factureRepository.save(facture);
    }

    @Autowired
    public FactureController(FactureService factureService, FactureRepository factureRepository) {
        this.factureRepository = factureRepository;
        this.factureService = factureService;
    }

    @GetMapping
    public ResponseEntity<Iterable<Facture>> getAllFactures() {
        Iterable<Facture> factures = factureService.getAllFactures();
        return new ResponseEntity<>(factures, HttpStatus.OK);
    }

    @GetMapping("/{Idfacture}")
    public ResponseEntity<Facture> getFactureById(@PathVariable Integer Idfacture) {
        return factureService.getFactureById(Idfacture)
                .map(facture -> new ResponseEntity<>(facture, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Facture> createFacture(@RequestBody Facture facture) {
        Facture savedFacture = factureService.saveFacture(facture);
        return new ResponseEntity<>(savedFacture, HttpStatus.CREATED);
    }

    @PutMapping("/{Idfacture}")
    public ResponseEntity<Facture> updateFacture(@PathVariable Integer Idfacture, @RequestBody Facture facture) {
        if (!factureService.getFactureById(Idfacture).isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        facture.setIdfacture(Idfacture);
        Facture updatedFacture = factureService.saveFacture(facture);
        return new ResponseEntity<>(updatedFacture, HttpStatus.OK);
    }

    @DeleteMapping("/{Idfacture}")
    public ResponseEntity<Void> deleteFacture(@PathVariable Integer Idfacture) {
        if (!factureService.getFactureById(Idfacture).isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        factureService.deleteFacture(Idfacture);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
