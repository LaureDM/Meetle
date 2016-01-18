package com.meetle.lauresoft.meetle.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.meetle.lauresoft.meetle.factories.EventViewHolderFactory;
import com.meetle.lauresoft.meetle.models.Event;
import com.meetle.lauresoft.meetle.views.BaseViewHolder;

/**
 * Created by lauredemey on 01/11/15.
 */
public class EventAdapter extends RecyclerView.Adapter<BaseViewHolder<Event>>
{

    private static final int VIEWTYPE_TITLE = 1;
    private static final int VIEWTYPE_DESCRIPTION = 2;
    private static final int VIEWTYPE_DATE = 3;
    private static final int VIEWTYPE_PLACE = 4;
    private static final int VIEWTYPE_PARTICIPANT = 5;

    private Context context;

    private Event event;

    public EventAdapter(Context context)
    {
        this.context = context;
    }

    public void setData(Event event)
    {
        this.event = event;
        notifyDataSetChanged();
    }

    @Override
    public int getItemViewType(int position)
    {
        return 1;
    }

    @Override
    public BaseViewHolder<Event> onCreateViewHolder(ViewGroup viewGroup, int viewType)
    {
        return EventViewHolderFactory.createEventViewHolder(viewType, viewGroup, this.context);
    }

    @Override
    public void onBindViewHolder(BaseViewHolder<Event> baseViewHolder, int i)
    {
        baseViewHolder.bindData(this.event);
    }

    @Override
    public int getItemCount()
    {
        return 0;
    }
}
