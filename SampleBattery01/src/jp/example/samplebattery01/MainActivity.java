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
		//受信を開始
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
		//受信を停止
		unregisterReceiver(myReceiver);
	}

	//受信機
		public BroadcastReceiver myReceiver = new BroadcastReceiver() {
			private int scale;
			private int level;

			@Override
			public void onReceive(Context context, Intent intent) {
				if (intent.getAction().equals(Intent.ACTION_BATTERY_CHANGED)) {
					// 電池残量の最大値
					scale = intent.getIntExtra("scale", 0);
					// 電池残量
					level = intent.getIntExtra("level", 0);
				}
				//結果を描写
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
