package com.abstractperiodictask;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;


/**
 * ���킸������MainActivity�N���X
 */
public class PeriodicExp extends Activity {

    private TextView countDisplay;
    private PeriodicCounter counter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //�t���X�N���[���\��
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //�^�C�g���o�[��\��
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_periodic_exp);
        countDisplay = (TextView) findViewById(R.id.countDisplay);

        //�J�E���^�[������1000ms�A�J�E���g�\����countDisplay�Ő���
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