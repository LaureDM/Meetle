package com.meetle.lauresoft.meetle.adapters;

import android.content.Context;
import android.support.v4.widget.Space;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.meetle.lauresoft.meetle.R;
import com.meetle.lauresoft.meetle.interfaces.EventClickListener;
import com.meetle.lauresoft.meetle.models.Event;
import com.meetle.lauresoft.meetle.views.BaseViewHolder;
import com.meetle.lauresoft.meetle.views.DummyViewHolder;
import com.meetle.lauresoft.meetle.views.EventViewHolder;

/**
 * Created by lauredemey on 04/10/15.
 */
public class DayAdapter extends RecyclerView.Adapter<BaseViewHolder>
{

    protected LayoutInflater layoutInflater;

    private static final int VIEWTYPE_EVENT = 1;

    private Event[] events;

    private Context context;

    private EventClickListener eventClickListener;

    public DayAdapter(Context context, EventClickListener eventClickListener)
    {
        this.layoutInflater = LayoutInflater.from(context);
        this.context = context;
        this.eventClickListener = eventClickListener;
    }

    public void setData(Event[] events)
    {
        this.events = events;
    }

    @Override
    public int getItemViewType(int position)
    {
        //can currently only be an event type
        return VIEWTYPE_EVENT;
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        BaseViewHolder viewHolder;
        View view;

        switch (viewType)
        {
            case VIEWTYPE_EVENT:
                view = this.layoutInflater.inflate(R.layout.listitem_event, parent, false);
                viewHolder = new EventViewHolder(view, this.eventClickListener);
                break;

            default:
                view = new Space(this.context);
                viewHolder = new DummyViewHolder(view);

        }

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position)
    {

        if (holder instanceof EventViewHolder)
        {
            holder.bindData(this.events[position]);
        }
        else
        {
            holder.bindData(null);
        }
    }

    @Override
    public int getItemCount()
    {
        return events.length;
    }
}
