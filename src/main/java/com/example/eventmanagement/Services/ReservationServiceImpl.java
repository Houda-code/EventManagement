package com.example.eventmanagement.Services;
import com.example.eventmanagement.Entities.Reservation;
import com.example.eventmanagement.Repositories.ReservationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ReservationServiceImpl implements ReservationService{
    ReservationRepository reservationRepository;
    @Override
    public Reservation addReservation(Reservation reservation) {

        return reservationRepository.save(reservation);

    }

    @Override
    public List<Reservation> RetrieveAllReservations() {
        return (List<Reservation>) reservationRepository.findAll();
    }
}
