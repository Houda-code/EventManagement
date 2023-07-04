package com.example.eventmanagement.Services;
import com.example.eventmanagement.Entities.Facture;
import com.example.eventmanagement.Entities.Payment;
import com.example.eventmanagement.Entities.Reservation;
import com.example.eventmanagement.Repositories.ReservationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
   @Override
   public Optional<Reservation> getReservationById(Integer Reservtid) {
      return reservationRepository.findById(Reservtid);
   }
   @Override
   public Reservation saveReservation(Reservation reservation) {
      return reservationRepository.save(reservation);
   }

   @Override
   public void deleteReservation(Integer Reservtid) {
      reservationRepository.deleteById(Reservtid);
   }

}
