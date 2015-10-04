package com.meetle.lauresoft.meetle.models;

import java.util.Date;

/**
 * Created by lauredemey on 02/10/15.
 */
public class EventDay
{

    private Date date;

    //or arraylist? events are dynamic...
    private Event[] events;

    public EventDay()
    {
        this(null);
    }

    public EventDay(Date date)
    {
        this(date, null);
    }

    public EventDay(Date date, Event[] events)
    {
        this.date = date;
        this.events = events;
    }

    public Date getDate()
    {
        return date;
    }

    public Event[] getEvents()
    {
        return events;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }

    public void setEvents(Event[] events)
    {
        this.events = events;
    }
}
