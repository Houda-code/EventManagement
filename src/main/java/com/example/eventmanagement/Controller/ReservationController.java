package com.example.eventmanagement.Controller;

import com.example.eventmanagement.Entities.Reservation;
import com.example.eventmanagement.Entities.User;
import com.example.eventmanagement.Repositories.ReservationRepository;
import com.example.eventmanagement.Services.ReservationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/retrieve-all-Reservation")
    public List<Reservation> getReservations() {
        List<Reservation> listReservations = reservationService.RetrieveAllReservations();
        return listReservations;
    }

}
