package com.example.eventmanagement.Controller;

import com.example.eventmanagement.Entities.Reservation;
import com.example.eventmanagement.Repositories.ReservationRepository;
import com.example.eventmanagement.Services.ReservationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
