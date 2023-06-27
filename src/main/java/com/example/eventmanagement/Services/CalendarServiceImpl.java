package com.example.eventmanagement.Services;

import com.example.eventmanagement.Entities.Calendar;
import com.example.eventmanagement.Entities.User;
import com.example.eventmanagement.Repositories.CalendarRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@AllArgsConstructor
@Service
public class CalendarServiceImpl implements ICalendarService {
    CalendarRepository calendarRepository;
    @Override
    public Calendar addCalendar(Calendar calendar) {
        return calendarRepository.save(calendar);
    }

    @Override
    public List<Calendar> RetrieveAllCalendars() {
        return (List<Calendar>) calendarRepository.findAll();
    }

    @Override
    public Calendar GetCalendarByID(Integer CalendarId) {
        return calendarRepository.findById(CalendarId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Calendar not found"));
    }
}
