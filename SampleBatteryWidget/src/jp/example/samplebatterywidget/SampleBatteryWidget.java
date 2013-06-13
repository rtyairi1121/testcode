package jp.example.samplebatterywidget;

import android.app.Service;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.widget.RemoteViews;

public class SampleBatteryWidget extends AppWidgetProvider {
    @Override
    public void onUpdate(Context c, AppWidgetManager awm, int[] awi) {
        Intent in = new Intent(c, WidgetService.class);
        c.startService(in);
    }

    public static class WidgetService extends Service {
        @Override
        public void onStart(Intent in, int si) {
            IntentFilter filter = new IntentFilter();
            filter.addAction(Intent.ACTION_BATTERY_CHANGED);
            registerReceiver(batteryReceiver, filter);
        }

        @Override
        public IBinder onBind(Intent in) {
            return null;
        }
    }

    private static BroadcastReceiver batteryReceiver = new BroadcastReceiver() {
        int scale = 100;
        int level = 0;

          @Override
          public void onReceive(Context c, Intent in) {
            String ac = in.getAction();
            if (ac.equals(Intent.ACTION_BATTERY_CHANGED)) {
                level = in.getIntExtra("level", 0);
                scale = in.getIntExtra("scale", 0);

            }

          AppWidgetManager awm = AppWidgetManager.getInstance(c);
          ComponentName cn = new ComponentName(c, SampleBatteryWidget.class);
          RemoteViews rv = new RemoteViews(c.getPackageName(), R.layout.activity_sample_battery_widget);
          rv.setTextViewText(R.id.textView, ""+(int)(level*100/scale));
          awm.updateAppWidget(cn, rv);
          }
    };
}



