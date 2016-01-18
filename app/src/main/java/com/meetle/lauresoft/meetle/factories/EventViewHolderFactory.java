package com.meetle.lauresoft.meetle.factories;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;

import com.meetle.lauresoft.meetle.R;
import com.meetle.lauresoft.meetle.models.Event;
import com.meetle.lauresoft.meetle.views.BaseViewHolder;
import com.meetle.lauresoft.meetle.views.DummyViewHolder;
import com.meetle.lauresoft.meetle.views.event.EventDateViewHolder;
import com.meetle.lauresoft.meetle.views.event.EventDescriptionViewHolder;
import com.meetle.lauresoft.meetle.views.event.EventParticipantViewHolder;
import com.meetle.lauresoft.meetle.views.event.EventPlaceViewHolder;
import com.meetle.lauresoft.meetle.views.event.EventTitleViewHolder;

/**
 * Created by lauredemey on 01/11/15.
 */
public class EventViewHolderFactory
{
    public static final int VIEWTYPE_TITLE = 1;
    public static final int VIEWTYPE_DESCRIPTION = 2;
    public static final int VIEWTYPE_DATE = 3;
    public static final int VIEWTYPE_PLACE = 4;
    public static final int VIEWTYPE_PARTICIPANTS = 5;

    private static LayoutInflater layoutInflater;


    public static BaseViewHolder<Event> createEventViewHolder(int viewType, ViewGroup viewGroup, Context context)
    {
        final View view;

        layoutInflater = LayoutInflater.from(context);

        switch (viewType)
        {
            case VIEWTYPE_TITLE:
                view = createView(R.layout.listitem_event_title, viewGroup);
                return new EventTitleViewHolder(view);

            case VIEWTYPE_DESCRIPTION:
                view = createView(R.layout.event_description, viewGroup);
                return new EventDescriptionViewHolder(view);

            case VIEWTYPE_DATE:
                view = createView(R.layout.event_date, viewGroup);
                return new EventDateViewHolder(view);

            case VIEWTYPE_PLACE:
                view = createView(R.layout.event_place, viewGroup);
                return new EventPlaceViewHolder(view);

            case VIEWTYPE_PARTICIPANTS:
                view = createView(R.layout.event_participants, viewGroup);
                return new EventParticipantViewHolder(view);

            default:
                view = new Space(context);
                return new DummyViewHolder<>(view);

        }
    }

    private static View createView(@LayoutRes int layout, ViewGroup parent)
    {
        return layoutInflater.inflate(layout, parent, false);
    }
}
