package com.theprototypo.www.protoapp;

import android.content.Context;
import android.support.multidex.MultiDex;
import android.support.multidex.MultiDexApplication;

/**
 * Created by walesadanto on 3/13/16.
 */
public class ProtoApplication extends MultiDexApplication {

    public ProtoApplication(){
        super();
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
}
