package com.keicode.android.test;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {

  final static String TAG = "MyService";
  final int INTERVAL_PERIOD = 5000;
  Timer timer = new Timer();

  @Override
  public IBinder onBind(Intent intent) {
    return null;
  }

  @Override
  public void onCreate() {
    super.onCreate();
    Log.d(TAG, "onCreate");
  }

  @Override
  public int onStartCommand(Intent intent, int flags, int startId) {
    Log.d(TAG, "onStartCommand");

    timer.scheduleAtFixedRate(new TimerTask(){
      @Override
      public void run() {
        Log.d(TAG, "Hello!");
      }
    }, 0, INTERVAL_PERIOD);

    return START_STICKY;
  }

  @Override
  public void onDestroy() {
    super.onDestroy();
    if(timer != null){
      timer.cancel();
    }
    Log.d(TAG, "onDestroy");
  }

}