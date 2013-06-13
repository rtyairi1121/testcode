package jp.co.example.AutoAddressRegister; 


import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Timer;
import java.util.TimerTask;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

@SuppressLint("SimpleDateFormat")
public class MyService extends Service {

	int i = 1;

  final static String TAG = "MyService";
  final int INTERVAL_PERIOD = 60000;
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

		 Log.e(TAG, Integer.toString(i));
	//	Toast.makeText(MyService.this, "しげ", Toast.LENGTH_LONG).show();

    	  try
    	    {
    		  long startTime = System.currentTimeMillis();
    		  Date date = new Date(startTime);
    		  SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HHmmss");//
    		  //Log.e("タグ", simpleDateFormat.format(date));//2011.11.17.02:53:38 217

    		  String date2 = simpleDateFormat.format(date);

    		  Log.e(TAG,date2);

    	        HttpGet method = new HttpGet("http://ec2-54-244-212-108.us-west-2.compute.amazonaws.com/?"+date2+"times="+i);

    	        DefaultHttpClient client = new DefaultHttpClient();

    	        // ヘッダを設定する
    	        method.setHeader( "Cache-Control", "no-cache" );

    	        HttpResponse response = client.execute( method );
    	        int status = response.getStatusLine().getStatusCode();
    	        if ( status != HttpStatus.SC_OK )
    	            throw new Exception( "" );
    	        Log.d(TAG,EntityUtils.toString( response.getEntity(), "UTF-8" ));

    		  }
    	    catch ( Exception e )
    	    {
    	        e.toString();
    	    }
    	  i++;
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
