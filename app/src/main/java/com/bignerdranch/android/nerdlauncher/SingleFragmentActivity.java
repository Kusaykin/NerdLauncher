package com.bignerdranch.android.nerdlauncher;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.util.Log;

public abstract class SingleFragmentActivity extends FragmentActivity {
	protected abstract Fragment createFragment();

	private static final String TAG = "Crime";

	protected int getLayoutResId() {
		return R.layout.activity_fragment;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		Log.d(TAG, "Call SingleFragmentActivity-onCreate");
		super.onCreate(savedInstanceState);
		setContentView(getLayoutResId());
		FragmentManager fm = getSupportFragmentManager();
		Fragment fragment = fm.findFragmentById(R.id.fragmentContainer);
		if (fragment == null) {
			fragment = createFragment();
			fm.beginTransaction().add(R.id.fragmentContainer, fragment)
					.commit();
		}
	}
}
