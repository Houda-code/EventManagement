package com.example.eventmanagement.Controller;

import com.example.eventmanagement.Entities.Evenement;
import com.example.eventmanagement.Entities.Reservation;
import com.example.eventmanagement.Entities.User;
import com.example.eventmanagement.Repositories.ReservationRepository;
import com.example.eventmanagement.Services.ReservationService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*")
@RestController
@AllArgsConstructor
@RequestMapping("/Resservation")
public class ReservationController {

    ReservationService reservationService;
    public final ReservationRepository reservationRepository;
    @PostMapping("/add-Reservation")
    public Reservation addReservation(@RequestBody Reservation reservation){
        return  reservationRepository.save(reservation);
    }
    @PostMapping("makeReservation/{Id}")
    public ResponseEntity<?> makeReservation(@PathVariable Integer Id, @RequestBody Reservation reservation) {
        try {
            Reservation createdReservation = reservationService.createReservation(Id, reservation);
            return ResponseEntity.ok(createdReservation);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Une erreur s'est produite lors de la création de la réservation.");
        }
    }

    @GetMapping("/retrieve-all-Reservation")
    public List<Reservation> getReservations() {
        List<Reservation> listReservations = reservationService.RetrieveAllReservations();
        return listReservations;
    }
    @GetMapping("/{Reservtid}")
    public ResponseEntity<Reservation> getResrvationById(@PathVariable Integer Reservtid) {
        return reservationService.getReservationById(Reservtid)
                .map(reservation -> new ResponseEntity<>(reservation, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PutMapping("/{Reservtid}")
    public ResponseEntity<Reservation> updateReservation(@PathVariable Integer Reservtid, @RequestBody Reservation reservation) {
        if (!reservationService.getReservationById(Reservtid).isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        reservation.setReservtid(Reservtid);
        Reservation updateReservation = reservationService.saveReservation(reservation);
        return new ResponseEntity<>(updateReservation, HttpStatus.OK);
    }
    @DeleteMapping("/{Reservtid}")
    public ResponseEntity<Void> deleteReservation(@PathVariable Integer Reservtid) {
        if (!reservationService.getReservationById(Reservtid).isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        reservationService.deleteReservation(Reservtid);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @GetMapping("GetEventByReservation/{reservationId}")
    public Evenement getEventByReservationId(@PathVariable Integer reservationId) {
        return reservationService.getEventByReservationId(reservationId);
    }
}
