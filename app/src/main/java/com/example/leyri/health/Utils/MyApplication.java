package com.example.leyri.health.Utils;

import android.app.FragmentManager;
import android.content.Context;

public class MyApplication {

    private static Context context;
    private static FragmentManager fragmentManager;

    public static Context getContext() {
        return context;
    }
    public static void setContext(Context context) {
        MyApplication.context = context;
    }
}
