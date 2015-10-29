package com.rf43.shareddagger.depinj;

import com.rf43.shareddagger.prefs.PrefsStore;

import android.app.Activity;
import android.app.Application;
import android.content.SharedPreferences;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class PrefsModule {

    @Provides
    @Singleton
    SharedPreferences provideSharedPrefs(final Application application) {
        return application.getSharedPreferences(PrefsStore.PREFS_NAME, Activity.MODE_PRIVATE);
    }

    @Provides
    @Singleton
    PrefsStore providePrefsStore(final SharedPreferences preferences) {
        return new PrefsStore(preferences);
    }
}
