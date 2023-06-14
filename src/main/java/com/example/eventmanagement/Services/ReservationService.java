package com.example.eventmanagement.Services;
import com.example.eventmanagement.Entities.Reservation;

import java.util.List;

public interface ReservationService {
    Reservation addReservation(Reservation reservation);

    List<Reservation> RetrieveAllReservations();

}
