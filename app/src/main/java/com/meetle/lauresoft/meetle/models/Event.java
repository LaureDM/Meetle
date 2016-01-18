package com.meetle.lauresoft.meetle.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.meetle.lauresoft.meetle.EventCategory;
import com.meetle.lauresoft.meetle.creator.MeetleCreator;
import com.meetle.lauresoft.meetle.interfaces.MeetleParcelable;

/**
 * Created by lauredemey on 01/10/15.
 */
public class Event implements Parcelable
{
    public static final Creator<Event> CREATOR = new Creator<Event>()
    {
        @Override
        public Event createFromParcel(Parcel source)
        {
            return new Event(source);
        }

        @Override
        public Event[] newArray(int size)
        {
            return new Event[size];
        }
    };

    private String name;

    private String description;

    private EventCategory eventCategory;

    //private Date date;

    private int totalSpots;

    private int takenSpots;

    //private City city;

    //private Place place;

    //private User creator;


    public Event()
    {
        this("", "", 0, 0, EventCategory.UNKNOWN);
    }

    public Event(Parcel parcel)
    {
        this.name = parcel.readString();
        this.description = parcel.readString();
        this.totalSpots = parcel.readInt();
        this.takenSpots = parcel.readInt();
    }

    public Event(String name, String description, int totalSpots, int takenSpots, EventCategory eventCategory)
    {
        this.name = name;
        this.description = description;
        this.totalSpots = totalSpots;
        this.takenSpots = takenSpots;
        this.eventCategory = eventCategory;
    }

    public String getName()
    {
        return name;
    }

    public String getDescription()
    {
        return description;
    }

    public int getTotalSpots()
    {
        return totalSpots;
    }

    public int getTakenSpots()
    {
        return takenSpots;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public void setTotalSpots(int totalSpots)
    {
        this.totalSpots = totalSpots;
    }

    public void setTakenSpots(int takenSpots)
    {
        this.takenSpots = takenSpots;
    }

    public EventCategory getEventCategory()
    {
        return eventCategory;
    }

    @Override
    public int describeContents()
    {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags)
    {
        dest.writeString(this.name);
        dest.writeString(this.description);
        dest.writeInt(this.totalSpots);
        dest.writeInt(this.takenSpots);
    }
}
