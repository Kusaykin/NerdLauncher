package com.bignerdranch.android.nerdlauncher;

import android.view.MenuItem;
import android.support.v4.app.Fragment;



public class NerdLauncherActivity extends SingleFragmentActivity {

	@Override
	public Fragment createFragment() {
		return new NerdLauncherFragment();
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();

		//noinspection SimplifiableIfStatement
		if (id == R.id.action_settings) {
			return true;
		}

		return super.onOptionsItemSelected(item);
	}
}
