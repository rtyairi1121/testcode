package com.service_simple;

import android.app.Service;
import android.widget.Toast;

public class SpecialService extends Service {
	 @Override
	 public void onCreate() {
	 Toast.makeText(this, "����ɂ���", Toast.LENGTH_LONG),show();
	 super.onCreate();
	 }
	}