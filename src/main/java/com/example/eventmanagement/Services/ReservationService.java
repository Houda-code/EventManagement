package com.example.eventmanagement.Services;
import com.example.eventmanagement.Entities.Facture;
import com.example.eventmanagement.Entities.Payment;
import com.example.eventmanagement.Entities.Reservation;

import java.util.List;
import java.util.Optional;

public interface ReservationService {

    Reservation addReservation(Reservation reservation);
    Optional<Reservation> getReservationById(Integer Reservtid);

    List<Reservation> RetrieveAllReservations();
    Reservation saveReservation(Reservation reservation);
    void deleteReservation(Integer Reservtid);
}
