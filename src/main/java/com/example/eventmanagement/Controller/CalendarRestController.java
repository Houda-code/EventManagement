package com.example.eventmanagement.Controller;

import com.example.eventmanagement.Entities.Calendar;
import com.example.eventmanagement.Repositories.CalendarRepository;
import com.example.eventmanagement.Services.ICalendarService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
