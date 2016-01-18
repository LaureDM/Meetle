package com.meetle.lauresoft.meetle.adapters;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.meetle.lauresoft.meetle.fragments.DayFragment;
import com.meetle.lauresoft.meetle.models.EventDay;
import com.meetle.lauresoft.meetle.utils.DateUtils;

/**
 * Created by lauredemey on 01/10/15.
 */
public class DayPagerAdapter extends FragmentStatePagerAdapter
{

    private EventDay[] eventDays;

    public DayPagerAdapter(FragmentManager fm, EventDay[] events)
    {
        super(fm);
        this.eventDays = events;
    }

    @Override
    public int getCount()
    {
        return this.eventDays.length;
    }

    @Override
    public Fragment getItem(int position)
    {
        DayFragment dayFragment = new DayFragment();
        Bundle bundle = new Bundle();
        //make parcelable object
        // this.events[position]
        //bundle.putParcelable(DayFragment.EXTRA_EVENT, );
        bundle.putParcelableArray("TEST", this.eventDays[position].getEvents());
        bundle.putString("DATE", DateUtils.formatDate(this.eventDays[position].getDate()));
        dayFragment.setArguments(bundle);
        return dayFragment;
    }
}
