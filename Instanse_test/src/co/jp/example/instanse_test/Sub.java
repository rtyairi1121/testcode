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
        //���\�b�h(ke)�Ő錾�����ϐ��̒l��\��
        System.out.println("���\�b�h���̕ϐ���\���F"+data);

        //���\�b�h(ke)�O�̃N���XSub�Ő錾���ꂽ�ϐ��̒l��\��
        System.out.println("���\�b�h�O�̕ϐ���\���F"+this.data);
    }
	@Override
	public IBinder onBind(Intent arg0) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		return null;
	}

}
