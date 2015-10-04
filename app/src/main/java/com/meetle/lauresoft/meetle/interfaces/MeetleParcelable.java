package com.meetle.lauresoft.meetle.interfaces;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by lauredemey on 02/10/15.
 */
public interface MeetleParcelable extends Parcelable
{
    void readFromParcel(Parcel parcel);
}
