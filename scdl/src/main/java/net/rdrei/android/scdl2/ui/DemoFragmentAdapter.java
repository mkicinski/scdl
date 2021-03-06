package net.rdrei.android.scdl2.ui;

import net.rdrei.android.scdl2.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class DemoFragmentAdapter extends FragmentPagerAdapter {

	private static final int[] SLIDES = { R.layout.demo_hello,
			R.layout.demo_step1, R.layout.demo_step2, R.layout.demo_step3,
			R.layout.demo_step4 };

	public DemoFragmentAdapter(final FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(final int key) {
		final int layoutId = SLIDES[key];

		final Fragment fragment = DemoFragment.newInstance(layoutId);
		return fragment;
	}

	@Override
	public int getCount() {
		return SLIDES.length;
	}

}
