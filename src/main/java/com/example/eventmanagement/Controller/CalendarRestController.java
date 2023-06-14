package com.example.eventmanagement.Controller;

import com.example.eventmanagement.Entities.Calendar;
import com.example.eventmanagement.Entities.User;
import com.example.eventmanagement.Repositories.CalendarRepository;
import com.example.eventmanagement.Services.ICalendarService;
import lombok.AllArgsConstructor;
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
}
