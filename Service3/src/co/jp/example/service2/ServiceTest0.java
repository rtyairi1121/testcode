package co.jp.example.service2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ServiceTest0 extends Activity {

  Button startButton;
  Button stopButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();

        startButton.setOnClickListener(new OnClickListener(){
      @Override
      public void onClick(View v) {
        startService(new Intent(getBaseContext(),MyService.class));
      }
        });

        stopButton.setOnClickListener(new OnClickListener(){
      @Override
      public void onClick(View v) {
        stopService(new Intent(getBaseContext(),MyService.class));
      }
        });
    }

    protected void findViews(){
      startButton = (Button)findViewById(R.id.button1);
      stopButton = (Button)findViewById(R.id.button2);
    }
}