package jp.example.simplecalc2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

/**
 * シンプル電卓クラス
 */
public class MainActivity extends Activity
{
	/**
	 * onCreate コールバックメソッド
	 */
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// ウィジェットの初期化
		init();
	}

	/**
	 * ウィジェットの初期化
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
	 * EditText をエスケープして整数値を返す
	 *
	 * @param target エスケープ対象の EditText ウィジェット
	 * @return 整数値
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

