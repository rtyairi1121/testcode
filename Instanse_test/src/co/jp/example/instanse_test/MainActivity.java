package co.jp.example.instanse_test;


import android.os.Bundle;
import android.app.Activity;

import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		 int num = 2;

		 int i1;
		 int i2;
		 int i3;
	      // インスタンス化
	      sampleB obj = new sampleB();

	      int num1 = obj.method( num );
	      System.out.println("1回目：" + num1);

	      int num2 = obj.method( num );
	      System.out.println("2回目：" + num2);

	      int num3 = obj.method( num );
	      System.out.println("3回目：" + num3);

	      TextView tv = new TextView(this);

	      String s1;

	      i1 = num1;
	      i2 = num2;
	      i3 = i1+i2;

	      s1 = String.valueOf(i3);

	      tv.setText(s1);

	      setContentView(tv);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
