package com.meetle.lauresoft.meetle.views;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by lauredemey on 04/10/15.
 */
public abstract class BaseViewHolder<T> extends RecyclerView.ViewHolder
{
    public BaseViewHolder(View itemView)
    {
        super(itemView);
    }

    public abstract void bindData(T item);
}
