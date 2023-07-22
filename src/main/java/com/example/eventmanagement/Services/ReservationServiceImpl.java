package com.example.eventmanagement.Services;
import com.example.eventmanagement.Entities.Evenement;
import com.example.eventmanagement.Entities.Facture;
import com.example.eventmanagement.Entities.Payment;
import com.example.eventmanagement.Entities.Reservation;
import com.example.eventmanagement.Repositories.EventRepository;
import com.example.eventmanagement.Repositories.ReservationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.awt.*;
import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class ReservationServiceImpl implements ReservationService {
   ReservationRepository reservationRepository;
   IEventService eventService;
   EventRepository eventRepository;

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

   /**
    * @Override public Reservation makeReservation(Integer id,Reservation reservation){
    * Evenement event=eventService.getEventById(id);
    * reservation.setEvent(event);
    * return reservationRepository.save(reservation);
    * }
    **/
   public Reservation makeReservation(Integer eventId) {
      Evenement event = eventService.getEventById(eventId);

      if (event == null) {
         throw new IllegalArgumentException("Event with ID " + eventId + " not found");
      }
      Reservation reservation = new Reservation();
      reservation.setEvent(event);
      return reservationRepository.save(reservation);
   }


   @Override
   public Reservation createReservation(Integer Id, Reservation reservation) {
      Evenement evenement = eventRepository.findById(Id).get();
      reservation.setEvent(evenement);
      return reservationRepository.save(reservation);
   }

   /* @Override
    public Evenement getEventByReservationId(Integer reservationId) {
       Reservation reservation = reservationRepository.findById(reservationId)
               .orElseThrow(() -> new EntityNotFoundException("Reservation not found with ID: " + reservationId));

       return reservation.getEvent();
    }*/
   @Override
   public List<Evenement> getAllEventsForReservations() {
      List<Reservation> reservations = reservationRepository.findAll();
      return reservations.stream()
              .map(Reservation::getEvent)
              .collect(Collectors.toList());
   }
}


