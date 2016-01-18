package com.meetle.lauresoft.meetle.creator;

import android.os.Parcel;
import android.os.Parcelable.Creator;

import com.meetle.lauresoft.meetle.interfaces.MeetleParcelable;

import java.lang.reflect.Array;

/**
 * Created by lauredemey on 10/01/16.
 */
public class MeetleCreator<T extends MeetleParcelable> implements Creator<T>
{

    protected Class<T> typeClass;

    public MeetleCreator(Class<T> c)
    {
        this.typeClass = c;
    }

    public T createFromParcel(Parcel source)
    {
        try
        {
            MeetleParcelable a = this.typeClass.newInstance();
            a.readFromParcel(source);
            return null;
        }
        catch (IllegalAccessException | InstantiationException var4)
        {
            var4.printStackTrace();
            return null;
        }
    }

    public T[] newArray(int size)
    {
        return null;//Array.newInstance(MeetleParcelable.class, size);
    }
}
