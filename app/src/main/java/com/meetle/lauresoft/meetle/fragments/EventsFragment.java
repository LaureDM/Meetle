package com.meetle.lauresoft.meetle.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.meetle.lauresoft.meetle.R;
import com.meetle.lauresoft.meetle.adapters.EventPagerAdapter;
import com.meetle.lauresoft.meetle.models.Event;
import com.meetle.lauresoft.meetle.models.EventDay;

import java.util.Date;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * The fragment that contains the viewpager for the events of the week
 */
public class EventsFragment extends Fragment
{

    @Bind(R.id.viewpager_events)
    ViewPager viewPagerEvents;

    private PagerAdapter pagerAdapter;

    private Event[] mockEvents = {new Event("Event 1", "Dit is een event", 10, 3),
            new Event("Event 2", "Dit is ook een event", 5, 0),
            new Event("Event 3", "Dit is nog een event", 7, 7),
            new Event("Event 4", "Dit is het laatste event", 2, 1)};

    private EventDay[] mockEventDays = new EventDay[7];
    private Event[] events;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        for (int i = 0; i < 7 ; i++)
        {
            this.mockEventDays[i] = new EventDay(new Date(), mockEvents);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_events, container, false);

        ButterKnife.bind(this, view);

        this.pagerAdapter = new EventPagerAdapter(this.getFragmentManager(), this.mockEventDays);
        this.viewPagerEvents.setAdapter(this.pagerAdapter);

        return view;
    }

}
