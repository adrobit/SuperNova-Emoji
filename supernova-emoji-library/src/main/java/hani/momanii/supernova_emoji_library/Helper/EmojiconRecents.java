/*
 * Copyright (c) 2016 Adrobit Technologies LLP
 */

package hani.momanii.supernova_emoji_library.Helper;

import android.content.Context;

import hani.momanii.supernova_emoji_library.emoji.Emojicon;

/**
 * @author Daniele Ricci
 */

public interface EmojiconRecents {

    void addRecentEmoji(Context context, Emojicon emojicon);
}