package com.demo.working;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

import com.demo.R;

public class MainActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		Button b = findById(R.id.message_generator);
		b.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Log.v("DEBUG", "Clicked!");
				Toast.makeText(MainActivity.this, "Don't push my buttons!",
						Toast.LENGTH_SHORT).show();
			}
		});
	}

	@SuppressWarnings("unchecked")
	public <T> T findById(int id) {
		return (T) findViewById(id);
	}
}
