package com.rf43.shareddagger;

import com.rf43.shareddagger.depinj.ApplicationModule;
import com.rf43.shareddagger.depinj.DaggerGraph;
import com.rf43.shareddagger.depinj.Graph;

import android.app.Application;
import android.content.Context;

public class SharedDaggerApp extends Application {
    private Graph mGraph;

    public static Graph graph(final Context context) {
        return ((SharedDaggerApp) context.getApplicationContext()).mGraph;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mGraph = DaggerGraph.builder().applicationModule(new ApplicationModule(this)).build();
        mGraph.inject(this);
    }
}
