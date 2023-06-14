package com.example.eventmanagement.Services;

import com.example.eventmanagement.Entities.Calendar;
import com.example.eventmanagement.Entities.User;
import com.example.eventmanagement.Repositories.CalendarRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

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
}
