/*package com.example.eventmanagement.Controller;

import com.example.eventmanagement.Entities.Calendar;

import com.example.eventmanagement.Repositories.CalendarRepository;
import com.example.eventmanagement.Services.ICalendarService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/Calendars")
public class CalendarRestController {
    @Autowired
    private ICalendarService calendarService;
    @Autowired
    private CalendarRepository calendarRepository;

    @GetMapping("/retrieveAllCalendars")
    public ResponseEntity<List<Calendar>> getAllCalendars() {
        List<Calendar> calendars = calendarService.getAllCalendars();
        return new ResponseEntity<>(calendars, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Calendar> getCalendarById(Integer CalendarId) {
        Calendar calendar = calendarService.getCalendarById(CalendarId);
        if (calendar != null) {
            return new ResponseEntity<>(calendar, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/addCalendar")
    public ResponseEntity<Calendar> createCalendar(@RequestBody Calendar calendar) {
        Calendar createdCalendar = calendarService.createCalendar(calendar);
        return new ResponseEntity<>(createdCalendar, HttpStatus.CREATED);
    }

   /* @PutMapping("updateCalendar/{id}")
    public ResponseEntity<Calendar> updateCalendar(Integer CalendarId, @RequestBody Calendar calendar) {
        Calendar updatedCalendar = calendarService.updateCalendar(CalendarId, calendar);
        if (calendar != null) {
            calendar.setDateDebut(updatedCalendar.getDateDebut());
            calendar.setDateFin(updatedCalendar.getDateFin());
            calendar.setEventId(updatedCalendar.getEventId());
            calendar.setNote(updatedCalendar.getNote());

            Calendar updated = calendarService.updateCalendar(calendar);
            return new ResponseEntity<>(updated, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/deleteCalendar/{id}")
    public void deleteCalendar(@PathVariable("id") Integer Calendarid){
        calendarRepository.deleteById(Calendarid);
    }

}
*/
