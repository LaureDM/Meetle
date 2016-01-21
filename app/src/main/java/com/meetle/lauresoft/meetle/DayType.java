package com.meetle.lauresoft.meetle;

import android.support.annotation.StringRes;

/**
 * Created by lauredemey on 18/01/16.
 */
public enum DayType
{
    TODAY(R.string.today),
    TOMORROW(R.string.tomorrow),
    DAY_AFTER_TOMORROW(R.string.day_after_tomorrow);

    @StringRes
    private int name;

    DayType(@StringRes int name)
    {
        this.name = name;
    }

    @StringRes
    public int getName()
    {
        return name;
    }
}
