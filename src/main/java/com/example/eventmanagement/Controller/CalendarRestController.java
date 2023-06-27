package com.example.eventmanagement.Controller;

import com.example.eventmanagement.Entities.Calendar;

import com.example.eventmanagement.Repositories.CalendarRepository;
import com.example.eventmanagement.Services.ICalendarService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Calendar")
public class CalendarRestController {
    ICalendarService iCalendarService;
    public final CalendarRepository calendarRepository;
    @PostMapping("/add-Calendar")
    public Calendar addCalendar(@RequestBody Calendar calendar){
        return calendarRepository.save(calendar);
    }
    @GetMapping("/retrieve-all-Calendars")
    public List<Calendar> getCalendars() {
        List<Calendar> listCalendars = iCalendarService.RetrieveAllCalendars();
        return listCalendars;
    }
    @GetMapping("/{id}")
    public ResponseEntity<Calendar> GetCalendarByID(@PathVariable("CalendarId") Integer id) {
        Calendar calendar = iCalendarService.GetCalendarByID(id);
        return ResponseEntity.ok(calendar);
    }
}
