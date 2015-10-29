package com.rf43.shareddagger.prefs;

import android.content.SharedPreferences;

import javax.inject.Singleton;

@Singleton
public class PrefsStore {
    public static final String PREFS_NAME = "com.rf43.shareddagger.SharedPrefs";

    private SharedPreferences mPreferences;

    public PrefsStore(final SharedPreferences prefs) {
        mPreferences = prefs;
    }
}
