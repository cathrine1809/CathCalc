package edu.unikl.stud0104.cathcalc;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		final EditText input1 = (EditText) findViewById(R.id.editText1);
		final EditText input2 = (EditText) findViewById(R.id.editText2);
		final TextView text = (TextView) findViewById(R.id.textView4);

		Button buttonPlus = (Button) findViewById(R.id.button1);
		Button buttonMinus = (Button) findViewById(R.id.button2);
		Button buttonMultiple = (Button) findViewById(R.id.button4);
		Button buttonDivide = (Button) findViewById(R.id.button3);

		buttonPlus.setOnClickListener(new OnClickListener() {
//shahir test4
			public void onClick(View v) {

				String num1str = input1.getText().toString();
				String num2str = input2.getText().toString();

				double num1 = Double.parseDouble(num1str);
				double num2 = Double.parseDouble(num2str);

				double result = num1 + num2;

				text.setText("Result :" + result);

			}

		});
		buttonMinus.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {

				String num1str = input1.getText().toString();
				String num2str = input2.getText().toString();

				double num1 = Double.parseDouble(num1str);
				double num2 = Double.parseDouble(num2str);

				double result = num1 - num2;

				text.setText("Result :" + result);

			}

		});

		buttonMultiple.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {

				String num1str = input1.getText().toString();
				String num2str = input2.getText().toString();

				double num1 = Double.parseDouble(num1str);
				double num2 = Double.parseDouble(num2str);

				double result = num1 / num2;

				text.setText("Result :" + result);

			}

		});

		buttonDivide.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {

				String num1str = input1.getText().toString();
				String num2str = input2.getText().toString();

				double num1 = Double.parseDouble(num1str);
				double num2 = Double.parseDouble(num2str);

				double result = num1 * num2;

				text.setText("Result :" + result);

			}

		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
}
