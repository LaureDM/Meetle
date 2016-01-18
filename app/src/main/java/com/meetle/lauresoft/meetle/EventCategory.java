package com.meetle.lauresoft.meetle;

import android.support.annotation.ColorRes;
import android.support.annotation.StringRes;

/**
 * Created by lauredemey on 10/01/16.
 */
public enum EventCategory
{
    CAFE(R.string.category_cafe, R.color.white),
    MOVIE(R.string.category_movie, R.color.white),
    CONCERT(R.string.category_concert, R.color.white),
    THEATER(R.string.category_theater, R.color.white),
    SPORTS(R.string.category_sports, R.color.white),
    GAMES(R.string.category_games, R.color.white),
    BOARDGAMES(R.string.category_boardgames, R.color.white),
    PUBLIC_EVENTS(R.string.category_public_events, R.color.white),
    MUSEUM(R.string.category_museum, R.color.white),
    OTHER(R.string.category_other, R.color.white),
    UNKNOWN(R.string.category_unknown, R.color.white);

    @StringRes
    private int name;

    @ColorRes
    private int color;

    EventCategory(@StringRes int name, @ColorRes int color)
    {
        this.name = name;
        this.color = color;
    }

    public int getName()
    {
        return name;
    }

    public int getColor()
    {
        return color;
    }
}
