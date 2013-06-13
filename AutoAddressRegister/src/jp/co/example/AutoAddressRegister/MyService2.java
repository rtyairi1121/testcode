package jp.co.example.AutoAddressRegister;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService2 extends Service{

 private final String TAG = this.getClass().getSimpleName();

 @Override
 public IBinder onBind(Intent arg0) {
  // TODO �����������ꂽ���\�b�h�E�X�^�u
  Log.d(TAG, Thread.currentThread().getStackTrace()[2].getMethodName());
  return null;
 }

 @Override
 public void onCreate() {
  // TODO �����������ꂽ���\�b�h�E�X�^�u
  super.onCreate();
  Log.d(TAG, Thread.currentThread().getStackTrace()[2].getMethodName());
 }

 @Override
 public void onDestroy() {
  // TODO �����������ꂽ���\�b�h�E�X�^�u
  super.onDestroy();
  Log.d(TAG, Thread.currentThread().getStackTrace()[2].getMethodName());
 }

 @Override
 public void onStart(Intent intent, int startId) {
  // TODO �����������ꂽ���\�b�h�E�X�^�u
  super.onStart(intent, startId);
  Log.d(TAG, Thread.currentThread().getStackTrace()[2].getMethodName());

  Log.d(TAG, "sleep start");
  try {
   Thread.sleep(5000);
  } catch (InterruptedException e) {
   // TODO �����������ꂽ catch �u���b�N
   e.printStackTrace();
  }
  Log.d(TAG, "sleep end");
 }

}
