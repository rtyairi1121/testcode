package jp.example.alarm_manager;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    /** Called when the activity is first created. */
  Button button1;
  Button button2;

  TextView hello_tv;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);


        button1.setOnClickListener(new View.OnClickListener() {

      @Override
      public void onClick(View v) {
  	    Log.e("alarm manager","OnClick!!");
        // TODO 自動生成されたメソッド・スタブ

        Intent intent = new Intent(MainActivity.this, HelloService.class);
        PendingIntent service = PendingIntent.getService(MainActivity.this, 0, intent, 0);

        long first = System.currentTimeMillis() + 1 * 1000;
        long interval = 10 * 1000;
        AlarmManager am = (AlarmManager) getSystemService(ALARM_SERVICE);
        am.setRepeating(AlarmManager.RTC, first, interval, service);


      }
    });

        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
              // TODO 自動生成されたメソッド・スタブ
              Intent intent = new Intent(MainActivity.this, HelloService.class);
              PendingIntent service = PendingIntent.getService(MainActivity.this, 0, intent, 0);
              AlarmManager am = (AlarmManager) getSystemService(ALARM_SERVICE);
              am.cancel(service);
            }
          });
          }
      }
