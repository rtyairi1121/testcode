package jp.example.alarm_manager;

import java.util.Calendar;


import android.annotation.SuppressLint;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

@SuppressLint("DefaultLocale")
public class HelloService extends Service {

	  NotificationManager mNotificationManager;

	  @Override
	  public IBinder onBind(Intent arg0) {
	    // TODO �����������ꂽ���\�b�h�E�X�^�u
	    return null;
	  }

	  @Override
	  public void onCreate() {
	    // TODO �����������ꂽ���\�b�h�E�X�^�u
	    mNotificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

	    super.onCreate();
	    Toast.makeText(this, "create service", Toast.LENGTH_SHORT).show();
	  }

	  @Override
	  public void onStart(Intent intent, int startId) {
	    // TODO �����������ꂽ���\�b�h�E�X�^�u
	    super.onStart(intent, startId);
	    Log.e("alarm manager","Onstart!!");

	    Calendar Cal = Calendar.getInstance();
	    int hour = Cal.get(Calendar.HOUR_OF_DAY);
	    int minute = Cal.get(Calendar.MINUTE);
	    int second = Cal.get(Calendar.SECOND);
	    String message = String.format("%02d:%02d:%02d", hour, minute, second);

	    Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

	    Thread t = new Thread() {

	      @Override
	      public void run() {
	        // TODO �����������ꂽ���\�b�h�E�X�^�u
	        //super.run();
	        try {
	          sleep(5 * 1000);

	          stopSelf();
	        } catch (InterruptedException e) {

	        }
	      }

	    };
	    t.start();
	  }

	  @Override
	  public void onDestroy() {
	    // TODO �����������ꂽ���\�b�h�E�X�^�u
	    Log.i(getClass().getSimpleName()  , "Service Destroy");

	    super.onDestroy();
	    Toast.makeText(this, "destroy service", Toast.LENGTH_SHORT).show();
	  }
	}
