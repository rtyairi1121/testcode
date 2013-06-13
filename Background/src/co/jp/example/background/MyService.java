package co.jp.example.background;

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

	  final static String TAG = "MyService";
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
    	 Log.d(TAG, "onCreate");
        Toast.makeText(this, "create service", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStart(Intent intent, int StartId) {
        String message = intent.getStringExtra("Message");
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();


        /////
        //HttpGet method = new HttpGet("http://www.yahoo.co.jp");

        //DefaultHttpClient client = new DefaultHttpClient();

        // ÉwÉbÉ_Çê›íËÇ∑ÇÈ
        //method.setHeader( "Cache-Control", "no-cache" );

        //HttpResponse response = client.execute( method );
        //int status = response.getStatusLine().getStatusCode();
        //if ( status != HttpStatus.SC_OK )
        //    throw new Exception( "" );

        //Log.d(TAG,EntityUtils.toString( response.getEntity(), "UTF-8" ));

        //////

   	 Log.d(TAG, "message");



        try
	    {
        	Log.d(TAG, "before_HTTP");
	        HttpGet method = new HttpGet("http://www.yahoo.co.jp");

	        DefaultHttpClient client = new DefaultHttpClient();
	        Log.d(TAG, "before_HTTP1");
	        // ÉwÉbÉ_Çê›íËÇ∑ÇÈ
	        method.setHeader( "Cache-Control", "no-cache" );
	        Log.d(TAG, "before_HTTP2");
	        HttpResponse response = client.execute( method );
	        Log.d(TAG, "before_HTTP3");
	        int status = response.getStatusLine().getStatusCode();
	        Log.d(TAG, "before_HTTP4");
	        if ( status != HttpStatus.SC_OK )
	            throw new Exception( "" );
	        Log.e(TAG,EntityUtils.toString( response.getEntity(), "UTF-8" ));
		  Log.d(TAG, "HTTP");
		  }
	    catch ( Exception e )
	    {
	        Log.e(TAG,e.toString());
	    }













//            try
  //          {
    //            HttpGet method = new HttpGet("http://www.yahoo.co.jp");

      //          DefaultHttpClient client = new DefaultHttpClient();

                // ÉwÉbÉ_Çê›íËÇ∑ÇÈ
      //          method.setHeader( "Connection", "Keep-Alive" );

      //          HttpResponse response = client.execute( method );
      //          int status = response.getStatusLine().getStatusCode();
      //          if ( status != HttpStatus.SC_OK )
      //              throw new Exception( "" );
      //          Log.e(TAG,EntityUtils.toString( response.getEntity(), "UTF-8" ));
      //     }
      //      catch ( Exception e )
      //      {
      //      	 e.toString();
      //      }

















        /////
        Thread t = new Thread() {
            @Override
            public void run() {
                try {
                    //5ïbãxÇÒÇ≈èIóπ
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
        Toast.makeText(this, "destroy service", Toast.LENGTH_SHORT).show();
    }
}