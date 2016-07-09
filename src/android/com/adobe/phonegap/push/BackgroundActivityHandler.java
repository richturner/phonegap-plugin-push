package com.adobe.phonegap.push;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class BackgroundActivityHandler extends BroadcastReceiver implements PushConstants {
    private static String LOG_TAG = "PushPlugin_BackgroundActivityHandler";

    @Override
    public void onReceive(Context context, Intent intent) {
        PushPlugin.getEventHandler().handleBroadcast(context, intent);
     }
}
