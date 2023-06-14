package com.example.eventmanagement.Controller;

import com.example.eventmanagement.Entities.Evenement;
import com.example.eventmanagement.Entities.Facture;
import com.example.eventmanagement.Repositories.EventRepository;
import com.example.eventmanagement.Repositories.FactureRepository;
import com.example.eventmanagement.Services.FactureService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/Facture")
public class FactureController {
    FactureService factureService;
    public final FactureRepository factureRepository;
    @PostMapping("/add-Facture")
    public Facture addFacture(@RequestBody Facture facture){
        return factureRepository.save(facture);
    }

}
