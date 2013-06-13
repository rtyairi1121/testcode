package jp.example.samplebattery01;

import android.os.Bundle;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.app.Activity;
import android.view.Menu;
import android.content.IntentFilter;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onResume() {
		super.onResume();
		//��M���J�n
		IntentFilter filter=new IntentFilter();
		filter.addAction(Intent.ACTION_BATTERY_CHANGED);
		registerReceiver(myReceiver,filter);
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	protected void onPause() {
		super.onPause();
		//��M���~
		unregisterReceiver(myReceiver);
	}

	//��M�@
		public BroadcastReceiver myReceiver = new BroadcastReceiver() {
			private int scale;
			private int level;

			@Override
			public void onReceive(Context context, Intent intent) {
				if (intent.getAction().equals(Intent.ACTION_BATTERY_CHANGED)) {
					// �d�r�c�ʂ̍ő�l
					scale = intent.getIntExtra("scale", 0);
					// �d�r�c��
					level = intent.getIntExtra("level", 0);
				}
				//���ʂ�`��
				TextView textView = new TextView(context);
				textView.setText(""+level+"/"+scale);
				textView.setTextSize(64);
				setContentView(textView);
			}
		};

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
