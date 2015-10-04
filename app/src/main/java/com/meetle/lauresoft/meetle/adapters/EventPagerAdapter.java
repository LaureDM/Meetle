package com.meetle.lauresoft.meetle.adapters;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.View;

import com.meetle.lauresoft.meetle.fragments.EventFragment;
import com.meetle.lauresoft.meetle.fragments.EventsFragment;
import com.meetle.lauresoft.meetle.models.Event;
import com.meetle.lauresoft.meetle.models.EventDay;

/**
 * Created by lauredemey on 01/10/15.
 */
public class EventPagerAdapter extends FragmentStatePagerAdapter
{

    private EventDay[] events;

    public EventPagerAdapter(FragmentManager fm, EventDay[] events)
    {
        super(fm);
        this.events = events;
    }

    @Override
    public int getCount()
    {
        return this.events.length;
    }

    @Override
    public Fragment getItem(int position)
    {
        EventFragment eventFragment = new EventFragment();
        Bundle bundle = new Bundle();
        //make parcelable object
        // this.events[position]
        //bundle.putParcelable(EventFragment.EXTRA_EVENT, );
        bundle.putParcelableArray("TEST", this.events[position].getEvents());
        eventFragment.setArguments(bundle);
        return eventFragment;
    }
}
