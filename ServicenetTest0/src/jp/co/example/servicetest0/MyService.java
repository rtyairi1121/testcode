package jp.co.example.servicetest0;


import java.util.Timer;
import java.util.TimerTask;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class MyService extends Service {

	int i = 2;

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
  public void onCreate() {
      Toast.makeText(this, "create service", Toast.LENGTH_SHORT).show();
  }
  
  
  @Override
  public int onStartCommand(Intent intent, int flags, int startId) {

	  Log.d(TAG, "onStartCommand");


	  
    timer.scheduleAtFixedRate(new TimerTask(){
	@Override
      public void run() {

		 Log.e(TAG, Integer.toString(i));

    	  try
    	    {
    		  if(i%2 == 0){
    	        HttpGet method = new HttpGet("http://www.yahoo.co.jp");

    	        DefaultHttpClient client = new DefaultHttpClient();

    	        // ÉwÉbÉ_Çê›íËÇ∑ÇÈ
    	        method.setHeader( "Cache-Control", "no-cache" );

    	        HttpResponse response = client.execute( method );
    	        int status = response.getStatusLine().getStatusCode();
    	        if ( status != HttpStatus.SC_OK )
    	            throw new Exception( "" );
    	        Log.d(TAG,EntityUtils.toString( response.getEntity(), "UTF-8" ));

    		  }
    		  if(i%2 == 1){
      	        HttpGet method = new HttpGet("http://www.google.co.jp/");


    	        DefaultHttpClient client = new DefaultHttpClient();

    	        // ÉwÉbÉ_Çê›íËÇ∑ÇÈ
    	        method.setHeader( "Cache-Control", "no-cache" );

    	        HttpResponse response = client.execute( method );
    	        int status = response.getStatusLine().getStatusCode();
    	        if ( status != HttpStatus.SC_OK )
    	            throw new Exception( "" );
    	        Log.d(TAG,EntityUtils.toString( response.getEntity(), "UTF-8" ));
    		  }

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
