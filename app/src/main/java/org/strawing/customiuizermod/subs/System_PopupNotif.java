package org.strawing.customiuizermod.subs;

import android.os.Bundle;

import org.strawing.customiuizermod.SubFragment;

public class System_PopupNotif extends SubFragment {

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);

		findPreference("pref_key_system_popupnotif_apps").setOnPreferenceClickListener(openAppsEdit);
	}

}
