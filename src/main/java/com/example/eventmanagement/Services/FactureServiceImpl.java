package com.example.eventmanagement.Services;
import com.example.eventmanagement.Entities.*;
import com.example.eventmanagement.Repositories.FactureRepository;
import com.example.eventmanagement.Repositories.ReservationRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

import java.util.Optional;
import java.util.UUID;

@Service
public class FactureServiceImpl implements FactureService{
    FactureRepository factureRepository;

    @Autowired
    public FactureServiceImpl(FactureRepository factureRepository) {
        this.factureRepository = factureRepository;
    }
    @Override
    public Facture addFacture(Facture facture) {
        return factureRepository.save(facture);
    }
    @Override
    public Iterable<Facture> getAllFactures() {
        return factureRepository.findAll();
    }

    @Override
    public Optional<Facture> getFactureById(Integer Idfacture) {
        return factureRepository.findById(Idfacture);
    }

    @Override
    public Facture saveFacture(Facture facture) {
        return factureRepository.save(facture);
    }

    @Override
    public void deleteFacture(Integer Idfacture) {
        factureRepository.deleteById(Idfacture);
    }

    public List<Facture> getFactureHistoriqueByUser(Integer id) {
        return factureRepository.findByUserId(id);
    }

        public Facture generateFacture(Evenement event, Ticket ticket) {
            Facture facture = new Facture();
            facture.setRefFacture(generateRefFacture());
            facture.setDateFacture(new Date());
            facture.setEvent(event);
            facture.setTicket(ticket);

            return facture;
        }

        private String generateRefFacture() {

            return UUID.randomUUID().toString();
        }
}
