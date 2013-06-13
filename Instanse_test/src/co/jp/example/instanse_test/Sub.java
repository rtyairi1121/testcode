package co.jp.example.instanse_test;


import android.app.Activity;
import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;


public class Sub extends Service{
    int data = 100;
    void ke(){
        int data = 0;
        //メソッド(ke)で宣言した変数の値を表示
        System.out.println("メソッド内の変数を表示："+data);

        //メソッド(ke)外のクラスSubで宣言された変数の値を表示
        System.out.println("メソッド外の変数を表示："+this.data);
    }
	@Override
	public IBinder onBind(Intent arg0) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

}
