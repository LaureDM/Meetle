package com.meetle.lauresoft.meetle.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.meetle.lauresoft.meetle.R;
import com.meetle.lauresoft.meetle.adapters.EventAdapter;
import com.meetle.lauresoft.meetle.models.Event;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by lauredemey on 04/10/15.
 */
public class EventFragment extends BaseFragment
{
    public static final String EXTRA_EVENT = "extraEvent";

    @Bind(R.id.recyclerview)
    RecyclerView recyclerView;

    private Event event;

    private EventAdapter eventAdapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        final Bundle bundle = this.getArguments();

        if (bundle != null)
        {
            this.event = bundle.getParcelable(EXTRA_EVENT);
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_event, container, false);

        ButterKnife.bind(this, view);

        this.eventAdapter = new EventAdapter(this.getContext());

        this.eventAdapter.setData(this.event);

        this.recyclerView.setAdapter(this.eventAdapter);
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));

        return view;
    }
}
