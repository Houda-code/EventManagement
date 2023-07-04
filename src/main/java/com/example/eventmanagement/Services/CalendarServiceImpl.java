package com.example.eventmanagement.Services;

import com.example.eventmanagement.Entities.Calendar;
import com.example.eventmanagement.Entities.User;
import com.example.eventmanagement.Repositories.CalendarRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@AllArgsConstructor
@Service
public class CalendarServiceImpl implements ICalendarService {
    @Autowired
    private  CalendarRepository calendarRepository;
    @Override
    public List<Calendar> getAllCalendars() {
        return calendarRepository.findAll();
    }

    @Override
    public Calendar getCalendarById(Integer CalendarId) {
        return calendarRepository.findById(CalendarId).orElse(null);
    }

    @Override
    public Calendar createCalendar(Calendar calendar) {
        return calendarRepository.save(calendar);
    }

    @Override
<<<<<<< HEAD
    public Calendar updateCalendar(Integer CalendarId, Calendar calendar) {
        if (calendarRepository.existsById(CalendarId)) {
            calendar.setCalendarId(CalendarId);
            return calendarRepository.save(calendar);
        }
        return null;
=======
    public List<Calendar> RetrieveAllCalendars() {

        return (List<Calendar>) calendarRepository.findAll();
>>>>>>> f5bb156e7a7eca2eb23fa9b2ebdfcf7dcf990728
    }

    @Override
    public boolean deleteCalendar(Integer CalendarId) {
        if (calendarRepository.existsById(CalendarId)) {
            calendarRepository.deleteById(CalendarId);
            return true;
        }
        return false;
    }
    }

