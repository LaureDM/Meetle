package com.meetle.lauresoft.meetle.views;

import android.view.View;
import android.widget.TextView;

import com.meetle.lauresoft.meetle.R;
import com.meetle.lauresoft.meetle.models.Event;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by lauredemey on 04/10/15.
 */
public class EventViewHolder extends BaseViewHolder<Event>
{

    @Bind(R.id.textview_title)
    TextView textViewTitle;

    @Bind(R.id.textview_category)
    TextView textViewCategory;

    @Bind(R.id.textview_description)
    TextView textViewDescription;

    @Bind(R.id.textview_spots)
    TextView textViewSpots;


    public EventViewHolder(View itemView)
    {
        super(itemView);

        ButterKnife.bind(this, itemView);
    }

    public void bindData(Event event)
    {

        //null check

        this.textViewTitle.setText(event.getName());

        this.textViewCategory.setText("Placeholder");

        this.textViewDescription.setText(event.getDescription());

        this.textViewSpots.setText(String.format("%s/%s", event.getTakenSpots(), event.getTotalSpots()));

    }


}
