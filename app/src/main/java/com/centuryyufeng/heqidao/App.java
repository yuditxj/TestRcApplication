package com.centuryyufeng.heqidao;

import android.app.Application;

import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;

import io.rong.imkit.RongIM;

public class App  extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Logger.addLogAdapter(new AndroidLogAdapter());
        RongIM.init(this);
    }
}
