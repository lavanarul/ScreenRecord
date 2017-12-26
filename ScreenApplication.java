package com.xpressit.screenrecorder;

import android.app.Application;
import android.content.Context;
import android.content.Intent;


public class ScreenApplication extends Application {

    private static ScreenApplication application;

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        application = this;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        // Start service
        startService(new Intent(this, ScreenService.class));
    }

    public static ScreenApplication getInstance() {
        return application;
    }
}