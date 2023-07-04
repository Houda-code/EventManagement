package com.example.eventmanagement.Services;

import com.example.eventmanagement.Entities.Calendar;
import com.example.eventmanagement.Repositories.CalendarRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CalendarServiceImpl implements ICalendarService {
    @Autowired
    private CalendarRepository calendarRepository;

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
    public Calendar updateCalendar(Integer CalendarId, Calendar calendar) {
        if (calendarRepository.existsById(CalendarId)) {
            calendar.setCalendarId(CalendarId);
            return calendarRepository.save(calendar);
        }
        return null;
        public List<Calendar> RetrieveAllCalendars () {
            return (Calendar) calendarRepository.findAll();
        }



}

