package com.meetle.lauresoft.meetle.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.meetle.lauresoft.meetle.R;
import com.meetle.lauresoft.meetle.activities.EventActivity;
import com.meetle.lauresoft.meetle.adapters.DayAdapter;
import com.meetle.lauresoft.meetle.interfaces.EventClickListener;
import com.meetle.lauresoft.meetle.models.Event;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by lauredemey on 01/10/15.
 */
public class DayFragment extends BaseFragment implements EventClickListener
{

    @Bind(R.id.recyclerview)
    RecyclerView recyclerView;

    private Event[] events;

    private DayAdapter adapter;

    private LinearLayoutManager layoutManager;

    private String date;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        this.events = (Event[]) getArguments().getParcelableArray("TEST");

        this.date = getArguments().getString("DATE");

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view =  inflater.inflate(R.layout.fragment_day, container, false);

        ButterKnife.bind(this, view);

        this.getActivity().setTitle(this.date);

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
        final Intent intent = new Intent(this.getView().getContext(), EventActivity.class);
        intent.putExtra(EventActivity.EXTRA_EVENT, event);
        startActivity(intent);
    }
}
