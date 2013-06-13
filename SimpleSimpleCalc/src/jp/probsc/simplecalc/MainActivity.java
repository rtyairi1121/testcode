package jp.probsc.simplecalc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

/**
 * �V���v���d��N���X
 */
public class MainActivity extends Activity
{
	/**
	 * onCreate �R�[���o�b�N���\�b�h
	 */
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// �E�B�W�F�b�g�̏�����
		init();
	}

	/**
	 * �E�B�W�F�b�g�̏�����
	 */
	private void init()
	{
		final EditText num1 = (EditText)findViewById(R.id.editNum1);
		num1.setSelectAllOnFocus(true);

		final EditText num2 = (EditText)findViewById(R.id.editNum2);
		num2.setSelectAllOnFocus(true);

		final EditText numAnswer = (EditText)findViewById(R.id.editAnswer);

		Button btnAdd = (Button)findViewById(R.id.btnAdd);
		btnAdd.setOnClickListener(new OnClickListener()
			{
				public void onClick(View v)
				{
					int ret = Calculator.Add(escape(num1), escape(num2));
					numAnswer.setText(String.valueOf(ret));
				}
			});
	}

	/**
	 * EditText ���G�X�P�[�v���Đ����l��Ԃ�
	 *
	 * @param target �G�X�P�[�v�Ώۂ� EditText �E�B�W�F�b�g
	 * @return �����l
	 */
	public static int escape(EditText target)
	{
		try
		{
			return Integer.parseInt(target.getText().toString());
		}
		catch (Exception ex)
		{
			target.setText("0");
			return 0;
		}
	}
}
