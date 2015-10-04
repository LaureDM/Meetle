package com.meetle.lauresoft.meetle.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.meetle.lauresoft.meetle.R;
import com.meetle.lauresoft.meetle.adapters.EventAdapter;
import com.meetle.lauresoft.meetle.models.Event;
import com.meetle.lauresoft.meetle.models.EventDay;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by lauredemey on 01/10/15.
 */
public class EventFragment extends Fragment
{

    @Bind(R.id.textview_title)
    TextView textViewTitle;

    @Bind(R.id.recyclerview_events)
    RecyclerView recyclerView;

    private Event[] events;

    private EventAdapter adapter;

    private LinearLayoutManager layoutManager;

    private String name;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        this.events = (Event[]) getArguments().getParcelableArray("TEST");

        this.name = "PLACEHOLDER";
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view =  inflater.inflate(R.layout.fragment_event, container, false);

        ButterKnife.bind(this, view);

        this.adapter = new EventAdapter(view.getContext());
        this.adapter.setData(this.events);

        this.layoutManager = new LinearLayoutManager(view.getContext());

        this.recyclerView.setAdapter(this.adapter);
        this.recyclerView.setLayoutManager(this.layoutManager);

        return view;
    }
}
