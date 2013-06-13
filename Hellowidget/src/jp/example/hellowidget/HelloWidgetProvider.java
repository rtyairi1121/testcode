package jp.example.hellowidget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class HelloWidgetProvider extends AppWidgetProvider {
	@Override
	public void onEnabled(Context context) {
		Log.v("HelloAndroid!!!", "onEnabled");
		super.onEnabled(context);
	}

	@Override
	public void onUpdate(Context context, AppWidgetManager appWidgetManager,
			int[] appWidgetIds) {
		Log.v("HelloAndroid!!!", "onUpdate");
		super.onUpdate(context, appWidgetManager, appWidgetIds);
	}

	@Override
	public void onDeleted(Context context, int[] appWidgetIds) {
		Log.v("HelloAndroid!!!", "onDeleted");
		super.onDeleted(context, appWidgetIds);
	}

	@Override
	public void onDisabled(Context context) {
		Log.v("HelloAndroid!!!", "onDisabled");
		super.onDisabled(context);
	}

	@Override
	public void onReceive(Context context, Intent intent) {
		Log.v("HelloAndroid!!!", "onReceive");
		super.onReceive(context, intent);
	}

}
