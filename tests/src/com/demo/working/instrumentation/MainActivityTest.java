package com.demo.working.instrumentation;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.demo.R;
import com.demo.working.MainActivity;

/**
 * This is a simple framework for a test of an Application. See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more
 * information on how to write and extend Application tests.
 * <p/>
 * To run this test, you can type: adb shell am instrument -w \ -e class
 * com.demo.MainActivityTest \
 * com.demo.tests/android.test.InstrumentationTestRunner
 */
public class MainActivityTest extends
		ActivityInstrumentationTestCase2<MainActivity> {

	public MainActivityTest() {
		super("com.demo", MainActivity.class);
	}

	public void testTextInPortrait() {
		TextView orientation = (TextView) getActivity().findViewById(
				R.id.orientation);
		assertEquals("Portrait", orientation.getText().toString());
	}
}
