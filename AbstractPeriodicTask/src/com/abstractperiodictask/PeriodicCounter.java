package com.abstractperiodictask;

import android.widget.TextView;

/**
 * 周期的にカウントを進めるクラス
 */
public class PeriodicCounter extends AbstractPeriodicTask {

    TextView countView;
    private int count;

    public PeriodicCounter(long period, boolean isDaemon, TextView countView) {
        super(period, isDaemon);
        this.countView = countView;
    }

    @Override
    protected void invokersMethod() {
        count++;
        countView.setText(Integer.toString(count));
    }

}
