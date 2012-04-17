package com.demo.working.unit;

import junit.framework.TestCase;
import android.text.TextUtils;

public class TextUnitTest extends TestCase {
	public void testIsEmptyReturnsTrueForNullString() {
		String toTest = null;
		boolean empty = TextUtils.isEmpty(toTest);
		assertTrue(empty);
	}

	public void testIsEmptyReturnsTrueForZeroLengthString() {
		String toTest = "";
		boolean empty = TextUtils.isEmpty(toTest);
		assertTrue(empty);
	}

	public void testIsEmptyReturnsFalseForWhiteSpaceString() {
		String toTest = "   ";
		boolean empty = TextUtils.isEmpty(toTest);
		assertFalse(empty);
	}
}
