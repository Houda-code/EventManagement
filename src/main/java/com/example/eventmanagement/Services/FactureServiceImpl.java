package com.example.eventmanagement.Services;

import com.example.eventmanagement.Entities.Facture;
import com.example.eventmanagement.Repositories.FactureRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class FactureServiceImpl implements FactureService{
    FactureRepository factureRepository;
    @Override
    public Facture addFacture(Facture facture) {
        return factureRepository.save(facture);
    }
}
