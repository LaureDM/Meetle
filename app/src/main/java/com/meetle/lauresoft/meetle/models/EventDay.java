package com.meetle.lauresoft.meetle.models;

import java.util.Date;

/**
 * Created by lauredemey on 02/10/15.
 */
public class EventDay
{

    private Date date;

    public EventDay()
    {
        this(null);
    }

    public EventDay(Date date)
    {
        this.date = date;
    }

    public Date getDate()
    {
        return date;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }
}
