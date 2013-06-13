package jp.co.example.servicetest0;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService2 extends Service{

 private final String TAG = this.getClass().getSimpleName();

 @Override
 public IBinder onBind(Intent arg0) {
  // TODO 自動生成されたメソッド・スタブ
  Log.d(TAG, Thread.currentThread().getStackTrace()[2].getMethodName());
  return null;
 }

 @Override
 public void onCreate() {
  // TODO 自動生成されたメソッド・スタブ
  super.onCreate();
  Log.d(TAG, Thread.currentThread().getStackTrace()[2].getMethodName());
 }

 @Override
 public void onDestroy() {
  // TODO 自動生成されたメソッド・スタブ
  super.onDestroy();
  Log.d(TAG, Thread.currentThread().getStackTrace()[2].getMethodName());
 }

 @Override
 public void onStart(Intent intent, int startId) {
  // TODO 自動生成されたメソッド・スタブ
  super.onStart(intent, startId);
  Log.d(TAG, Thread.currentThread().getStackTrace()[2].getMethodName());

  Log.d(TAG, "sleep start");
  try {
   Thread.sleep(5000);
  } catch (InterruptedException e) {
   // TODO 自動生成された catch ブロック
   e.printStackTrace();
  }
  Log.d(TAG, "sleep end");
 }

}
