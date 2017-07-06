package com.example.network;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;

/**
 * Created by ouyangshen on 2016/11/11.
 */
public class QQConcernActivity extends AppCompatActivity {
	private final static String TAG = "QQConcernActivity";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_qq_concern);
		Toolbar tl_head = (Toolbar) findViewById(R.id.tl_head);
		tl_head.setTitle(getResources().getString(R.string.menu_first));
		setSupportActionBar(tl_head);
		tl_head.setNavigationOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View view) {
				finish();
			}
		});
	}

}