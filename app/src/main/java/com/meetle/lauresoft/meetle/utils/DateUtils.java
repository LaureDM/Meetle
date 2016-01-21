package com.meetle.lauresoft.meetle.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * Created by lauredemey on 04/10/15.
 */
public class DateUtils
{

    private static final SimpleDateFormat dateTimeFormat = new SimpleDateFormat("EEEE dd/MM", Locale.getDefault());

    public static String formatDate(long date)
    {
        return dateTimeFormat.format(date);
    }

    public static long getDate(int dayTypeOrdinal)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.DATE, dayTypeOrdinal);
        return calendar.getTime().getTime();
    }
}
