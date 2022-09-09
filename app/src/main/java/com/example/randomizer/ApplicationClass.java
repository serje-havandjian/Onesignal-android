package com.example.randomizer;

import android.app.Application;
import com.onesignal.OneSignal;




public class ApplicationClass extends Application {
    private static final String ONESIGNAL_APP_ID = "271b1ec0-ca6d-4a2c-8124-ec7443e821f4";

    @Override
    public void onCreate() {
        super.onCreate();

        // Enable verbose OneSignal logging to debug issues if needed.
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);

        // OneSignal Initialization
        OneSignal.initWithContext(this);
        OneSignal.setAppId(ONESIGNAL_APP_ID);

        // promptForPushNotifications will show the native Android notification permission prompt.
        // We recommend removing the following code and instead using an In-App Message to prompt for notification permission (See step 7)
        OneSignal.promptForPushNotifications();
    }
}


