package co.jp.example.background;


import android.os.Bundle;
import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	 Button mStartButton;
	 Button mStopButton;
	// mStartButton = (Button)findViewById(R.id.button1);

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		 Intent intent = new Intent(MainActivity.this, MyService.class);
		  startService(intent);

		  intent.putExtra("Message", "Hello Service");
		  
		  PendingIntent service = PendingIntent.getService(
	                        MainActivity.this, 0, intent, 0);

	                long first = System.currentTimeMillis() + 1 * 1000;
	                long interval = 10 * 1000;
	                AlarmManager am = (AlarmManager) getSystemService(ALARM_SERVICE);
	                am.setRepeating(AlarmManager.RTC, first, interval, service);

		 // mStartButton.setOnClickListener(new View.OnClickListener() {
	       //     @Override
	         //   public void onClick(View arg0) {
	                //Intent intent = new Intent(MainActivity.this, MyService.class);
	                //intent.putExtra("Message", "Hello Service");
	                //PendingIntent service = PendingIntent.getService(
	                 //       MainActivity.this, 0, intent, 0);

	                //long first = System.currentTimeMillis() + 1 * 1000;
	                //long interval = 10 * 1000;
	                //AlarmManager am = (AlarmManager) getSystemService(ALARM_SERVICE);
	                //am.setRepeating(AlarmManager.RTC, first, interval, service);
	           // }
	       // });

	}

}
