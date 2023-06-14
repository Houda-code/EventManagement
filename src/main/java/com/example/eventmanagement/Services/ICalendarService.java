package com.example.eventmanagement.Services;

import com.example.eventmanagement.Entities.Calendar;
import com.example.eventmanagement.Entities.User;

import java.util.List;

public interface ICalendarService {

    Calendar addCalendar(Calendar calendar);
    List<Calendar> RetrieveAllCalendars();
}
