package com.meetle.lauresoft.meetle.views.event;

import android.view.View;
import android.widget.TextView;

import com.meetle.lauresoft.meetle.R;
import com.meetle.lauresoft.meetle.models.Event;
import com.meetle.lauresoft.meetle.views.BaseViewHolder;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by lauredemey on 01/11/15.
 */
public class EventTitleViewHolder extends BaseViewHolder<Event>
{

    @Bind(R.id.textview_title)
    TextView textView;

    public EventTitleViewHolder(View itemView)
    {
        super(itemView);

        ButterKnife.bind(this, itemView);
    }

    @Override
    public void bindData(Event event)
    {
        textView.setText(event.getName());
    }
}
