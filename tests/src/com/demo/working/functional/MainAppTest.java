package com.demo.working.functional;

import android.test.ActivityInstrumentationTestCase2;

import com.demo.working.MainActivity;
import com.jayway.android.robotium.solo.Solo;

public class MainAppTest extends ActivityInstrumentationTestCase2<MainActivity> {

	private Solo solo;

	public MainAppTest() {
		super(MainActivity.class);
	}

	public void setUp() throws Exception {
		solo = new Solo(getInstrumentation(), getActivity());
		solo.setActivityOrientation(Solo.PORTRAIT);
	}

	public void testMessageInPortrait() {
		boolean found = solo.searchText("Portrait");
		assertTrue(found);
	}

	public void testMessageInLandscape() {
		solo.setActivityOrientation(Solo.LANDSCAPE);

		boolean found = solo.searchText("Landscape");
		assertTrue(found);
	}

	public void testClickButtonGeneratesToast() {
		solo.clickOnButton("Click for a message");
		
		boolean found = solo.searchText("Don't push my buttons");
		assertTrue(found);
	}

}
