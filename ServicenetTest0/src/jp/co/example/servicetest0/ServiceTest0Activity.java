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
//MyService��MyService2��؂�ւ��\
   public void onClick(View v) {
    // TODO �����������ꂽ���\�b�h�E�X�^�u
    startService(new Intent(getBaseContext(), MyService.class));
   }
  });

        stopButton.setOnClickListener(new OnClickListener() {

     public void onClick(View v) {
      // TODO �����������ꂽ���\�b�h�E�X�^�u
      stopService(new Intent(getBaseContext(), MyService.class));
     }
    });
    }

    protected void findViews() {
     startButton = (Button)findViewById(R.id.button1);
     stopButton = (Button)findViewById(R.id.button2);
    }
}