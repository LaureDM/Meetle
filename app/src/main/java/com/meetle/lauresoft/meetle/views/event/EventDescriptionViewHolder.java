package com.meetle.lauresoft.meetle.views.event;

import android.view.View;

import com.meetle.lauresoft.meetle.models.Event;
import com.meetle.lauresoft.meetle.views.BaseViewHolder;

import butterknife.ButterKnife;

/**
 * Created by lauredemey on 01/11/15.
 */
public class EventDescriptionViewHolder extends BaseViewHolder<Event>
{
    public EventDescriptionViewHolder(View itemView)
    {
        super(itemView);

        ButterKnife.bind(this, itemView);
    }

    @Override
    public void bindData(Event event)
    {
        //textviewDescription.setText(event.getDescription());
    }
}
