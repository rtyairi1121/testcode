package jp.co.example.servicetest0;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ServiceTest0Activity extends Activity {

 Button startButton;
 Button stopButton;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_test0);

        findViews();

        startButton.setOnClickListener(new OnClickListener() {
//MyServiceとMyService2を切り替え
   public void onClick(View v) {
    // TODO 自動生成されたメソッド・スタブ
    startService(new Intent(getBaseContext(), MyService.class));
   }
  });

        stopButton.setOnClickListener(new OnClickListener() {

     public void onClick(View v) {
      // TODO 自動生成されたメソッド・スタブ
      stopService(new Intent(getBaseContext(), MyService.class));
     }
    });
    }

    protected void findViews() {
     startButton = (Button)findViewById(R.id.button1);
     stopButton = (Button)findViewById(R.id.button2);
    }
}