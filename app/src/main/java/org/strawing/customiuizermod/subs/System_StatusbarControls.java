package org.strawing.customiuizermod.subs;

import android.os.Bundle;

import org.strawing.customiuizermod.SubFragment;

public class System_StatusbarControls extends SubFragment {

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);

		findPreference("pref_key_system_statusbarcontrols_dt").setOnPreferenceClickListener(openStatusbarActions);
	}

}
