package com.rf43.shareddagger.depinj;

import com.rf43.shareddagger.MainActivity;
import com.rf43.shareddagger.SharedDaggerApp;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class, PrefsModule.class})
public interface Graph {

    void inject(SharedDaggerApp app);

    // Activities
    void inject(MainActivity mainActivity);
}
