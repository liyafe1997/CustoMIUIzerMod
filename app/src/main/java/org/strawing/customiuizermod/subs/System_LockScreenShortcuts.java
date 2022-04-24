package org.strawing.customiuizermod.subs;

import android.os.Bundle;

import org.strawing.customiuizermod.SubFragment;

public class System_LockScreenShortcuts extends SubFragment {

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);

		findPreference("pref_key_system_lockscreenshortcuts_right").setOnPreferenceClickListener(openLockScreenActions);
		findPreference("pref_key_system_lockscreenshortcuts_left").setOnPreferenceClickListener(openSortableList);
	}

}
