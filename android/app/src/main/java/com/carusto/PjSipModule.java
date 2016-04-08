package com.carusto;

import android.content.Intent;
import android.util.Log;
import com.facebook.react.bridge.*;

public class PjSipModule extends ReactContextBaseJavaModule {

    private static String TAG = "PjSipModule";

    private static PjSipBroadcastReceiver receiver;



    public PjSipModule(ReactApplicationContext context) {
        super(context);

        Log.d(TAG, "PjSipModule init");

        // Module could be started several times, but we have to register receiver only once.
        if (receiver == null) {
            receiver = new PjSipBroadcastReceiver(context);
            this.getReactApplicationContext().registerReceiver(receiver, receiver.getFilter());
        } else {
            receiver.setContext(context);
        }
    }

    @Override
    public String getName() {
        return "PjSipModule";
    }

    @ReactMethod
    public void resume() throws ClassNotFoundException {
        Log.d(TAG, "Start intent");

        Intent intent = new Intent(getReactApplicationContext(), Class.forName("com.carustoconnect.MainActivity"));
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.EXTRA_DOCK_STATE_CAR);
        intent.addCategory(Intent.CATEGORY_LAUNCHER);
        getReactApplicationContext().startActivity(intent);
    }

    @ReactMethod
    public void start(Callback callback) {
        Log.d(TAG, "Start intent");

        Intent intent = new Intent(getReactApplicationContext(), PjSipService.class);
        intent.setAction(PjActions.ACTION_START);
        intent.putExtra("callback_id", receiver.register(callback));

        getReactApplicationContext().startService(intent);
    }

    @ReactMethod
    public void createAccount(ReadableMap configuration, Callback callback) {
        Log.d(TAG, "Start intent");

        int id = receiver.register(callback);
        Intent intent = PjActions.createAccountCreateIntent(id, configuration, getReactApplicationContext());
        getReactApplicationContext().startService(intent);
    }

    @ReactMethod
    public void deleteAccount(int accountId, Callback callback) {
        int callbackId = receiver.register(callback);
        Intent intent = PjActions.createAccountDeleteIntent(callbackId, accountId, getReactApplicationContext());
        getReactApplicationContext().startService(intent);
    }
}
