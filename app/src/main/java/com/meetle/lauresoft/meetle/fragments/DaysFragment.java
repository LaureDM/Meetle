package com.meetle.lauresoft.meetle.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.meetle.lauresoft.meetle.DayType;
import com.meetle.lauresoft.meetle.EventCategory;
import com.meetle.lauresoft.meetle.R;
import com.meetle.lauresoft.meetle.adapters.DayPagerAdapter;
import com.meetle.lauresoft.meetle.models.Event;
import com.meetle.lauresoft.meetle.models.EventDay;

import java.util.Date;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * The fragment that contains the viewpager for the events of the week
 */
public class DaysFragment extends BaseFragment
{
    @Bind(R.id.viewpager_events)
    ViewPager viewPagerEvents;

    private PagerAdapter pagerAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_days, container, false);

        ButterKnife.bind(this, view);

        this.pagerAdapter = new DayPagerAdapter(this.getFragmentManager());
        this.viewPagerEvents.setAdapter(this.pagerAdapter);

        return view;
    }

}
