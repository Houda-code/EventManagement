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
<<<<<<< HEAD

=======
    }
>>>>>>> 031699a640452afb30b887b2646ee6612033b17e

    public List<Calendar> RetrieveAllCalendars() {

        return (List<Calendar>) calendarRepository.findAll();
<<<<<<< HEAD
    }

    @Override
    public boolean deleteCalendar(Integer CalendarId) {
        if (calendarRepository.existsById(CalendarId)) {
            calendarRepository.deleteById(CalendarId);
            return true;

        public List<Calendar> RetrieveAllCalendars () {
            return (Calendar) calendarRepository.findAll();


    }
    @Override
    public boolean deleteCalendar (Integer CalendarId){
        if (calendarRepository.existsById(CalendarId)) {
            calendarRepository.deleteById(CalendarId);
            return true;

        }
        return false;
    }
=======
    }
   /* @Override
    public boolean deleteCalendar(Integer CalendarId) {
        if (calendarRepository.existsById(CalendarId)) {
            calendarRepository.deleteById(CalendarId);
            return true;

        }
        return false;
    }*/
    public void deleteEvent(Integer id){
        calendarRepository.deleteById(id);
    }

>>>>>>> 031699a640452afb30b887b2646ee6612033b17e
}

