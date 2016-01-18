package com.meetle.lauresoft.meetle.activities;

import android.content.Context;
import android.content.Intent;

/**
 * Created by lauredemey on 10/01/16.
 */
public class AddEventActivity extends BaseActivity
{

    public static Intent getIntent(Context context)
    {
        return new Intent(context, AddEventActivity.class);
    }
}
