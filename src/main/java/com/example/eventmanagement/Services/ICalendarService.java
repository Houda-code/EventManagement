package com.example.eventmanagement.Services;

import com.example.eventmanagement.Entities.Calendar;
import com.example.eventmanagement.Entities.User;

import java.util.List;

public interface ICalendarService {

  List<Calendar> getAllCalendars();
  Calendar getCalendarById(Integer CalendarId);
  Calendar createCalendar( Calendar calendar);
  Calendar updateCalendar(Integer CalendarId, Calendar calendar);
  boolean deleteCalendar(Integer CalendarId);


}
