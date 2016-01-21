package com.meetle.lauresoft.meetle.adapters;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.meetle.lauresoft.meetle.DayType;
import com.meetle.lauresoft.meetle.fragments.BaseFragment;
import com.meetle.lauresoft.meetle.fragments.DayFragment;
import com.meetle.lauresoft.meetle.models.EventDay;
import com.meetle.lauresoft.meetle.utils.DateUtils;

/**
 * Created by lauredemey on 01/10/15.
 */
public class DayPagerAdapter extends FragmentStatePagerAdapter
{
    private DayFragment[] dayFragments;

    public DayPagerAdapter(FragmentManager fm)
    {
        super(fm);

        this.dayFragments = new DayFragment[DayType.values().length];

        for(int i = 0; i < this.dayFragments.length;i++)
        {
            DayFragment dayFragment = new DayFragment();
            Bundle bundle = new Bundle();
            bundle.putLong(DayFragment.EXTRA_DATE, DateUtils.getDate(i));
            bundle.putInt(DayFragment.EXTRA_DAY_TYPE, DayType.values()[i].getName());
            dayFragment.setArguments(bundle);
            this.dayFragments[i] = new DayFragment();
        }
    }

    @Override
    public int getCount()
    {
        return this.dayFragments == null ? 0 : this.dayFragments.length;
    }

    @Override
    public Fragment getItem(int position)
    {
       return this.dayFragments[position];
    }
}
