package com.meetle.lauresoft.meetle.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.meetle.lauresoft.meetle.R;
import com.meetle.lauresoft.meetle.fragments.DaysFragment;
import com.meetle.lauresoft.meetle.fragments.EventFragment;
import com.meetle.lauresoft.meetle.models.Event;

/**
 * Created by lauredemey on 04/10/15.
 */
public class EventActivity extends BaseActivity
{

    public static final String EXTRA_EVENT = "extraEvent";

    public static Intent getIntent(Context context, Event event)
    {
        Intent intent = new Intent(context, EventActivity.class);
        intent.putExtra(EXTRA_EVENT, event);
        return intent;
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        EventFragment eventFragment = new EventFragment();
        eventFragment.setArguments(this.getIntent().getExtras());
        fragmentTransaction.add(android.R.id.content, eventFragment);
        fragmentTransaction.commit();
    }
}
