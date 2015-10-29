package com.rf43.shareddagger.depinj;

import com.rf43.shareddagger.SharedDaggerApp;

import android.app.Application;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

    private SharedDaggerApp mApp;

    public ApplicationModule(final SharedDaggerApp app) {
        this.mApp = app;
    }

    @Provides
    public Application provideApplication() {
        return mApp;
    }
}
