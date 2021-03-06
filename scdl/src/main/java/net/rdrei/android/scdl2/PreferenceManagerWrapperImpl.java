package net.rdrei.android.scdl2;

import android.preference.Preference;
import android.preference.PreferenceManager;

import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;

public class PreferenceManagerWrapperImpl implements PreferenceManagerWrapper {

	private final PreferenceManager mPreferenceManager;

	@Inject
	public PreferenceManagerWrapperImpl(
			@Assisted final PreferenceManager preferenceManager) {
		mPreferenceManager = preferenceManager;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.rdrei.android.scdl2.PreferenceManagerWrapper#findPreference(java.
	 * lang.CharSequence)
	 */
	@Override
	public Preference findPreference(final CharSequence key) {
		return mPreferenceManager.findPreference(key);
	}
}
