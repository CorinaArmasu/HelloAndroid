package com.example.android.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
	private EditText eText;
	private Button button;
	private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
	eText = (EditText)findViewById(R.id.et);
	textView = (TextView)findViewById(R.id.tv);
	button =(Button)findViewById(R.id.btn);
	String s = eText.getText().toString();
	button.setOnClickListener(new View.OnClickListener {
	public void OnClick(View v){
	textView.setText("Hello Welcome "+s);

	}
	});

    }
}
