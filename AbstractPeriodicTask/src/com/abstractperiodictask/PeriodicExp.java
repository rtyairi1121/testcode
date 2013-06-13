package com.abstractperiodictask;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;


/**
 * 言わずもがなMainActivityクラス
 */
public class PeriodicExp extends Activity {

    private TextView countDisplay;
    private PeriodicCounter counter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //フルスクリーン表示
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //タイトルバー非表示
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_periodic_exp);
        countDisplay = (TextView) findViewById(R.id.countDisplay);

        //カウンターを周期1000ms、カウント表示をcountDisplayで生成
        counter = new PeriodicCounter(1000,true, countDisplay);

    }

    @Override
    protected void onResume() {
        super.onResume();
        if(counter!=null){
            counter.execute();
        }
    }

    @Override
    protected void onPause() {
        if(counter!=null){
            counter.cancel();
        }
        super.onPause();
    }

}