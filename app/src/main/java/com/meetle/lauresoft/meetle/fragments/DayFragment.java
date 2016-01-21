package com.meetle.lauresoft.meetle.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.meetle.lauresoft.meetle.DayType;
import com.meetle.lauresoft.meetle.EventCategory;
import com.meetle.lauresoft.meetle.R;
import com.meetle.lauresoft.meetle.activities.EventActivity;
import com.meetle.lauresoft.meetle.adapters.DayAdapter;
import com.meetle.lauresoft.meetle.interfaces.EventClickListener;
import com.meetle.lauresoft.meetle.models.Event;
import com.meetle.lauresoft.meetle.utils.DateUtils;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by lauredemey on 01/10/15.
 */
public class DayFragment extends BaseFragment implements EventClickListener
{

    public static final String EXTRA_DAY_TYPE = "extraDayType";
    public static final String EXTRA_DATE = "extraDate";

    @Bind(R.id.recyclerview)
    RecyclerView recyclerView;

    private Event[] events;

    @StringRes
    private int dayType;

    private long date;

    private DayAdapter adapter;

    private LinearLayoutManager layoutManager;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        //TODO this is mockdata
        this.events = new Event[]
                {
                        new Event("Event 1", "Dit is een event", 10, 3, EventCategory.CAFE),
                        new Event("Event 2", "Dit is ook een event", 5, 0, EventCategory.CONCERT),
                        new Event("Event 3", "Dit is nog een event", 7, 7, EventCategory.MOVIE),
                        new Event("Event 4", "Dit is het laatste event", 2, 1, EventCategory.BOARDGAMES)
                };

        this.dayType = this.getArguments().getInt(EXTRA_DAY_TYPE);

        this.date = this.getArguments().getLong(EXTRA_DATE);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_day, container, false);

        ButterKnife.bind(this, view);

        this.getActivity().setTitle(this.dayType);

        //todo fetch events for day with preferences restrictions

        this.adapter = new DayAdapter(view.getContext(), this);
        this.adapter.setData(this.events);

        this.layoutManager = new LinearLayoutManager(view.getContext());

        this.recyclerView.setAdapter(this.adapter);
        this.recyclerView.setLayoutManager(this.layoutManager);

        return view;
    }

    @Override
    public void onEventClicked(Event event)
    {
        showEventDetails(event);
    }

    private void showEventDetails(Event event)
    {
        final Intent intent = new Intent(this.getContext(), EventActivity.class);
        intent.putExtra(EventActivity.EXTRA_EVENT, event);
        startActivity(intent);
    }
}
