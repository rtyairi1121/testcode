package co.jp.example.helloworldwidget.sample;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class HelloAndroidWidgetProvider extends AppWidgetProvider {

	@Override
	public void onEnabled(Context context) {
		Log.v("HelloAndroidWidget", "onEnabled");
		super.onEnabled(context);
	}

	@Override
	public void onUpdate(Context context, AppWidgetManager appWidgetManager,
			int[] appWidgetIds) {
		Log.v("HelloAndroidWidget", "onUpdate");
		super.onUpdate(context, appWidgetManager, appWidgetIds);
	}

	@Override
	public void onDeleted(Context context, int[] appWidgetIds) {
		Log.v("HelloAndroidWidget", "onDeleted");
		super.onDeleted(context, appWidgetIds);
	}

	@Override
	public void onDisabled(Context context) {
		Log.v("HelloAndroidWidget", "onDisabled");
		super.onDisabled(context);
	}

	@Override
	public void onReceive(Context context, Intent intent) {
		Log.v("HelloAndroidWidget", "onReceive");
		super.onReceive(context, intent);
	}
}