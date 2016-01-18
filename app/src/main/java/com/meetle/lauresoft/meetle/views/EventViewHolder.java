package com.meetle.lauresoft.meetle.views;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.meetle.lauresoft.meetle.R;
import com.meetle.lauresoft.meetle.interfaces.EventClickListener;
import com.meetle.lauresoft.meetle.models.Event;

import butterknife.Bind;
import butterknife.ButterKnife;
import github.cesarferreira.catkit.CatKit;

/**
 * Created by lauredemey on 04/10/15.
 */
public class EventViewHolder extends BaseViewHolder<Event> implements View.OnClickListener
{

    @Bind(R.id.imageview_creator)
    ImageView imageViewCreator;

    @Bind(R.id.textview_title)
    TextView textViewTitle;

    @Bind(R.id.textview_category)
    TextView textViewCategory;

    @Bind(R.id.textview_spots)
    TextView textViewSpots;

    private Event event;

    private EventClickListener eventClickListener;


    public EventViewHolder(View itemView, EventClickListener eventClickListener)
    {
        super(itemView);

        ButterKnife.bind(this, itemView);

        this.itemView.setOnClickListener(this);

        this.eventClickListener = eventClickListener;
    }

    public void bindData(Event event)
    {
        if (event != null)
        {
            this.event = event;

            this.textViewTitle.setText(this.event.getName());

            this.textViewCategory.setText(event.getEventCategory().getName());

            this.textViewSpots.setText(String.format("%s/%s", this.event.getTakenSpots(), this.event.getTotalSpots()));

            CatKit
                    .with(this.itemView.getContext())
                    .dp(100,100)
                    .into(this.imageViewCreator);
        }
    }


    @Override
    public void onClick(View v)
    {
        this.eventClickListener.onEventClicked(this.event);
    }
}
