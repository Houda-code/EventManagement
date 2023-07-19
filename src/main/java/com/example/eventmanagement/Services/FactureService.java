package com.example.eventmanagement.Services;
import com.example.eventmanagement.Entities.Evenement;
import com.example.eventmanagement.Entities.Facture;
import com.example.eventmanagement.Entities.Ticket;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface FactureService {
    Facture addFacture(Facture facture);
    Iterable<Facture> getAllFactures();
    Optional<Facture> getFactureById(Integer Idfacture);
    Facture saveFacture(Facture facture);
    void deleteFacture(Integer Idfacture);
    public List<Facture> getFactureHistoriqueByUser(Integer id);
    public  Facture generateFacture(Evenement event, Ticket ticket);
}
